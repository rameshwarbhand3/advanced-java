package com.ram.jdbc.jdbcapp01.factories;

import com.ram.jdbc.jdbcapp01.dao.StudentDao;
import com.ram.jdbc.jdbcapp01.dao.StudentDaoImpl;

public class StudentDaoFactory {
    private static final StudentDao studentDao;
    static {
        studentDao = new StudentDaoImpl();
    }
    public static StudentDao getStudentDao(){
        return studentDao;
    }
}
