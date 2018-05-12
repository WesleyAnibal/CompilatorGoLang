/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GoGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.Go");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsGreetingParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Go:
		//	elements+=Greeting*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Greeting*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Greeting
		public RuleCall getElementsGreetingParserRuleCall_0() { return cElementsGreetingParserRuleCall_0; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.Greeting");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTypeSpecParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Greeting:
		//	DataType | Entity | TypeSpec;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Entity | TypeSpec
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
		
		//TypeSpec
		public RuleCall getTypeSpecParserRuleCall_2() { return cTypeSpecParserRuleCall_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeNameParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeLitParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Type:
		//	TypeName | TypeLit | "(" Type ")";
		@Override public ParserRule getRule() { return rule; }
		
		//TypeName | TypeLit | "(" Type ")"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypeName
		public RuleCall getTypeNameParserRuleCall_0() { return cTypeNameParserRuleCall_0; }
		
		//TypeLit
		public RuleCall getTypeLitParserRuleCall_1() { return cTypeLitParserRuleCall_1; }
		
		//"(" Type ")"
		public Group getGroup_2() { return cGroup_2; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_2_1() { return cTypeParserRuleCall_2_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}
	public class TypeNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.TypeName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//TypeName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class TypeSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.TypeSpec");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAliasDeclParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeDefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeSpec:
		//	AliasDecl | TypeDef;
		@Override public ParserRule getRule() { return rule; }
		
		//AliasDecl | TypeDef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AliasDecl
		public RuleCall getAliasDeclParserRuleCall_0() { return cAliasDeclParserRuleCall_0; }
		
		//TypeDef
		public RuleCall getTypeDefParserRuleCall_1() { return cTypeDefParserRuleCall_1; }
	}
	public class TypeDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.TypeDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//TypeDef:
		//	name=ID type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID type=Type
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//type=Type
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_1_0() { return cTypeTypeParserRuleCall_1_0; }
	}
	public class AliasDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.AliasDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//AliasDecl:
		//	name=ID "=" type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID "=" type=Type
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
	}
	public class TypeLitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.TypeLit");
		private final RuleCall cArrayTypeParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//TypeLit:
		//	ArrayType;
		@Override public ParserRule getRule() { return rule; }
		
		//ArrayType
		public RuleCall getArrayTypeParserRuleCall() { return cArrayTypeParserRuleCall; }
	}
	public class ArrayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.ArrayType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cArrayLengthParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ArrayType:
		//	"[" ArrayLength* "]";
		@Override public ParserRule getRule() { return rule; }
		
		//"[" ArrayLength* "]"
		public Group getGroup() { return cGroup; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//ArrayLength*
		public RuleCall getArrayLengthParserRuleCall_1() { return cArrayLengthParserRuleCall_1; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class ArrayLengthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.ArrayLength");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDigitOneKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDigitTwoKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDigitThreeKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDigitFourKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDigitFiveKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cDigitSixKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cDigitSevenKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cDigitEightKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cDigitNineKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//ArrayLength:
		//	"1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9";
		@Override public ParserRule getRule() { return rule; }
		
		//"1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"1"
		public Keyword getDigitOneKeyword_0() { return cDigitOneKeyword_0; }
		
		//"2"
		public Keyword getDigitTwoKeyword_1() { return cDigitTwoKeyword_1; }
		
		//"3"
		public Keyword getDigitThreeKeyword_2() { return cDigitThreeKeyword_2; }
		
		//"4"
		public Keyword getDigitFourKeyword_3() { return cDigitFourKeyword_3; }
		
		//"5"
		public Keyword getDigitFiveKeyword_4() { return cDigitFiveKeyword_4; }
		
		//"6"
		public Keyword getDigitSixKeyword_5() { return cDigitSixKeyword_5; }
		
		//"7"
		public Keyword getDigitSevenKeyword_6() { return cDigitSevenKeyword_6; }
		
		//"8"
		public Keyword getDigitEightKeyword_7() { return cDigitEightKeyword_7; }
		
		//"9"
		public Keyword getDigitNineKeyword_8() { return cDigitNineKeyword_8; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Entity:
		//	'print' '(' name=ID ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'print' '(' name=ID ')'
		public Group getGroup() { return cGroup; }
		
		//'print'
		public Keyword getPrintKeyword_0() { return cPrintKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.go.Go.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//	'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final GoElements pGo;
	private final GreetingElements pGreeting;
	private final TypeElements pType;
	private final TypeNameElements pTypeName;
	private final TypeSpecElements pTypeSpec;
	private final TypeDefElements pTypeDef;
	private final AliasDeclElements pAliasDecl;
	private final TypeLitElements pTypeLit;
	private final ArrayTypeElements pArrayType;
	private final ArrayLengthElements pArrayLength;
	private final EntityElements pEntity;
	private final DataTypeElements pDataType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GoGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGo = new GoElements();
		this.pGreeting = new GreetingElements();
		this.pType = new TypeElements();
		this.pTypeName = new TypeNameElements();
		this.pTypeSpec = new TypeSpecElements();
		this.pTypeDef = new TypeDefElements();
		this.pAliasDecl = new AliasDeclElements();
		this.pTypeLit = new TypeLitElements();
		this.pArrayType = new ArrayTypeElements();
		this.pArrayLength = new ArrayLengthElements();
		this.pEntity = new EntityElements();
		this.pDataType = new DataTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.go.Go".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Go:
	//	elements+=Greeting*;
	public GoElements getGoAccess() {
		return pGo;
	}
	
	public ParserRule getGoRule() {
		return getGoAccess().getRule();
	}
	
	//Greeting:
	//	DataType | Entity | TypeSpec;
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}
	
	//Type:
	//	TypeName | TypeLit | "(" Type ")";
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//TypeName:
	//	name=ID;
	public TypeNameElements getTypeNameAccess() {
		return pTypeName;
	}
	
	public ParserRule getTypeNameRule() {
		return getTypeNameAccess().getRule();
	}
	
	//TypeSpec:
	//	AliasDecl | TypeDef;
	public TypeSpecElements getTypeSpecAccess() {
		return pTypeSpec;
	}
	
	public ParserRule getTypeSpecRule() {
		return getTypeSpecAccess().getRule();
	}
	
	//TypeDef:
	//	name=ID type=Type;
	public TypeDefElements getTypeDefAccess() {
		return pTypeDef;
	}
	
	public ParserRule getTypeDefRule() {
		return getTypeDefAccess().getRule();
	}
	
	//AliasDecl:
	//	name=ID "=" type=Type;
	public AliasDeclElements getAliasDeclAccess() {
		return pAliasDecl;
	}
	
	public ParserRule getAliasDeclRule() {
		return getAliasDeclAccess().getRule();
	}
	
	//TypeLit:
	//	ArrayType;
	public TypeLitElements getTypeLitAccess() {
		return pTypeLit;
	}
	
	public ParserRule getTypeLitRule() {
		return getTypeLitAccess().getRule();
	}
	
	//ArrayType:
	//	"[" ArrayLength* "]";
	public ArrayTypeElements getArrayTypeAccess() {
		return pArrayType;
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}
	
	//ArrayLength:
	//	"1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9";
	public ArrayLengthElements getArrayLengthAccess() {
		return pArrayLength;
	}
	
	public ParserRule getArrayLengthRule() {
		return getArrayLengthAccess().getRule();
	}
	
	//Entity:
	//	'print' '(' name=ID ')';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//DataType:
	//	'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
