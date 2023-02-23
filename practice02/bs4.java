package practice02;
import java.util.*;
public class bs4 {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lng = str.length();
        char sk = 'n';
        int count = 0;
        for(int i = 0; i<lng; i++){
            count = 0;
            sk = str.charAt(i);
            for(int j = 0; j<lng ; j++){
                if (sk == str.charAt(j)){
                    char n = str.charAt(j);
                    count ++;
//                    str.deleteCharAt()
                }
            }
            System.out.println(str.charAt(i) + " FREQUENCY = " + count);

        }
    }
}
