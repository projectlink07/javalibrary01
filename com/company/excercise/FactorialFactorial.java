package com.company.excercise;

import java.util.Scanner;
 public class FactorialFactorial {


    public static int Factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.print("Enter number for com.company.excercise.FactorialFactorial = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factfact = 1;
        for(int i =1 ; i<= n ; i++){
            factfact *= Factorial(i);
        }
        System.out.println("com.company.excercise.FactorialFactorial = " + factfact);

    }
}
