package Ch9Inheritance;

public class ShapeClientV2 {
    public static void main(String[] args) {
        ShapeV2[] shapes = {new CircleV2(1),new TriangleV2(3,4,5), new RectangleV2(4,3)};
        shapeInfo(shapes);
        System.out.println(shapes[1].compareTo("Hello"));
    }
    public static void shapeInfo(ShapeV2[] shapes){
        for(ShapeV2 s: shapes){
            System.out.println(s.area() + " " + s.perimeter());
        }
    }
}
                                                 