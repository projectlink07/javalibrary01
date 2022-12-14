package for_loop;

import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = sc.nextInt();
        System.out.print("N2: ");
        int n2 = sc.nextInt();
        int gcd = 1;
        for (int i=1; i < Math.min(n1, n2); i++){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        System.out.println("for_loop.GCD: " + gcd);
    }
}
