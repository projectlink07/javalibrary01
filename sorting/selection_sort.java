package sorting;

public class selection_sort {
    public static void main(String[] args) {
        int myArray[] = {13, 39, 15, 23, 23, 45};
        int min, temp;
        int lng = myArray.length;
        for(int i = 0; i<lng; i++){
            min = i;
            for(int j = i+1;j<lng;j++){
                if (myArray[j] < myArray[min]){
                    min = j;

                }
            }
            temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;

        }
        for (int i = 0; i<lng; i++){
            System.out.println(myArray[i]);
        }
    }
}
