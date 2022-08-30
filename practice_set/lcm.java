package practice_set;
import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = sc.nextInt();
        System.out.print("N2: ");
        int n2 = sc.nextInt();
        int max = Math.max(n1, n2);
        int lcm;
        int i =1;
        while(true){
            if(max % n1 == 0 && max % n2 == 0){
                lcm = max;
                break;
            }
            else{
                max = Math.max(n1, n2);
                max = max*i;
                i ++;
            }
        }
        System.out.println("lcm " + lcm);
    }
}
