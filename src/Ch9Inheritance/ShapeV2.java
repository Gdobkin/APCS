package Ch9Inheritance;
//Shape is an interface with two methods in it
//area and perimeter. Any class that implements shape is
//responsible to implement its inherited area and perimeter
//methods
public abstract class ShapeV2 implements Comparable {
    public abstract double area();
    public abstract double perimeter();
    public double getArea(){
        return this.area();
    }

    public int compareTo(Object other){
        try {
            if (this.area() > ((ShapeV2) (other)).area()) {
                return 1;
            } else if (this.area() < ((ShapeV2) (other)).area()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e){
            System.out.println("Doesn't work");
            return -666;
        }
    }
}
