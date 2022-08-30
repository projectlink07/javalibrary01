package practice_set;
import java.util.*;
public class pr4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ROWS: ");
        int row = sc.nextInt();
        int i = row;
        for(int r = row; r>0;r--){
            for(int s = row;s>r; s--){
                System.out.print(" ");
            }
            for(int j = i + 4; j>0; j--){
                System.out.print("*");
            }
            i = i-2;
            System.out.println();
        }

    }
}
