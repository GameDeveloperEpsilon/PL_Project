// Generated from C:/Users/Rec/Forge/Java_WS/PL_Project/src\JSON3.g4 by ANTLR 4.12.0
package gen3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSON3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NULL=12, BOOLEAN=13, DIGIT=14, ONENINE=15, STRING=16, 
		ESCAPE=17, WS=18;
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_members = 2, RULE_member = 3, RULE_array = 4, 
		RULE_elements = 5, RULE_element = 6, RULE_value = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "object", "members", "member", "array", "elements", "element", 
			"value", "number"
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

	@Override
	public String getGrammarFileName() { return "JSON3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSON3Parser(TokenStream input) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
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
	public static class ObjectContext extends ParserRuleContext {
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				members();
				setState(24);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				member();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				member();
				setState(32);
				match(T__2);
				setState(33);
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
		public TerminalNode STRING() { return getToken(JSON3Parser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(STRING);
			setState(38);
			match(T__3);
			setState(39);
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
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__4);
				setState(42);
				elements();
				setState(43);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__4);
				setState(46);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elements);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				element();
				setState(51);
				match(T__2);
				setState(52);
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
	public static class ElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JSON3Parser.NULL, 0); }
		public TerminalNode BOOLEAN() { return getToken(JSON3Parser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(JSON3Parser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(NULL);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(STRING);
				}
				break;
			case T__6:
			case DIGIT:
			case ONENINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode ONENINE() { return getToken(JSON3Parser.ONENINE, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(JSON3Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(JSON3Parser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSON3Listener ) ((JSON3Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSON3Visitor ) return ((JSON3Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(66);
				match(T__6);
				}
			}

			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(DIGIT);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case ONENINE:
				{
				setState(74);
				match(ONENINE);
				setState(75);
				match(DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(78);
				match(T__7);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					match(DIGIT);
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__10) {
					{
					setState(87);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(DIGIT);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00040\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u00057\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"A\b\u0007\u0001\b\u0003\bD\b\b\u0001\b\u0004\bG\b\b\u000b\b\f\bH\u0001"+
		"\b\u0001\b\u0003\bM\b\b\u0001\b\u0001\b\u0004\bQ\b\b\u000b\b\f\bR\u0003"+
		"\bU\b\b\u0001\b\u0001\b\u0003\bY\b\b\u0001\b\u0004\b\\\b\b\u000b\b\f\b"+
		"]\u0003\b`\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0002\u0001\u0000\t\n\u0002\u0000\u0007\u0007\u000b\u000b"+
		"j\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000"+
		"\u0004#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b/\u0001"+
		"\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000"+
		"\u000e@\u0001\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012\u0015"+
		"\u0003\u0002\u0001\u0000\u0013\u0015\u0003\b\u0004\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0001\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003"+
		"\u0004\u0002\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001d\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001d\u0005"+
		"\u0002\u0000\u0000\u001c\u0016\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e$\u0003\u0006"+
		"\u0003\u0000\u001f \u0003\u0006\u0003\u0000 !\u0005\u0003\u0000\u0000"+
		"!\"\u0003\u0004\u0002\u0000\"$\u0001\u0000\u0000\u0000#\u001e\u0001\u0000"+
		"\u0000\u0000#\u001f\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0010\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0003\u000e\u0007"+
		"\u0000(\u0007\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000*+\u0003"+
		"\n\u0005\u0000+,\u0005\u0006\u0000\u0000,0\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0005\u0000\u0000.0\u0005\u0006\u0000\u0000/)\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u00000\t\u0001\u0000\u0000\u000017\u0003\f\u0006"+
		"\u000023\u0003\f\u0006\u000034\u0005\u0003\u0000\u000045\u0003\n\u0005"+
		"\u000057\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u000062\u0001\u0000"+
		"\u0000\u00007\u000b\u0001\u0000\u0000\u000089\u0003\u000e\u0007\u0000"+
		"9\r\u0001\u0000\u0000\u0000:A\u0005\f\u0000\u0000;A\u0005\r\u0000\u0000"+
		"<A\u0005\u0010\u0000\u0000=A\u0003\u0010\b\u0000>A\u0003\u0002\u0001\u0000"+
		"?A\u0003\b\u0004\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000"+
		"@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BD\u0005"+
		"\u0007\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DL\u0001\u0000\u0000\u0000EG\u0005\u000e\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IM\u0001\u0000\u0000\u0000JK\u0005\u000f\u0000\u0000KM\u0005"+
		"\u000e\u0000\u0000LF\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MT\u0001\u0000\u0000\u0000NP\u0005\b\u0000\u0000OQ\u0005\u000e\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TN\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U_\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0000\u0000\u0000WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0005\u000e\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_V\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0011\u0001\u0000\u0000"+
		"\u0000\u000e\u0014\u001c#/6@CHLRTX]_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}