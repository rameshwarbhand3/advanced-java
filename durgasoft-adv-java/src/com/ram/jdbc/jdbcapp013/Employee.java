package com.ram.jdbc.jdbcapp013;
@interface persistable{

        }

        @persistable
 class Employee {
void m1(){
    System.out.println("Employee m1-method");
}
}
 class Bank extends  Employee{
    void m1(){
        System.out.println("Bank m1-method");
    }
}
class Main {
    public static void main(String args[]){
        Bank bank = (Bank) new Employee();
        bank.m1();
//       Employee emp = new Bank();
//      emp.m1();
//        Bank bank = new Bank();
//        bank.m1();
//        Employee emp = new Employee();
//        emp.m1();
    }
}

