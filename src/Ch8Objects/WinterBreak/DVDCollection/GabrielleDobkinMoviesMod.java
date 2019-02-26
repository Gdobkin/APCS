package Ch8Objects.WinterBreak.DVDCollection;

import java.util.ArrayList;

//this program takes inputs for a bunch of movies, puts them into an array, and prints them
public class GabrielleDobkinMoviesMod {
    public static void main(String[] args) {
        GabrielleDobkinDVDCollectionMod movies = new GabrielleDobkinDVDCollectionMod(new ArrayList<>(), 0);
        movies.addDVD(new GabrielleDobkinDVDMod("The Godfather", "Francis Ford Coppala", 1972, 24.95, true));
        movies.addDVD(new GabrielleDobkinDVDMod("District 9", "Neill Blomkamp", 2009, 19.95, false));
        movies.addDVD(new GabrielleDobkinDVDMod("Iron Man", "Jon Favreau", 2008, 15.95, false));
        movies.addDVD(new GabrielleDobkinDVDMod("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false));
        movies.addDVD(new GabrielleDobkinDVDMod("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true));
        System.out.println(movies);
        movies.addDVD(new GabrielleDobkinDVDMod("Iron Man 2", "Jon Favreau", 2010, 22.99, false));
        movies.addDVD(new GabrielleDobkinDVDMod("Casablanca", "Michael Curtiz", 1942, 19.95, false));
        System.out.println(movies);
    }
}
