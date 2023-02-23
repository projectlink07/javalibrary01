package practice01;
import java.util.*;
public class spl_num {
    //145 = 1! + 4! + 5!= 145
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int s = 0;

        int i = num, r;
        while(i!= 0){
            int factorial = 1;
            r = i%10;
            i /= 10;
            for(int j = r; j>0; j--){
                factorial = factorial * j;
            }
            s = s + factorial;
            System.out.println(s);
        }
        if (s == num){
            System.out.println("IT IS A SPECIAL NUMBER");
        }
        else{
            System.out.println("IT IS NOT A SPECIAL NUMBER");
        }
    }
}
