package com.factories;

import com.ram.jdbc.jdbcapp01.service.StudentService;
import com.ram.jdbc.jdbcapp01.service.StudentServiceImpl;

public class StudentServiceFactory {
    private static StudentService studentService;
    static {
        studentService = new StudentServiceImpl();
    }
    public static StudentService getStudentService(){
        return studentService;
    }
}
