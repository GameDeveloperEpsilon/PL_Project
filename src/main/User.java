package main;

import gen3.JSON3Lexer;
import gen3.JSON3Parser;
import gen3.JSON3Visitor;
import gen3.TableMakerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class User {

    public static User makeUserFromJSONString(String jsonString) {

        CharStream charStream = CharStreams.fromString(jsonString);
        JSON3Lexer lexer = new JSON3Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JSON3Parser parser = new JSON3Parser(tokenStream);

        JSON3Parser.JsonContext jsonContext = parser.json();
        JSON3Visitor<String> jsonVisitor = new TableMakerVisitor();
        jsonVisitor.visitJson(jsonContext);

        final int id = 5;
        final String name = "Pete";
        final int age = 6;

        return new User(id, name, age);
    }

    public static User makeUserFromUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        return new User(id, name, age);
    }

    public int id;
    public String name;
    public int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
