// Generated from C:/Users/rmama/IdeaProjects/rubrica/src/com/visitor\visitor.g4 by ANTLR 4.8
package com.visitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link visitorParser}.
 */
public interface visitorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link visitorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(visitorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link visitorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(visitorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDiv(visitorParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDiv(visitorParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(visitorParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(visitorParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMenos(visitorParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMenos(visitorParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPlus(visitorParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPlus(visitorParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(visitorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(visitorParser.IntContext ctx);
}