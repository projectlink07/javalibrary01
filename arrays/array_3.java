package arrays;
import java.util.*;
public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[10];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i< 10; i++){
            System.out.print("ENTER NUMBER "+(i+1) + "- ");
            list[i] = sc.nextInt();
            sum += list[i];
        }
        avg = sum/10.0;
        System.out.println("SUM= "+ sum + "\nAverage = "+avg);

    }
}
