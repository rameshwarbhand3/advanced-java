package com.ram.jdbc.jdbcapp012;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

    public String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += A.charAt(i)-'0';
            }
            if(j>=0){
                sum += B.charAt(j)-'0';
            }
            if(sum==0 || sum==1){
                result.append(sum);
                carry = 0;
            }else if(sum==2){
                result.append("0");
                carry = 1;
            }else{
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if(carry == 1)result.append("1");
        return result.reverse().toString();
    }
    public static void main(String args[]){
        Test test = new Test();
        String ans = test.addBinary("110","10");
        System.out.println(ans);
    }
}
