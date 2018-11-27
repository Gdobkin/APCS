package Ch8Objects;

import java.awt.*;

public class PointV1 {
    //state
    public int x;
    public int y;

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
    public void setLocationV1(int newX, int newY){
        x = newX;
        y = newY;
    }
    public void setLocation(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    //distance and distanceFrom
    public double distance(PointV1 other){
        return(Math.sqrt(Math.pow(this.x-other.x,2)+(Math.pow(this.y-other.y,2))));
    }
    public static double distanceFromTwo(PointV1 first, PointV1 second){
        return(Math.sqrt(Math.pow(first.x-second.x,2)+(Math.pow(first.y-second.y,2))));
    }
    //constructors
    public PointV1(){

    }
    public PointV1(int x, int y){

    }
}
