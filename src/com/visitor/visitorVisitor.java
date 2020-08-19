// Generated from C:/Users/rmama/IdeaProjects/rubrica/src/com/visitor\visitor.g4 by ANTLR 4.8
package com.visitor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link visitorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface visitorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link visitorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(visitorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(visitorParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(visitorParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(visitorParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(visitorParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link visitorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(visitorParser.IntContext ctx);
}