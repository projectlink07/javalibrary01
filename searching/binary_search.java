package searching;
import java.util.*;

public class binary_search {
    public static void main(String[] args) {
        int myArray[] = {10, 23, 34, 43 ,56, 76, 80};
        int search_key = 10;
        int lng = myArray.length;
        int first, last = lng-1;
        int mid;
        first = 0;
        int f_i = -1;
            while (first<=last) {
                mid = (first + last) / 2;
                if (search_key == myArray[mid]) {
                    f_i = mid;
                    System.out.println("Found at index: " + mid);
                    break;
                } else if (myArray[mid] > search_key) {
                    last = mid -1;

                }
                else{
                    first += mid + 1;
                }

            }
            if (f_i < 0){
                System.out.println("Not found!");
            }

    }
}
