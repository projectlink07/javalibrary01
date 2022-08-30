package for_loop;

import java.util.*;
public class pascal_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int row = sc.nextInt();
        int pascal_number, f1 = 1, f2 =1 , f3 =1;
        for(int r = 1; r<= row; r++){
            for(int s = row-r; s>0; s--){
                System.out.print(" ");
            }
            if(r==1){
                System.out.println("1");
            }
            else if(r ==2){
                System.out.println("1 1");
            }
            else {
                int n = r;
                while(n!=-1){
                    if(n==0){
                        f1 = 1;
                    }
                    else{
                        f1 = f1*n;
                    }
                    n--;
                }
//                for (int n = r; n > 0; n--) {
//                    f1 = f1 * n;
//                }
                for (int k = 1; k <= r; k++) {
                    int l = k;
                    while(l!=-1){
                        if(l==0){
                            f2 = 1;
                        }
                        else{
                            f2 = f2*l;
                        }
                        l--;

                    }
//                    for (int l = k; l > 0; l--) {
//                        f2 = f2 * k;
//                    }
                    int m = r-k;
                    while(m!=-1){
                        if(m == 0){
                            f3 = 1;
                        }
                        else{
                            f3 = f3*m;
                        }
                        m--;
                    }
//                    for (int m = (r - k); m > 0; m--) {
//                        f3 = f3 * m;
//                    }
                }
                System.out.print(f1 / (f2 * f3));
                System.out.println();
            }
        }

    }
}
