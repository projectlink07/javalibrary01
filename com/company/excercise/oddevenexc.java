package com.company.excercise;

import java.util.*;
public class oddevenexc {
    //demo program - odd even program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.print("Number: ");
        num = sc.nextLong();
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd  Number");
//        int range = 100 - 10 + 1;
//
//        int count = 1;
//        while(count<= 1000){
//            int rand = (int)(range*Math.random()+min);
//            System.out.println(rand);
//            count++;
//        }

    }

}
