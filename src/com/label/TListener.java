// Generated from C:/Users/rmama/IdeaProjects/rubrica/src/com/label\T.g4 by ANTLR 4.8
package com.label;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TParser}.
 */
public interface TListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(TParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(TParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(TParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(TParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(TParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(TParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(TParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(TParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(TParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(TParser.IntContext ctx);
}