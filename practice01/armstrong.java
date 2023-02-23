package practice01;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int r, i= num, c=0;
        double sum=0;
        while(i!=0){
            i = i/10;
            c++;
        }
        int k  = num;
        while(k!=0){
            r = k%10;
            k = k/10;
            sum = sum + Math.pow(r, c);
        }
        if(sum == num){
            System.out.println("IT IS AN ARMSTRONG NO.");
        }
        else{
            System.out.println("NOT AN ARMSTRONG NO.");
        }
    }
}
