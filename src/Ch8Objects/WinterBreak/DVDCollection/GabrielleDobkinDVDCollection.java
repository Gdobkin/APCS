package Ch8Objects.WinterBreak.DVDCollection;

import java.text.DecimalFormat;

public class GabrielleDobkinDVDCollection {
    /**
     * The state fields for this object include the Array that will hold DVDS, the count number of total DVDs, and the totalCost of all DVDs
     */
    private GabrielleDobkinDVD[] collection;
    private int count;
    private double totalCost;

    /**
     * This method adds a DVD object into the list of DVD objects
     * It contains a recursive loop which calls the increaseSize method if the array is too small to hold another DVD and them restarts the method
     * @param newDVD - this is the new DVD object that is being added to the list
     */
    public void addDVD(GabrielleDobkinDVD newDVD){
        if(count<collection.length) {//if there is space for another movie
            collection[count] = newDVD;
            count++;//count is the number of movies so when a movie is added count is incremented
            totalCost+=newDVD.getCost();//adds the cost of the new dvd to the total cost
        } else{ //if the array is too small, the increase size method is called to make it bigger
            this.increaseSize();
            this.addDVD(newDVD);
        }
    }

    /**
     * This is a complex method which extends the size of the DVD array if it is too small
     */
    private void increaseSize(){
        GabrielleDobkinDVD[] larger= new GabrielleDobkinDVD[count+1];//larger is a temporary array that will be one larger than collection
        for(int i = 0; i<count; i++){//goes until count because count is how many DVDs
            larger[i]=collection[i];//larger is filled with collection (the last index will be empty)
        }
        collection=larger;//larger is dereferenced as collection becomes larger. the old collection is gone
    }

    /**
     * This is the constructor for the DVD collection class
     * @param collection - the array of DVD objects
     * @param count - the number of movies
     * @param totalCost - the total cost of dvds in the array
     */
    public GabrielleDobkinDVDCollection(GabrielleDobkinDVD[] collection, int count, double totalCost) {
        this.collection = collection;
        this.count = count;
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
        toReturn+="Number of DVDs: "+count+"\n";
        toReturn+="Total Cost: $"+price.format(totalCost)+"\n";
        toReturn+="Average Cost: $"+price.format(totalCost/count)+"\n\n";
        toReturn+="DVD List:\n\n";
        for(int i = 0; i<count;i++){//adds all the movies
            toReturn+=(collection[i]+"\n");
        }
        return toReturn;
    }
}
