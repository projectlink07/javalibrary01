package practice02;
import java.util.*;
public class bs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().toLowerCase(Locale.ROOT);
        String nw = "";
        int l = n.length();
        for(int i = 0; i< l; i++){
            char c = n.charAt(i);
            int ac = (int)c;
            if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
                nw = n.replace(c, (char)(ac+1));
                n = nw;
                //System.out.println(nw);
            }
        }
        System.out.println(nw);

    }

}
