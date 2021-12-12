package ru.mirea.ikbo1120.sheloumov;

public class PhoneNums {
    public PhoneNums(){}
    public String ConvertNum(String num){
        String result = "";
        if(num.charAt(0) == '+') {
            int start = num.length() - 10;
            String zero = num.substring(1, start);
            String first = num.substring(start, start + 3);
            String second = num.substring(start + 3, start + 6);
            String third = num.substring(start + 6);
            result += num.charAt(0) + "<" + zero + ">-" + "<" + first + ">-" + "<" + second + ">-" + "<" + third + ">";
        }
        else
        {
            int start = 1;
            String zero = num.substring(0, start);
            String first = num.substring(start, start + 3);
            String second = num.substring(start + 3, start + 6);
            String third = num.substring(start + 6);
            result +="+<" + zero + ">-" + "<" + first + ">-" + "<" + second + ">-" + "<" + third + ">";
        }
        return result;
    }
}