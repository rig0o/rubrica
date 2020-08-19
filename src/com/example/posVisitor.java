// Generated from /home/rodrigo/IdeaProjects/listener2/src/com/example/pos.g4 by ANTLR 4.8
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link posParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface posVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link posParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(posParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link posParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(posParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(posParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(posParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link posParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacio(posParser.VacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link posParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(posParser.TermContext ctx);
}