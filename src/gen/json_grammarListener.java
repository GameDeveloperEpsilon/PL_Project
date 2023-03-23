// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link json_grammarParser}.
 */
public interface json_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(json_grammarParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(json_grammarParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(json_grammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(json_grammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(json_grammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(json_grammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(json_grammarParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(json_grammarParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(json_grammarParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(json_grammarParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(json_grammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(json_grammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(json_grammarParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(json_grammarParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(json_grammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(json_grammarParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(json_grammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(json_grammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(json_grammarParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(json_grammarParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(json_grammarParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(json_grammarParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(json_grammarParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(json_grammarParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(json_grammarParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(json_grammarParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(json_grammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(json_grammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(json_grammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(json_grammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(json_grammarParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(json_grammarParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(json_grammarParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(json_grammarParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#onenine}.
	 * @param ctx the parse tree
	 */
	void enterOnenine(json_grammarParser.OnenineContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#onenine}.
	 * @param ctx the parse tree
	 */
	void exitOnenine(json_grammarParser.OnenineContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(json_grammarParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(json_grammarParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(json_grammarParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(json_grammarParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(json_grammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(json_grammarParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_grammarParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(json_grammarParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_grammarParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(json_grammarParser.WsContext ctx);
}