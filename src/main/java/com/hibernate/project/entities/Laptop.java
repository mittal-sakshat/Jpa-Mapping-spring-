package com.hibernate.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private int laptopId;
    private int modelNum;
    private String brand;

    public int getLaptopId() {
        return laptopId;
    }

    public Student getStudent() {
        return student;
    }

    public Laptop() {
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getBrand() {
        return brand;
    }

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop(String brand, int laptopId, int modelNum, Student student) {
        this.brand = brand;
        this.laptopId = laptopId;
        this.modelNum = modelNum;
        this.student = student;
    }
}
