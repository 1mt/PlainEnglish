package compiler;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import lexerparser.*;

public class ParseTreePrint extends PlainEnglishBaseListener {
		public String getXmlTag() {
			String nameofCurrentMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
			if(nameofCurrentMethod.substring(0,5).equals("enter")) {
				return "<" + Character.toLowerCase(nameofCurrentMethod.charAt(5)) + nameofCurrentMethod.substring(6) + ">";
			}
			else {
				return "</" + Character.toLowerCase(nameofCurrentMethod.charAt(4)) + nameofCurrentMethod.substring(5) + ">";
			}
			
		}
		@Override public void enterProgram(PlainEnglishParser.ProgramContext ctx) { 
			System.out.println(getXmlTag());

		}
		
		@Override public void exitProgram(PlainEnglishParser.ProgramContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterStatement(PlainEnglishParser.StatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitStatement(PlainEnglishParser.StatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterBlock(PlainEnglishParser.BlockContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitBlock(PlainEnglishParser.BlockContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterStatementList(PlainEnglishParser.StatementListContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitStatementList(PlainEnglishParser.StatementListContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterVariableStatement(PlainEnglishParser.VariableStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitVariableStatement(PlainEnglishParser.VariableStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterParenthesizedExpression(PlainEnglishParser.ParenthesizedExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitParenthesizedExpression(PlainEnglishParser.ParenthesizedExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterAdditiveExpression(PlainEnglishParser.AdditiveExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitAdditiveExpression(PlainEnglishParser.AdditiveExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterRelationalExpression(PlainEnglishParser.RelationalExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitRelationalExpression(PlainEnglishParser.RelationalExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterLogicalAndExpression(PlainEnglishParser.LogicalAndExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitLogicalAndExpression(PlainEnglishParser.LogicalAndExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterLiteralExpression(PlainEnglishParser.LiteralExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitLiteralExpression(PlainEnglishParser.LiteralExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterLogicalOrExpression(PlainEnglishParser.LogicalOrExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitLogicalOrExpression(PlainEnglishParser.LogicalOrExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArrayLiteralExpression(PlainEnglishParser.ArrayLiteralExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArrayLiteralExpression(PlainEnglishParser.ArrayLiteralExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterDecreaseExpression(PlainEnglishParser.DecreaseExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitDecreaseExpression(PlainEnglishParser.DecreaseExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArrayAssignmentExpression(PlainEnglishParser.ArrayAssignmentExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArrayAssignmentExpression(PlainEnglishParser.ArrayAssignmentExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterIdentifierExpression(PlainEnglishParser.IdentifierExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitIdentifierExpression(PlainEnglishParser.IdentifierExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArgumentsExpression(PlainEnglishParser.ArgumentsExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArgumentsExpression(PlainEnglishParser.ArgumentsExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterFunctionExpression(PlainEnglishParser.FunctionExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitFunctionExpression(PlainEnglishParser.FunctionExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterIncrementExpression(PlainEnglishParser.IncrementExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitIncrementExpression(PlainEnglishParser.IncrementExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterEqualityExpression(PlainEnglishParser.EqualityExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitEqualityExpression(PlainEnglishParser.EqualityExpressionContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterMultiplicativeExpression(PlainEnglishParser.MultiplicativeExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitMultiplicativeExpression(PlainEnglishParser.MultiplicativeExpressionContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterParameterList(PlainEnglishParser.ParameterListContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitParameterList(PlainEnglishParser.ParameterListContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterParameterArg(PlainEnglishParser.ParameterArgContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitParameterArg(PlainEnglishParser.ParameterArgContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArguments(PlainEnglishParser.ArgumentsContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArguments(PlainEnglishParser.ArgumentsContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterLiteral(PlainEnglishParser.LiteralContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitLiteral(PlainEnglishParser.LiteralContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterNumericLiteral(PlainEnglishParser.NumericLiteralContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitNumericLiteral(PlainEnglishParser.NumericLiteralContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArrayLiteral(PlainEnglishParser.ArrayLiteralContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArrayLiteral(PlainEnglishParser.ArrayLiteralContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterArrayGet(PlainEnglishParser.ArrayGetContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitArrayGet(PlainEnglishParser.ArrayGetContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterElementList(PlainEnglishParser.ElementListContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitElementList(PlainEnglishParser.ElementListContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterExpressionSequence(PlainEnglishParser.ExpressionSequenceContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitExpressionSequence(PlainEnglishParser.ExpressionSequenceContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterEmptyStatement(PlainEnglishParser.EmptyStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitEmptyStatement(PlainEnglishParser.EmptyStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterIfStatement(PlainEnglishParser.IfStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitIfStatement(PlainEnglishParser.IfStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterWhileStatement(PlainEnglishParser.WhileStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitWhileStatement(PlainEnglishParser.WhileStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterForStatement(PlainEnglishParser.ForStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitForStatement(PlainEnglishParser.ForStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterExpressionStatement(PlainEnglishParser.ExpressionStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitExpressionStatement(PlainEnglishParser.ExpressionStatementContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterBreakStatement(PlainEnglishParser.BreakStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitBreakStatement(PlainEnglishParser.BreakStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterReturnStatement(PlainEnglishParser.ReturnStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void exitReturnStatement(PlainEnglishParser.ReturnStatementContext ctx) {
			System.out.println(getXmlTag());
		}
		
		@Override public void enterFunctionDeclaration(PlainEnglishParser.FunctionDeclarationContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitFunctionDeclaration(PlainEnglishParser.FunctionDeclarationContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterFunctionCall(PlainEnglishParser.FunctionCallContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void exitFunctionCall(PlainEnglishParser.FunctionCallContext ctx) { 
			System.out.println(getXmlTag());
		}
		
		@Override public void enterEveryRule(ParserRuleContext ctx) { 
			
		}
		
		@Override public void exitEveryRule(ParserRuleContext ctx) {
			
			
		}
		
		@Override public void visitTerminal(TerminalNode node) {
			System.out.println(node.getText());
		
		}
		
		@Override public void visitErrorNode(ErrorNode node) { 
			
		}
	
	
}
