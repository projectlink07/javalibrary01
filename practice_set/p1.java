package practice_set;
import  java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING: ");
        String str = sc.nextLine();
        int lth = str.length();
        String strf = "";
        for(int i = 0; i<lth; i++){
            strf = strf + str.charAt(i);
            System.out.println(strf);
        }
        System.out.println();
    }

}
