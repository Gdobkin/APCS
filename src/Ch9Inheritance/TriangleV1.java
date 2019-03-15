package Ch9Inheritance;
//implements shape
public class TriangleV1 implements ShapeV1{
    private double s1;
    private double s2;
    private double s3;
    public TriangleV1(double s1, double s2, double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public double area(){
        double s = .5*(s1+s2+s3);
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    } public double perimeter(){
        return s1+s2+s3;
    }
}
