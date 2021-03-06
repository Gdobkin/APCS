package Ch8Objects;

public class PointClientV1 {
    public static void main(String[] args) {
        PointV3 p1 = new PointV3(5,5);
        System.out.println("P1: ("+p1.x+", "+p1.y+")");
        p1.translate(5,4);
        System.out.println("P1': ("+p1.x+", "+p1.y+")");

        p1.translateV1(3,2);
        System.out.println("P1'': ("+p1.x+", "+p1.y+")");

        p1.setLocation(7,6);
        System.out.println("P1''': ("+p1.x+", "+p1.y+")");

        p1.setLocationV1(5,8);
        System.out.println("P1'''': ("+p1.x+", "+p1.y+")");

        System.out.println("p1 = " + p1);
    }
}
/* instantiate */
