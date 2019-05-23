// Generated from PlainEnglish.g4 by ANTLR 4.4

	package lexerparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlainEnglishParser}.
 */
public interface PlainEnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#parameterArg}.
	 * @param ctx the parse tree
	 */
	void enterParameterArg(@NotNull PlainEnglishParser.ParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#parameterArg}.
	 * @param ctx the parse tree
	 */
	void exitParameterArg(@NotNull PlainEnglishParser.ParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PlainEnglishParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PlainEnglishParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(@NotNull PlainEnglishParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(@NotNull PlainEnglishParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression2(@NotNull PlainEnglishParser.FunctionExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression2(@NotNull PlainEnglishParser.FunctionExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull PlainEnglishParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull PlainEnglishParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(@NotNull PlainEnglishParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(@NotNull PlainEnglishParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PlainEnglishParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PlainEnglishParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull PlainEnglishParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull PlainEnglishParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull PlainEnglishParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull PlainEnglishParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression2(@NotNull PlainEnglishParser.LogicalOrExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression2(@NotNull PlainEnglishParser.LogicalOrExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull PlainEnglishParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull PlainEnglishParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull PlainEnglishParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull PlainEnglishParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull PlainEnglishParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull PlainEnglishParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecreaseExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterDecreaseExpression2(@NotNull PlainEnglishParser.DecreaseExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code DecreaseExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitDecreaseExpression2(@NotNull PlainEnglishParser.DecreaseExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull PlainEnglishParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull PlainEnglishParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull PlainEnglishParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull PlainEnglishParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull PlainEnglishParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull PlainEnglishParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression2(@NotNull PlainEnglishParser.AdditiveExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression2(@NotNull PlainEnglishParser.AdditiveExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull PlainEnglishParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull PlainEnglishParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(@NotNull PlainEnglishParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(@NotNull PlainEnglishParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecreaseExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecreaseExpression(@NotNull PlainEnglishParser.DecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecreaseExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecreaseExpression(@NotNull PlainEnglishParser.DecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignmentExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentExpression(@NotNull PlainEnglishParser.ArrayAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignmentExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentExpression(@NotNull PlainEnglishParser.ArrayAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PlainEnglishParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PlainEnglishParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull PlainEnglishParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull PlainEnglishParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression2(@NotNull PlainEnglishParser.ParenthesizedExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression2(@NotNull PlainEnglishParser.ParenthesizedExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignmentExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentExpression2(@NotNull PlainEnglishParser.ArrayAssignmentExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignmentExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentExpression2(@NotNull PlainEnglishParser.ArrayAssignmentExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull PlainEnglishParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull PlainEnglishParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull PlainEnglishParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull PlainEnglishParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull PlainEnglishParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull PlainEnglishParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PlainEnglishParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull PlainEnglishParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PlainEnglishParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull PlainEnglishParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull PlainEnglishParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull PlainEnglishParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#expressionSequence2}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence2(@NotNull PlainEnglishParser.ExpressionSequence2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#expressionSequence2}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence2(@NotNull PlainEnglishParser.ExpressionSequence2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull PlainEnglishParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull PlainEnglishParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(@NotNull PlainEnglishParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(@NotNull PlainEnglishParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull PlainEnglishParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull PlainEnglishParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void enterArrayGet(@NotNull PlainEnglishParser.ArrayGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void exitArrayGet(@NotNull PlainEnglishParser.ArrayGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull PlainEnglishParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull PlainEnglishParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression2(@NotNull PlainEnglishParser.ArgumentsExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression2(@NotNull PlainEnglishParser.ArgumentsExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression2(@NotNull PlainEnglishParser.EqualityExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression2(@NotNull PlainEnglishParser.EqualityExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PlainEnglishParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PlainEnglishParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression2(@NotNull PlainEnglishParser.IncrementExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression2(@NotNull PlainEnglishParser.IncrementExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PlainEnglishParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull PlainEnglishParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PlainEnglishParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull PlainEnglishParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull PlainEnglishParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull PlainEnglishParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression2(@NotNull PlainEnglishParser.RelationalExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression2(@NotNull PlainEnglishParser.RelationalExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull PlainEnglishParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull PlainEnglishParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression2(@NotNull PlainEnglishParser.LiteralExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression2(@NotNull PlainEnglishParser.LiteralExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PlainEnglishParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PlainEnglishParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression2(@NotNull PlainEnglishParser.LogicalAndExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression2(@NotNull PlainEnglishParser.LogicalAndExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull PlainEnglishParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull PlainEnglishParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression2(@NotNull PlainEnglishParser.ArrayLiteralExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression2(@NotNull PlainEnglishParser.ArrayLiteralExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull PlainEnglishParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull PlainEnglishParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression2(@NotNull PlainEnglishParser.MultiplicativeExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression2}
	 * labeled alternative in {@link PlainEnglishParser#singleExpression2}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression2(@NotNull PlainEnglishParser.MultiplicativeExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlainEnglishParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull PlainEnglishParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlainEnglishParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull PlainEnglishParser.FunctionDeclarationContext ctx);
}