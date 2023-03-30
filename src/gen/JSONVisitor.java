// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JSONParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JSONParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(JSONParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(JSONParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSONParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(JSONParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JSONParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JSONParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(JSONParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JSONParser.NumberContext ctx);
}