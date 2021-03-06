// Generated from /home/bruno/IMT_A1/MathDiscretes/LangagesProgrammation/TP/TP1/PCF/PCF/src/parser/PCF.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP1=9, 
		OP2=10, LIT=11, VAR=12, WS=13, LINE_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OP1", 
			"OP2", "LIT", "VAR", "WS", "LINE_COMMENT"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\fE\n\f\f\f\16\fH"+
		"\13\f\5\fJ\n\f\3\r\6\rM\n\r\r\r\16\rN\3\r\3\r\3\r\7\rT\n\r\f\r\16\rW\13"+
		"\r\3\16\6\16Z\n\16\r\16\16\16[\3\16\3\16\3\17\3\17\3\17\3\17\7\17d\n\17"+
		"\f\17\16\17g\13\17\3\17\3\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\13\4\2--//\4\2,,\61\61"+
		"\3\2\63;\3\2\62;\6\2//C\\aac|\4\2C\\c|\4\2//aa\5\2\13\f\17\17\"\"\3\2"+
		"\f\f\2s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2"+
		"\7(\3\2\2\2\t-\3\2\2\2\13\61\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21;\3"+
		"\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27I\3\2\2\2\31L\3\2\2\2\33Y\3\2\2\2\35"+
		"_\3\2\2\2\37 \7k\2\2 !\7h\2\2!\"\7|\2\2\"\4\3\2\2\2#$\7v\2\2$%\7j\2\2"+
		"%&\7g\2\2&\'\7p\2\2\'\6\3\2\2\2()\7g\2\2)*\7n\2\2*+\7u\2\2+,\7g\2\2,\b"+
		"\3\2\2\2-.\7h\2\2./\7w\2\2/\60\7p\2\2\60\n\3\2\2\2\61\62\7/\2\2\62\63"+
		"\7@\2\2\63\f\3\2\2\2\64\65\7k\2\2\65\66\7p\2\2\66\16\3\2\2\2\678\7n\2"+
		"\289\7g\2\29:\7v\2\2:\20\3\2\2\2;<\7?\2\2<\22\3\2\2\2=>\t\2\2\2>\24\3"+
		"\2\2\2?@\t\3\2\2@\26\3\2\2\2AJ\7\62\2\2BF\t\4\2\2CE\t\5\2\2DC\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IA\3\2\2\2IB\3\2\2\2"+
		"J\30\3\2\2\2KM\t\6\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OU\3\2\2"+
		"\2PT\t\7\2\2QT\5\27\f\2RT\t\b\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2V\32\3\2\2\2WU\3\2\2\2XZ\t\t\2\2YX\3\2\2\2Z[\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\16\2\2^\34\3\2\2\2_`\7\61\2"+
		"\2`a\7\61\2\2ae\3\2\2\2bd\n\n\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ge\3\2\2\2hi\7\f\2\2ij\3\2\2\2jk\b\17\2\2k\36\3\2\2\2\13"+
		"\2FILNSU[e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}