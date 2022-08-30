package for_loop;

import java.util.Locale;
import java.util.*;

public class Projtextutils {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        System.out.print("STRING: ");
        String name = sc.nextLine(); //input here
        String nospacestr = name.replace(" ", "");
        System.out.printf("String : %s \n", name);
        System.out.printf("String length (WITH SPACES): %d\n", name.length());
        System.out.printf("String length (WITHOUT SPACES): %d\n", nospacestr.length());
        System.out.printf("String (LOWER CASE): %s\n", name.toLowerCase());
        System.out.printf("String (UPPER CASE): %s\n", name.toUpperCase());
        System.out.printf("String(WITHOUT SPACES): %s\n", nospacestr);



    }
}
