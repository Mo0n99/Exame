package com.company;

public class SumOfNaturalNumber3 {
    {
        int number = 10;
        int sum = addNumbers(number);
        System.out.println("Sum of First 10 Natural Numbers(Using recursion) is= " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}
