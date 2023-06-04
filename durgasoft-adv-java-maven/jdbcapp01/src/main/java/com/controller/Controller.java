package com.controller;

import com.ram.jdbc.jdbcapp01.bean.Student;
import com.ram.jdbc.jdbcapp01.factories.StudentServiceFactory;
import com.ram.jdbc.jdbcapp01.service.StudentService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
    public static void main(String args[]) {
        System.out.println("Student Management System : ");
        System.out.println("=================================");
        BufferedReader bufferedReader = null;
        String sid = "", sname = "", addr = "";
        Student student = null;
        String status = "";
        StudentService studentService = StudentServiceFactory.getStudentService();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println();
                System.out.println("1. Add Student");
                System.out.println("2. Search Student");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Your option [1,2,3,4,5] : ");
                int userOption = Integer.parseInt(bufferedReader.readLine());
                System.out.println();

                switch (userOption) {
                    case 1:
                        System.out.println("Student add module ");
                        System.out.println();
                        System.out.println("Student Id : ");
                        sid = bufferedReader.readLine();
                        System.out.println("Student Name : ");
                        sname = bufferedReader.readLine();
                        System.out.println("Student Address : ");
                        addr = bufferedReader.readLine();
                        student = studentService.searchStudent(sid);
                        if (student == null) {
                            student = new Student();
                            student.setSid(sid);
                            student.setSname(sname);
                            student.setAddr(addr);
                            status = studentService.addStudent(student);
                            System.out.println("Status : " + status);
                        } else {
                            System.out.println("Status : Student" + sid + " already exists");
                        }
                        break;
                    case 2:
                        System.out.println("Student SEARCH Module");
                        System.out.println("--------------------------");
                        System.out.print("Student Id     : ");
                        sid = bufferedReader.readLine();
                        student = studentService.searchStudent(sid);
                        if (student == null) {
                            System.out.println("Status  : Student " + sid + " Does not exist");
                        } else {
                            System.out.println("Student Details");
                            System.out.println("--------------------");
                            System.out.println("Student Id      : " + student.getSid());
                            System.out.println("Student Name    : " + student.getSname());
                            System.out.println("Student Address : " + student.getAddr());
                        }
                        break;

                    case 3:
                        System.out.println("Student update module ");
                        System.out.println("-------------------------------");
                        System.out.println("Student Id : ");
                        sid = bufferedReader.readLine();
                        student = studentService.searchStudent(sid);
                        if (student == null) {
                            System.out.println("Status   : Student " + sid + " Does not Exist");
                        } else {
                            System.out.print("Student Name : Old : " + student.getSname() + " : New : ");
                            sname = bufferedReader.readLine();
                            System.out.print("Student Address : Old : " + student.getAddr() + " : New : ");
                            addr = bufferedReader.readLine();

                            Student newStudent = new Student();
                            newStudent.setSid(sid);
                            if (sname == null || sname.equals("")) {
                                newStudent.setSname(student.getSname());
                            } else {
                                newStudent.setSname(sname);
                            }
                            if (addr == null || addr.equals("")) {
                                newStudent.setAddr(student.getAddr());
                            } else {
                                newStudent.setAddr(addr);
                            }
                            status = studentService.updateStudent(newStudent);
                            System.out.println("Status   : " + status);
                        }
                        break;
                    case 4:
                        System.out.println("Student DELETE Module");
                        System.out.println("----------------------------");
                        System.out.print("Student Id    : ");
                        sid = bufferedReader.readLine();
                        student = studentService.searchStudent(sid);
                        if (student == null) {
                            System.out.println("Status     : Student " + sid + " Does not exist");
                        } else {
                            status = studentService.deleteStudent(sid);
                            System.out.println("Status   : " + status);
                        }
                        break;
                    case 5:
                        System.out.println("Thanq for Using Student Management System Application");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong entry,please Provide the number from 1,2,3 and 4");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
