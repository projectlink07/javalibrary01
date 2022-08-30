package for_loop;

import java.util.*;
public class conditionalsjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char user_input;
        System.out.print("character: ");
        user_input = sc.next().charAt(0);
        boolean result = Character.isUpperCase(user_input);
        if (result){
            System.out.println("UPPER CASE");

        }
        else
        {
            System.out.println("LOWER CASE");
        }

    }
}