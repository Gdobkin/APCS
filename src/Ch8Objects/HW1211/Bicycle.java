package Ch8Objects.HW1211;

public class Bicycle {
    private int price;
    private boolean isPurchased;
    private String condition;
    private double psi;
    private int wheels;
    private int numGears;
    private int ageRange;
    private String color;
    private double rpm;
    private boolean isBraking;
    private boolean isInMotion;

    public Bicycle(int price, boolean isPurchased, String condition, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange=ageRange;
        this.color=color;
    }
    public Bicycle(int price, boolean isPurchased, String condition, int ageRange, String color, int numGears) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange=ageRange;
        this.color=color;
        this.numGears=numGears;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public String getCondition() {
        return condition;
    }

    public double getPsi() {
        return psi;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumGears() {
        return numGears;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getColor() {
        return color;
    }

    public double getRpm() {
        return rpm;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public boolean isInMotion() {
        return isInMotion;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;//this can be set to whatever is passed because what if the bike is for sale
    }

    public void setCondition(String condition) {//condition can be any condition not just used or new, like a book (good, very good, ok...)
        this.condition = condition;
    }

    public void setPsi(double psi) {
        this.psi = psi;
    }

    public void setBraking(boolean braking) {
        isBraking = braking;
    }

    public void setInMotion(boolean inMotion) {
        isInMotion = inMotion;
    }

    public String toString(){
        return "Price: "+price+" Age range: "+ageRange+ " Color: "+ color;
    }
}
