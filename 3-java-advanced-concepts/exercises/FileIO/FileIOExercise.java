package FileIO;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;

public static class FileIOExercise {
    public static void main(String[] args) {

    }

    // File IO Exercise
    // ========================
    // Complete the numbered tasks below

    // 1. Write the line "Hello, World!" to a text file named exercise_file1.txt
    // the file should be stored in the same directory as this exercise file.
    // if the file already exists, it should be overwritten, not appended
    public void helloWorldFile() {
        Path path = Path.of("3-java-advanced-concepts/exercises/FileIO/exercise_file1.txt");
        ArrayList<String> message = new ArrayList<>();

        message.add("Hello, World!");

        try {
            Files.write(path, message, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 2. Read all the lines from the text file named exercise_file2.txt
    // return the lines as an ArrayList of Strings
    public ArrayList<String> readFile() {
        Path path = Path.of("3-java-advanced-concepts/exercises/FileIO/exercise_file2.txt");
        ArrayList<String> lines = new ArrayList<>();
        try {
            lines.addAll(Files.readAllLines(path));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }

    // 3. Create a method that takes in a String named fruit
    // and append it to the end of the text file named exercise_file2.txt
    public ArrayList<String> appendToFile(String fruit) {
        Path path = Path.of("3-java-advanced-concepts/exercises/FileIO/exercise_file2.txt");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add(fruit);

        try {
            Files.write(path, fruits, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fruits;
    }

    // 4. Create a method that removes the String fruit passed as a parameter
    // from the exercise_file2.txt file
    public void removeFromFile(String fruit) throws IOException {
        Path path = Path.of("3-java-advanced-concepts/exercises/FileIO/exercise_file2.txt");
        try {
            if (Files.deleteIfExists(path)) {
                System.out.println("file deleted.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5. Create a new class in this directory that you can practice serializing and deserializing
    // It should have at least one of each of the following datatypes as properties:
    // String
    // LocalDate or LocalTime
    // BigDecimal


    // 6. Create a method to serialize your new object into a csv line in the text file exercise_file3.txt
     public static void serializetoys(Path classFile, String toys) {
        classFile = Paths.get("3-java-advanced-concepts/exercises/FileIO/NewClass.java");
        toys = ("Barbie");
        serializetoys(classFile, toys);

         System.out.println(toys);

         try {
             if (Files.exists(classFile)) {
                 Files.write(classFile, (toys + "\n").getBytes(), StandardOpenOption.APPEND);
             } else {
                 Files.write(classFile, (toys + "\n").getBytes(), StandardOpenOption.CREATE);
             }
             } catch (IOException e) {
             e.printStackTrace();
         }



     }
     }

    // 7. Create a method to deserialize your new object from the exercise_file3.txt into an ArrayList of Objects
    public static ArrayList<NewClass> deserializeToys(Path classFile) {
        ArrayList<NewClass> toys = new ArrayList<>();

        try {
            for (String toy : Files.readAllLines(classFile)) {
                String[] csvLine = toy.split(",");
                String[] releaseDate = csvLine[2].split("-");
                NewClass toyBox = new NewClass("Barbie", LocalDate.of(2025, 07, 01), BigDecimal.valueOf(15.99));
                toys.add(toyBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toys;

    }

void main() {
}




