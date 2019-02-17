package Ch8Objects.WinterBreak.DVDCollection;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GabrielleDobkinDVDCollection {
    /**
     * The state fields for this object include the Array that will hold DVDS, the count number of total DVDs, and the totalCost of all DVDs
     */
    private ArrayList<GabrielleDobkinDVD> collection;
   // private int count;
    private double totalCost;

    /**
     * This method adds a DVD object into the list of DVD objects
     * It contains a recursive loop which calls the increaseSize method if the array is too small to hold another DVD and them restarts the method
     * @param newDVD - this is the new DVD object that is being added to the list
     */
    public void addDVD(GabrielleDobkinDVD newDVD){
        collection.add(newDVD);
        totalCost+=newDVD.getCost();
    }

    /**
     * This is the constructor for the DVD collection class
     * @param collection - the array of DVD objects
     * @param totalCost - the total cost of dvds in the array
     */
    public GabrielleDobkinDVDCollection(ArrayList<GabrielleDobkinDVD> collection, double totalCost) {
        this.collection = collection;
        this.totalCost = totalCost;
    }

    /**
     * This toString method works off of a cummulative string variable and it collects all the nessesary pieces to print
     * @return - the end result of the toReturn string is returned and ready to print
     */
    public String toString(){//\n characters are used for formatting purposes
        String toReturn = "";
        toReturn+="My DVD Collection\n\n";
        DecimalFormat price = new DecimalFormat("#.00");//makes sure that the total and average cost both go to the hundredths place
        toReturn+="Number of DVDs: "+collection.size()+"\n";
        toReturn+="Total Cost: $"+price.format(totalCost)+"\n";
        toReturn+="Average Cost: $"+price.format(totalCost/collection.size())+"\n\n";
        toReturn+="DVD List:\n\n";
        for(int i = 0; i<collection.size();i++){//adds all the movies
            toReturn+=(collection.get(i)+"\n");
        }
        return toReturn;
    }
}
