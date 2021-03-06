/*
* generated by Xtext
*/
package org.xtext.example.mydsl.anyfeature.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RootElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootElementType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRootElementTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cElement1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElement1Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElement1Element1ParserRuleCall_3_0 = (RuleCall)cElement1Assignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPropertiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPropertiesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPropertiesPropertiesParserRuleCall_4_1_0 = (RuleCall)cPropertiesAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RootElementType:
		//	"RootElementType" "{" "element1" element1=Element1 ("properties" properties=Properties)? "}";
		public ParserRule getRule() { return rule; }

		//"RootElementType" "{" "element1" element1=Element1 ("properties" properties=Properties)? "}"
		public Group getGroup() { return cGroup; }

		//"RootElementType"
		public Keyword getRootElementTypeKeyword_0() { return cRootElementTypeKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"element1"
		public Keyword getElement1Keyword_2() { return cElement1Keyword_2; }

		//element1=Element1
		public Assignment getElement1Assignment_3() { return cElement1Assignment_3; }

		//Element1
		public RuleCall getElement1Element1ParserRuleCall_3_0() { return cElement1Element1ParserRuleCall_3_0; }

		//("properties" properties=Properties)?
		public Group getGroup_4() { return cGroup_4; }

		//"properties"
		public Keyword getPropertiesKeyword_4_0() { return cPropertiesKeyword_4_0; }

		//properties=Properties
		public Assignment getPropertiesAssignment_4_1() { return cPropertiesAssignment_4_1; }

		//Properties
		public RuleCall getPropertiesPropertiesParserRuleCall_4_1_0() { return cPropertiesPropertiesParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class Element1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cElement1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cElement1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCityKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCityAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCityString0ParserRuleCall_3_1_0 = (RuleCall)cCityAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cStreetKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cStreetAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cStreetString0ParserRuleCall_4_1_0 = (RuleCall)cStreetAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Element1:
		//	{Element1} "Element1" "{" ("city" city=String0)? ("street" street=String0)? "}";
		public ParserRule getRule() { return rule; }

		//{Element1} "Element1" "{" ("city" city=String0)? ("street" street=String0)? "}"
		public Group getGroup() { return cGroup; }

		//{Element1}
		public Action getElement1Action_0() { return cElement1Action_0; }

		//"Element1"
		public Keyword getElement1Keyword_1() { return cElement1Keyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("city" city=String0)?
		public Group getGroup_3() { return cGroup_3; }

		//"city"
		public Keyword getCityKeyword_3_0() { return cCityKeyword_3_0; }

		//city=String0
		public Assignment getCityAssignment_3_1() { return cCityAssignment_3_1; }

		//String0
		public RuleCall getCityString0ParserRuleCall_3_1_0() { return cCityString0ParserRuleCall_3_1_0; }

		//("street" street=String0)?
		public Group getGroup_4() { return cGroup_4; }

		//"street"
		public Keyword getStreetKeyword_4_0() { return cStreetKeyword_4_0; }

		//street=String0
		public Assignment getStreetAssignment_4_1() { return cStreetAssignment_4_1; }

		//String0
		public RuleCall getStreetString0ParserRuleCall_4_1_0() { return cStreetString0ParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class PropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Properties");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertiesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPropertiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAnyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAnyEFeatureMapEntryParserRuleCall_2_0 = (RuleCall)cAnyAssignment_2.eContents().get(0);
		
		//Properties:
		//	{Properties} "Properties" any+=EFeatureMapEntry?;
		public ParserRule getRule() { return rule; }

		//{Properties} "Properties" any+=EFeatureMapEntry?
		public Group getGroup() { return cGroup; }

		//{Properties}
		public Action getPropertiesAction_0() { return cPropertiesAction_0; }

		//"Properties"
		public Keyword getPropertiesKeyword_1() { return cPropertiesKeyword_1; }

		//any+=EFeatureMapEntry?
		public Assignment getAnyAssignment_2() { return cAnyAssignment_2; }

		//EFeatureMapEntry
		public RuleCall getAnyEFeatureMapEntryParserRuleCall_2_0() { return cAnyEFeatureMapEntryParserRuleCall_2_0; }
	}

	public class EFeatureMapEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EFeatureMapEntry");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EFeatureMapEntry returns ecore::EFeatureMapEntry:
		//	STRING;
		public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class String0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "String0");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//String0 returns type::String: //	'String' / * TODO: implement this rule and an appropriate IValueConverter * /;
		//	STRING;
		public ParserRule getRule() { return rule; }

		////	'String' / * TODO: implement this rule and an appropriate IValueConverter * /;
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final RootElementTypeElements pRootElementType;
	private final Element1Elements pElement1;
	private final PropertiesElements pProperties;
	private final EFeatureMapEntryElements pEFeatureMapEntry;
	private final String0Elements pString0;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRootElementType = new RootElementTypeElements();
		this.pElement1 = new Element1Elements();
		this.pProperties = new PropertiesElements();
		this.pEFeatureMapEntry = new EFeatureMapEntryElements();
		this.pString0 = new String0Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.anyfeature.MyDsl".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RootElementType:
	//	"RootElementType" "{" "element1" element1=Element1 ("properties" properties=Properties)? "}";
	public RootElementTypeElements getRootElementTypeAccess() {
		return pRootElementType;
	}
	
	public ParserRule getRootElementTypeRule() {
		return getRootElementTypeAccess().getRule();
	}

	//Element1:
	//	{Element1} "Element1" "{" ("city" city=String0)? ("street" street=String0)? "}";
	public Element1Elements getElement1Access() {
		return pElement1;
	}
	
	public ParserRule getElement1Rule() {
		return getElement1Access().getRule();
	}

	//Properties:
	//	{Properties} "Properties" any+=EFeatureMapEntry?;
	public PropertiesElements getPropertiesAccess() {
		return pProperties;
	}
	
	public ParserRule getPropertiesRule() {
		return getPropertiesAccess().getRule();
	}

	//EFeatureMapEntry returns ecore::EFeatureMapEntry:
	//	STRING;
	public EFeatureMapEntryElements getEFeatureMapEntryAccess() {
		return pEFeatureMapEntry;
	}
	
	public ParserRule getEFeatureMapEntryRule() {
		return getEFeatureMapEntryAccess().getRule();
	}

	//String0 returns type::String: //	'String' / * TODO: implement this rule and an appropriate IValueConverter * /;
	//	STRING;
	public String0Elements getString0Access() {
		return pString0;
	}
	
	public ParserRule getString0Rule() {
		return getString0Access().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
