package objects;

public class ObjectsExercise {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Cinderella", "wilfred Jackson", 4.28, "USA", 76);
        Movie movie2 = new Movie("Into the Woods", "Rob Marshall", 213.1, "USA", 125);
        Movie movie3 = new Movie("One Spoon of Chocolate", "RZA", "USA", 112);

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
        System.out.println(movie3.toString());
    }

}
