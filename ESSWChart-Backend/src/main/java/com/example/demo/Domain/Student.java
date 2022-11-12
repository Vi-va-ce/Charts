package com.example.demo.Domain;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Student {
    private String fName; //f_name
    private String lName; //l_name
    private int age;
    private String year;
    private int id;
    private double grade;
    private Address address;

    private ArrayList adresses;




    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    public Student(){
            super();
        }

    public Student(String fName, String lName, int age, String year, int id, double grade, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.year = year;
        this.id = id;
        this.grade = grade;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public Address getAddress() {
        return address;
    }


    public ArrayList getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList adresses) {
        this.adresses = adresses;
    }
}



