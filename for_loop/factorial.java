package for_loop;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long user_number = sc.nextLong();
        long factorial_num = 1;
        for(long i = 1; i <= user_number; i++){
            factorial_num = factorial_num * i;
        }
        System.out.println("Factorial of " + user_number + " is:" + factorial_num);
    }
}
