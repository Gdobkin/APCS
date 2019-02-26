package Ch9Inheritance;

public class CarClient {
    public static void main(String[] args) {
        Car mycar = new Car();
        Truck mytruck = new Truck();


        System.out.println(mytruck);
        mytruck.m1();
        mytruck.m2();
    }
}
