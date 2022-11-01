// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link drawParser}.
 */
public interface drawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link drawParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(drawParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link drawParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(drawParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code init}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterInit(drawParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code init}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitInit(drawParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterUp(drawParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitUp(drawParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterDown(drawParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitDown(drawParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterLeft(drawParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitLeft(drawParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterRight(drawParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitRight(drawParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code draw}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterDraw(drawParser.DrawContext ctx);
	/**
	 * Exit a parse tree produced by the {@code draw}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitDraw(drawParser.DrawContext ctx);
	/**
	 * Enter a parse tree produced by the {@code display}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(drawParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code display}
	 * labeled alternative in {@link drawParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(drawParser.DisplayContext ctx);
}