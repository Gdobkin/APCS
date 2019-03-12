package Ch8Objects;

public class PointV5 {
    //state
     private int x;
     private int y;

    public static int getObjCount() {
        return objCount;
    }

    private static int objCount;

    //overloaded constructors
    public PointV5(int x, int y){
        this.x=x;
        this.y=y;
        objCount++;//static fields are local to the class they do not belong to the object
    }
    //default constructor
    public PointV5(){
        x=0;
        y=0;
        objCount++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //behavior
    public void translateV1(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }
    public void translate(int dx, int dy) {
        setX(getX()+dx);
        setY(getY()+dy);
    }
    public void setLocationV1(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setLocation(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    //toString method
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }

    //distance and distanceFrom
    public double distance(PointV5 other){
        return(Math.sqrt(Math.pow(this.x-other.x,2)+(Math.pow(this.y-other.y,2))));
    }

    public static double distanceFromTwo(PointV5 first, PointV5 second){
        return(Math.sqrt(Math.pow(first.x-second.x,2)+(Math.pow(first.y-second.y,2))));
    }

    public boolean equals(Object other){
        PointV5 o = (PointV5)other;
        return this.getX()==o.getX()&&this.getY()==o.getY();
    }
}
