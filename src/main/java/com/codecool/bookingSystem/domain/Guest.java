package com.codecool.bookingSystem.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phone;
    private String email;
    private String address;
    private String city;
    private String country;

    public Guest() {
    }

    public Guest(String firstName, String lastName, String phone, String email, String address, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Guest id: " + this.id + "\n" +
                "Name: " + this.firstName + "\n" +
                "Surname: " + this.lastName + "\n" +
                "Telephone number: " + this.phone + "\n" +
                "e-mail address: " + this.email + "\n" +
                "Address: " + this.address + "\n" +
                this.city + " " + this.country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id == guest.id &&
                Objects.equals(firstName, guest.firstName) &&
                Objects.equals(lastName, guest.lastName) &&
                Objects.equals(phone, guest.phone) &&
                Objects.equals(email, guest.email) &&
                Objects.equals(address, guest.address) &&
                Objects.equals(city, guest.city) &&
                Objects.equals(country, guest.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phone, email, address, city, country);
    }
}
