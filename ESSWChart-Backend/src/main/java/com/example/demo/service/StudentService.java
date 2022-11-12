package com.example.demo.service;

import com.example.demo.Domain.Address;
import com.example.demo.Domain.Country;
import com.example.demo.Domain.Student;
import com.example.demo.Domain.Trades;
import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentDao studentDao;

    private Student student = new Student();


    public void setStudent(Student customer) {
        student=customer;

    }

    public Student getDefault() {
        return student;
    }

    public Student getStudent() {
        Student customer = new Student();
        customer.setfName("Weldegerial");
        customer.setlName("Belete");
        customer.setAge(21);
        customer.setYear("5th");
        customer.setId(4);
        customer.setGrade(3);
        Address add= new Address();
        Address add2= new Address();
        add.setKebele("01");
        add.setWereda("02");
        add.setZone("N/slk");
        add2.setKebele("04");
        add2.setWereda("25");
        add2.setZone("Gulele");
        customer.setAddress(add);
        ArrayList newAdresses = new ArrayList();
        newAdresses.add(add);
        newAdresses.add(add2);
        customer.setAdresses(newAdresses);

        return customer;
    }

    public List<Student> doSelectStudent() {
        return studentDao.selectStudent();
    }

    public List<Country> doSelectCountry() {
        return studentDao.selectCountry();
    }

    public List<Trades> doSelectTrades() {return studentDao.selectTrades();}

    public List<Trades> doSelectTotTrades() {return studentDao.selectTotTrades();}
    public void doInsertStudent() {
        Student s = getStudent();
        System.out.println("Name: "+s.getfName()+"\nLName = "+s.getlName());
        studentDao.insertStudent(s);
    }

    public void doUpdateStudent() {
        Student updatedStudent = getStudent();
         studentDao.updateStudent(updatedStudent);
    }
}
