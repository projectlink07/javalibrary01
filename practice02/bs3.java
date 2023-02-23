package practice02;
import java.util.*;
public class bs3 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j<= 6-i; j++){
                System.out.print("*");
            }
            System.out.print(count);
            count++;
            for(int k = 1; k< i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
