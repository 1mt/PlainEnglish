// Generated from PlainEnglish.g4 by ANTLR 4.4

	package lexerparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlainEnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WHITESPACE=17, DOT=18, UNDERSCORE=19, LETTER=20, DOUBLEQUOTE=21, EQUALS=22, 
		FUNCTION=23, VARDEFINE=24, ASSIGN=25, EQUALSCOM=26, NOTEQUALS=27, STARTFUNC=28, 
		ENDFUNC=29, IF=30, ELSE=31, INCREMENT=32, DECREASE=33, ADD=34, MINUS=35, 
		MULT=36, DIV=37, MOD=38, AND=39, OR=40, GREATERTHAN=41, LESSTHAN=42, GREATERTHANEQ=43, 
		LESSTHANEQ=44, ARRAYGET=45, GLOBAL=46, FOR=47, WHILE=48, BREAK=49, RETURN=50, 
		NULLLITERAL=51, BOOLEANLITERAL=52, DECIMALLITERAL=53, INTEGERLITERAL=54, 
		STRINGLITERAL=55, IDENTIFIER=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'do this'", "'this is true'", "'with the increment '", "'on the condition'", 
		"'please start'", "']'", "'break'", "' is true then do'", "'at the index'", 
		"'please create a list ['", "'('", "')'", "'call the function'", "'with these parameters ('", 
		"','", "'please stop'", "WHITESPACE", "'.'", "'_'", "LETTER", "'\"'", 
		"'='", "'please create the function'", "'please create the variable'", 
		"'set it to'", "'is equal to'", "'is not equal to'", "'please start function'", 
		"'that is all'", "'if'", "'else do'", "'increment'", "'decrease'", "'add'", 
		"'minus'", "'multiply'", "'divide'", "'mod'", "'and'", "'or'", "'is greater than'", 
		"'is less than'", "'is greater or equal to'", "'is less than or equal to'", 
		"'the value in the array'", "'that is global'", "'for the loop'", "'while'", 
		"'thankyou that is all'", "'please return'", "'null'", "BOOLEANLITERAL", 
		"DECIMALLITERAL", "INTEGERLITERAL", "STRINGLITERAL", "IDENTIFIER"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_statementList = 3, 
		RULE_variableStatement = 4, RULE_singleExpression = 5, RULE_singleExpression2 = 6, 
		RULE_parameterList = 7, RULE_parameterArg = 8, RULE_arguments = 9, RULE_literal = 10, 
		RULE_numericLiteral = 11, RULE_arrayLiteral = 12, RULE_arrayGet = 13, 
		RULE_elementList = 14, RULE_expressionSequence = 15, RULE_expressionSequence2 = 16, 
		RULE_emptyStatement = 17, RULE_ifStatement = 18, RULE_iterationStatement = 19, 
		RULE_expressionStatement = 20, RULE_breakStatement = 21, RULE_returnStatement = 22, 
		RULE_functionDeclaration = 23, RULE_functionCall = 24;
	public static final String[] ruleNames = {
		"program", "statement", "block", "statementList", "variableStatement", 
		"singleExpression", "singleExpression2", "parameterList", "parameterArg", 
		"arguments", "literal", "numericLiteral", "arrayLiteral", "arrayGet", 
		"elementList", "expressionSequence", "expressionSequence2", "emptyStatement", 
		"ifStatement", "iterationStatement", "expressionStatement", "breakStatement", 
		"returnStatement", "functionDeclaration", "functionCall"
	};

	@Override
	public String getGrammarFileName() { return "PlainEnglish.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlainEnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__3) | (1L << DOT) | (1L << FUNCTION) | (1L << VARDEFINE) | (1L << IF) | (1L << ARRAYGET) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50); statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59); expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60); returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61); functionDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62); ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63); iterationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64); breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65); functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__11);
			setState(70);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__3) | (1L << DOT) | (1L << FUNCTION) | (1L << VARDEFINE) | (1L << IF) | (1L << ARRAYGET) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(69); statementList();
				}
			}

			setState(72); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74); statement();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__3) | (1L << DOT) | (1L << FUNCTION) | (1L << VARDEFINE) | (1L << IF) | (1L << ARRAYGET) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PlainEnglishParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public TerminalNode VARDEFINE() { return getToken(PlainEnglishParser.VARDEFINE, 0); }
		public TerminalNode GLOBAL() { return getToken(PlainEnglishParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(VARDEFINE);
			setState(81);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(80); match(GLOBAL);
				}
			}

			setState(83); match(IDENTIFIER);
			setState(86);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(84); match(ASSIGN);
				setState(85); singleExpression(0);
				}
			}

			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(88); match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public TerminalNode ADD() { return getToken(PlainEnglishParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(PlainEnglishParser.MINUS, 0); }
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public TerminalNode GREATERTHANEQ() { return getToken(PlainEnglishParser.GREATERTHANEQ, 0); }
		public TerminalNode LESSTHANEQ() { return getToken(PlainEnglishParser.LESSTHANEQ, 0); }
		public TerminalNode GREATERTHAN() { return getToken(PlainEnglishParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(PlainEnglishParser.LESSTHAN, 0); }
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitRelationalExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public TerminalNode AND() { return getToken(PlainEnglishParser.AND, 0); }
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLiteralExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PlainEnglishParser.OR, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class DecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode DECREASE() { return getToken(PlainEnglishParser.DECREASE, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitDecreaseExpression(this);
		}
	}
	public static class ArrayAssignmentExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayAssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayAssignmentExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode FUNCTION() { return getToken(PlainEnglishParser.FUNCTION, 0); }
		public TerminalNode ENDFUNC() { return getToken(PlainEnglishParser.ENDFUNC, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode STARTFUNC() { return getToken(PlainEnglishParser.STARTFUNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitFunctionExpression(this);
		}
	}
	public static class IncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode INCREMENT() { return getToken(PlainEnglishParser.INCREMENT, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitIncrementExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public TerminalNode NOTEQUALS() { return getToken(PlainEnglishParser.NOTEQUALS, 0); }
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public TerminalNode EQUALSCOM() { return getToken(PlainEnglishParser.EQUALSCOM, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitEqualityExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public TerminalNode MULT() { return getToken(PlainEnglishParser.MULT, 0); }
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(PlainEnglishParser.MOD, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(PlainEnglishParser.DIV, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92); match(FUNCTION);
				setState(94);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(93); match(IDENTIFIER);
					}
				}

				setState(96); match(T__2);
				setState(98);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(97); parameterList();
					}
				}

				setState(100); match(T__4);
				setState(101); match(STARTFUNC);
				setState(102); statementList();
				setState(103); match(ENDFUNC);
				}
				break;
			case NULLLITERAL:
			case BOOLEANLITERAL:
			case DECIMALLITERAL:
			case INTEGERLITERAL:
			case STRINGLITERAL:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); literal();
				}
				break;
			case T__6:
				{
				_localctx = new ArrayAssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106); arrayLiteral();
				}
				break;
			case ARRAYGET:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); arrayGet();
				}
				break;
			case T__5:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108); match(T__5);
				setState(109); expressionSequence();
				setState(110); match(T__4);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(115);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(116);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(117); singleExpression(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(118);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(119);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(120); singleExpression(11);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						_la = _input.LA(1);
						if ( !(_la==EQUALSCOM || _la==NOTEQUALS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(123); singleExpression(10);
						}
						break;
					case 4:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(125); match(AND);
						setState(126); singleExpression(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128); match(OR);
						setState(129); singleExpression(8);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(132); singleExpression(7);
						}
						break;
					case 7:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(133);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(134); arguments();
						}
						break;
					case 8:
						{
						_localctx = new IncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(135);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(136); match(INCREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(138); match(DECREASE);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SingleExpression2Context extends ParserRuleContext {
		public SingleExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression2; }
	 
		public SingleExpression2Context() { }
		public void copyFrom(SingleExpression2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpression2Context extends SingleExpression2Context {
		public TerminalNode ADD() { return getToken(PlainEnglishParser.ADD, 0); }
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public TerminalNode MINUS() { return getToken(PlainEnglishParser.MINUS, 0); }
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public AdditiveExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterAdditiveExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitAdditiveExpression2(this);
		}
	}
	public static class RelationalExpression2Context extends SingleExpression2Context {
		public TerminalNode GREATERTHANEQ() { return getToken(PlainEnglishParser.GREATERTHANEQ, 0); }
		public TerminalNode LESSTHANEQ() { return getToken(PlainEnglishParser.LESSTHANEQ, 0); }
		public TerminalNode GREATERTHAN() { return getToken(PlainEnglishParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(PlainEnglishParser.LESSTHAN, 0); }
		public SingleExpression2Context singleExpression2() {
			return getRuleContext(SingleExpression2Context.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public RelationalExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterRelationalExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitRelationalExpression2(this);
		}
	}
	public static class LiteralExpression2Context extends SingleExpression2Context {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public LiteralExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLiteralExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLiteralExpression2(this);
		}
	}
	public static class LogicalAndExpression2Context extends SingleExpression2Context {
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public TerminalNode AND() { return getToken(PlainEnglishParser.AND, 0); }
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public LogicalAndExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLogicalAndExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLogicalAndExpression2(this);
		}
	}
	public static class FunctionExpression2Context extends SingleExpression2Context {
		public TerminalNode FUNCTION() { return getToken(PlainEnglishParser.FUNCTION, 0); }
		public TerminalNode ENDFUNC() { return getToken(PlainEnglishParser.ENDFUNC, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode STARTFUNC() { return getToken(PlainEnglishParser.STARTFUNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public FunctionExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterFunctionExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitFunctionExpression2(this);
		}
	}
	public static class ArgumentsExpression2Context extends SingleExpression2Context {
		public SingleExpression2Context singleExpression2() {
			return getRuleContext(SingleExpression2Context.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArgumentsExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArgumentsExpression2(this);
		}
	}
	public static class EqualityExpression2Context extends SingleExpression2Context {
		public TerminalNode NOTEQUALS() { return getToken(PlainEnglishParser.NOTEQUALS, 0); }
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public TerminalNode EQUALSCOM() { return getToken(PlainEnglishParser.EQUALSCOM, 0); }
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public EqualityExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterEqualityExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitEqualityExpression2(this);
		}
	}
	public static class ArrayLiteralExpression2Context extends SingleExpression2Context {
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public ArrayLiteralExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayLiteralExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayLiteralExpression2(this);
		}
	}
	public static class IncrementExpression2Context extends SingleExpression2Context {
		public SingleExpression2Context singleExpression2() {
			return getRuleContext(SingleExpression2Context.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(PlainEnglishParser.INCREMENT, 0); }
		public IncrementExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterIncrementExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitIncrementExpression2(this);
		}
	}
	public static class ParenthesizedExpression2Context extends SingleExpression2Context {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterParenthesizedExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitParenthesizedExpression2(this);
		}
	}
	public static class LogicalOrExpression2Context extends SingleExpression2Context {
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public TerminalNode OR() { return getToken(PlainEnglishParser.OR, 0); }
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public LogicalOrExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLogicalOrExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLogicalOrExpression2(this);
		}
	}
	public static class MultiplicativeExpression2Context extends SingleExpression2Context {
		public TerminalNode MULT() { return getToken(PlainEnglishParser.MULT, 0); }
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public TerminalNode MOD() { return getToken(PlainEnglishParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(PlainEnglishParser.DIV, 0); }
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public MultiplicativeExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterMultiplicativeExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitMultiplicativeExpression2(this);
		}
	}
	public static class ArrayAssignmentExpression2Context extends SingleExpression2Context {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayAssignmentExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayAssignmentExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayAssignmentExpression2(this);
		}
	}
	public static class DecreaseExpression2Context extends SingleExpression2Context {
		public TerminalNode DECREASE() { return getToken(PlainEnglishParser.DECREASE, 0); }
		public SingleExpression2Context singleExpression2() {
			return getRuleContext(SingleExpression2Context.class,0);
		}
		public DecreaseExpression2Context(SingleExpression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterDecreaseExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitDecreaseExpression2(this);
		}
	}

	public final SingleExpression2Context singleExpression2() throws RecognitionException {
		return singleExpression2(0);
	}

	private SingleExpression2Context singleExpression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpression2Context _localctx = new SingleExpression2Context(_ctx, _parentState);
		SingleExpression2Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_singleExpression2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				_localctx = new FunctionExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(145); match(FUNCTION);
				setState(147);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(146); match(IDENTIFIER);
					}
				}

				setState(149); match(T__2);
				setState(151);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(150); parameterList();
					}
				}

				setState(153); match(T__4);
				setState(154); match(STARTFUNC);
				setState(155); statementList();
				setState(156); match(ENDFUNC);
				}
				break;
			case NULLLITERAL:
			case BOOLEANLITERAL:
			case DECIMALLITERAL:
			case INTEGERLITERAL:
			case STRINGLITERAL:
				{
				_localctx = new LiteralExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); literal();
				}
				break;
			case T__6:
				{
				_localctx = new ArrayAssignmentExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); arrayLiteral();
				}
				break;
			case ARRAYGET:
				{
				_localctx = new ArrayLiteralExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); arrayGet();
				}
				break;
			case T__5:
				{
				_localctx = new ParenthesizedExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(T__5);
				setState(162); expressionSequence();
				setState(163); match(T__4);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new LiteralExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(168);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(169);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(170); singleExpression2(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(171);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(173); singleExpression2(11);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==EQUALSCOM || _la==NOTEQUALS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(176); singleExpression2(10);
						}
						break;
					case 4:
						{
						_localctx = new LogicalAndExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178); match(AND);
						setState(179); singleExpression2(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicalOrExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181); match(OR);
						setState(182); singleExpression2(8);
						}
						break;
					case 6:
						{
						_localctx = new ArgumentsExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(183);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(184); arguments();
						}
						break;
					case 7:
						{
						_localctx = new IncrementExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(185);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(186); match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new DecreaseExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(187);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(188); match(DECREASE);
						}
						break;
					case 9:
						{
						_localctx = new RelationalExpression2Context(new SingleExpression2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression2);
						setState(189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(191); singleExpression(0);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterArgContext> parameterArg() {
			return getRuleContexts(ParameterArgContext.class);
		}
		public ParameterArgContext parameterArg(int i) {
			return getRuleContext(ParameterArgContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); parameterArg();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(198); match(T__1);
				setState(199); parameterArg();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterArgContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PlainEnglishParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitParameterArg(this);
		}
	}

	public final ParameterArgContext parameterArg() throws RecognitionException {
		ParameterArgContext _localctx = new ParameterArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(IDENTIFIER);
			setState(208);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(206); match(ASSIGN);
				setState(207); singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(T__5);
			setState(219);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(211); singleExpression(0);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(212); match(T__1);
					setState(213); singleExpression(0);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(221); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode NULLLITERAL() { return getToken(PlainEnglishParser.NULLLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(PlainEnglishParser.STRINGLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(PlainEnglishParser.BOOLEANLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case NULLLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(NULLLITERAL);
				}
				break;
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(BOOLEANLITERAL);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); match(STRINGLITERAL);
				}
				break;
			case DECIMALLITERAL:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(226); numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(PlainEnglishParser.INTEGERLITERAL, 0); }
		public TerminalNode DECIMALLITERAL() { return getToken(PlainEnglishParser.DECIMALLITERAL, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==DECIMALLITERAL || _la==INTEGERLITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(T__6);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232); match(T__1);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(238); elementList();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(241); match(T__1);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayGetContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PlainEnglishParser.ASSIGN, 0); }
		public List<TerminalNode> INTEGERLITERAL() { return getTokens(PlainEnglishParser.INTEGERLITERAL); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlainEnglishParser.IDENTIFIER, i);
		}
		public TerminalNode INTEGERLITERAL(int i) {
			return getToken(PlainEnglishParser.INTEGERLITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlainEnglishParser.IDENTIFIER); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode ARRAYGET() { return getToken(PlainEnglishParser.ARRAYGET, 0); }
		public ArrayGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterArrayGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitArrayGet(this);
		}
	}

	public final ArrayGetContext arrayGet() throws RecognitionException {
		ArrayGetContext _localctx = new ArrayGetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayGet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(ARRAYGET);
			setState(250); match(IDENTIFIER);
			setState(251); match(T__7);
			setState(258);
			switch (_input.LA(1)) {
			case INTEGERLITERAL:
				{
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252); match(INTEGERLITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case IDENTIFIER:
				{
				setState(257); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(260); match(ASSIGN);
				setState(261); singleExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264); singleExpression(0);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(265); match(T__1);
						}
						}
						setState(268); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__1 );
					setState(270); singleExpression(0);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); singleExpression(0);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(277); match(T__1);
				setState(278); singleExpression(0);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequence2Context extends ParserRuleContext {
		public List<SingleExpression2Context> singleExpression2() {
			return getRuleContexts(SingleExpression2Context.class);
		}
		public SingleExpression2Context singleExpression2(int i) {
			return getRuleContext(SingleExpression2Context.class,i);
		}
		public ExpressionSequence2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterExpressionSequence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitExpressionSequence2(this);
		}
	}

	public final ExpressionSequence2Context expressionSequence2() throws RecognitionException {
		ExpressionSequence2Context _localctx = new ExpressionSequence2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionSequence2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); singleExpression2(0);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(285); match(T__1);
				setState(286); singleExpression2(0);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PlainEnglishParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(PlainEnglishParser.IF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionSequence2Context expressionSequence2() {
			return getRuleContext(ExpressionSequence2Context.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(IF);
			setState(295); expressionSequence2();
			setState(296); match(T__8);
			setState(297); statement();
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(298); match(ELSE);
				setState(299); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PlainEnglishParser.WHILE, 0); }
		public ExpressionSequence2Context expressionSequence2() {
			return getRuleContext(ExpressionSequence2Context.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(PlainEnglishParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequence2Context> expressionSequence2() {
			return getRuleContexts(ExpressionSequence2Context.class);
		}
		public ExpressionSequence2Context expressionSequence2(int i) {
			return getRuleContext(ExpressionSequence2Context.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitForStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterationStatement);
		int _la;
		try {
			setState(322);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(WHILE);
				setState(303); match(T__14);
				setState(304); expressionSequence2();
				setState(305); match(T__15);
				setState(306); statement();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308); match(FOR);
				setState(310);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(309); expressionSequence2();
					}
				}

				setState(312); match(T__12);
				setState(314);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(313); expressionSequence2();
					}
				}

				setState(316); match(T__13);
				setState(318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(317); expressionSequence2();
					}
				}

				setState(320); match(T__15);
				setState(321); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); expressionSequence();
			setState(325); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(T__9);
			setState(328); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public TerminalNode RETURN() { return getToken(PlainEnglishParser.RETURN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(RETURN);
			setState(332);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << FUNCTION) | (1L << ARRAYGET) | (1L << NULLLITERAL) | (1L << BOOLEANLITERAL) | (1L << DECIMALLITERAL) | (1L << INTEGERLITERAL) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(331); expressionSequence();
				}
			}

			setState(334); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PlainEnglishParser.FUNCTION, 0); }
		public TerminalNode ENDFUNC() { return getToken(PlainEnglishParser.ENDFUNC, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode STARTFUNC() { return getToken(PlainEnglishParser.STARTFUNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(FUNCTION);
			setState(337); match(IDENTIFIER);
			setState(338); match(T__2);
			setState(340);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(339); parameterList();
				}
			}

			setState(342); match(T__4);
			setState(343); match(STARTFUNC);
			setState(344); statementList();
			setState(345); match(ENDFUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PlainEnglishParser.DOT, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlainEnglishParser.IDENTIFIER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlainEnglishListener ) ((PlainEnglishListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(T__3);
			setState(348); match(IDENTIFIER);
			setState(349); match(T__2);
			setState(351);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(350); parameterList();
				}
			}

			setState(353); match(T__4);
			setState(354); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 6: return singleExpression2_sempred((SingleExpression2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression2_sempred(SingleExpression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 12);
		case 17: return precpred(_ctx, 6);
		case 9: return precpred(_ctx, 11);
		case 10: return precpred(_ctx, 10);
		case 11: return precpred(_ctx, 9);
		case 12: return precpred(_ctx, 8);
		case 13: return precpred(_ctx, 7);
		case 14: return precpred(_ctx, 15);
		case 15: return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 11);
		case 1: return precpred(_ctx, 10);
		case 2: return precpred(_ctx, 9);
		case 3: return precpred(_ctx, 8);
		case 4: return precpred(_ctx, 7);
		case 5: return precpred(_ctx, 6);
		case 6: return precpred(_ctx, 15);
		case 7: return precpred(_ctx, 13);
		case 8: return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3E\n\3\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\6\5N\n\5\r\5\16\5O\3"+
		"\6\3\6\5\6T\n\6\3\6\3\6\3\6\5\6Y\n\6\3\6\5\6\\\n\6\3\7\3\7\3\7\5\7a\n"+
		"\7\3\7\3\7\5\7e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7t\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13"+
		"\7\3\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\5\b\u009a\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\t\3\t\3\t\7\t\u00cb\n\t\f\t\16"+
		"\t\u00ce\13\t\3\n\3\n\3\n\5\n\u00d3\n\n\3\13\3\13\3\13\3\13\7\13\u00d9"+
		"\n\13\f\13\16\13\u00dc\13\13\5\13\u00de\n\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00e6\n\f\3\r\3\r\3\16\3\16\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16"+
		"\3\16\5\16\u00f2\n\16\3\16\7\16\u00f5\n\16\f\16\16\16\u00f8\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\6\17\u0100\n\17\r\17\16\17\u0101\3\17\5\17\u0105"+
		"\n\17\3\17\3\17\5\17\u0109\n\17\3\20\3\20\6\20\u010d\n\20\r\20\16\20\u010e"+
		"\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\21\3\21\3\21\7\21\u011a"+
		"\n\21\f\21\16\21\u011d\13\21\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22"+
		"\u0125\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012f\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0139\n\25\3\25\3\25\5\25"+
		"\u013d\n\25\3\25\3\25\5\25\u0141\n\25\3\25\3\25\5\25\u0145\n\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\5\30\u014f\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0157\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\5\32\u0162\n\32\3\32\3\32\3\32\3\32\2\4\f\16\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3\2&(\3\2$%\3\2\34\35\3\2+.\3\2"+
		"\678\u0195\2\67\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bM\3\2\2\2\nQ\3\2\2\2\f"+
		"s\3\2\2\2\16\u00a8\3\2\2\2\20\u00c7\3\2\2\2\22\u00cf\3\2\2\2\24\u00d4"+
		"\3\2\2\2\26\u00e5\3\2\2\2\30\u00e7\3\2\2\2\32\u00e9\3\2\2\2\34\u00fb\3"+
		"\2\2\2\36\u010a\3\2\2\2 \u0116\3\2\2\2\"\u011e\3\2\2\2$\u0126\3\2\2\2"+
		"&\u0128\3\2\2\2(\u0144\3\2\2\2*\u0146\3\2\2\2,\u0149\3\2\2\2.\u014c\3"+
		"\2\2\2\60\u0152\3\2\2\2\62\u015d\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:E\5\6\4\2;"+
		"E\5\n\6\2<E\5$\23\2=E\5*\26\2>E\5.\30\2?E\5\60\31\2@E\5&\24\2AE\5(\25"+
		"\2BE\5,\27\2CE\5\62\32\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2"+
		"\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FH\7"+
		"\7\2\2GI\5\b\5\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\22\2\2K\7\3\2\2\2L"+
		"N\5\4\3\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QS\7\32\2"+
		"\2RT\7\60\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UX\7:\2\2VW\7\33\2\2WY\5\f"+
		"\7\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\24\2\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"\13\3\2\2\2]^\b\7\1\2^`\7\31\2\2_a\7:\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2"+
		"\2bd\7\20\2\2ce\5\20\t\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\16\2\2gh\7"+
		"\36\2\2hi\5\b\5\2ij\7\37\2\2jt\3\2\2\2kt\5\26\f\2lt\5\32\16\2mt\5\34\17"+
		"\2no\7\r\2\2op\5 \21\2pq\7\16\2\2qt\3\2\2\2rt\7:\2\2s]\3\2\2\2sk\3\2\2"+
		"\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2sr\3\2\2\2t\u008f\3\2\2\2uv\f\r\2\2vw"+
		"\t\2\2\2w\u008e\5\f\7\16xy\f\f\2\2yz\t\3\2\2z\u008e\5\f\7\r{|\f\13\2\2"+
		"|}\t\4\2\2}\u008e\5\f\7\f~\177\f\n\2\2\177\u0080\7)\2\2\u0080\u008e\5"+
		"\f\7\13\u0081\u0082\f\t\2\2\u0082\u0083\7*\2\2\u0083\u008e\5\f\7\n\u0084"+
		"\u0085\f\b\2\2\u0085\u0086\t\5\2\2\u0086\u008e\5\f\7\t\u0087\u0088\f\21"+
		"\2\2\u0088\u008e\5\24\13\2\u0089\u008a\f\17\2\2\u008a\u008e\7\"\2\2\u008b"+
		"\u008c\f\16\2\2\u008c\u008e\7#\2\2\u008du\3\2\2\2\u008dx\3\2\2\2\u008d"+
		"{\3\2\2\2\u008d~\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0084\3\2\2\2\u008d"+
		"\u0087\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\r\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0093\b\b\1\2\u0093\u0095\7\31\2\2\u0094\u0096\7:\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\20"+
		"\2\2\u0098\u009a\5\20\t\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\16\2\2\u009c\u009d\7\36\2\2\u009d\u009e\5"+
		"\b\5\2\u009e\u009f\7\37\2\2\u009f\u00a9\3\2\2\2\u00a0\u00a9\5\26\f\2\u00a1"+
		"\u00a9\5\32\16\2\u00a2\u00a9\5\34\17\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5"+
		"\5 \21\2\u00a5\u00a6\7\16\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\7:\2\2\u00a8"+
		"\u0092\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00c4\3\2\2\2\u00aa"+
		"\u00ab\f\r\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00c3\5\16\b\16\u00ad\u00ae\f"+
		"\f\2\2\u00ae\u00af\t\3\2\2\u00af\u00c3\5\16\b\r\u00b0\u00b1\f\13\2\2\u00b1"+
		"\u00b2\t\4\2\2\u00b2\u00c3\5\16\b\f\u00b3\u00b4\f\n\2\2\u00b4\u00b5\7"+
		")\2\2\u00b5\u00c3\5\16\b\13\u00b6\u00b7\f\t\2\2\u00b7\u00b8\7*\2\2\u00b8"+
		"\u00c3\5\16\b\n\u00b9\u00ba\f\21\2\2\u00ba\u00c3\5\24\13\2\u00bb\u00bc"+
		"\f\17\2\2\u00bc\u00c3\7\"\2\2\u00bd\u00be\f\16\2\2\u00be\u00c3\7#\2\2"+
		"\u00bf\u00c0\f\b\2\2\u00c0\u00c1\t\5\2\2\u00c1\u00c3\5\f\7\2\u00c2\u00aa"+
		"\3\2\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00b0\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2"+
		"\u00b6\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bd\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cc\5\22\n"+
		"\2\u00c8\u00c9\7\21\2\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\21\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\7:\2\2\u00d0\u00d1\7\33\2\2\u00d1\u00d3"+
		"\5\f\7\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\23\3\2\2\2\u00d4"+
		"\u00dd\7\r\2\2\u00d5\u00da\5\f\7\2\u00d6\u00d7\7\21\2\2\u00d7\u00d9\5"+
		"\f\7\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0"+
		"\25\3\2\2\2\u00e1\u00e6\7\65\2\2\u00e2\u00e6\7\66\2\2\u00e3\u00e6\79\2"+
		"\2\u00e4\u00e6\5\30\r\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\27\3\2\2\2\u00e7\u00e8\t\6\2"+
		"\2\u00e8\31\3\2\2\2\u00e9\u00ed\7\f\2\2\u00ea\u00ec\7\21\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\7\21\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\b\2\2\u00fa"+
		"\33\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\7:\2\2\u00fd\u0104\7\13\2\2"+
		"\u00fe\u0100\78\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0105\7:\2\2\u0104"+
		"\u00ff\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\7\33"+
		"\2\2\u0107\u0109\5\f\7\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\35\3\2\2\2\u010a\u0113\5\f\7\2\u010b\u010d\7\21\2\2\u010c\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0112\5\f\7\2\u0111\u010c\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\37\3\2\2\2\u0115\u0113\3\2\2"+
		"\2\u0116\u011b\5\f\7\2\u0117\u0118\7\21\2\2\u0118\u011a\5\f\7\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c!\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\16\b\2\u011f\u0120"+
		"\7\21\2\2\u0120\u0122\5\16\b\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124#\3\2\2\2\u0125\u0123\3"+
		"\2\2\2\u0126\u0127\7\24\2\2\u0127%\3\2\2\2\u0128\u0129\7 \2\2\u0129\u012a"+
		"\5\"\22\2\u012a\u012b\7\n\2\2\u012b\u012e\5\4\3\2\u012c\u012d\7!\2\2\u012d"+
		"\u012f\5\4\3\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\'\3\2\2\2"+
		"\u0130\u0131\7\62\2\2\u0131\u0132\7\4\2\2\u0132\u0133\5\"\22\2\u0133\u0134"+
		"\7\3\2\2\u0134\u0135\5\4\3\2\u0135\u0145\3\2\2\2\u0136\u0138\7\61\2\2"+
		"\u0137\u0139\5\"\22\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\7\6\2\2\u013b\u013d\5\"\22\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7\5\2\2\u013f\u0141"+
		"\5\"\22\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0143\7\3\2\2\u0143\u0145\5\4\3\2\u0144\u0130\3\2\2\2\u0144\u0136"+
		"\3\2\2\2\u0145)\3\2\2\2\u0146\u0147\5 \21\2\u0147\u0148\7\24\2\2\u0148"+
		"+\3\2\2\2\u0149\u014a\7\t\2\2\u014a\u014b\7\24\2\2\u014b-\3\2\2\2\u014c"+
		"\u014e\7\64\2\2\u014d\u014f\5 \21\2\u014e\u014d\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\24\2\2\u0151/\3\2\2\2\u0152\u0153"+
		"\7\31\2\2\u0153\u0154\7:\2\2\u0154\u0156\7\20\2\2\u0155\u0157\5\20\t\2"+
		"\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\7\16\2\2\u0159\u015a\7\36\2\2\u015a\u015b\5\b\5\2\u015b\u015c\7\37\2"+
		"\2\u015c\61\3\2\2\2\u015d\u015e\7\17\2\2\u015e\u015f\7:\2\2\u015f\u0161"+
		"\7\20\2\2\u0160\u0162\5\20\t\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0164\7\16\2\2\u0164\u0165\7\24\2\2\u0165\63"+
		"\3\2\2\2*\67DHOSX[`ds\u008d\u008f\u0095\u0099\u00a8\u00c2\u00c4\u00cc"+
		"\u00d2\u00da\u00dd\u00e5\u00ed\u00f1\u00f6\u0101\u0104\u0108\u010e\u0113"+
		"\u011b\u0123\u012e\u0138\u013c\u0140\u0144\u014e\u0156\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}