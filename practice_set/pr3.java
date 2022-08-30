package practice_set;

public class pr3 {
    public static void main(String[] args) {
        int c = 1;
        for(int r = 1; r<= 7; r++){
            for(int j = 1; j<= r; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
