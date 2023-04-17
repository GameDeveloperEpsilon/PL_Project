package main;

import gen3.JSON3Lexer;
import gen3.JSON3Parser;
import gen3.TableMakerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.Scanner;

public class User {

    public static User makeUserFromJSONString(String jsonString) {

        CharStream charStream = CharStreams.fromString(jsonString);
        JSON3Lexer lexer = new JSON3Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JSON3Parser parser = new JSON3Parser(tokenStream);

        JSON3Parser.JsonContext jsonContext = parser.json();
        TableMakerVisitor jsonVisitor = new TableMakerVisitor();
        jsonVisitor.visitJson(jsonContext);

        HashMap<String, String> memberMap = jsonVisitor.table;

        final int id = Integer.parseInt(memberMap.get("\"id\""));
        final String raw_name = memberMap.get("\"name\"");
        final String name = raw_name.substring(1, raw_name.length() - 1);
        final int age = Integer.parseInt(memberMap.get("\"age\""));

        return new User(id, name, age);
    }

    public static User makeUserFromUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        //scanner.close();

        return new User(id, name, age);
    }

    public int id;
    public String name;
    public int age;
    public String hobby;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " + id + " " + name + " " + age;
    }

    public String toJSONString() {
        final String idMember = String.format("\t\"id\":%d,\n", id);
        final String nameMember = String.format("\t\"name\":\"%s\",\n", name);
        final String ageMember = String.format("\t\"age\":%d\n", age);
        return String.format("{\n%s%s%s}", idMember, nameMember, ageMember);
    }
}
