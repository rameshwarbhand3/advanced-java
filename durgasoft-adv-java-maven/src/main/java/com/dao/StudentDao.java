package com.ram.jdbc.jdbcapp01.dao;
import com.ram.jdbc.jdbcapp01.bean.Student;


public interface StudentDao {
    public String add(Student student);
    public Student search(String sid);
    public String update(Student student);
    public String delete(String sid);
}

