package Ch8Objects.BankAccountProgram;

public class Address {
    private int houseNum;
    private String streetName;
    private String town;
    private String state;
    private int zip;
    private String apt;

    public Address(int houseNum, String streetName, String town, String state, int zip) {
        this.houseNum = houseNum;
        this.streetName = streetName;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String toString(){
        return houseNum+" "+streetName+" \n"+town+" "+state+" "+zip;
    }
}
