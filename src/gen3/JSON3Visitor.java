// Generated from C:/Users/Rec/Forge/Java_WS/PL_Project/src\JSON3.g4 by ANTLR 4.12.0
package gen3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSON3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSON3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSON3Parser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JSON3Parser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(JSON3Parser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(JSON3Parser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSON3Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(JSON3Parser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JSON3Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JSON3Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSON3Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JSON3Parser.NumberContext ctx);
}