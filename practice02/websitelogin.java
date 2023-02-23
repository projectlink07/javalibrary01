package practice02;
import java.util.*;
public class websitelogin {
    String name, email, password; int age;
    boolean is_eligible = false;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age >= 18) {
            is_eligible = true;
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } else {
            System.out.println("Age should be greater than 18");
        }
    }
    public void Passwordcheck(){
        if (is_eligible){

        }
    }

    }


