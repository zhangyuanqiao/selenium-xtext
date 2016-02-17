/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMainAccess().getOrdersAlternatives_6_0(), "rule__Main__OrdersAlternatives_6_0");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getActionWithObjectAccess().getAlternatives_0(), "rule__ActionWithObject__Alternatives_0");
					put(grammarAccess.getStructureAccess().getAlternatives(), "rule__Structure__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
					put(grammarAccess.getObjectAccess().getAlternatives(), "rule__Object__Alternatives");
					put(grammarAccess.getHTMLTYPEAccess().getTypeAlternatives_0(), "rule__HTMLTYPE__TypeAlternatives_0");
					put(grammarAccess.getCollectionAccess().getAlternatives_1(), "rule__Collection__Alternatives_1");
					put(grammarAccess.getSubProcedureAccess().getActionsAlternatives_2_0(), "rule__SubProcedure__ActionsAlternatives_2_0");
					put(grammarAccess.getCheckBoxAccess().getNewValueAlternatives_2_1_0(), "rule__CheckBox__NewValueAlternatives_2_1_0");
					put(grammarAccess.getIsInAccess().getAlternatives_0(), "rule__IsIn__Alternatives_0");
					put(grammarAccess.getDoAllAccess().getTodoAlternatives_7_0(), "rule__DoAll__TodoAlternatives_7_0");
					put(grammarAccess.getExecuteAccess().getAlternatives(), "rule__Execute__Alternatives");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getActionWithObjectAccess().getGroup(), "rule__ActionWithObject__Group__0");
					put(grammarAccess.getObjectAccess().getGroup_2(), "rule__Object__Group_2__0");
					put(grammarAccess.getCollectionAccess().getGroup(), "rule__Collection__Group__0");
					put(grammarAccess.getCollectionAccess().getGroup_1_0(), "rule__Collection__Group_1_0__0");
					put(grammarAccess.getCollectionAccess().getGroup_1_1(), "rule__Collection__Group_1_1__0");
					put(grammarAccess.getSubProcedureAccess().getGroup(), "rule__SubProcedure__Group__0");
					put(grammarAccess.getRefreshAccess().getGroup(), "rule__Refresh__Group__0");
					put(grammarAccess.getNavigateAccess().getGroup(), "rule__Navigate__Group__0");
					put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
					put(grammarAccess.getReDefineAccess().getGroup(), "rule__ReDefine__Group__0");
					put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
					put(grammarAccess.getActionSelectAccess().getGroup(), "rule__ActionSelect__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
					put(grammarAccess.getCheckBoxAccess().getGroup(), "rule__CheckBox__Group__0");
					put(grammarAccess.getCheckBoxAccess().getGroup_2(), "rule__CheckBox__Group_2__0");
					put(grammarAccess.getRickrollAccess().getGroup(), "rule__Rickroll__Group__0");
					put(grammarAccess.getDoWaitAccess().getGroup(), "rule__DoWait__Group__0");
					put(grammarAccess.getIsInAccess().getGroup(), "rule__IsIn__Group__0");
					put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_8(), "rule__If__Group_8__0");
					put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
					put(grammarAccess.getDoAllAccess().getGroup(), "rule__DoAll__Group__0");
					put(grammarAccess.getExecuteAccess().getGroup_0(), "rule__Execute__Group_0__0");
					put(grammarAccess.getMainAccess().getFileNameAssignment_1(), "rule__Main__FileNameAssignment_1");
					put(grammarAccess.getMainAccess().getBrowserNameAssignment_4(), "rule__Main__BrowserNameAssignment_4");
					put(grammarAccess.getMainAccess().getOrdersAssignment_6(), "rule__Main__OrdersAssignment_6");
					put(grammarAccess.getActionWithObjectAccess().getObjectAssignment_1(), "rule__ActionWithObject__ObjectAssignment_1");
					put(grammarAccess.getObjectAccess().getObjNameAssignment_0(), "rule__Object__ObjNameAssignment_0");
					put(grammarAccess.getObjectAccess().getHtmltypeAssignment_2_0(), "rule__Object__HtmltypeAssignment_2_0");
					put(grammarAccess.getObjectAccess().getObjectDefAssignment_2_1(), "rule__Object__ObjectDefAssignment_2_1");
					put(grammarAccess.getHTMLTYPEAccess().getTypeAssignment(), "rule__HTMLTYPE__TypeAssignment");
					put(grammarAccess.getCollectionAccess().getObjAssignment_1_0_1(), "rule__Collection__ObjAssignment_1_0_1");
					put(grammarAccess.getCollectionAccess().getHtmltypeAssignment_1_1_2(), "rule__Collection__HtmltypeAssignment_1_1_2");
					put(grammarAccess.getCollectionAccess().getObjectRuleAssignment_1_1_3(), "rule__Collection__ObjectRuleAssignment_1_1_3");
					put(grammarAccess.getSubProcedureAccess().getActionsAssignment_2(), "rule__SubProcedure__ActionsAssignment_2");
					put(grammarAccess.getNavigateAccess().getUrlAssignment_1(), "rule__Navigate__UrlAssignment_1");
					put(grammarAccess.getStoreAccess().getObjNameAssignment_1(), "rule__Store__ObjNameAssignment_1");
					put(grammarAccess.getStoreAccess().getObjAssignment_3(), "rule__Store__ObjAssignment_3");
					put(grammarAccess.getReDefineAccess().getObjNameAssignment_1(), "rule__ReDefine__ObjNameAssignment_1");
					put(grammarAccess.getReDefineAccess().getObjAssignment_3(), "rule__ReDefine__ObjAssignment_3");
					put(grammarAccess.getDeleteAccess().getObjNameAssignment_1(), "rule__Delete__ObjNameAssignment_1");
					put(grammarAccess.getActionSelectAccess().getOptionAssignment_1(), "rule__ActionSelect__OptionAssignment_1");
					put(grammarAccess.getActionSelectAccess().getXpathAssignment_3(), "rule__ActionSelect__XpathAssignment_3");
					put(grammarAccess.getFillAccess().getContentAssignment_1(), "rule__Fill__ContentAssignment_1");
					put(grammarAccess.getCheckBoxAccess().getNametagAssignment_1(), "rule__CheckBox__NametagAssignment_1");
					put(grammarAccess.getCheckBoxAccess().getNewValueAssignment_2_1(), "rule__CheckBox__NewValueAssignment_2_1");
					put(grammarAccess.getDoWaitAccess().getMillisecAssignment_2(), "rule__DoWait__MillisecAssignment_2");
					put(grammarAccess.getIsInAccess().getObjAssignment_0_0(), "rule__IsIn__ObjAssignment_0_0");
					put(grammarAccess.getIsInAccess().getBodyAssignment_0_1(), "rule__IsIn__BodyAssignment_0_1");
					put(grammarAccess.getIsInAccess().getTextAssignment_2(), "rule__IsIn__TextAssignment_2");
					put(grammarAccess.getNotAccess().getCondAssignment_1(), "rule__Not__CondAssignment_1");
					put(grammarAccess.getIfAccess().getCondAssignment_2(), "rule__If__CondAssignment_2");
					put(grammarAccess.getIfAccess().getActionThenAssignment_6(), "rule__If__ActionThenAssignment_6");
					put(grammarAccess.getIfAccess().getActionElseAssignment_8_3(), "rule__If__ActionElseAssignment_8_3");
					put(grammarAccess.getLoopAccess().getCondAssignment_4(), "rule__Loop__CondAssignment_4");
					put(grammarAccess.getLoopAccess().getMillisecondsAssignment_7(), "rule__Loop__MillisecondsAssignment_7");
					put(grammarAccess.getLoopAccess().getActionsAssignment_11(), "rule__Loop__ActionsAssignment_11");
					put(grammarAccess.getDoAllAccess().getCollAssignment_3(), "rule__DoAll__CollAssignment_3");
					put(grammarAccess.getDoAllAccess().getTodoAssignment_7(), "rule__DoAll__TodoAssignment_7");
					put(grammarAccess.getExecuteAccess().getSubProcedureNameAssignment_0_1(), "rule__Execute__SubProcedureNameAssignment_0_1");
					put(grammarAccess.getExecuteAccess().getSubprocedureAssignment_1(), "rule__Execute__SubprocedureAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleMain();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
