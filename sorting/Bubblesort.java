package sorting;
import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array");
        int[] myArray = new int[10];
        for(int i=0;i<myArray.length;i++) {
            myArray[i] = sc.nextInt();
        }
//        int myArray[] = {13, 39, 15, 23, 23, 45};
        int lng = myArray.length;
//        System.out.println(lng);
        int temp;
        for(int i = 0; i< lng-1; i++){
            for(int j=0; j<lng - i - 1; j++){
                if(myArray[j]>myArray[j+1]){
                    temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for(int k = 0; k<lng; k++){
            System.out.println(myArray[k]);
        }
    }

}
