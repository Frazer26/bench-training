package collections.set;

import java.util.*;

public class Movie {
//    Constructor lets us define the sorting
//    Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));

    private void iterateAscending(TreeSet<String> treeSet) {
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

            // ConcurrentModifiedException throwing
            // treeSet.remove("Matrix");
        }
    }

    private void iterateDescending(TreeSet<String> treeSet) {
        Iterator<String> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public static void main(String[] args) {
        Movie movie = new Movie();

        TreeSet<String> movies = new TreeSet<>();
        movies.add("Pulp Fiction");
        movies.add("Pulp Fiction");
        movies.add("Kill Bill");
        movies.add("Matrix");
        movies.add("RoboCop");
        movies.add("The Room");
        movies.add("Terminator");
        movie.iterateAscending(movies);
        System.out.println("\n" + "Descending order: ");
        movie.iterateDescending(movies);
        System.out.println("\n" + "TreeSet first element: " + movies.first());

        TreeSet<String> bestMovies = new TreeSet<>();
        bestMovies.add("Matrix");
        bestMovies.add("Pulp Fiction");

        //FromElement is inclusive, toElement is exclusive
        System.out.println("Subset:");
        movie.iterateAscending((TreeSet<String>) movies.subSet("Matrix","Terminator"));
    }
}
