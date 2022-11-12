package com.example.demo.controller;

import com.example.demo.Domain.Address;
import com.example.demo.Domain.Country;
import com.example.demo.Domain.Student;
import com.example.demo.Domain.Trades;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class StudentController  {

    @Autowired
    StudentService studentService;


    @GetMapping("/greeting")
    public Student student  (){


        Student customer = studentService.getDefault();

//        customer.setArrayAddress(add);
//        customer.setArrayAddress(add2);


        studentService.setStudent(customer);



        System.out.println(customer.getfName()+customer.getlName() +"\nAddress: ");
//        StudentDao.insertStudent(customer);


        return customer;

    }
    @RequestMapping(value = "/getStudentt",method = RequestMethod.GET)
    public List<Student> selectStudent(){
        //return null;
        return studentService.doSelectStudent();
    }

    @GetMapping(value = "/insertStudent")
    public void insertStudent(){
        //return null;
        System.out.println("Controller is working ***");
        studentService.doInsertStudent();
    }
    @GetMapping("/updateStudent")
    public void updateStudent(){
        studentService.doUpdateStudent();

    }

    @GetMapping("/getCountry")
    public List<Country> selectCountry(){
        return studentService.doSelectCountry();
    }

    @GetMapping("/getTrades")
    public List<Trades> selectTrades(){
        return studentService.doSelectTrades();
    }

    @GetMapping("/getTotTrades")
    public List<Trades> selectTotTrades(){return studentService.doSelectTotTrades();}

    @GetMapping("/getStudent")
    public Student getStudent (){
        return studentService.getStudent();
    }

    @GetMapping("/getMyStudent")
    public Student getStudent (Student std){
        return studentService.getStudent();
    }
    @GetMapping("/getAdresses")
        public ArrayList getStudentAddress(){
            return studentService.getStudent().getAdresses();
        }

    }




