package com.company;
import java.util.Arrays;

class Num {
    static int findMaxNum(int arr[], int n)
    {
        Arrays.sort(arr);

        int num = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            num = num * 10 + arr[i];
        }

        return num;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 0 };

        int n = arr.length;

        System.out.println(findMaxNum(arr, n));
    }
}

