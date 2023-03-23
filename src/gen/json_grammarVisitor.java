// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link json_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface json_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(json_grammarParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(json_grammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(json_grammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(json_grammarParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(json_grammarParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(json_grammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(json_grammarParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(json_grammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(json_grammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(json_grammarParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(json_grammarParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(json_grammarParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(json_grammarParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(json_grammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(json_grammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(json_grammarParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(json_grammarParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#onenine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnenine(json_grammarParser.OnenineContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(json_grammarParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(json_grammarParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(json_grammarParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link json_grammarParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(json_grammarParser.WsContext ctx);
}