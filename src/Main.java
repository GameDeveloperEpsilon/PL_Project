import main.User;

import java.io.*;
import java.util.Scanner;

public class Main {
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
        User user = step1();
        String jsonString = step2(user);
        step3(jsonString);
    }

    private static void decipherJSON() {
        // Decipher JSON File
        StringBuilder stringBuilder = step4();
        User retreivedUser = step5(stringBuilder);
        step6(retreivedUser);
    }

    private static User step1() {
        // 1 User fills out form
        System.out.println("1. Filling out form!");
        User user = User.makeUserFromUserInput();
        System.out.println(user);
        return user;
    }

    private static String step2(User user) {
        // 2 Form is saved to JSON
        System.out.println("2. Translating form object to JSON!");
        String jsonString = user.toJSONString();
        System.out.println(jsonString);
        return jsonString;
    }

    private static void step3(String jsonString) {
        // 3 JSON is saved to a file
        System.out.println("3. Saving JSON string!");
        System.out.println("Enter the name of the file to store the json string.");
        Scanner scanner = new Scanner(System.in);
        final String fileName = scanner.next() + ".json";
        //scanner.close();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static StringBuilder step4() {
        // 4 File is loaded
        System.out.println("4. Loading file!");
        StringBuilder stringBuilder = new StringBuilder();
        do {
            System.out.println("Enter the name of the file to load the json string.");
            Scanner scanner = new Scanner(System.in);
            final String fileName = scanner.next() + ".json";
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

    private static User step5(StringBuilder stringBuilder) {
        // 5 File is parsed
        System.out.println("5. Parsing file string!");
        return User.makeUserFromJSONString(stringBuilder.toString());
    }

    private static void step6(User retrievedUser) {
        // 6 Display attributes
        System.out.println("6. Displaying attributes!");
        System.out.println(retrievedUser);
    }
}