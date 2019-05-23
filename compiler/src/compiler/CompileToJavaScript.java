package compiler;

import lexerparser.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.*;
public class CompileToJavaScript extends PlainEnglishBaseListener {
	StringBuilder sb = new StringBuilder();
	STGroup stg = new STGroupFile("./pdl.stg"); 
	
	@Override public void enterProgram(PlainEnglishParser.ProgramContext ctx) {}
	
	@Override public void exitProgram(PlainEnglishParser.ProgramContext ctx) {
		System.out.println(sb);
	}
	
	@Override public void enterStatement(PlainEnglishParser.StatementContext ctx) { }
	
	@Override public void exitStatement(PlainEnglishParser.StatementContext ctx) { }
	
	@Override public void enterBlock(PlainEnglishParser.BlockContext ctx) {
		sb.append(" {");
	 }
	
	@Override public void exitBlock(PlainEnglishParser.BlockContext ctx) { 
		sb.append(" }");
	}
	
	@Override public void enterStatementList(PlainEnglishParser.StatementListContext ctx) { }
	
	@Override public void exitStatementList(PlainEnglishParser.StatementListContext ctx) { }
	
	@Override public void enterVariableStatement(PlainEnglishParser.VariableStatementContext ctx) { }
	
	@Override public void exitVariableStatement(PlainEnglishParser.VariableStatementContext ctx) {
		List<ParseTree> values = ctx.children;
		ArrayList<String> valueNames = new ArrayList<String>();

		for(int i=1; i<ctx.getChildCount(); i+=2)
			valueNames.add(values.get(i).getText());
			

		ST st = stg.getInstanceOf("Variable");
		st.add("name", valueNames.get(0));
		st.add("value", valueNames.get(1));
		sb.append(st.render());
		
	}
	
	@Override public void enterParenthesizedExpression(PlainEnglishParser.ParenthesizedExpressionContext ctx) {
		sb.append("(");
	 }
	
	@Override public void exitParenthesizedExpression(PlainEnglishParser.ParenthesizedExpressionContext ctx) { 
		sb.append(")");
	}
	
	@Override public void enterAdditiveExpression(PlainEnglishParser.AdditiveExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("AdditiveExpression");
		st.add("num1", values.get(0).getText());
		String op;
		for(int i=1; i<ctx.getChildCount(); i+=2) {
			op = values.get(i).getText();
			if(op.equals("add")) {
				op="+";
			}
			else {
				op="-";
			}
			st.add("opOperand",  op + " "+ values.get(i+1).getText());

		sb.append(st.render());
		
	 }
	}
	
	@Override public void exitAdditiveExpression(PlainEnglishParser.AdditiveExpressionContext ctx) { }
	
	@Override public void enterRelationalExpression(PlainEnglishParser.RelationalExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("MathCompExp");
		st.add("num1", values.get(0).getText());
		String op;
		op = values.get(1).getText();
		if(op.equals("is less than")) {
			op="<";
		}
		else if(op.equals("is greater than")){
			op=">";
		}
		else if(op.equals("is less than or equal to")){
			op="<=";
		}
		else{
			op=">=";
		}
		
		st.add("op", op );
		st.add("num2", values.get(2).getText() );

		sb.append(st.render());
		
	 }
	 
	
	@Override public void exitRelationalExpression(PlainEnglishParser.RelationalExpressionContext ctx) { }
	
	@Override public void enterLogicalAndExpression(PlainEnglishParser.LogicalAndExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("MathCompExp");
		st.add("num1", values.get(0).getText());
		st.add("op", "&&" );
		st.add("op", values.get(2).getText() );

		sb.append(st.render());
		
	 }
	
	@Override public void exitLogicalAndExpression(PlainEnglishParser.LogicalAndExpressionContext ctx) { }
	
	@Override public void enterLiteralExpression(PlainEnglishParser.LiteralExpressionContext ctx) { }
	
	@Override public void exitLiteralExpression(PlainEnglishParser.LiteralExpressionContext ctx) { }
	
	@Override public void enterLogicalOrExpression(PlainEnglishParser.LogicalOrExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("MathCompExp");
		st.add("num1", values.get(0).getText());
		st.add("op", "||");
		st.add("op", values.get(2).getText() );

		sb.append(st.render());
		
	 }
	
	@Override public void exitLogicalOrExpression(PlainEnglishParser.LogicalOrExpressionContext ctx) { }
	
	@Override public void enterArrayLiteralExpression(PlainEnglishParser.ArrayLiteralExpressionContext ctx) {
	 }
	
	@Override public void exitArrayLiteralExpression(PlainEnglishParser.ArrayLiteralExpressionContext ctx) { }
	
	@Override public void enterDecreaseExpression(PlainEnglishParser.DecreaseExpressionContext ctx) { 
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("DecreaseExpression");
		st.add("variable", values.get(0).getText());
		sb.append(st.render());
		
	}
	
	@Override public void exitDecreaseExpression(PlainEnglishParser.DecreaseExpressionContext ctx) { }
	
	@Override public void enterArrayAssignmentExpression(PlainEnglishParser.ArrayAssignmentExpressionContext ctx) { }
	
	@Override public void exitArrayAssignmentExpression(PlainEnglishParser.ArrayAssignmentExpressionContext ctx) { }
	
	@Override public void enterIdentifierExpression(PlainEnglishParser.IdentifierExpressionContext ctx) { }
	
	@Override public void exitIdentifierExpression(PlainEnglishParser.IdentifierExpressionContext ctx) { }
	
	@Override public void enterArgumentsExpression(PlainEnglishParser.ArgumentsExpressionContext ctx) { }
	
	@Override public void exitArgumentsExpression(PlainEnglishParser.ArgumentsExpressionContext ctx) { }
	
	@Override public void enterFunctionExpression(PlainEnglishParser.FunctionExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("Function");
		st.add("name", values.get(1).getText());
		st.add("elementList", values.get(3).getText() );
		sb.append(st.render());
		
	 }
	
	@Override public void exitFunctionExpression(PlainEnglishParser.FunctionExpressionContext ctx) {
		sb.append("}");
	 }
	
	@Override public void enterIncrementExpression(PlainEnglishParser.IncrementExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("IncrementExpression");
		st.add("variable", values.get(0).getText());
		sb.append(st.render());
		
	 }
	
	@Override public void exitIncrementExpression(PlainEnglishParser.IncrementExpressionContext ctx) { }
	
	@Override public void enterEqualityExpression(PlainEnglishParser.EqualityExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("MathCompExp");
		st.add("num1", values.get(0).getText());
		String op;
		op = values.get(1).getText();
		if(op.equals("is equal to")) {
			op="==";
		}
		else{
			op="!=";
		}
		st.add("op", op );
		st.add("num2", values.get(2).getText() );

		sb.append(st.render());
		
	 }
	
	@Override public void exitEqualityExpression(PlainEnglishParser.EqualityExpressionContext ctx) { }
	
	@Override public void enterMultiplicativeExpression(PlainEnglishParser.MultiplicativeExpressionContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("MathCompExp");
		st.add("num1", values.get(0).getText());
		String op;
		op = values.get(1).getText();
		if(op.equals("muliply")) {
			op="*";
		}
		else if(op.equals("divide")){
			op="/";
		}
		else{
			op="%";
		}
		
		st.add("op", op );
		st.add("num2", values.get(2).getText() );

		sb.append(st.render());
		
	}
	
	@Override public void exitMultiplicativeExpression(PlainEnglishParser.MultiplicativeExpressionContext ctx) { }
	
	@Override public void enterParameterList(PlainEnglishParser.ParameterListContext ctx) { }
	
	@Override public void exitParameterList(PlainEnglishParser.ParameterListContext ctx) { }
	
	@Override public void enterParameterArg(PlainEnglishParser.ParameterArgContext ctx) { }
	
	@Override public void exitParameterArg(PlainEnglishParser.ParameterArgContext ctx) { }
	
	@Override public void enterArguments(PlainEnglishParser.ArgumentsContext ctx) { }
	
	@Override public void exitArguments(PlainEnglishParser.ArgumentsContext ctx) { }
	
	@Override public void enterLiteral(PlainEnglishParser.LiteralContext ctx) { }
	
	@Override public void exitLiteral(PlainEnglishParser.LiteralContext ctx) { }
	
	@Override public void enterNumericLiteral(PlainEnglishParser.NumericLiteralContext ctx) { }
	
	@Override public void exitNumericLiteral(PlainEnglishParser.NumericLiteralContext ctx) { }
	
	@Override public void enterArrayLiteral(PlainEnglishParser.ArrayLiteralContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("Array");
		st.add("ArrayList", values.get(1).getText());
		sb.append(st.render());	
	 }
	
	@Override public void exitArrayLiteral(PlainEnglishParser.ArrayLiteralContext ctx) { }
	
	@Override public void enterArrayGet(PlainEnglishParser.ArrayGetContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("ArrayGet");
		st.add("id", values.get(1).getText());
		st.add("index", values.get(3).getText());

		sb.append(st.render());
		
	}
	
	@Override public void exitArrayGet(PlainEnglishParser.ArrayGetContext ctx) { }
	
	@Override public void enterElementList(PlainEnglishParser.ElementListContext ctx) { }
	
	@Override public void exitElementList(PlainEnglishParser.ElementListContext ctx) { }
	
	@Override public void enterExpressionSequence(PlainEnglishParser.ExpressionSequenceContext ctx) { }
	
	@Override public void exitExpressionSequence(PlainEnglishParser.ExpressionSequenceContext ctx) { }
	
	@Override public void enterEmptyStatement(PlainEnglishParser.EmptyStatementContext ctx) { }
	
	@Override public void exitEmptyStatement(PlainEnglishParser.EmptyStatementContext ctx) {
		sb.append(";");
	 }
	
	@Override public void enterIfStatement(PlainEnglishParser.IfStatementContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("If");
		String conditionText = values.get(1).getText();
		String op;
		String[] conditionTextTokens;
		if(conditionText.contains("is greater than")) {
			op=">";
			conditionTextTokens = conditionText.split("is greater than");
		}
		else if(conditionText.contains("is less than")){
			op="<";
			conditionTextTokens = conditionText.split("is less than");
		}
		else if(conditionText.contains("is less than or equal to")){
			op="<=";
			conditionTextTokens = conditionText.split("is less than or equal to");
		}
		else if(conditionText.contains("is greater than or equal to")){
			op=">=";
			conditionTextTokens = conditionText.split("is greater than or equal to");
		}
		else if(conditionText.contains("is equal to")){
			op="==";
			conditionTextTokens = conditionText.split("is equal to");
		}
		else if(conditionText.contains("is not equal to")){
			op="!=";
			conditionTextTokens = conditionText.split("is not equal to");
		}
		else if(conditionText.contains("and")){
			op="and";
			conditionTextTokens = conditionText.split("and");
		}
		else if(conditionText.contains("or")){
			op="or";
			conditionTextTokens = conditionText.split("and");
		}
		else if(conditionText.contains("true")){
			op="true";
			conditionTextTokens = conditionText.split("true");
		}
		else {
			op="false";
			conditionTextTokens = conditionText.split("false");
		}
		if (conditionTextTokens.length > 1) {
			st.add("num1", conditionTextTokens[0] );
			st.add("num2", conditionTextTokens[1] );
			st.add("op", op );
		}
		

		sb.append(st.render());
		
	}
	
	@Override public void exitIfStatement(PlainEnglishParser.IfStatementContext ctx) {
		sb.append("}");
	}
	
	@Override public void enterWhileStatement(PlainEnglishParser.WhileStatementContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("While");
		String conditionText = values.get(2).getText();
		String op;
		String[] conditionTextTokens;
		if(conditionText.contains("is greater than")) {
			op=">";
			conditionTextTokens = conditionText.split("is greater than");
		}
		else if(conditionText.contains("is less than")){
			op="<";
			conditionTextTokens = conditionText.split("is less than");
		}
		else if(conditionText.contains("is less than or equal to")){
			op="<=";
			conditionTextTokens = conditionText.split("is less than or equal to");
		}
		else if(conditionText.contains("is greater than or equal to")){
			op=">=";
			conditionTextTokens = conditionText.split("is greater than or equal to");
		}
		else if(conditionText.contains("is equal to")){
			op="==";
			conditionTextTokens = conditionText.split("is equal to");
		}
		else if(conditionText.contains("is not equal to")){
			op="!=";
			conditionTextTokens = conditionText.split("is not equal to");
		}
		else if(conditionText.contains("and")){
			op="and";
			conditionTextTokens = conditionText.split("and");
		}
		else if(conditionText.contains("or")){
			op="or";
			conditionTextTokens = conditionText.split("and");
		}
		else if(conditionText.contains("true")){
			op="true";
			conditionTextTokens = conditionText.split("true");
		}
		else {
			op="false";
			conditionTextTokens = conditionText.split("false");
		}
		if (conditionTextTokens.length > 1) {
			st.add("num1", conditionTextTokens[0] );
			st.add("num2", conditionTextTokens[1] );
			st.add("op", op );
		}
		

		sb.append(st.render());
	}
	
	@Override public void exitWhileStatement(PlainEnglishParser.WhileStatementContext ctx) {
		sb.append(";}");
	}
	
	@Override public void enterForStatement(PlainEnglishParser.ForStatementContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("For");
		ArrayList<String> conditionText = new ArrayList<String>(
			    Arrays.asList(values.get(1).getText(),values.get(3).getText(),values.get(5).getText() ));{};
		List<String> op = new ArrayList<String>();;
		List<String> conditionTextTokens = new ArrayList<String>();
		for (int i = 0; i < conditionText.size(); i++) {
		if(conditionText.get(i).contains("is greater than")) {
			op.add(">");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is greater than")));
		}
		else if(conditionText.get(i).contains("is less than")){
			op.add("<");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is less than")));
		}
		else if(conditionText.get(i).contains("is less than or equal to")){
			op.add("<=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is less than or equal to")));
		}
		else if(conditionText.get(i).contains("is greater than or equal to")){
			op.add(">=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is greater than or equal to")));
		}
		else if(conditionText.get(i).contains("is equal to")){
			op.add("=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is equal to")));
		}
		else if(conditionText.get(i).contains("is not equal to")){
			op.add("!=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("is not equal to")));
		}
		else if(conditionText.get(i).contains("and")){
			op.add("and");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("and")));
		}
		else if(conditionText.get(i).contains("or")){
			op.add("or");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("and")));
		}
		else if(conditionText.get(i).contains("true")){
			op.add("true");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("true")));
		}
		
		else if(conditionText.get(i).contains("increment")){
			op.add("+=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("increment")));
			conditionTextTokens.add("1");
		}
		else if(conditionText.get(i).contains("decrease")){
			op.add("-=");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("decrease")));
			conditionTextTokens.add("1");
		}
		else {
			op.add("false");
			conditionTextTokens.addAll(Arrays.asList(conditionText.get(i).split("false")));
		}
		}
		st.add("num1", conditionTextTokens.get(0));
		st.add("num2", conditionTextTokens.get(1));
		st.add("num3", conditionTextTokens.get(2));
		st.add("num4", conditionTextTokens.get(3));
		st.add("num5", conditionTextTokens.get(4));
		st.add("num6", conditionTextTokens.get(5));
		st.add("op1", op.get(0) );
		st.add("op2", op.get(1) );
		st.add("op3", op.get(2) );
		sb.append(st.render());
	}
	
	@Override public void exitForStatement(PlainEnglishParser.ForStatementContext ctx) {
		sb.append("}");
	}
	
	@Override public void enterExpressionStatement(PlainEnglishParser.ExpressionStatementContext ctx) { }
	
	@Override public void exitExpressionStatement(PlainEnglishParser.ExpressionStatementContext ctx) {}
	
	@Override public void enterBreakStatement(PlainEnglishParser.BreakStatementContext ctx) {
		sb.append("break;");
	}
	
	@Override public void exitBreakStatement(PlainEnglishParser.BreakStatementContext ctx) { }
	
	@Override public void enterReturnStatement(PlainEnglishParser.ReturnStatementContext ctx) {}
	
	@Override public void exitReturnStatement(PlainEnglishParser.ReturnStatementContext ctx) { 
		sb.append(ctx.children.get(1).getText() + " return;");
	}
	
	@Override public void enterFunctionDeclaration(PlainEnglishParser.FunctionDeclarationContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("Func");
		st.add("name", values.get(1).getText());
		st.add("list", values.get(3).getText());
		sb.append(st.render());
	}
	
	@Override public void exitFunctionDeclaration(PlainEnglishParser.FunctionDeclarationContext ctx) {
		sb.append("}");
	}
	
	@Override public void enterFunctionCall(PlainEnglishParser.FunctionCallContext ctx) {
		List<ParseTree> values = ctx.children;
		ST st = stg.getInstanceOf("CallFunc");
		st.add("name", values.get(1).getText());
		st.add("list", values.get(3).getText());
		sb.append(st.render());
	}
	
	@Override public void exitFunctionCall(PlainEnglishParser.FunctionCallContext ctx) {
		sb.append(";");
	}
	

	
}
