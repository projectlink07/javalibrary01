package for_loop;

import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER: ");
        int user_number = sc.nextInt();
        int num = user_number;
        int rem,q=1, sum = 0;
        while(q!=0){
            rem = num%10;
            sum = sum + rem;
            q = num/10;
            num = q;
        }
        System.out.print("SUM OF DIGITS: " + sum);

    }
}
