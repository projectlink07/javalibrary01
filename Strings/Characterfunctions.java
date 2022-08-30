package Strings;

public class Characterfunctions {
    public static void main(String[] args) {
        char ch = 'h';
        char nch = Character.toUpperCase(ch);
        System.out.println(nch);
        boolean bch = Character.isWhitespace(nch);
        System.out.println(bch);
        bch = Character.isLetterOrDigit(ch);
        System.out.println(bch);
    }
}
