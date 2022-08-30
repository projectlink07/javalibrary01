package practice_set;
import java.util.*;
public class pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows: ");
        int r= sc.nextInt();
        for(int i = 1; i<=r;i++){
            for(int j = i; j<=r;j++){
                System.out.print("@" + " ");
            }
            System.out.println();
        }
        for(int i = 2; i<=r;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("@" + " ");
            }
            System.out.println();
        }
       }
    }
