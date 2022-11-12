package com.example.demo.dao;

import com.example.demo.Domain.Country;
import com.example.demo.Domain.Student;
import com.example.demo.Domain.Trades;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    List<Student> selectStudent();
    int insertStudent(Student stud);
    int updateStudent(Student stud);


    ///country
    List<Country> selectCountry();
    int insertCountry(Country Cntry);
    int updateCountry(Country Cntry);


    //Trades
    List<Trades> selectTrades();
    int insertTrades(Trades trades);
    int updateTrades(Trades trades);

    List<Trades> selectTotTrades();
}
