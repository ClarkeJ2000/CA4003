// Generated from c:\Users\Jamie\Compiler\CA4003\Draw_example\draw.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class drawLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Up=1, Down=2, Left=3, Right=4, Init=5, Draw=6, Display=7, NUMBER=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "D", "E", "F", "G", "H", "I", "L", "N", "O", "P", "R", "S", "T", 
			"U", "W", "Y", "Up", "Down", "Left", "Right", "Init", "Draw", "Display", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Up", "Down", "Left", "Right", "Init", "Draw", "Display", "NUMBER", 
			"WS"
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


	public drawLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "draw.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\6\32\u0080\n\32\r\32\16\32\u0081\3\33\6\33\u0085\n\33"+
		"\r\33\16\33\u0086\3\33\3\33\2\2\34\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2"+
		"\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\3\'\4)\5+\6-\7/\b\61\t\63\n"+
		"\65\13\3\2\25\4\2CCcc\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk"+
		"\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2Y"+
		"Yyy\4\2[[{{\3\2\62;\5\2\13\f\17\17\"\"\2z\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA"+
		"\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31"+
		"M\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2!U\3\2\2\2#W\3\2\2\2%Y\3"+
		"\2\2\2\'\\\3\2\2\2)a\3\2\2\2+f\3\2\2\2-l\3\2\2\2/q\3\2\2\2\61v\3\2\2\2"+
		"\63\177\3\2\2\2\65\u0084\3\2\2\2\678\t\2\2\28\4\3\2\2\29:\t\3\2\2:\6\3"+
		"\2\2\2;<\t\4\2\2<\b\3\2\2\2=>\t\5\2\2>\n\3\2\2\2?@\t\6\2\2@\f\3\2\2\2"+
		"AB\t\7\2\2B\16\3\2\2\2CD\t\b\2\2D\20\3\2\2\2EF\t\t\2\2F\22\3\2\2\2GH\t"+
		"\n\2\2H\24\3\2\2\2IJ\t\13\2\2J\26\3\2\2\2KL\t\f\2\2L\30\3\2\2\2MN\t\r"+
		"\2\2N\32\3\2\2\2OP\t\16\2\2P\34\3\2\2\2QR\t\17\2\2R\36\3\2\2\2ST\t\20"+
		"\2\2T \3\2\2\2UV\t\21\2\2V\"\3\2\2\2WX\t\22\2\2X$\3\2\2\2YZ\5\37\20\2"+
		"Z[\5\27\f\2[&\3\2\2\2\\]\5\5\3\2]^\5\25\13\2^_\5!\21\2_`\5\23\n\2`(\3"+
		"\2\2\2ab\5\21\t\2bc\5\7\4\2cd\5\t\5\2de\5\35\17\2e*\3\2\2\2fg\5\31\r\2"+
		"gh\5\17\b\2hi\5\13\6\2ij\5\r\7\2jk\5\35\17\2k,\3\2\2\2lm\5\17\b\2mn\5"+
		"\23\n\2no\5\17\b\2op\5\35\17\2p.\3\2\2\2qr\5\5\3\2rs\5\31\r\2st\5\3\2"+
		"\2tu\5!\21\2u\60\3\2\2\2vw\5\5\3\2wx\5\17\b\2xy\5\33\16\2yz\5\27\f\2z"+
		"{\5\21\t\2{|\5\3\2\2|}\5#\22\2}\62\3\2\2\2~\u0080\t\23\2\2\177~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\64"+
		"\3\2\2\2\u0083\u0085\t\24\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\b\33\2\2\u0089\66\3\2\2\2\5\2\u0081\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}