import main.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting presentation!");

//        Procedure
//        1 User fills out form
        System.out.println("Filling out form!");
        User user = User.makeUserFromUserInput();
        System.out.println("User: " + user.id + " " + user.name);
//        2 Form is saved to JSON
        System.out.println("Translating form object to JSON!");
//        3 JSON is saved to a file
        System.out.println("Saving JSON string!");

//        4 File is loaded
        System.out.println("Loading file!");
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("test.json"))) {
            while (reader.ready()) {
                String line = reader.readLine();
                stringBuilder.append(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        5 File is parsed
        System.out.println("Parsing file string!");
        User.makeUserFromJSONString(stringBuilder.toString());

        // 6 Display attributes
        System.out.println("Displaying attributes!");

        System.out.println("Ending presentation!");
    }
}