package Ch8Objects.WinterBreak.DVDCollection;
//this program takes inputs for a bunch of movies, puts them into an array, and prints them
public class GabrielleDobkinMovies {
    public static void main(String[] args) {
        GabrielleDobkinDVDCollection movies = new GabrielleDobkinDVDCollection(new GabrielleDobkinDVD[0], 0,0);
        movies.addDVD(new GabrielleDobkinDVD("The Godfather", "Francis Ford Coppala", 1972, 24.95, true));
        movies.addDVD(new GabrielleDobkinDVD("District 9", "Neill Blomkamp", 2009, 19.95, false));
        movies.addDVD(new GabrielleDobkinDVD("Iron Man", "Jon Favreau", 2008, 15.95, false));
        movies.addDVD(new GabrielleDobkinDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false));
        movies.addDVD(new GabrielleDobkinDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true));
        System.out.println(movies);
        movies.addDVD(new GabrielleDobkinDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false));
        movies.addDVD(new GabrielleDobkinDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false));
        System.out.println(movies);
    }
}
