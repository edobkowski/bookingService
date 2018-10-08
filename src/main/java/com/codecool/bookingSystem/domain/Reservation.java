package com.codecool.bookingSystem.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToMany
    private List<Room> rooms;
    @ManyToOne
    private Guest guest;

    @Enumerated(EnumType.STRING)
    private PaymentStatusType status;
    @Column(name = "arrival_date")
    private LocalDate arrivalDate;
    @Column(name = "departure_date")
    private LocalDate departureDate;
    @Column(name = "arrival_time")
    private LocalTime arrivalTime;
    @Column(name = "departure_time")
    private LocalTime departureTime;
    @Column(name = "number_of_guests")
    private long numberOfGuests;
    private boolean breakfast;
    private String notes;
    private double advancePayment;

    public Reservation() {
        this.rooms = new ArrayList();
    }

    public Reservation(List<Room> rooms, Guest guest, PaymentStatusType status, LocalDate arrivalDate,
                       LocalDate departureDate, LocalTime arrivalTime, LocalTime departureTime, long numberOfGuests,
                       boolean breakfast, String notes, double advancePayment) {
        this.rooms = rooms;
        this.guest = guest;
        this.status = status;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.numberOfGuests = numberOfGuests;
        this.breakfast = breakfast;
        this.notes = notes;
        this.advancePayment = advancePayment;
    }

    public long getId() {
        return id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public PaymentStatusType getStatus() {
        return status;
    }

    public void setStatus(PaymentStatusType status) {
        this.status = status;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public long getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(long numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id &&
                numberOfGuests == that.numberOfGuests &&
                breakfast == that.breakfast &&
                Double.compare(that.advancePayment, advancePayment) == 0 &&
                Objects.equals(rooms, that.rooms) &&
                Objects.equals(guest, that.guest) &&
                status == that.status &&
                Objects.equals(arrivalDate, that.arrivalDate) &&
                Objects.equals(departureDate, that.departureDate) &&
                Objects.equals(arrivalTime, that.arrivalTime) &&
                Objects.equals(departureTime, that.departureTime) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, rooms, guest, status, arrivalDate, departureDate, arrivalTime, departureTime, numberOfGuests, breakfast, notes, advancePayment);
    }
}
