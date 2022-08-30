package for_loop;
import java.util.*;
public class Lcm_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        boolean divisible = false;
        double max = Math.max(num1, num2);
        int i = 1;
        double lcm = 1;
        while(!divisible){
            if ((max % num1 == 0) && (max % num2 == 0)){
                lcm = max;
                System.out.println("LCM = " + lcm);
                divisible = true;
            }
            else{
                max = Math.max(num1, num2);
                i++;
                max = max*i;
                //System.out.println(max);
            }
        }

    }
}
