package practice01;

public class obj4 {
    String coltop, colbottom;
    obj4(){
        colbottom = "black";
        coltop = "white";

    }
    obj4(String x, String y){
        coltop = x;
        colbottom = y;
    }

    public static void main(String[] args) {
        obj4 ob = new obj4("White", "Black");
        System.out.println(ob.colbottom);
    }
}
