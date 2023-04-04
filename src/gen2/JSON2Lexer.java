// Generated from java-escape by ANTLR 4.11.1
package gen2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSON2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CHARACTER=8, ESCAPE=9, 
		UNICODE=10, HEX=11, NUMBER=12, DIGIT=13, INT=14, EXP=15, TRUE=16, FALSE=17, 
		NULL=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CHARACTER", 
			"ESCAPE", "UNICODE", "HEX", "NUMBER", "DIGIT", "INT", "EXP", "TRUE", 
			"FALSE", "NULL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "':'", "'['", "']'", "'\"'", null, null, null, 
			null, null, null, null, null, "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CHARACTER", "ESCAPE", 
			"UNICODE", "HEX", "NUMBER", "DIGIT", "INT", "EXP", "TRUE", "FALSE", "NULL", 
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


	public JSON2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON2.g4"; }

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
		"\u0004\u0000\u0013\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b;\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nE\b\n\u0001\u000b\u0003\u000b"+
		"H\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000bM\b\u000b\u000b"+
		"\u000b\f\u000bN\u0001\u000b\u0003\u000bR\b\u000b\u0001\u000b\u0003\u000b"+
		"U\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"[\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b`\b\u000b\u000b"+
		"\u000b\f\u000ba\u0003\u000bd\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\rk\b\r\n\r\f\rn\t\r\u0003\rp\b\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000et\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0089\b\u0012\u000b\u0012\f"+
		"\u0012\u008a\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\u0001\u0000\b\u0003\u0000\u0000\u001f\"\"\\\\\b"+
		"\u0000\"\"//\\\\bbffnnrrtt\u0002\u0000AFaf\u0001\u000009\u0001\u00001"+
		"9\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\f\r  \u009b\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000"+
		"\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f"+
		"5\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u0013<\u0001"+
		"\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000"+
		"\u0000\u0019e\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001d"+
		"q\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000!|\u0001\u0000"+
		"\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000"+
		"\'(\u0005{\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005}\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005,\u0000\u0000,\u0006\u0001\u0000"+
		"\u0000\u0000-.\u0005:\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005["+
		"\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005]\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000034\u0005\"\u0000\u00004\u000e\u0001\u0000\u0000\u0000"+
		"56\b\u0000\u0000\u00006\u0010\u0001\u0000\u0000\u00007:\u0005\\\u0000"+
		"\u00008;\u0007\u0001\u0000\u00009;\u0003\u0013\t\u0000:8\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005"+
		"u\u0000\u0000=>\u0003\u0015\n\u0000>?\u0003\u0015\n\u0000?@\u0003\u0015"+
		"\n\u0000@A\u0003\u0015\n\u0000A\u0014\u0001\u0000\u0000\u0000BE\u0003"+
		"\u0019\f\u0000CE\u0007\u0002\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000E\u0016\u0001\u0000\u0000\u0000FH\u0005-\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0003\u001b\r\u0000JL\u0005.\u0000\u0000KM\u0003\u0019\f\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PR\u0003\u001d"+
		"\u000e\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000Rd\u0001"+
		"\u0000\u0000\u0000SU\u0005-\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003\u001b\r\u0000WX\u0003"+
		"\u001d\u000e\u0000Xd\u0001\u0000\u0000\u0000Y[\u0005-\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0003\u001b\r\u0000]_\u0005.\u0000\u0000^`\u0003\u0019\f\u0000_^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000cG\u0001\u0000\u0000"+
		"\u0000cT\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000d\u0018\u0001"+
		"\u0000\u0000\u0000ef\u0007\u0003\u0000\u0000f\u001a\u0001\u0000\u0000"+
		"\u0000gp\u00050\u0000\u0000hl\u0007\u0004\u0000\u0000ik\u0007\u0003\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000og\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000"+
		"p\u001c\u0001\u0000\u0000\u0000qs\u0007\u0005\u0000\u0000rt\u0007\u0006"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0003\u001b\r\u0000v\u001e\u0001\u0000\u0000\u0000"+
		"wx\u0005t\u0000\u0000xy\u0005r\u0000\u0000yz\u0005u\u0000\u0000z{\u0005"+
		"e\u0000\u0000{ \u0001\u0000\u0000\u0000|}\u0005f\u0000\u0000}~\u0005a"+
		"\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005s\u0000\u0000"+
		"\u0080\u0081\u0005e\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005n\u0000\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u0085\u0005"+
		"l\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086$\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0007\u0007\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0006\u0012\u0000\u0000\u008d&\u0001\u0000\u0000\u0000"+
		"\u000e\u0000:DGNQTZaclos\u008a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}