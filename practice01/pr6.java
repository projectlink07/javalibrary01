package practice01;
import java.util.*;
public class pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS: ");
        int rows = sc.nextInt();
        int c = 1;
        for(int r = rows; r>0; r--){
            for(int s = 1; s < r; s++){
                System.out.print("*");
            }
            System.out.print(c);
            c++;
            System.out.println();
        }
    }
}
