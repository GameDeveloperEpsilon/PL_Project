// Generated from C:/Users/Rec/Forge/Java_WS/PL_Project/src\JSON3.g4 by ANTLR 4.12.0
package gen3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSON3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NULL=12, BOOLEAN=13, DIGIT=14, ONENINE=15, STRING=16, 
		ESCAPE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NULL", "BOOLEAN", "DIGIT", "ONENINE", "STRING", "ESCAPE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "':'", "'['", "']'", "'-'", "'.'", "'E'", 
			"'e'", "'+'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NULL", "BOOLEAN", "DIGIT", "ONENINE", "STRING", "ESCAPE", "WS"
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


	public JSON3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON3.g4"; }

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
		"\u0004\u0000\u0012c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\fJ\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000fS\b\u000f\n\u000f\f\u000fV\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0004\u0011^\b\u0011\u000b\u0011\f\u0011_\u0001\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0001\u0000"+
		"09\u0001\u000019\u0002\u0000 !#~\b\u0000\"\"//\\\\bbffnnrrtt\u0003\u0000"+
		"\t\n\f\r  f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%"+
		"\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000"+
		"\u0000\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f"+
		"3\u0001\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u00137\u0001"+
		"\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017;\u0001\u0000\u0000"+
		"\u0000\u0019I\u0001\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001d"+
		"M\u0001\u0000\u0000\u0000\u001fO\u0001\u0000\u0000\u0000!Y\u0001\u0000"+
		"\u0000\u0000#]\u0001\u0000\u0000\u0000%&\u0005{\u0000\u0000&\u0002\u0001"+
		"\u0000\u0000\u0000\'(\u0005}\u0000\u0000(\u0004\u0001\u0000\u0000\u0000"+
		")*\u0005,\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005:\u0000\u0000"+
		",\b\u0001\u0000\u0000\u0000-.\u0005[\u0000\u0000.\n\u0001\u0000\u0000"+
		"\u0000/0\u0005]\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005-\u0000"+
		"\u00002\u000e\u0001\u0000\u0000\u000034\u0005.\u0000\u00004\u0010\u0001"+
		"\u0000\u0000\u000056\u0005E\u0000\u00006\u0012\u0001\u0000\u0000\u0000"+
		"78\u0005e\u0000\u00008\u0014\u0001\u0000\u0000\u00009:\u0005+\u0000\u0000"+
		":\u0016\u0001\u0000\u0000\u0000;<\u0005n\u0000\u0000<=\u0005u\u0000\u0000"+
		"=>\u0005l\u0000\u0000>?\u0005l\u0000\u0000?\u0018\u0001\u0000\u0000\u0000"+
		"@A\u0005t\u0000\u0000AB\u0005r\u0000\u0000BC\u0005u\u0000\u0000CJ\u0005"+
		"e\u0000\u0000DE\u0005f\u0000\u0000EF\u0005a\u0000\u0000FG\u0005l\u0000"+
		"\u0000GH\u0005s\u0000\u0000HJ\u0005e\u0000\u0000I@\u0001\u0000\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000J\u001a\u0001\u0000\u0000\u0000KL\u0007\u0000"+
		"\u0000\u0000L\u001c\u0001\u0000\u0000\u0000MN\u0007\u0001\u0000\u0000"+
		"N\u001e\u0001\u0000\u0000\u0000OT\u0005\"\u0000\u0000PS\u0007\u0002\u0000"+
		"\u0000QS\u0003!\u0010\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005"+
		"\"\u0000\u0000X \u0001\u0000\u0000\u0000YZ\u0005\\\u0000\u0000Z[\u0007"+
		"\u0003\u0000\u0000[\"\u0001\u0000\u0000\u0000\\^\u0007\u0004\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0006\u0011"+
		"\u0000\u0000b$\u0001\u0000\u0000\u0000\u0005\u0000IRT_\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}