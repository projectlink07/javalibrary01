package for_loop;

import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("a");
            }
            System.out.println();
        }
        for(int k = n-1;k>=1; k--){
            for(int l = k; l>=1;l--){
                System.out.print("a");
            }
            System.out.println();
        }

        }
    }

