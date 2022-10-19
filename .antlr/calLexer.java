// Generated from c:\Users\Jamie\Compiler\CA4003\Assignment-1.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Semicolon=3, ID=4, Colon=5, Comma=6, OpenBracket=7, CloseBracket=8, 
		Equals=9, Variable=10, Constant=11, Statement=12, Begin=13, Integer=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Semicolon", "ID", "Colon", "Comma", "OpenBracket", "CloseBracket", 
			"Equals", "Variable", "Constant", "Statement", "Begin", "Integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'END'", "'EXPRESSION'", "';'", "'Identifier'", "':'", "','", "'('", 
			"')'", "'='", "'VARIABLE'", "'CONSTANT'", "'STATEMENT'", "'BEGIN'", "'INTEGER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Semicolon", "ID", "Colon", "Comma", "OpenBracket", 
			"CloseBracket", "Equals", "Variable", "Constant", "Statement", "Begin", 
			"Integer"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assignment-1.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\2\2n\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13;"+
		"\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27"+
		"N\3\2\2\2\31W\3\2\2\2\33a\3\2\2\2\35g\3\2\2\2\37 \7G\2\2 !\7P\2\2!\"\7"+
		"F\2\2\"\4\3\2\2\2#$\7G\2\2$%\7Z\2\2%&\7R\2\2&\'\7T\2\2\'(\7G\2\2()\7U"+
		"\2\2)*\7U\2\2*+\7K\2\2+,\7Q\2\2,-\7P\2\2-\6\3\2\2\2./\7=\2\2/\b\3\2\2"+
		"\2\60\61\7K\2\2\61\62\7f\2\2\62\63\7g\2\2\63\64\7p\2\2\64\65\7v\2\2\65"+
		"\66\7k\2\2\66\67\7h\2\2\678\7k\2\289\7g\2\29:\7t\2\2:\n\3\2\2\2;<\7<\2"+
		"\2<\f\3\2\2\2=>\7.\2\2>\16\3\2\2\2?@\7*\2\2@\20\3\2\2\2AB\7+\2\2B\22\3"+
		"\2\2\2CD\7?\2\2D\24\3\2\2\2EF\7X\2\2FG\7C\2\2GH\7T\2\2HI\7K\2\2IJ\7C\2"+
		"\2JK\7D\2\2KL\7N\2\2LM\7G\2\2M\26\3\2\2\2NO\7E\2\2OP\7Q\2\2PQ\7P\2\2Q"+
		"R\7U\2\2RS\7V\2\2ST\7C\2\2TU\7P\2\2UV\7V\2\2V\30\3\2\2\2WX\7U\2\2XY\7"+
		"V\2\2YZ\7C\2\2Z[\7V\2\2[\\\7G\2\2\\]\7O\2\2]^\7G\2\2^_\7P\2\2_`\7V\2\2"+
		"`\32\3\2\2\2ab\7D\2\2bc\7G\2\2cd\7I\2\2de\7K\2\2ef\7P\2\2f\34\3\2\2\2"+
		"gh\7K\2\2hi\7P\2\2ij\7V\2\2jk\7G\2\2kl\7I\2\2lm\7G\2\2mn\7T\2\2n\36\3"+
		"\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}