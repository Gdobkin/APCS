package Ch8Objects;

public class PointClientV1 {
    public static void main(String[] args) {
        PointV1 p1 = new PointV1();
        System.out.println("P1: ("+p1.x+", "+p1.y+")");
        p1.x = 5;
        p1.y = 7;
        System.out.println("P1: ("+p1.x+", "+p1.y+")");
    }
}
