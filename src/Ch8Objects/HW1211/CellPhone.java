package Ch8Objects.HW1211;

public class CellPhone {

    private int numOfApps;
    private String phoneNumber;
    private boolean isCracked;
    private String color;
    private boolean hasCase;
    private String caseColor;
    private int battery;
    private String owner;

    public CellPhone(int numOfApps, String phoneNumber, String color, int battery, String owner) {
        this.numOfApps = numOfApps;
        this.phoneNumber = phoneNumber;
        this.color = color;
        this.battery = battery;
        this.owner = owner;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getOwner(){
        return owner;
    }

    public int getBattery(){
        return battery;
    }

    public boolean isHasCase() {
        return hasCase;
    }

    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public boolean isCracked() {
        return isCracked;
    }

    public String getColor() {
        return color;
    }

    public void setCracked(boolean cracked) {
        isCracked = cracked;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public void setNumOfApps(int numOfApps) {
        this.numOfApps = numOfApps;
    }
    public void charge(){
        battery=100;
        System.out.println("Battery is not at 100%");
    }

    public String toString(){
        return "Owner: "+ owner+" Battery level: "+ battery+"% Color: "+ color + " Has a case? "+ hasCase;
    }
}
