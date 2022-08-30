package searching;
import java.util.*;

public class binary_search {
    public static void main(String[] args) {
        int myArray[] = {10, 23, 34, 43 ,56, 76, 80};
        int search_key = 76;
        int lng = myArray.length;
        int first, last = lng-1;
        int mid;
        first = 0;

        boolean is_found = false;
            while (!is_found) {
                mid = first + last / 2;
                if (search_key == myArray[mid]) {
                    System.out.println("Found at index: " + mid);
                    is_found = true;
                } else if (myArray[mid] > search_key) {
                    last -= 1;

                }
                else{
                    first += 1;
                }

            }

    }
}
