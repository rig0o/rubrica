// Generated from /home/rodrigo/IdeaProjects/listener2/src/com/listener.g4 by ANTLR 4.8
package com.listener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link listener}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface listenerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link listener#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(listener.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link listener#heder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeder(listener.HederContext ctx);
	/**
	 * Visit a parse tree produced by {@link listener#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(listener.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(listener.TextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(listener.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vacio}
	 * labeled alternative in {@link listener#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacio(listener.VacioContext ctx);
}