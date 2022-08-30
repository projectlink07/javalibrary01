package for_loop;

import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int limit = sc.nextInt();
        int a = 0, b= 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 3;i <= limit; i++){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
