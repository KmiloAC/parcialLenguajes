// Generated from TrigExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrigExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrigExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrigExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TrigExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinExpr(TrigExprParser.SinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosExpr(TrigExprParser.CosExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanExpr(TrigExprParser.TanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(TrigExprParser.NumberExprContext ctx);
}