package for_loop;

import java.util.*;
public class Sin_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X= ");
        double x = sc.nextInt();
        System.out.print("N= ");
        double n = sc.nextInt();
        double fact = 1.0;
        double intial_sinx = x - (Math.pow(x, 3)/6.0);
        double final_sinx = 0;
        for(double i = 5.0; i<= n; i++){
            for(double j = 1.0; j<= i; j++){
                fact = fact * j;
            }
            final_sinx = final_sinx + intial_sinx + (Math.pow(x,i)/fact);
        }
        System.out.println("Sin " + x + " = "+final_sinx);
    }
}
