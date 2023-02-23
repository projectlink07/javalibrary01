package practice02;
import java.util.*;
public class bs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country_names[] = new String[10];
        System.out.println("Enter 10 country names");
        for(int i = 0; i < 10; i++){
            country_names[i] = sc.next();
        }
        int lng = country_names.length;
        String temp;
        for(int i = 0; i < lng-1; i++){
            for(int j = 0 ; j < lng- 1 - i; j++){
                if(country_names[j].compareTo(country_names[j+1]) > 0){
                    temp = country_names[j];
                    country_names[j] = country_names[j+1];
                    country_names[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(country_names[i]);
        }

    }
}
