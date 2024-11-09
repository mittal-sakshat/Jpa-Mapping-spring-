package com.hibernate.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private int AddressId;
    private String Street;
    private String City;
    private int ZipCode;
    private String Country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public Address(int addressId, String city, String country, String street, Student student, int zipCode) {
        AddressId = addressId;
        City = city;
        Country = country;
        Street = street;
        this.student = student;
        ZipCode = zipCode;
    }

    public int getAddressId() {
        return AddressId;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public String getStreet() {
        return Street;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public Address() {
    }
}
