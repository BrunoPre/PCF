// Generated from /home/bruno/IMT_A1/MathDiscretes/LangagesProgrammation/TP/TP1/PCF/PCF/src/parser/PCF.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP1=9, 
		OP2=10, LIT=11, VAR=12, WS=13, LINE_COMMENT=14;
	public static final int
		RULE_term = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ifz'", "'then'", "'else'", "'fun'", "'->'", "'in'", "'let'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "OP1", "OP2", "LIT", 
			"VAR", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public TerminalNode LIT() { return getToken(PCFParser.LIT, 0); }
		public CallContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public CondContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitContext extends TermContext {
		public TerminalNode LIT() { return getToken(PCFParser.LIT, 0); }
		public LitContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public VarContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AssignContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOpContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode OP2() { return getToken(PCFParser.OP2, 0); }
		public TerminalNode OP1() { return getToken(PCFParser.OP1, 0); }
		public BinOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public FunContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(LIT);
				}
				break;
			case 2:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(4);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(5);
				match(T__0);
				setState(6);
				term(0);
				setState(7);
				match(T__1);
				setState(8);
				term(0);
				setState(9);
				match(T__2);
				setState(10);
				term(4);
				}
				break;
			case 4:
				{
				_localctx = new FunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(T__3);
				setState(13);
				match(VAR);
				setState(14);
				match(T__4);
				setState(15);
				term(0);
				setState(16);
				match(T__5);
				setState(17);
				term(3);
				}
				break;
			case 5:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(VAR);
				setState(20);
				match(LIT);
				}
				break;
			case 6:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__6);
				setState(22);
				match(VAR);
				setState(23);
				match(T__7);
				setState(24);
				term(0);
				setState(25);
				match(T__5);
				setState(26);
				term(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(30);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(31);
						match(OP2);
						setState(32);
						term(7);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						match(OP1);
						setState(35);
						term(6);
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20,\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\'"+
		"\n\2\f\2\16\2*\13\2\3\2\2\3\2\3\2\2\2\2\61\2\36\3\2\2\2\4\5\b\2\1\2\5"+
		"\37\7\r\2\2\6\37\7\16\2\2\7\b\7\3\2\2\b\t\5\2\2\2\t\n\7\4\2\2\n\13\5\2"+
		"\2\2\13\f\7\5\2\2\f\r\5\2\2\6\r\37\3\2\2\2\16\17\7\6\2\2\17\20\7\16\2"+
		"\2\20\21\7\7\2\2\21\22\5\2\2\2\22\23\7\b\2\2\23\24\5\2\2\5\24\37\3\2\2"+
		"\2\25\26\7\16\2\2\26\37\7\r\2\2\27\30\7\t\2\2\30\31\7\16\2\2\31\32\7\n"+
		"\2\2\32\33\5\2\2\2\33\34\7\b\2\2\34\35\5\2\2\3\35\37\3\2\2\2\36\4\3\2"+
		"\2\2\36\6\3\2\2\2\36\7\3\2\2\2\36\16\3\2\2\2\36\25\3\2\2\2\36\27\3\2\2"+
		"\2\37(\3\2\2\2 !\f\b\2\2!\"\7\f\2\2\"\'\5\2\2\t#$\f\7\2\2$%\7\13\2\2%"+
		"\'\5\2\2\b& \3\2\2\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2"+
		"\2*(\3\2\2\2\5\36&(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}