package for_loop;

import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            for(int m = i-1; m >= 1; m--){
                System.out.print(m);
            }
            System.out.println();
        }
        for(int k = n-1; k>0; k--){
            for(int l = 1; l<=k; l++){
                System.out.print(l);
            }
            for(int p = k-1; p>= 1; p--){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
