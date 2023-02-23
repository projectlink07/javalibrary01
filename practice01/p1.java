package practice01;
import  java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        int ar1[] = new int[26];
        int ar2[] = new int[26];
        while(ch!='*'){
            ch = sc.next().charAt(0);
            if (Character.isUpperCase(ch)) {
                for (int i = 65; i <= 90; i++) {
                    if ((char) (i) == ch) {
                        System.out.println((char) (i));
                        ar1[ch - 'A']++;
                    }
                }
            }
            else{
                for (int i = 97; i <= 122; i++) {
                    if ((char) (i) == ch) {
                        ar2[ch - 'a']++;
                    }
                }
            }

        }
        for(int i = 0; i<26; i++){
            if (ar1[i] > 0){
            System.out.print((char)(i + 'A') + " ");
            System.out.print(ar1[i] + " ");
            System.out.println();}
        }
        for(int i = 0; i<26; i++){
            if (ar2[i] > 0){
            System.out.print((char)(i + 'a') + " ");
            System.out.print(ar2[i] + " ");
            System.out.println();}
        }



    }
}





