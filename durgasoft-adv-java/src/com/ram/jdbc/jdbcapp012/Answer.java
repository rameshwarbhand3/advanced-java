package com.ram.jdbc.jdbcapp012;

public class Answer {
    public static String multiply(String num1, String num2) {
        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];

        for (int i = 0; i < num1.length(); i++) {
            n1[i] = num1.charAt(num1.length() - 1 - i) - '0';
        }

        for (int i = 0; i < num2.length(); i++) {
            n2[i] = num2.charAt(num2.length() - 1 - i) - '0';
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = 0; i < n2.length; i++) {
            int carry = 0;
            for (int j = 0; j < n1.length; j++) {
                int product = n1[j] * n2[i] + carry + result[i + j];
                carry = product / 10;
                result[i + j] = product % 10;
            }
            result[i + n1.length] = carry;
        }

        StringBuilder sb = new StringBuilder();
        int i = result.length - 1;
        while (i > 0 && result[i] == 0) {
            i--;
        }
        while (i >= 0) {
            sb.append(result[i--]);
        }

        return sb.toString();
    }
    public static  void main(String args[]){
        String ans = multiply("1285","59");
        System.out.println(ans);

    }

}
