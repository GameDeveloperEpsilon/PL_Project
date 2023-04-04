import main.User;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting presentation!\n");

//        Procedure
//        1 User fills out form
        System.out.println("1. Filling out form!");
        User user = User.makeUserFromUserInput();
        System.out.println(user);

//        2 Form is saved to JSON
        System.out.println("2. Translating form object to JSON!");
        String jsonString = user.toJSONString();
        System.out.println(jsonString);

        //        3 JSON is saved to a file
        System.out.println("3. Saving JSON string!");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.json"))) {
            writer.write(jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        4 File is loaded
        System.out.println("4. Loading file!");
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("test.json"))) {
            while (reader.ready()) {
                String line = reader.readLine();
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        5 File is parsed
        System.out.println("5. Parsing file string!");
        User retrievedUser = User.makeUserFromJSONString(stringBuilder.toString());

        // 6 Display attributes
        System.out.println("6. Displaying attributes!");
        System.out.println(retrievedUser);

        System.out.println("\nEnding presentation!");
    }
}