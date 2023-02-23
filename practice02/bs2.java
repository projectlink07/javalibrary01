package practice02;

public class bs2 {
    public static void main(String[] args) {
        String n = "Energy";
        int lng = 6;
        for(int i = 0; i< lng; i++){
            for(int j = 0; j<= i; j++){
                System.out.print(" ");
            }
            System.out.println(n.substring(0, lng-i));
        }
    }
}
