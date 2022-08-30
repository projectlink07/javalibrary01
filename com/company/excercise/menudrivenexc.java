package com.company.excercise;

import java.util.*;
public class menudrivenexc {
    public static void main(String[] args) {
        double c, s, w, p;
        double result;
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("S for square root \n" +
                "C for cube root  \n" +
                "W for square \n" +
                "P for number raise to power {input} ");
        System.out.print("input: ");
        input = sc.next().charAt(0);

        double pow_choice;
        switch (input){
            case 'c':
                System.out.print("number= ");
                c = sc.nextDouble();
                result = Math.pow(c, 1.0/3);
                System.out.printf("result = %f", result);
                break;

            case 's':
                System.out.print("number= ");
                s = sc.nextDouble();
                result = Math.sqrt(s);
                System.out.printf("result = %f", result);
                break;

            case 'w':
                System.out.print("number= ");
                w = sc.nextDouble();
                result = w*w;
                System.out.printf("result = %f", result);
                break;

            case 'p':
                System.out.print("number: ");
                p = sc.nextDouble();
                System.out.print("raise to the power: ");
                pow_choice = sc.nextDouble();
                result = Math.pow(p, pow_choice);
                System.out.printf("result = %f", result);
                break;

            default:
                System.out.println("Choice not available");


            }
        }

    }

