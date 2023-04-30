package harness;

import test.User;

import java.io.*;
import java.util.Scanner;

public class Main {

    /**
     * Entry point - dictates execution pattern
     * @param args -create for generation, -decipher for parsing, and no args for generation and parsing
     */
    public static void main(String[] args) {

        System.out.println("Starting presentation!\n");

        // Procedure

        if (args.length == 0) {
            generateJSON();
            decipherJSON();
        } else if (args[0].equals("-create")) {
            generateJSON();
        } else if (args[0].equals("-decipher")) {
            decipherJSON();
        }

        System.out.println("\nEnding presentation!");
    }

    private static void generateJSON() {
        // Generate JSON File
        User user = createTestUser();
        String jsonString = translateUserToJSON(user);
        saveJSONStringToFile(jsonString);
    }

    private static void decipherJSON() {
        // Decipher JSON File
        StringBuilder stringBuilder = loadJSONStringFROMFile();
        User retreivedUser = makeUserFromJSONString(stringBuilder);
        displayUserFields(retreivedUser);
    }

    private static User createTestUser() {
        // User fills out form
        System.out.println("- Creating test User");
        User user = User.makeUserFromUserInput();
        System.out.println(user);
        return user;
    }

    private static String translateUserToJSON(User user) {
        // Form is saved to JSON
        System.out.println("- Translating User object to JSON string");
        String jsonString = user.toJSONString();
        System.out.println(jsonString);
        return jsonString;
    }

    private static void saveJSONStringToFile(String jsonString) {
        // JSON is saved to a file
        System.out.println("- Saving JSON string to JSON file");
        System.out.println("Enter the name of the file to store the json string.");
        Scanner scanner = new Scanner(System.in);
        final String fileName = scanner.nextLine() + ".json";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static StringBuilder loadJSONStringFROMFile() {
        // File is loaded
        System.out.println("- Loading JSON string from file");
        StringBuilder stringBuilder = new StringBuilder();
        do {
            System.out.println("Enter the name of the file to load the json string.");
            Scanner scanner = new Scanner(System.in);
            final String fileName = scanner.nextLine() + ".json";
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                    String line = reader.readLine();
                    stringBuilder.append(line);
                }
                break;
            } catch (FileNotFoundException ignored) {
                System.err.println("File not found!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (true);
        return stringBuilder;
    }

    private static User makeUserFromJSONString(StringBuilder stringBuilder) {
        // File is parsed
        System.out.println("- Parsing file string");
        return User.makeUserFromJSONString(stringBuilder.toString());
    }

    private static void displayUserFields(User retrievedUser) {
        // Display attributes
        System.out.println("- Displaying User fields");
        System.out.println(retrievedUser);
    }
}