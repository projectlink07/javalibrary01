package for_loop;

import java.util.*;
public class string_reverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("STRING: ");
        String str = sc.nextLine();
        int lth = str.length();
        for(int i = lth-1; i!=-1; i--){
            System.out.print(str.charAt(i));
        }
    }
}
