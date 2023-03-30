// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(JSONParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(JSONParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(JSONParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(JSONParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(JSONParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(JSONParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JSONParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JSONParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JSONParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JSONParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(JSONParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(JSONParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSONParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSONParser.NumberContext ctx);
}