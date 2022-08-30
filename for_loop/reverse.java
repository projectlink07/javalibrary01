package for_loop;

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter No: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1, n = number;
        int f = 0;
        while(i != 0){
            int rem = number % 10;
            f = f*10 + rem;
            number = number / 10;
            i = number;
        }
        System.out.println(f);
        if (n == f){
            System.out.println("IT IS A PALINDROME NUMBER");
        }
        else{
            System.out.println("IT IS not A PALINDROME NUMBER");
        }
    }
}
