// Generated from C:/Users/rmama/IdeaProjects/rubrica/src/com/label\T.g4 by ANTLR 4.8
package com.label;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(TParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(TParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(TParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(TParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TParser.IntContext ctx);
}