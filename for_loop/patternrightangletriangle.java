package for_loop;

import java.util.*;
public class patternrightangletriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int setter = sc.nextInt();
//        int setter = x;
        for (int j = 1; j<=setter; j++){
            for(int i = 1; i<= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
