package practice02;
import java.util.*;
public class vowelreplace {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
    String nstr = "";
    for(int i = 0; i< str.length(); i++){
         char c_char = str.charAt(i);
        if (c_char == 'a'|| c_char == 'e' || c_char == 'i'|| c_char == 'o' || c_char == 'u' ){
            nstr = str.replace(c_char, ++c_char);
            str = nstr;
        }
    }
    System.out.println(nstr);
    }

}
