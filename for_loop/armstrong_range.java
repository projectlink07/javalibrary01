package for_loop;
import java.util.*;
public class armstrong_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Min. Range: ");
        int r1 = sc.nextInt();
        System.out.print("Max. Range: ");
        int r2 = sc.nextInt();
        int num2, r, sum = 0;
        for(int i = r1; i<= r2; i++){
            num2 = i;
            while(num2 != 0){
                r = num2 % 10;
                num2 /= 10;
//                System.out.println(r);
                sum = sum + (r*r*r);
            }
            if(sum == i){
                System.out.println("ARMSTRONG NUMBER 👉 "+ i);
            }
            sum = 0;
        }
        System.out.println("DONE...⚡");

    }
}
