package Ch8Objects;

public class PointClientV3 {
    public static void main(String[] args) {
        PointV4 p1 = new PointV4(5,5);
        System.out.println("P1: ("+p1.getX()+", "+p1.getY()+")");
        p1.translate(5,4);
        System.out.println("P1': ("+p1.getX()+", "+p1.getY()+")");

        p1.translateV1(3,2);
        System.out.println("P1'': ("+p1.getX()+", "+p1.getY()+")");

        p1.setLocation(7,6);
        System.out.println("P1''': ("+p1.getX()+", "+p1.getY()+")");

        p1.setLocationV1(5,8);
        System.out.println("P1'''': ("+p1.getX()+", "+p1.getY()+")");

        System.out.println("p1 = " + p1 +"\n"+PointV4.getObjCount());
        double x = Math.PI;

    }
}
/* instantiate */
