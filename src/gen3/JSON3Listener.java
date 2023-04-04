// Generated from C:/Users/Rec/Forge/Java_WS/PL_Project/src\JSON3.g4 by ANTLR 4.12.0
package gen3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSON3Parser}.
 */
public interface JSON3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSON3Parser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSON3Parser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSON3Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSON3Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(JSON3Parser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(JSON3Parser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(JSON3Parser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(JSON3Parser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSON3Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSON3Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(JSON3Parser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(JSON3Parser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JSON3Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JSON3Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSON3Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSON3Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSON3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSON3Parser.NumberContext ctx);
}