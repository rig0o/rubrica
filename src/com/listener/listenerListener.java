// Generated from /home/rodrigo/IdeaProjects/listener2/src/com/listener.g4 by ANTLR 4.8
package com.listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link listener}.
 */
public interface listenerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link listener#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(listener.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link listener#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(listener.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link listener#heder}.
	 * @param ctx the parse tree
	 */
	void enterHeder(listener.HederContext ctx);
	/**
	 * Exit a parse tree produced by {@link listener#heder}.
	 * @param ctx the parse tree
	 */
	void exitHeder(listener.HederContext ctx);
	/**
	 * Enter a parse tree produced by {@link listener#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(listener.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link listener#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(listener.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void enterTexto(listener.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void exitTexto(listener.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void enterString(listener.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void exitString(listener.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vacio}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void enterVacio(listener.VacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vacio}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 */
	void exitVacio(listener.VacioContext ctx);
}