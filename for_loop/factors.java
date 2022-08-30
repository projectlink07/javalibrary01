package for_loop;

import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long n = sc.nextLong();
        for(long i = 1; i<= n; i++){
            if(i==n){
                System.out.print(i);
            }
            else if(n%i == 0){
                System.out.print(i + ", ");
            }

        }
    }
}
