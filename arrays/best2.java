package arrays;

public class best2 {
    public static void main(String[] args) {
        int arr1[] = {10, 67, 54, 34, 56, 12, 11, 23,5 };
        int lng = arr1.length;
        int temp;
        for(int i = 0; i< lng -1; i++){
            for(int j = 0; j< lng -i -1; j++){
                if (arr1[j] < arr1[j+1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;

                }
            }
        }
        for(int k = 0; k< arr1.length; k++){
            System.out.print(arr1[k] + " ");
        }

    }
}
