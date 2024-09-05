// Generated from TrigExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigExprParser}.
 */
public interface TrigExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TrigExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TrigExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSinExpr(TrigExprParser.SinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSinExpr(TrigExprParser.SinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosExpr(TrigExprParser.CosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosExpr(TrigExprParser.CosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTanExpr(TrigExprParser.TanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTanExpr(TrigExprParser.TanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(TrigExprParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link TrigExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(TrigExprParser.NumberExprContext ctx);
}