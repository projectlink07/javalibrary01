package arrays;
import java.util.*;
public class array_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[20];
        for(int i = 0; i<20; i++){
            System.out.print("Marks of Student number " + (i+1)+"= ");
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i<20; i++){
            if(marks[i] > 90){
                System.out.println("Student no. "+ (i+1) + " Grade = A+");
            }
            else if(marks[i] >= 80 && marks[i]<=90){
                System.out.println("Student no. "+ (i+1) + " Grade = A");
            }
            else if(marks[i] >= 70 && marks[i]<=79){
                System.out.println("Student no. "+ (i+1) + " Grade = B");
            }
            else if(marks[i] >= 60 && marks[i]<=69){
                System.out.println("Student no. "+ (i+1) + " Grade = C");
            }
            else {
                System.out.println("Student no. "+ (i+1) + " Grade = D");
            }
        }
    }
}
