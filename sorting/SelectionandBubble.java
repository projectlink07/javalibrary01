package sorting;
import java.util.*;
public class SelectionandBubble {
    public static void selectionsort(int[] myArray){
        int lng = myArray.length;
        int min; int temp;
        for(int i =0; i< lng; i++){
            min = i;
            for(int j = i+1; j<lng; j++){
                if (myArray[j] > myArray[min]){
                    min = j;
                }

            }
            temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;

        }
        for(int i = 0; i<lng; i++){
            System.out.print(myArray[i] + " ");
        }
    }
    static void bubblesort(int[] myArray){
        int lng = myArray.length;
        int temp;
        for(int i = 0; i<lng -1; i++){
            for(int j = 0; j < lng - 1 - i; j++){
                if(myArray[j] > myArray[j+1]){
                    temp = myArray[j + 1];
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for(int k = 0; k<lng; k++){
            System.out.print(myArray[k] + " ");
        }
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 numbers: ");
//        int nA[] = new int[10];
//        for(int i = 0; i<nA.length; i++){
//            nA[i] = sc.nextInt();
//        }
        int myNew[] = {2, 67 , 54, 34 ,78, 65};
//        SelectionandBubble.selectionsort(nA); 2sec
        SelectionandBubble.bubblesort(myNew);
    }
}

