package test;

import gen3.JSON3Lexer;
import gen3.JSON3Parser;
import gen3.TableMakerVisitor;
import generator.JSONSerializable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.Scanner;

public class User implements JSONSerializable {

    public static User makeUserFromJSONString(String jsonString) {  // Factory method

        CharStream charStream = CharStreams.fromString(jsonString);  // Make a CharStream from the JSON String
        JSON3Lexer lexer = new JSON3Lexer(charStream);  // Make a Lexer using the CharStream
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);  // Make a TokenStream using the Lexer
        JSON3Parser parser = new JSON3Parser(tokenStream);  // Make a Parser using the TokenStream

        JSON3Parser.JsonContext jsonContext = parser.json();  // Using the json parsing rule, create a context
        TableMakerVisitor jsonVisitor = new TableMakerVisitor();  // Make a TableMaker to produce a field table
        jsonVisitor.visitJson(jsonContext);  // Visit the parse tree

        HashMap<String, String> fieldTable = jsonVisitor.table;  // Get field table

        // Grab values from field table
        final int id = Integer.parseInt(fieldTable.get("\"id\""));
        final String raw_name = fieldTable.get("\"name\"");
        final String name = raw_name.substring(1, raw_name.length() - 1);  // Remove quotes
        final int age = Integer.parseInt(fieldTable.get("\"age\""));

        return new User(id, name, age);  // Create and return User object
    }

    public static User makeUserFromUserInput() {  // Factory method

        Scanner scanner = new Scanner(System.in);  // Set up console input

        System.out.print("Enter id: ");  // Prompt
        int id = Integer.parseInt(scanner.nextLine());  // Get id from user
        System.out.print("Enter name: ");  // Prompt
        String name = scanner.nextLine();  // Get name from user
        System.out.print("Enter age: ");  // Prompt
        int age = Integer.parseInt(scanner.nextLine());  // Get age from user

        return new User(id, name, age);  // Create and return User object
    }

    public int id;
    public String name;
    public int age;
    //public String hobby;

    private User(int id, String name, int age) {  // Constructor
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {  // Pretty printing
        return "User: id=" + id + ", name=" + name + ", age=" + age;
    }

    @Override
    public String toJSONString() {  // From JSONSerializable
        final String idMember = String.format("\"id\":%d", id);  // "id":5
        final String nameMember = String.format("\"name\":\"%s\"", name);  // "name":"Some name"
        final String ageMember = String.format("\"age\":%d", age);  // "age":49
        return String.format("{\n\t%s,\n\t%s,\n\t%s\n}", idMember, nameMember, ageMember);  // Return {id,name,age}
    }
}
