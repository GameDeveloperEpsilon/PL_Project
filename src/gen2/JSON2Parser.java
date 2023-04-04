// Generated from java-escape by ANTLR 4.11.1
package gen2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSON2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CHARACTER=8, ESCAPE=9, 
		UNICODE=10, HEX=11, NUMBER=12, DIGIT=13, INT=14, EXP=15, TRUE=16, FALSE=17, 
		NULL=18, WS=19;
	public static final int
		RULE_json = 0, RULE_value = 1, RULE_object = 2, RULE_members = 3, RULE_member = 4, 
		RULE_array = 5, RULE_elements = 6, RULE_string = 7, RULE_characters = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "value", "object", "members", "member", "array", "elements", 
			"string", "characters"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSON2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JSON2Parser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(JSON2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSON2Parser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JSON2Parser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				string();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__0);
				setState(34);
				members();
				setState(35);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MembersContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_members);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				member();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				member();
				setState(41);
				match(T__2);
				setState(42);
				members();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			string();
			setState(47);
			match(T__3);
			setState(48);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(JSON2Parser.WS, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__4);
				setState(51);
				match(WS);
				setState(52);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__4);
				setState(54);
				elements();
				setState(55);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elements);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				value();
				setState(61);
				match(T__2);
				setState(62);
				elements();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<CharactersContext> characters() {
			return getRuleContexts(CharactersContext.class);
		}
		public CharactersContext characters(int i) {
			return getRuleContext(CharactersContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER || _la==ESCAPE) {
				{
				{
				setState(67);
				characters();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharactersContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(JSON2Parser.CHARACTER, 0); }
		public TerminalNode ESCAPE() { return getToken(JSON2Parser.ESCAPE, 0); }
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_characters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==CHARACTER || _la==ESCAPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"A\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007E\b\u0007\n\u0007\f\u0007"+
		"H\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\b"+
		"\tP\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		".\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000"+
		"\u0000\u000eB\u0001\u0000\u0000\u0000\u0010K\u0001\u0000\u0000\u0000\u0012"+
		"\u0015\u0003\u0004\u0002\u0000\u0013\u0015\u0003\n\u0005\u0000\u0014\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0001"+
		"\u0001\u0000\u0000\u0000\u0016\u001e\u0003\u0004\u0002\u0000\u0017\u001e"+
		"\u0003\n\u0005\u0000\u0018\u001e\u0003\u000e\u0007\u0000\u0019\u001e\u0005"+
		"\f\u0000\u0000\u001a\u001e\u0005\u0010\u0000\u0000\u001b\u001e\u0005\u0011"+
		"\u0000\u0000\u001c\u001e\u0005\u0012\u0000\u0000\u001d\u0016\u0001\u0000"+
		"\u0000\u0000\u001d\u0017\u0001\u0000\u0000\u0000\u001d\u0018\u0001\u0000"+
		"\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000"+
		"\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000"+
		"\u0000 &\u0005\u0002\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0003\u0006"+
		"\u0003\u0000#$\u0005\u0002\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001f"+
		"\u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000&\u0005\u0001\u0000"+
		"\u0000\u0000\'-\u0003\b\u0004\u0000()\u0003\b\u0004\u0000)*\u0005\u0003"+
		"\u0000\u0000*+\u0003\u0006\u0003\u0000+-\u0001\u0000\u0000\u0000,\'\u0001"+
		"\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000"+
		"\u0000./\u0003\u000e\u0007\u0000/0\u0005\u0004\u0000\u000001\u0003\u0002"+
		"\u0001\u00001\t\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005"+
		"\u0013\u0000\u00004:\u0005\u0006\u0000\u000056\u0005\u0005\u0000\u0000"+
		"67\u0003\f\u0006\u000078\u0005\u0006\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"92\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;A\u0003\u0002\u0001\u0000<=\u0003\u0002\u0001\u0000=>\u0005"+
		"\u0003\u0000\u0000>?\u0003\f\u0006\u0000?A\u0001\u0000\u0000\u0000@;\u0001"+
		"\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000"+
		"BF\u0005\u0007\u0000\u0000CE\u0003\u0010\b\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0007"+
		"\u0000\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000"+
		"L\u0011\u0001\u0000\u0000\u0000\u0007\u0014\u001d%,9@F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}