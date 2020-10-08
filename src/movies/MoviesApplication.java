package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] main = MoviesArray.findAll();
        System.out.println("Welcome to my Movie Application!");

        while (true){
            showMenu();
            Input input = new Input();
            int selection = input.getInt(0, 5, "Please enter a choice: ");
            if (selection == 0){
                break;
            } else if (selection == 1){
                printMovieList(main);
            } else if (selection == 2){
                printMovieList(main, "animated");
            } else if (selection == 3){
                printMovieList(main, "drama");
            } else if (selection == 4){
                printMovieList(main, "horror");
            } else {
                printMovieList(main, "scifi");
            }

        }
        System.out.println("Enjoy your movie!");
    }

    public static void showMenu(){
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println();
    }

    public static void printMovie(Movie film){
        System.out.println(film.getMovieName() + " -- " + film.getMovieCategory());
    }

    public static void printMovieList(Movie[] main){
        System.out.println();
        System.out.println("=========================");
        for (Movie movie : main){
            printMovie(movie);
        }
        System.out.println("=========================");
        System.out.println();
    }
    public static void printMovieList(Movie[] main, String category){
        System.out.println();
        System.out.println("=========================");
        for (Movie movie : main){
            if (movie.getMovieCategory().equalsIgnoreCase(category)){
                printMovie(movie);
            }
        }
        System.out.println("=========================");
        System.out.println();
    }

    public static Movie addMovie(String name, String category){
        Movie newMovie = new Movie(name, category);
        return newMovie;
    }

//    public static Movie[] addMovieToArray(Movie [] movieArray, Movie film){
//        // Copy the original array into the result array with length + 1
//        // Add film as the object of the last element in the array
//        // return the result array
//    }
}
