package for_loop;

import java.util.*;
public class x_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 2;
        System.out.print("Limit: ");
        int limit = sc.nextInt();
        System.out.print("Value of x: ");
        int x = sc.nextInt();
        for(int i = 2; i<=limit; i++){
            if(i%2==0){
                sum = sum - (Math.pow(x,i));
            }
            else{
                sum = sum + (Math.pow(x, i));
            }
        }
        System.out.print("X SERIES SUM= "+sum);
    }


    }

