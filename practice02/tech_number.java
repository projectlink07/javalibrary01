package practice02;
import java.util.*;
public class tech_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        int lng = str.length();
        double r; int on = num;
        int sum = 0;
        while(on!=0){
            r = on % (Math.pow(10, lng/2));
            sum += r;
            on/= Math.pow(10, lng/2);

        }
        if (sum*sum == num){
            System.out.println("It is a tech number");
        }
        else{
            System.out.println("It is not a tech number");
        }
    }
}
