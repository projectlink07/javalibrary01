package for_loop;

import java.util.*;
public class VariablesJava {

    public static void main(String[] args) {
        float mar_1, mar_2, mar_3, mar_4, mar_5, Total_marks, Max_marks;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hindi Marks: ");
        mar_1 = sc.nextFloat();
        System.out.print("Maths Marks: ");
        mar_2 = sc.nextFloat();
        System.out.print("Science Marks: ");
        mar_3 = sc.nextFloat();
        System.out.print("History/Civics Marks: ");
        mar_4 = sc.nextFloat();
        System.out.print("Geography Marks: ");
        mar_5 = sc.nextFloat();

        Total_marks = mar_1 + mar_2 + mar_3 + mar_4 + mar_5;
        Max_marks = 500.0f;
        percentage = (Total_marks/Max_marks) * 100;
        System.out.println("Percentage of Student: " + percentage);
        System.out.println("");
    }
}



