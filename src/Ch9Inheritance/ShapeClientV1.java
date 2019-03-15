package Ch9Inheritance;

public class ShapeClientV1 {
    public static void main(String[] args) {
        ShapeV1[] shapes = {new CircleV1(1),new TriangleV1(3,4,5), new RectangleV1(4,3)};
        shapeInfo(shapes);
    }
    public static void shapeInfo(ShapeV1[] shapes){
        for(ShapeV1 s: shapes){
            System.out.println(s.area() + " " + s.perimeter());
        }
    }
}
                                                 