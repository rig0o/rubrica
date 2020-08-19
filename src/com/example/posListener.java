// Generated from /home/rodrigo/IdeaProjects/listener2/src/com/example/pos.g4 by ANTLR 4.8
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link posParser}.
 */
public interface posListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link posParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(posParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link posParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(posParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link posParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(posParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link posParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(posParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suma}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterSuma(posParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitSuma(posParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resta}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterResta(posParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitResta(posParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterVacio(posParser.VacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitVacio(posParser.VacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link posParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(posParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link posParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(posParser.TermContext ctx);
}