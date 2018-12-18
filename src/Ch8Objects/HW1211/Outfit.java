package Ch8Objects.HW1211;

public class Outfit {
    private String colorShirt;
    private boolean isWearingDress;
    private String colorPants;
    private int sizeShoes;
    private String shoeBrand;
    private int waistLength;
    private int shirtSize;
    private int accessories;

//constructor
    public Outfit(String colorShirt, String colorPants, int sizeShoes, String shoeBrand, int shirtSize, int waistLength ){
        this.colorShirt = colorShirt;
        this.colorPants = colorPants;
        this.sizeShoes = sizeShoes;
        this.shoeBrand = shoeBrand;
        this.shirtSize = shirtSize;
        this.waistLength = waistLength;
    }
//getters
    public String getColorShirt() {
        return colorShirt;
    }

    public boolean isWearingDress() {
        return isWearingDress;
    }

    public String getColorPants() {
        return colorPants;
    }

    public int getSizeShoes() {
        return sizeShoes;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public int getWaistLength() {
        return waistLength;
    }

    public int getShirtSize() {
    return shirtSize;
    }

    public int getAccessories() {
        return accessories;
    }
//setters

    public void setAccessories(int accessories) {
        this.accessories = accessories;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public void setColorPants(String colorPants) {
        this.colorPants = colorPants;
    }

    public void setWearingDress(boolean wearingDress) {
        isWearingDress = wearingDress;
    }

    public void setColorShirt(String colorShirt) {
        this.colorShirt = colorShirt;
    }
    public String toString(){
        return ("Shirt Color: " + colorShirt + " Color pants: " + colorPants + " Shoe brand: " + shoeBrand + " Number of Accessories: " + accessories );
    }
}
