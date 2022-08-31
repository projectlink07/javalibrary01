package practice02;
import java.util.*;
public class piglattin {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String nstr = "";
        for(int i = 0; i<str.length(); i++){
            char c_char = str.charAt(i);
            if (c_char == 'a' ||c_char == 'e' ||c_char == 'i' ||c_char == 'o' ||c_char == 'u'){
                nstr = str.substring(i) + str.substring(0, i);
                break;
            }
        }
        String piglattin = nstr + "AY";
        System.out.println(piglattin.toUpperCase());
    }
}
