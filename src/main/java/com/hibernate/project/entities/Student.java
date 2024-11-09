package com.hibernate.project.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> addressList;

    public String getAbout() {
        return about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Student() {
    }

    public Student(String about, List<Address> addressList, Laptop laptop, int studentId, String studentName) {
        this.about = about;
        this.addressList = addressList;
        this.laptop = laptop;
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
