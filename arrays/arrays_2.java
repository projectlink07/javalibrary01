package arrays;
import java.util.*;
public class arrays_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[10];
        System.out.println("Please enter the values: ");
        for (int i = 0; i < 10;i++){
            array1[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < 10; i++){
            for(int r = 2; r<array1[i];r++){
                if (array1[i]%r==0) {
                    count += 1;
                }
            }
            if (count > 0){
                System.out.println(array1[i] + " is NOT a prime number");
            }
            else{
                System.out.println(array1[i] + " is a prime number");
            }
            count = 0;

        }
    }
}
