package practice01;

public class sinx {
    public static void main(String[] args) {
        int x = 1;
        int r = 100000;
        double fact = 1;
        double sum = 0;
        int count = 0;
        double temp;
        for (int i = 1; i <= r; i += 2) {
            count++;
            for (int f = 1; f <= i; f++) {
                fact *= f;
            }
            temp = Math.pow(x, i);
            if (count % 2 == 0) {
                sum -= temp / fact;
            } else {
                sum += temp / fact;
            }
            temp = 0;
            fact = 1;
        }
        System.out.println("SIN "+x +" = "+sum);
    }
}




