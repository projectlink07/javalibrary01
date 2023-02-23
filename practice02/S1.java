package practice02;

public class S1 {
    public static void main(String[] args) {
        //no of rows - 7
        for(int i = 7; i>=1; i--){
            for(int j=1; j<=i; j++){
                if (i==7){
                    System.out.print("*");
                }
                else if(j == 1){
                    System.out.print("*");
                }
                else if(j== i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                }
            System.out.println();

            }
        }
    }

