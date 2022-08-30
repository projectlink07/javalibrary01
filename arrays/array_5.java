package arrays;
import java.util.*;
public class array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Enter number " + (i+1) + "= ");
            list[i] = sc.nextInt();
        }
        System.out.println("Enter Number: ");
        int search_key = sc.nextInt();
        boolean is_present = false;
        for(int i = 0; i < 10; i++){
            if(list[i] == search_key){
                is_present = true;
            }
        }
        if (is_present) {
            System.out.println(search_key + " is present in Array.");
        }
        else {
            System.out.println(search_key + " is NOT present in Array.");
        }

    }
}
