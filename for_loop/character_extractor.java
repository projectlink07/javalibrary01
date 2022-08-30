package for_loop;

import java.util.*;
public class character_extractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String user_input = sc.nextLine();
        int text_length = user_input.length();
        for(int i=0; i<= text_length-1; i++){
            System.out.print(user_input.charAt(i) + " ");
        }
    }
}
