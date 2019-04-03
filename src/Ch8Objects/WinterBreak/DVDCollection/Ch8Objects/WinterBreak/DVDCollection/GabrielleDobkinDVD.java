package Ch8Objects.WinterBreak.DVDCollection.Ch8Objects.WinterBreak.DVDCollection;

import java.text.DecimalFormat;

public class GabrielleDobkinDVD {
    /**
     * These are the state fields and they represent attributes of DVDs
     */
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     * This is a constructor for a DVD. It will be used to instantiate an instance of the DVD class
     * @param title - title of the movie
     * @param director -  director of the movie
     * @param year -  year the movie was made
     * @param cost - cost to buy the DVD
     * @param blueray - whether or not it is a blueray DVD
     */
    public GabrielleDobkinDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * This is a getter for the cost value because it is a private field but its value will later be used in DVDCollection to get total cost
     * @return - cost is returned
     */
    public double getCost() {
        return cost;
    }

    /**
     * This method formats the output seen in printing a single DVD
     * It has two possible options of what to print depending on whether or not the DVD is bluray
     * it also contains several for loops and a DecimalFormat object to help with formatting
     * @return - returns the fully constructed String
     */
    public String toString (){
        String spaces = ""; //this variable and subsequent for loop will be used to line up jagged spaces between title and director
        for(int i = 0; i<14-title.length(); i++){
            spaces+=" ";
        }
        String spaces2=""; //this variable and subsequent for loop will be used to line up jagged spaces between director and bluray
        for(int i =0; i<21-director.length();i++){
            spaces2+=" ";
        }
        DecimalFormat price = new DecimalFormat("#.00");//this is used to format the decimal of price so all the prices include cent costs
        if(blueray){
            return "$"+price.format(cost)+" "+year+"  "+title+spaces+director+spaces2+"\tBlu-Ray";
        } else{
            return "$"+price.format(cost)+" "+year+"  "+title+spaces+director;
        }
    }
}
