package practice_set;
import java.util.*;
public class pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROW: ");
        int row = sc.nextInt();
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= row; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
