package for_loop;

public class pattern5 {
    public static void main(String[] args) {
        int a = 4;
        for(int r = 1; r<=5; r++) {
            for (int s = a; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            a--;
        }
            for(int i = 1; i<=4; i++){
                for(int b = 1; b<=i; b++){
                    System.out.print(" ");
                }
                for(int k = 1; k<= 5-i; k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }

        }
    }

