package Ch8Objects;

public class PointClientV1 {
    public static void main(String[] args) {
        PointV1 p1 = new PointV1();
        System.out.println("P1: ("+p1.x+", "+p1.y+")");
        PointV1 p2 = new PointV1(5,5);
        //p2.x=7;
        //p2.y=8;
        p1.translate(5,4);
        System.out.println("P1': ("+p1.x+", "+p1.y+")");

        p1.translateV1(3,2);
        System.out.println("P1'': ("+p1.x+", "+p1.y+")");

        p1.setLocation(7,6);
        System.out.println("P1''': ("+p1.x+", "+p1.y+")");

        p1.setLocationV1(0,0);
        System.out.println("P1'''': ("+p1.x+", "+p1.y+")");

    }
}
/* instantiate */
