package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'guess'", "'nameTag'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'true'", "'false'", "'File'", "'with'", "'browser'", "':'", "'Collection'", "'{'", "'}'", "'of'", "'all'", "'Subprocedure'", "'Refresh'", "'Navigate'", "'var'", "'='", "'Redefine'", "'as'", "'Delete'", "'Select'", "'from'", "'Click'", "'Write'", "'inside'", "'CheckBox'", "'to'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'contains'", "'Not'", "'If'", "'Then'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'in'", "'do'", "'Execute'", "'body'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMain"
    // InternalMyDsl.g:53:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMain EOF )
            // InternalMyDsl.g:55:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyDsl.g:62:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Main__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Main__Group__0 )
            // InternalMyDsl.g:69:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:78:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAction EOF )
            // InternalMyDsl.g:80:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:87:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:94:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionWithObject"
    // InternalMyDsl.g:103:1: entryRuleActionWithObject : ruleActionWithObject EOF ;
    public final void entryRuleActionWithObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleActionWithObject EOF )
            // InternalMyDsl.g:105:1: ruleActionWithObject EOF
            {
             before(grammarAccess.getActionWithObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleActionWithObject();

            state._fsp--;

             after(grammarAccess.getActionWithObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionWithObject"


    // $ANTLR start "ruleActionWithObject"
    // InternalMyDsl.g:112:1: ruleActionWithObject : ( ( rule__ActionWithObject__Group__0 ) ) ;
    public final void ruleActionWithObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ActionWithObject__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ActionWithObject__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ActionWithObject__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ActionWithObject__Group__0 )
            {
             before(grammarAccess.getActionWithObjectAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ActionWithObject__Group__0 )
            // InternalMyDsl.g:119:4: rule__ActionWithObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionWithObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionWithObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionWithObject"


    // $ANTLR start "entryRuleStructure"
    // InternalMyDsl.g:128:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStructure EOF )
            // InternalMyDsl.g:130:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalMyDsl.g:137:1: ruleStructure : ( ( rule__Structure__Alternatives ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Structure__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Structure__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Structure__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Structure__Alternatives )
            {
             before(grammarAccess.getStructureAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Structure__Alternatives )
            // InternalMyDsl.g:144:4: rule__Structure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCondition EOF )
            // InternalMyDsl.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:162:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Condition__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Condition__Alternatives )
            // InternalMyDsl.g:169:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleObject"
    // InternalMyDsl.g:178:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleObject EOF )
            // InternalMyDsl.g:180:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalMyDsl.g:187:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Object__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Object__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Object__Alternatives )
            // InternalMyDsl.g:194:4: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Object__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleHTMLTYPE"
    // InternalMyDsl.g:203:1: entryRuleHTMLTYPE : ruleHTMLTYPE EOF ;
    public final void entryRuleHTMLTYPE() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleHTMLTYPE EOF )
            // InternalMyDsl.g:205:1: ruleHTMLTYPE EOF
            {
             before(grammarAccess.getHTMLTYPERule()); 
            pushFollow(FOLLOW_1);
            ruleHTMLTYPE();

            state._fsp--;

             after(grammarAccess.getHTMLTYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTMLTYPE"


    // $ANTLR start "ruleHTMLTYPE"
    // InternalMyDsl.g:212:1: ruleHTMLTYPE : ( ( rule__HTMLTYPE__TypeAssignment ) ) ;
    public final void ruleHTMLTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__HTMLTYPE__TypeAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__HTMLTYPE__TypeAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__HTMLTYPE__TypeAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__HTMLTYPE__TypeAssignment )
            {
             before(grammarAccess.getHTMLTYPEAccess().getTypeAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__HTMLTYPE__TypeAssignment )
            // InternalMyDsl.g:219:4: rule__HTMLTYPE__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__HTMLTYPE__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHTMLTYPEAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTMLTYPE"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:228:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCollection EOF )
            // InternalMyDsl.g:230:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:237:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Collection__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Collection__Group__0 )
            // InternalMyDsl.g:244:4: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleSubProcedure"
    // InternalMyDsl.g:253:1: entryRuleSubProcedure : ruleSubProcedure EOF ;
    public final void entryRuleSubProcedure() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSubProcedure EOF )
            // InternalMyDsl.g:255:1: ruleSubProcedure EOF
            {
             before(grammarAccess.getSubProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleSubProcedure();

            state._fsp--;

             after(grammarAccess.getSubProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubProcedure"


    // $ANTLR start "ruleSubProcedure"
    // InternalMyDsl.g:262:1: ruleSubProcedure : ( ( rule__SubProcedure__Group__0 ) ) ;
    public final void ruleSubProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SubProcedure__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SubProcedure__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SubProcedure__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SubProcedure__Group__0 )
            {
             before(grammarAccess.getSubProcedureAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SubProcedure__Group__0 )
            // InternalMyDsl.g:269:4: rule__SubProcedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubProcedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubProcedure"


    // $ANTLR start "entryRuleRefresh"
    // InternalMyDsl.g:278:1: entryRuleRefresh : ruleRefresh EOF ;
    public final void entryRuleRefresh() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRefresh EOF )
            // InternalMyDsl.g:280:1: ruleRefresh EOF
            {
             before(grammarAccess.getRefreshRule()); 
            pushFollow(FOLLOW_1);
            ruleRefresh();

            state._fsp--;

             after(grammarAccess.getRefreshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefresh"


    // $ANTLR start "ruleRefresh"
    // InternalMyDsl.g:287:1: ruleRefresh : ( ( rule__Refresh__Group__0 ) ) ;
    public final void ruleRefresh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Refresh__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Refresh__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Refresh__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Refresh__Group__0 )
            {
             before(grammarAccess.getRefreshAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Refresh__Group__0 )
            // InternalMyDsl.g:294:4: rule__Refresh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Refresh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefreshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefresh"


    // $ANTLR start "entryRuleNavigate"
    // InternalMyDsl.g:303:1: entryRuleNavigate : ruleNavigate EOF ;
    public final void entryRuleNavigate() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleNavigate EOF )
            // InternalMyDsl.g:305:1: ruleNavigate EOF
            {
             before(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigate();

            state._fsp--;

             after(grammarAccess.getNavigateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // InternalMyDsl.g:312:1: ruleNavigate : ( ( rule__Navigate__Group__0 ) ) ;
    public final void ruleNavigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Navigate__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Navigate__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Navigate__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Navigate__Group__0 )
            {
             before(grammarAccess.getNavigateAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Navigate__Group__0 )
            // InternalMyDsl.g:319:4: rule__Navigate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:328:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleStore EOF )
            // InternalMyDsl.g:330:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:337:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Store__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Store__Group__0 )
            // InternalMyDsl.g:344:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleReDefine"
    // InternalMyDsl.g:353:1: entryRuleReDefine : ruleReDefine EOF ;
    public final void entryRuleReDefine() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleReDefine EOF )
            // InternalMyDsl.g:355:1: ruleReDefine EOF
            {
             before(grammarAccess.getReDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleReDefine();

            state._fsp--;

             after(grammarAccess.getReDefineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReDefine"


    // $ANTLR start "ruleReDefine"
    // InternalMyDsl.g:362:1: ruleReDefine : ( ( rule__ReDefine__Group__0 ) ) ;
    public final void ruleReDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ReDefine__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ReDefine__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ReDefine__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ReDefine__Group__0 )
            {
             before(grammarAccess.getReDefineAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ReDefine__Group__0 )
            // InternalMyDsl.g:369:4: rule__ReDefine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReDefine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReDefine"


    // $ANTLR start "entryRuleDelete"
    // InternalMyDsl.g:378:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleDelete EOF )
            // InternalMyDsl.g:380:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyDsl.g:387:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Delete__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Delete__Group__0 )
            // InternalMyDsl.g:394:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleActionSelect"
    // InternalMyDsl.g:403:1: entryRuleActionSelect : ruleActionSelect EOF ;
    public final void entryRuleActionSelect() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleActionSelect EOF )
            // InternalMyDsl.g:405:1: ruleActionSelect EOF
            {
             before(grammarAccess.getActionSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleActionSelect();

            state._fsp--;

             after(grammarAccess.getActionSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionSelect"


    // $ANTLR start "ruleActionSelect"
    // InternalMyDsl.g:412:1: ruleActionSelect : ( ( rule__ActionSelect__Group__0 ) ) ;
    public final void ruleActionSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__ActionSelect__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__ActionSelect__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__ActionSelect__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__ActionSelect__Group__0 )
            {
             before(grammarAccess.getActionSelectAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__ActionSelect__Group__0 )
            // InternalMyDsl.g:419:4: rule__ActionSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionSelect"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:428:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleClick EOF )
            // InternalMyDsl.g:430:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:437:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Click__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Click__Group__0 )
            // InternalMyDsl.g:444:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalMyDsl.g:453:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleFill EOF )
            // InternalMyDsl.g:455:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalMyDsl.g:462:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Fill__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Fill__Group__0 )
            // InternalMyDsl.g:469:4: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleCheckBox"
    // InternalMyDsl.g:478:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleCheckBox EOF )
            // InternalMyDsl.g:480:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalMyDsl.g:487:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__CheckBox__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__CheckBox__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__CheckBox__Group__0 )
            // InternalMyDsl.g:494:4: rule__CheckBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRickroll"
    // InternalMyDsl.g:503:1: entryRuleRickroll : ruleRickroll EOF ;
    public final void entryRuleRickroll() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleRickroll EOF )
            // InternalMyDsl.g:505:1: ruleRickroll EOF
            {
             before(grammarAccess.getRickrollRule()); 
            pushFollow(FOLLOW_1);
            ruleRickroll();

            state._fsp--;

             after(grammarAccess.getRickrollRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRickroll"


    // $ANTLR start "ruleRickroll"
    // InternalMyDsl.g:512:1: ruleRickroll : ( ( rule__Rickroll__Group__0 ) ) ;
    public final void ruleRickroll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Rickroll__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Rickroll__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Rickroll__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Rickroll__Group__0 )
            {
             before(grammarAccess.getRickrollAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Rickroll__Group__0 )
            // InternalMyDsl.g:519:4: rule__Rickroll__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rickroll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRickrollAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRickroll"


    // $ANTLR start "entryRuleDoWait"
    // InternalMyDsl.g:528:1: entryRuleDoWait : ruleDoWait EOF ;
    public final void entryRuleDoWait() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleDoWait EOF )
            // InternalMyDsl.g:530:1: ruleDoWait EOF
            {
             before(grammarAccess.getDoWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleDoWait();

            state._fsp--;

             after(grammarAccess.getDoWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoWait"


    // $ANTLR start "ruleDoWait"
    // InternalMyDsl.g:537:1: ruleDoWait : ( ( rule__DoWait__Group__0 ) ) ;
    public final void ruleDoWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__DoWait__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__DoWait__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__DoWait__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__DoWait__Group__0 )
            {
             before(grammarAccess.getDoWaitAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__DoWait__Group__0 )
            // InternalMyDsl.g:544:4: rule__DoWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoWait"


    // $ANTLR start "entryRuleIsIn"
    // InternalMyDsl.g:553:1: entryRuleIsIn : ruleIsIn EOF ;
    public final void entryRuleIsIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleIsIn EOF )
            // InternalMyDsl.g:555:1: ruleIsIn EOF
            {
             before(grammarAccess.getIsInRule()); 
            pushFollow(FOLLOW_1);
            ruleIsIn();

            state._fsp--;

             after(grammarAccess.getIsInRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsIn"


    // $ANTLR start "ruleIsIn"
    // InternalMyDsl.g:562:1: ruleIsIn : ( ( rule__IsIn__Group__0 ) ) ;
    public final void ruleIsIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__IsIn__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__IsIn__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__IsIn__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__IsIn__Group__0 )
            {
             before(grammarAccess.getIsInAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__IsIn__Group__0 )
            // InternalMyDsl.g:569:4: rule__IsIn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsIn"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:578:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleNot EOF )
            // InternalMyDsl.g:580:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMyDsl.g:587:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Not__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Not__Group__0 )
            // InternalMyDsl.g:594:4: rule__Not__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:603:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleIf EOF )
            // InternalMyDsl.g:605:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:612:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:619:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:628:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleLoop EOF )
            // InternalMyDsl.g:630:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:637:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:644:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleDoAll"
    // InternalMyDsl.g:653:1: entryRuleDoAll : ruleDoAll EOF ;
    public final void entryRuleDoAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleDoAll EOF )
            // InternalMyDsl.g:655:1: ruleDoAll EOF
            {
             before(grammarAccess.getDoAllRule()); 
            pushFollow(FOLLOW_1);
            ruleDoAll();

            state._fsp--;

             after(grammarAccess.getDoAllRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoAll"


    // $ANTLR start "ruleDoAll"
    // InternalMyDsl.g:662:1: ruleDoAll : ( ( rule__DoAll__Group__0 ) ) ;
    public final void ruleDoAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__DoAll__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__DoAll__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__DoAll__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__DoAll__Group__0 )
            {
             before(grammarAccess.getDoAllAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__DoAll__Group__0 )
            // InternalMyDsl.g:669:4: rule__DoAll__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoAllAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoAll"


    // $ANTLR start "entryRuleExecute"
    // InternalMyDsl.g:678:1: entryRuleExecute : ruleExecute EOF ;
    public final void entryRuleExecute() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleExecute EOF )
            // InternalMyDsl.g:680:1: ruleExecute EOF
            {
             before(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            ruleExecute();

            state._fsp--;

             after(grammarAccess.getExecuteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalMyDsl.g:687:1: ruleExecute : ( ( rule__Execute__Alternatives ) ) ;
    public final void ruleExecute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Execute__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Execute__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Execute__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__Execute__Alternatives )
            {
             before(grammarAccess.getExecuteAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__Execute__Alternatives )
            // InternalMyDsl.g:694:4: rule__Execute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecute"


    // $ANTLR start "rule__Main__OrdersAlternatives_6_0"
    // InternalMyDsl.g:702:1: rule__Main__OrdersAlternatives_6_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__Main__OrdersAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=30 && LA1_0<=32)||LA1_0==34||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=40)||LA1_0==42||(LA1_0>=44 && LA1_0<=45)) ) {
                alt1=1;
            }
            else if ( (LA1_0==29||LA1_0==50||LA1_0==53||LA1_0==57||LA1_0==60) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:707:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:707:2: ( ruleAction )
                    // InternalMyDsl.g:708:3: ruleAction
                    {
                     before(grammarAccess.getMainAccess().getOrdersActionParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getOrdersActionParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:713:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:713:2: ( ruleStructure )
                    // InternalMyDsl.g:714:3: ruleStructure
                    {
                     before(grammarAccess.getMainAccess().getOrdersStructureParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStructure();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getOrdersStructureParserRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__OrdersAlternatives_6_0"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMyDsl.g:723:1: rule__Action__Alternatives : ( ( ruleNavigate ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleRickroll ) | ( ruleDoWait ) | ( ruleStore ) | ( ruleReDefine ) | ( ruleDelete ) | ( ruleActionWithObject ) | ( ruleCheckBox ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ruleNavigate ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleRickroll ) | ( ruleDoWait ) | ( ruleStore ) | ( ruleReDefine ) | ( ruleDelete ) | ( ruleActionWithObject ) | ( ruleCheckBox ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 44:
                {
                alt2=4;
                }
                break;
            case 45:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 34:
                {
                alt2=7;
                }
                break;
            case 36:
                {
                alt2=8;
                }
                break;
            case 39:
            case 40:
                {
                alt2=9;
                }
                break;
            case 42:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:728:2: ( ruleNavigate )
                    {
                    // InternalMyDsl.g:728:2: ( ruleNavigate )
                    // InternalMyDsl.g:729:3: ruleNavigate
                    {
                     before(grammarAccess.getActionAccess().getNavigateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigate();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getNavigateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:734:2: ( ruleRefresh )
                    {
                    // InternalMyDsl.g:734:2: ( ruleRefresh )
                    // InternalMyDsl.g:735:3: ruleRefresh
                    {
                     before(grammarAccess.getActionAccess().getRefreshParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefresh();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRefreshParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:740:2: ( ruleActionSelect )
                    {
                    // InternalMyDsl.g:740:2: ( ruleActionSelect )
                    // InternalMyDsl.g:741:3: ruleActionSelect
                    {
                     before(grammarAccess.getActionAccess().getActionSelectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleActionSelect();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getActionSelectParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:746:2: ( ruleRickroll )
                    {
                    // InternalMyDsl.g:746:2: ( ruleRickroll )
                    // InternalMyDsl.g:747:3: ruleRickroll
                    {
                     before(grammarAccess.getActionAccess().getRickrollParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRickroll();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRickrollParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:752:2: ( ruleDoWait )
                    {
                    // InternalMyDsl.g:752:2: ( ruleDoWait )
                    // InternalMyDsl.g:753:3: ruleDoWait
                    {
                     before(grammarAccess.getActionAccess().getDoWaitParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDoWait();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDoWaitParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:758:2: ( ruleStore )
                    {
                    // InternalMyDsl.g:758:2: ( ruleStore )
                    // InternalMyDsl.g:759:3: ruleStore
                    {
                     before(grammarAccess.getActionAccess().getStoreParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getStoreParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:764:2: ( ruleReDefine )
                    {
                    // InternalMyDsl.g:764:2: ( ruleReDefine )
                    // InternalMyDsl.g:765:3: ruleReDefine
                    {
                     before(grammarAccess.getActionAccess().getReDefineParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReDefine();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getReDefineParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:770:2: ( ruleDelete )
                    {
                    // InternalMyDsl.g:770:2: ( ruleDelete )
                    // InternalMyDsl.g:771:3: ruleDelete
                    {
                     before(grammarAccess.getActionAccess().getDeleteParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDeleteParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:776:2: ( ruleActionWithObject )
                    {
                    // InternalMyDsl.g:776:2: ( ruleActionWithObject )
                    // InternalMyDsl.g:777:3: ruleActionWithObject
                    {
                     before(grammarAccess.getActionAccess().getActionWithObjectParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleActionWithObject();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getActionWithObjectParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:782:2: ( ruleCheckBox )
                    {
                    // InternalMyDsl.g:782:2: ( ruleCheckBox )
                    // InternalMyDsl.g:783:3: ruleCheckBox
                    {
                     before(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__ActionWithObject__Alternatives_0"
    // InternalMyDsl.g:792:1: rule__ActionWithObject__Alternatives_0 : ( ( ruleClick ) | ( ruleFill ) );
    public final void rule__ActionWithObject__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ruleClick ) | ( ruleFill ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:797:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:797:2: ( ruleClick )
                    // InternalMyDsl.g:798:3: ruleClick
                    {
                     before(grammarAccess.getActionWithObjectAccess().getClickParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getActionWithObjectAccess().getClickParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:803:2: ( ruleFill )
                    {
                    // InternalMyDsl.g:803:2: ( ruleFill )
                    // InternalMyDsl.g:804:3: ruleFill
                    {
                     before(grammarAccess.getActionWithObjectAccess().getFillParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getActionWithObjectAccess().getFillParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__Alternatives_0"


    // $ANTLR start "rule__Structure__Alternatives"
    // InternalMyDsl.g:813:1: rule__Structure__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) | ( ruleExecute ) );
    public final void rule__Structure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) | ( ruleExecute ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            case 57:
                {
                alt4=3;
                }
                break;
            case 29:
            case 60:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:818:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:818:2: ( ruleIf )
                    // InternalMyDsl.g:819:3: ruleIf
                    {
                     before(grammarAccess.getStructureAccess().getIfParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStructureAccess().getIfParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:824:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:824:2: ( ruleLoop )
                    // InternalMyDsl.g:825:3: ruleLoop
                    {
                     before(grammarAccess.getStructureAccess().getLoopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getStructureAccess().getLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:830:2: ( ruleDoAll )
                    {
                    // InternalMyDsl.g:830:2: ( ruleDoAll )
                    // InternalMyDsl.g:831:3: ruleDoAll
                    {
                     before(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoAll();

                    state._fsp--;

                     after(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:836:2: ( ruleExecute )
                    {
                    // InternalMyDsl.g:836:2: ( ruleExecute )
                    // InternalMyDsl.g:837:3: ruleExecute
                    {
                     before(grammarAccess.getStructureAccess().getExecuteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExecute();

                    state._fsp--;

                     after(grammarAccess.getStructureAccess().getExecuteParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMyDsl.g:846:1: rule__Condition__Alternatives : ( ( ruleIsIn ) | ( ruleNot ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( ruleIsIn ) | ( ruleNot ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=17)||LA5_0==29||LA5_0==61) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:851:2: ( ruleIsIn )
                    {
                    // InternalMyDsl.g:851:2: ( ruleIsIn )
                    // InternalMyDsl.g:852:3: ruleIsIn
                    {
                     before(grammarAccess.getConditionAccess().getIsInParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIsIn();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getIsInParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:857:2: ( ruleNot )
                    {
                    // InternalMyDsl.g:857:2: ( ruleNot )
                    // InternalMyDsl.g:858:3: ruleNot
                    {
                     before(grammarAccess.getConditionAccess().getNotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getNotParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Object__Alternatives"
    // InternalMyDsl.g:867:1: rule__Object__Alternatives : ( ( ( rule__Object__ObjNameAssignment_0 ) ) | ( ruleSubProcedure ) | ( ( rule__Object__Group_2__0 ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( ( ( rule__Object__ObjNameAssignment_0 ) ) | ( ruleSubProcedure ) | ( ( rule__Object__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:872:2: ( ( rule__Object__ObjNameAssignment_0 ) )
                    {
                    // InternalMyDsl.g:872:2: ( ( rule__Object__ObjNameAssignment_0 ) )
                    // InternalMyDsl.g:873:3: ( rule__Object__ObjNameAssignment_0 )
                    {
                     before(grammarAccess.getObjectAccess().getObjNameAssignment_0()); 
                    // InternalMyDsl.g:874:3: ( rule__Object__ObjNameAssignment_0 )
                    // InternalMyDsl.g:874:4: rule__Object__ObjNameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__ObjNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getObjNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:878:2: ( ruleSubProcedure )
                    {
                    // InternalMyDsl.g:878:2: ( ruleSubProcedure )
                    // InternalMyDsl.g:879:3: ruleSubProcedure
                    {
                     before(grammarAccess.getObjectAccess().getSubProcedureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubProcedure();

                    state._fsp--;

                     after(grammarAccess.getObjectAccess().getSubProcedureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:884:2: ( ( rule__Object__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:884:2: ( ( rule__Object__Group_2__0 ) )
                    // InternalMyDsl.g:885:3: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalMyDsl.g:886:3: ( rule__Object__Group_2__0 )
                    // InternalMyDsl.g:886:4: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Alternatives"


    // $ANTLR start "rule__HTMLTYPE__TypeAlternatives_0"
    // InternalMyDsl.g:894:1: rule__HTMLTYPE__TypeAlternatives_0 : ( ( 'guess' ) | ( 'nameTag' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) );
    public final void rule__HTMLTYPE__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( 'guess' ) | ( 'nameTag' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:899:2: ( 'guess' )
                    {
                    // InternalMyDsl.g:899:2: ( 'guess' )
                    // InternalMyDsl.g:900:3: 'guess'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeGuessKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeGuessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:905:2: ( 'nameTag' )
                    {
                    // InternalMyDsl.g:905:2: ( 'nameTag' )
                    // InternalMyDsl.g:906:3: 'nameTag'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeNameTagKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeNameTagKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:911:2: ( 'class' )
                    {
                    // InternalMyDsl.g:911:2: ( 'class' )
                    // InternalMyDsl.g:912:3: 'class'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:917:2: ( 'id' )
                    {
                    // InternalMyDsl.g:917:2: ( 'id' )
                    // InternalMyDsl.g:918:3: 'id'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:923:2: ( 'name' )
                    {
                    // InternalMyDsl.g:923:2: ( 'name' )
                    // InternalMyDsl.g:924:3: 'name'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:929:2: ( 'CSS Selector' )
                    {
                    // InternalMyDsl.g:929:2: ( 'CSS Selector' )
                    // InternalMyDsl.g:930:3: 'CSS Selector'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:935:2: ( 'XPath' )
                    {
                    // InternalMyDsl.g:935:2: ( 'XPath' )
                    // InternalMyDsl.g:936:3: 'XPath'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLTYPE__TypeAlternatives_0"


    // $ANTLR start "rule__Collection__Alternatives_1"
    // InternalMyDsl.g:945:1: rule__Collection__Alternatives_1 : ( ( ( rule__Collection__Group_1_0__0 ) ) | ( ( rule__Collection__Group_1_1__0 ) ) );
    public final void rule__Collection__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( ( rule__Collection__Group_1_0__0 ) ) | ( ( rule__Collection__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:950:2: ( ( rule__Collection__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:950:2: ( ( rule__Collection__Group_1_0__0 ) )
                    // InternalMyDsl.g:951:3: ( rule__Collection__Group_1_0__0 )
                    {
                     before(grammarAccess.getCollectionAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:952:3: ( rule__Collection__Group_1_0__0 )
                    // InternalMyDsl.g:952:4: rule__Collection__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:956:2: ( ( rule__Collection__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:956:2: ( ( rule__Collection__Group_1_1__0 ) )
                    // InternalMyDsl.g:957:3: ( rule__Collection__Group_1_1__0 )
                    {
                     before(grammarAccess.getCollectionAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:958:3: ( rule__Collection__Group_1_1__0 )
                    // InternalMyDsl.g:958:4: rule__Collection__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Alternatives_1"


    // $ANTLR start "rule__SubProcedure__ActionsAlternatives_2_0"
    // InternalMyDsl.g:966:1: rule__SubProcedure__ActionsAlternatives_2_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__SubProcedure__ActionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=30 && LA9_0<=32)||LA9_0==34||(LA9_0>=36 && LA9_0<=37)||(LA9_0>=39 && LA9_0<=40)||LA9_0==42||(LA9_0>=44 && LA9_0<=45)) ) {
                alt9=1;
            }
            else if ( (LA9_0==29||LA9_0==50||LA9_0==53||LA9_0==57||LA9_0==60) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:971:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:971:2: ( ruleAction )
                    // InternalMyDsl.g:972:3: ruleAction
                    {
                     before(grammarAccess.getSubProcedureAccess().getActionsActionParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getSubProcedureAccess().getActionsActionParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:977:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:977:2: ( ruleStructure )
                    // InternalMyDsl.g:978:3: ruleStructure
                    {
                     before(grammarAccess.getSubProcedureAccess().getActionsStructureParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStructure();

                    state._fsp--;

                     after(grammarAccess.getSubProcedureAccess().getActionsStructureParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__ActionsAlternatives_2_0"


    // $ANTLR start "rule__CheckBox__NewValueAlternatives_2_1_0"
    // InternalMyDsl.g:987:1: rule__CheckBox__NewValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__CheckBox__NewValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:992:2: ( 'true' )
                    {
                    // InternalMyDsl.g:992:2: ( 'true' )
                    // InternalMyDsl.g:993:3: 'true'
                    {
                     before(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:998:2: ( 'false' )
                    {
                    // InternalMyDsl.g:998:2: ( 'false' )
                    // InternalMyDsl.g:999:3: 'false'
                    {
                     before(grammarAccess.getCheckBoxAccess().getNewValueFalseKeyword_2_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCheckBoxAccess().getNewValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__NewValueAlternatives_2_1_0"


    // $ANTLR start "rule__IsIn__Alternatives_0"
    // InternalMyDsl.g:1008:1: rule__IsIn__Alternatives_0 : ( ( ( rule__IsIn__ObjAssignment_0_0 ) ) | ( ( rule__IsIn__BodyAssignment_0_1 ) ) );
    public final void rule__IsIn__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( ( ( rule__IsIn__ObjAssignment_0_0 ) ) | ( ( rule__IsIn__BodyAssignment_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=17)||LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==61) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1013:2: ( ( rule__IsIn__ObjAssignment_0_0 ) )
                    {
                    // InternalMyDsl.g:1013:2: ( ( rule__IsIn__ObjAssignment_0_0 ) )
                    // InternalMyDsl.g:1014:3: ( rule__IsIn__ObjAssignment_0_0 )
                    {
                     before(grammarAccess.getIsInAccess().getObjAssignment_0_0()); 
                    // InternalMyDsl.g:1015:3: ( rule__IsIn__ObjAssignment_0_0 )
                    // InternalMyDsl.g:1015:4: rule__IsIn__ObjAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IsIn__ObjAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIsInAccess().getObjAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1019:2: ( ( rule__IsIn__BodyAssignment_0_1 ) )
                    {
                    // InternalMyDsl.g:1019:2: ( ( rule__IsIn__BodyAssignment_0_1 ) )
                    // InternalMyDsl.g:1020:3: ( rule__IsIn__BodyAssignment_0_1 )
                    {
                     before(grammarAccess.getIsInAccess().getBodyAssignment_0_1()); 
                    // InternalMyDsl.g:1021:3: ( rule__IsIn__BodyAssignment_0_1 )
                    // InternalMyDsl.g:1021:4: rule__IsIn__BodyAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IsIn__BodyAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIsInAccess().getBodyAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Alternatives_0"


    // $ANTLR start "rule__DoAll__TodoAlternatives_7_0"
    // InternalMyDsl.g:1029:1: rule__DoAll__TodoAlternatives_7_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__DoAll__TodoAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=30 && LA12_0<=32)||LA12_0==34||(LA12_0>=36 && LA12_0<=37)||(LA12_0>=39 && LA12_0<=40)||LA12_0==42||(LA12_0>=44 && LA12_0<=45)) ) {
                alt12=1;
            }
            else if ( (LA12_0==29||LA12_0==50||LA12_0==53||LA12_0==57||LA12_0==60) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1034:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:1034:2: ( ruleAction )
                    // InternalMyDsl.g:1035:3: ruleAction
                    {
                     before(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_7_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1040:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:1040:2: ( ruleStructure )
                    // InternalMyDsl.g:1041:3: ruleStructure
                    {
                     before(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_7_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStructure();

                    state._fsp--;

                     after(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_7_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__TodoAlternatives_7_0"


    // $ANTLR start "rule__Execute__Alternatives"
    // InternalMyDsl.g:1050:1: rule__Execute__Alternatives : ( ( ( rule__Execute__Group_0__0 ) ) | ( ( rule__Execute__SubprocedureAssignment_1 ) ) );
    public final void rule__Execute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( ( rule__Execute__Group_0__0 ) ) | ( ( rule__Execute__SubprocedureAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==60) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1055:2: ( ( rule__Execute__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1055:2: ( ( rule__Execute__Group_0__0 ) )
                    // InternalMyDsl.g:1056:3: ( rule__Execute__Group_0__0 )
                    {
                     before(grammarAccess.getExecuteAccess().getGroup_0()); 
                    // InternalMyDsl.g:1057:3: ( rule__Execute__Group_0__0 )
                    // InternalMyDsl.g:1057:4: rule__Execute__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Execute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecuteAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1061:2: ( ( rule__Execute__SubprocedureAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1061:2: ( ( rule__Execute__SubprocedureAssignment_1 ) )
                    // InternalMyDsl.g:1062:3: ( rule__Execute__SubprocedureAssignment_1 )
                    {
                     before(grammarAccess.getExecuteAccess().getSubprocedureAssignment_1()); 
                    // InternalMyDsl.g:1063:3: ( rule__Execute__SubprocedureAssignment_1 )
                    // InternalMyDsl.g:1063:4: rule__Execute__SubprocedureAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Execute__SubprocedureAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecuteAccess().getSubprocedureAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // InternalMyDsl.g:1071:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyDsl.g:1076:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalMyDsl.g:1083:1: rule__Main__Group__0__Impl : ( 'File' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( 'File' ) )
            // InternalMyDsl.g:1088:1: ( 'File' )
            {
            // InternalMyDsl.g:1088:1: ( 'File' )
            // InternalMyDsl.g:1089:2: 'File'
            {
             before(grammarAccess.getMainAccess().getFileKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalMyDsl.g:1098:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyDsl.g:1103:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalMyDsl.g:1110:1: rule__Main__Group__1__Impl : ( ( rule__Main__FileNameAssignment_1 ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( ( ( rule__Main__FileNameAssignment_1 ) ) )
            // InternalMyDsl.g:1115:1: ( ( rule__Main__FileNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1115:1: ( ( rule__Main__FileNameAssignment_1 ) )
            // InternalMyDsl.g:1116:2: ( rule__Main__FileNameAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getFileNameAssignment_1()); 
            // InternalMyDsl.g:1117:2: ( rule__Main__FileNameAssignment_1 )
            // InternalMyDsl.g:1117:3: rule__Main__FileNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__FileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getFileNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalMyDsl.g:1125:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyDsl.g:1130:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalMyDsl.g:1137:1: rule__Main__Group__2__Impl : ( 'with' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( ( 'with' ) )
            // InternalMyDsl.g:1142:1: ( 'with' )
            {
            // InternalMyDsl.g:1142:1: ( 'with' )
            // InternalMyDsl.g:1143:2: 'with'
            {
             before(grammarAccess.getMainAccess().getWithKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // InternalMyDsl.g:1152:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyDsl.g:1157:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // InternalMyDsl.g:1164:1: rule__Main__Group__3__Impl : ( 'browser' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( 'browser' ) )
            // InternalMyDsl.g:1169:1: ( 'browser' )
            {
            // InternalMyDsl.g:1169:1: ( 'browser' )
            // InternalMyDsl.g:1170:2: 'browser'
            {
             before(grammarAccess.getMainAccess().getBrowserKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getBrowserKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // InternalMyDsl.g:1179:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyDsl.g:1184:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Main__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // InternalMyDsl.g:1191:1: rule__Main__Group__4__Impl : ( ( rule__Main__BrowserNameAssignment_4 ) ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ( rule__Main__BrowserNameAssignment_4 ) ) )
            // InternalMyDsl.g:1196:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            {
            // InternalMyDsl.g:1196:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            // InternalMyDsl.g:1197:2: ( rule__Main__BrowserNameAssignment_4 )
            {
             before(grammarAccess.getMainAccess().getBrowserNameAssignment_4()); 
            // InternalMyDsl.g:1198:2: ( rule__Main__BrowserNameAssignment_4 )
            // InternalMyDsl.g:1198:3: rule__Main__BrowserNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Main__BrowserNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getBrowserNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Main__Group__5"
    // InternalMyDsl.g:1206:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyDsl.g:1211:2: rule__Main__Group__5__Impl rule__Main__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Main__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5"


    // $ANTLR start "rule__Main__Group__5__Impl"
    // InternalMyDsl.g:1218:1: rule__Main__Group__5__Impl : ( ':' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( ':' ) )
            // InternalMyDsl.g:1223:1: ( ':' )
            {
            // InternalMyDsl.g:1223:1: ( ':' )
            // InternalMyDsl.g:1224:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5__Impl"


    // $ANTLR start "rule__Main__Group__6"
    // InternalMyDsl.g:1233:1: rule__Main__Group__6 : rule__Main__Group__6__Impl ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( rule__Main__Group__6__Impl )
            // InternalMyDsl.g:1238:2: rule__Main__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6"


    // $ANTLR start "rule__Main__Group__6__Impl"
    // InternalMyDsl.g:1244:1: rule__Main__Group__6__Impl : ( ( rule__Main__OrdersAssignment_6 )* ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( ( rule__Main__OrdersAssignment_6 )* ) )
            // InternalMyDsl.g:1249:1: ( ( rule__Main__OrdersAssignment_6 )* )
            {
            // InternalMyDsl.g:1249:1: ( ( rule__Main__OrdersAssignment_6 )* )
            // InternalMyDsl.g:1250:2: ( rule__Main__OrdersAssignment_6 )*
            {
             before(grammarAccess.getMainAccess().getOrdersAssignment_6()); 
            // InternalMyDsl.g:1251:2: ( rule__Main__OrdersAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=32)||LA14_0==34||(LA14_0>=36 && LA14_0<=37)||(LA14_0>=39 && LA14_0<=40)||LA14_0==42||(LA14_0>=44 && LA14_0<=45)||LA14_0==50||LA14_0==53||LA14_0==57||LA14_0==60) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1251:3: rule__Main__OrdersAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Main__OrdersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getOrdersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6__Impl"


    // $ANTLR start "rule__ActionWithObject__Group__0"
    // InternalMyDsl.g:1260:1: rule__ActionWithObject__Group__0 : rule__ActionWithObject__Group__0__Impl rule__ActionWithObject__Group__1 ;
    public final void rule__ActionWithObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( rule__ActionWithObject__Group__0__Impl rule__ActionWithObject__Group__1 )
            // InternalMyDsl.g:1265:2: rule__ActionWithObject__Group__0__Impl rule__ActionWithObject__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ActionWithObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionWithObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__Group__0"


    // $ANTLR start "rule__ActionWithObject__Group__0__Impl"
    // InternalMyDsl.g:1272:1: rule__ActionWithObject__Group__0__Impl : ( ( rule__ActionWithObject__Alternatives_0 ) ) ;
    public final void rule__ActionWithObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__ActionWithObject__Alternatives_0 ) ) )
            // InternalMyDsl.g:1277:1: ( ( rule__ActionWithObject__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__ActionWithObject__Alternatives_0 ) )
            // InternalMyDsl.g:1278:2: ( rule__ActionWithObject__Alternatives_0 )
            {
             before(grammarAccess.getActionWithObjectAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1279:2: ( rule__ActionWithObject__Alternatives_0 )
            // InternalMyDsl.g:1279:3: rule__ActionWithObject__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ActionWithObject__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getActionWithObjectAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__Group__0__Impl"


    // $ANTLR start "rule__ActionWithObject__Group__1"
    // InternalMyDsl.g:1287:1: rule__ActionWithObject__Group__1 : rule__ActionWithObject__Group__1__Impl ;
    public final void rule__ActionWithObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( rule__ActionWithObject__Group__1__Impl )
            // InternalMyDsl.g:1292:2: rule__ActionWithObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionWithObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__Group__1"


    // $ANTLR start "rule__ActionWithObject__Group__1__Impl"
    // InternalMyDsl.g:1298:1: rule__ActionWithObject__Group__1__Impl : ( ( rule__ActionWithObject__ObjectAssignment_1 ) ) ;
    public final void rule__ActionWithObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( ( rule__ActionWithObject__ObjectAssignment_1 ) ) )
            // InternalMyDsl.g:1303:1: ( ( rule__ActionWithObject__ObjectAssignment_1 ) )
            {
            // InternalMyDsl.g:1303:1: ( ( rule__ActionWithObject__ObjectAssignment_1 ) )
            // InternalMyDsl.g:1304:2: ( rule__ActionWithObject__ObjectAssignment_1 )
            {
             before(grammarAccess.getActionWithObjectAccess().getObjectAssignment_1()); 
            // InternalMyDsl.g:1305:2: ( rule__ActionWithObject__ObjectAssignment_1 )
            // InternalMyDsl.g:1305:3: rule__ActionWithObject__ObjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionWithObject__ObjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionWithObjectAccess().getObjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__Group__1__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalMyDsl.g:1314:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalMyDsl.g:1319:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalMyDsl.g:1326:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__HtmltypeAssignment_2_0 ) ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ( rule__Object__HtmltypeAssignment_2_0 ) ) )
            // InternalMyDsl.g:1331:1: ( ( rule__Object__HtmltypeAssignment_2_0 ) )
            {
            // InternalMyDsl.g:1331:1: ( ( rule__Object__HtmltypeAssignment_2_0 ) )
            // InternalMyDsl.g:1332:2: ( rule__Object__HtmltypeAssignment_2_0 )
            {
             before(grammarAccess.getObjectAccess().getHtmltypeAssignment_2_0()); 
            // InternalMyDsl.g:1333:2: ( rule__Object__HtmltypeAssignment_2_0 )
            // InternalMyDsl.g:1333:3: rule__Object__HtmltypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__HtmltypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getHtmltypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalMyDsl.g:1341:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( rule__Object__Group_2__1__Impl )
            // InternalMyDsl.g:1346:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalMyDsl.g:1352:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__ObjectDefAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( ( rule__Object__ObjectDefAssignment_2_1 ) ) )
            // InternalMyDsl.g:1357:1: ( ( rule__Object__ObjectDefAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1357:1: ( ( rule__Object__ObjectDefAssignment_2_1 ) )
            // InternalMyDsl.g:1358:2: ( rule__Object__ObjectDefAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getObjectDefAssignment_2_1()); 
            // InternalMyDsl.g:1359:2: ( rule__Object__ObjectDefAssignment_2_1 )
            // InternalMyDsl.g:1359:3: rule__Object__ObjectDefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjectDefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjectDefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Collection__Group__0"
    // InternalMyDsl.g:1368:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalMyDsl.g:1373:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Collection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0"


    // $ANTLR start "rule__Collection__Group__0__Impl"
    // InternalMyDsl.g:1380:1: rule__Collection__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:1385:1: ( 'Collection' )
            {
            // InternalMyDsl.g:1385:1: ( 'Collection' )
            // InternalMyDsl.g:1386:2: 'Collection'
            {
             before(grammarAccess.getCollectionAccess().getCollectionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getCollectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0__Impl"


    // $ANTLR start "rule__Collection__Group__1"
    // InternalMyDsl.g:1395:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( rule__Collection__Group__1__Impl )
            // InternalMyDsl.g:1400:2: rule__Collection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1"


    // $ANTLR start "rule__Collection__Group__1__Impl"
    // InternalMyDsl.g:1406:1: rule__Collection__Group__1__Impl : ( ( rule__Collection__Alternatives_1 ) ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1410:1: ( ( ( rule__Collection__Alternatives_1 ) ) )
            // InternalMyDsl.g:1411:1: ( ( rule__Collection__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1411:1: ( ( rule__Collection__Alternatives_1 ) )
            // InternalMyDsl.g:1412:2: ( rule__Collection__Alternatives_1 )
            {
             before(grammarAccess.getCollectionAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1413:2: ( rule__Collection__Alternatives_1 )
            // InternalMyDsl.g:1413:3: rule__Collection__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group_1_0__0"
    // InternalMyDsl.g:1422:1: rule__Collection__Group_1_0__0 : rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1 ;
    public final void rule__Collection__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1 )
            // InternalMyDsl.g:1427:2: rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Collection__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__0"


    // $ANTLR start "rule__Collection__Group_1_0__0__Impl"
    // InternalMyDsl.g:1434:1: rule__Collection__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__Collection__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( '{' ) )
            // InternalMyDsl.g:1439:1: ( '{' )
            {
            // InternalMyDsl.g:1439:1: ( '{' )
            // InternalMyDsl.g:1440:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__0__Impl"


    // $ANTLR start "rule__Collection__Group_1_0__1"
    // InternalMyDsl.g:1449:1: rule__Collection__Group_1_0__1 : rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2 ;
    public final void rule__Collection__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2 )
            // InternalMyDsl.g:1454:2: rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Collection__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__1"


    // $ANTLR start "rule__Collection__Group_1_0__1__Impl"
    // InternalMyDsl.g:1461:1: rule__Collection__Group_1_0__1__Impl : ( ( rule__Collection__ObjAssignment_1_0_1 )* ) ;
    public final void rule__Collection__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ( rule__Collection__ObjAssignment_1_0_1 )* ) )
            // InternalMyDsl.g:1466:1: ( ( rule__Collection__ObjAssignment_1_0_1 )* )
            {
            // InternalMyDsl.g:1466:1: ( ( rule__Collection__ObjAssignment_1_0_1 )* )
            // InternalMyDsl.g:1467:2: ( rule__Collection__ObjAssignment_1_0_1 )*
            {
             before(grammarAccess.getCollectionAccess().getObjAssignment_1_0_1()); 
            // InternalMyDsl.g:1468:2: ( rule__Collection__ObjAssignment_1_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=11 && LA15_0<=17)||LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1468:3: rule__Collection__ObjAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Collection__ObjAssignment_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getObjAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__1__Impl"


    // $ANTLR start "rule__Collection__Group_1_0__2"
    // InternalMyDsl.g:1476:1: rule__Collection__Group_1_0__2 : rule__Collection__Group_1_0__2__Impl ;
    public final void rule__Collection__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( rule__Collection__Group_1_0__2__Impl )
            // InternalMyDsl.g:1481:2: rule__Collection__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__2"


    // $ANTLR start "rule__Collection__Group_1_0__2__Impl"
    // InternalMyDsl.g:1487:1: rule__Collection__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__Collection__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( ( '}' ) )
            // InternalMyDsl.g:1492:1: ( '}' )
            {
            // InternalMyDsl.g:1492:1: ( '}' )
            // InternalMyDsl.g:1493:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_0__2__Impl"


    // $ANTLR start "rule__Collection__Group_1_1__0"
    // InternalMyDsl.g:1503:1: rule__Collection__Group_1_1__0 : rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1 ;
    public final void rule__Collection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1 )
            // InternalMyDsl.g:1508:2: rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Collection__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__0"


    // $ANTLR start "rule__Collection__Group_1_1__0__Impl"
    // InternalMyDsl.g:1515:1: rule__Collection__Group_1_1__0__Impl : ( 'of' ) ;
    public final void rule__Collection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( 'of' ) )
            // InternalMyDsl.g:1520:1: ( 'of' )
            {
            // InternalMyDsl.g:1520:1: ( 'of' )
            // InternalMyDsl.g:1521:2: 'of'
            {
             before(grammarAccess.getCollectionAccess().getOfKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getOfKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__0__Impl"


    // $ANTLR start "rule__Collection__Group_1_1__1"
    // InternalMyDsl.g:1530:1: rule__Collection__Group_1_1__1 : rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2 ;
    public final void rule__Collection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1534:1: ( rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2 )
            // InternalMyDsl.g:1535:2: rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Collection__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__1"


    // $ANTLR start "rule__Collection__Group_1_1__1__Impl"
    // InternalMyDsl.g:1542:1: rule__Collection__Group_1_1__1__Impl : ( 'all' ) ;
    public final void rule__Collection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( ( 'all' ) )
            // InternalMyDsl.g:1547:1: ( 'all' )
            {
            // InternalMyDsl.g:1547:1: ( 'all' )
            // InternalMyDsl.g:1548:2: 'all'
            {
             before(grammarAccess.getCollectionAccess().getAllKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getAllKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__1__Impl"


    // $ANTLR start "rule__Collection__Group_1_1__2"
    // InternalMyDsl.g:1557:1: rule__Collection__Group_1_1__2 : rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3 ;
    public final void rule__Collection__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3 )
            // InternalMyDsl.g:1562:2: rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Collection__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__2"


    // $ANTLR start "rule__Collection__Group_1_1__2__Impl"
    // InternalMyDsl.g:1569:1: rule__Collection__Group_1_1__2__Impl : ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) ) ;
    public final void rule__Collection__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1574:1: ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1574:1: ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) )
            // InternalMyDsl.g:1575:2: ( rule__Collection__HtmltypeAssignment_1_1_2 )
            {
             before(grammarAccess.getCollectionAccess().getHtmltypeAssignment_1_1_2()); 
            // InternalMyDsl.g:1576:2: ( rule__Collection__HtmltypeAssignment_1_1_2 )
            // InternalMyDsl.g:1576:3: rule__Collection__HtmltypeAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Collection__HtmltypeAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getHtmltypeAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__2__Impl"


    // $ANTLR start "rule__Collection__Group_1_1__3"
    // InternalMyDsl.g:1584:1: rule__Collection__Group_1_1__3 : rule__Collection__Group_1_1__3__Impl ;
    public final void rule__Collection__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( rule__Collection__Group_1_1__3__Impl )
            // InternalMyDsl.g:1589:2: rule__Collection__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__3"


    // $ANTLR start "rule__Collection__Group_1_1__3__Impl"
    // InternalMyDsl.g:1595:1: rule__Collection__Group_1_1__3__Impl : ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) ) ;
    public final void rule__Collection__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) ) )
            // InternalMyDsl.g:1600:1: ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) )
            {
            // InternalMyDsl.g:1600:1: ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) )
            // InternalMyDsl.g:1601:2: ( rule__Collection__ObjectRuleAssignment_1_1_3 )
            {
             before(grammarAccess.getCollectionAccess().getObjectRuleAssignment_1_1_3()); 
            // InternalMyDsl.g:1602:2: ( rule__Collection__ObjectRuleAssignment_1_1_3 )
            // InternalMyDsl.g:1602:3: rule__Collection__ObjectRuleAssignment_1_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Collection__ObjectRuleAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getObjectRuleAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_1_1__3__Impl"


    // $ANTLR start "rule__SubProcedure__Group__0"
    // InternalMyDsl.g:1611:1: rule__SubProcedure__Group__0 : rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1 ;
    public final void rule__SubProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1 )
            // InternalMyDsl.g:1616:2: rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubProcedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProcedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__0"


    // $ANTLR start "rule__SubProcedure__Group__0__Impl"
    // InternalMyDsl.g:1623:1: rule__SubProcedure__Group__0__Impl : ( 'Subprocedure' ) ;
    public final void rule__SubProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( ( 'Subprocedure' ) )
            // InternalMyDsl.g:1628:1: ( 'Subprocedure' )
            {
            // InternalMyDsl.g:1628:1: ( 'Subprocedure' )
            // InternalMyDsl.g:1629:2: 'Subprocedure'
            {
             before(grammarAccess.getSubProcedureAccess().getSubprocedureKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubProcedureAccess().getSubprocedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__0__Impl"


    // $ANTLR start "rule__SubProcedure__Group__1"
    // InternalMyDsl.g:1638:1: rule__SubProcedure__Group__1 : rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2 ;
    public final void rule__SubProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2 )
            // InternalMyDsl.g:1643:2: rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SubProcedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProcedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__1"


    // $ANTLR start "rule__SubProcedure__Group__1__Impl"
    // InternalMyDsl.g:1650:1: rule__SubProcedure__Group__1__Impl : ( '{' ) ;
    public final void rule__SubProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( '{' ) )
            // InternalMyDsl.g:1655:1: ( '{' )
            {
            // InternalMyDsl.g:1655:1: ( '{' )
            // InternalMyDsl.g:1656:2: '{'
            {
             before(grammarAccess.getSubProcedureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubProcedureAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__1__Impl"


    // $ANTLR start "rule__SubProcedure__Group__2"
    // InternalMyDsl.g:1665:1: rule__SubProcedure__Group__2 : rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3 ;
    public final void rule__SubProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3 )
            // InternalMyDsl.g:1670:2: rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SubProcedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProcedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__2"


    // $ANTLR start "rule__SubProcedure__Group__2__Impl"
    // InternalMyDsl.g:1677:1: rule__SubProcedure__Group__2__Impl : ( ( rule__SubProcedure__ActionsAssignment_2 )* ) ;
    public final void rule__SubProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( ( ( rule__SubProcedure__ActionsAssignment_2 )* ) )
            // InternalMyDsl.g:1682:1: ( ( rule__SubProcedure__ActionsAssignment_2 )* )
            {
            // InternalMyDsl.g:1682:1: ( ( rule__SubProcedure__ActionsAssignment_2 )* )
            // InternalMyDsl.g:1683:2: ( rule__SubProcedure__ActionsAssignment_2 )*
            {
             before(grammarAccess.getSubProcedureAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:1684:2: ( rule__SubProcedure__ActionsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=32)||LA16_0==34||(LA16_0>=36 && LA16_0<=37)||(LA16_0>=39 && LA16_0<=40)||LA16_0==42||(LA16_0>=44 && LA16_0<=45)||LA16_0==50||LA16_0==53||LA16_0==57||LA16_0==60) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1684:3: rule__SubProcedure__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubProcedure__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSubProcedureAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__2__Impl"


    // $ANTLR start "rule__SubProcedure__Group__3"
    // InternalMyDsl.g:1692:1: rule__SubProcedure__Group__3 : rule__SubProcedure__Group__3__Impl ;
    public final void rule__SubProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( rule__SubProcedure__Group__3__Impl )
            // InternalMyDsl.g:1697:2: rule__SubProcedure__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProcedure__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__3"


    // $ANTLR start "rule__SubProcedure__Group__3__Impl"
    // InternalMyDsl.g:1703:1: rule__SubProcedure__Group__3__Impl : ( '}' ) ;
    public final void rule__SubProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( ( '}' ) )
            // InternalMyDsl.g:1708:1: ( '}' )
            {
            // InternalMyDsl.g:1708:1: ( '}' )
            // InternalMyDsl.g:1709:2: '}'
            {
             before(grammarAccess.getSubProcedureAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubProcedureAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__Group__3__Impl"


    // $ANTLR start "rule__Refresh__Group__0"
    // InternalMyDsl.g:1719:1: rule__Refresh__Group__0 : rule__Refresh__Group__0__Impl rule__Refresh__Group__1 ;
    public final void rule__Refresh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( rule__Refresh__Group__0__Impl rule__Refresh__Group__1 )
            // InternalMyDsl.g:1724:2: rule__Refresh__Group__0__Impl rule__Refresh__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Refresh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Refresh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refresh__Group__0"


    // $ANTLR start "rule__Refresh__Group__0__Impl"
    // InternalMyDsl.g:1731:1: rule__Refresh__Group__0__Impl : ( () ) ;
    public final void rule__Refresh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( ( () ) )
            // InternalMyDsl.g:1736:1: ( () )
            {
            // InternalMyDsl.g:1736:1: ( () )
            // InternalMyDsl.g:1737:2: ()
            {
             before(grammarAccess.getRefreshAccess().getRefreshAction_0()); 
            // InternalMyDsl.g:1738:2: ()
            // InternalMyDsl.g:1738:3: 
            {
            }

             after(grammarAccess.getRefreshAccess().getRefreshAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refresh__Group__0__Impl"


    // $ANTLR start "rule__Refresh__Group__1"
    // InternalMyDsl.g:1746:1: rule__Refresh__Group__1 : rule__Refresh__Group__1__Impl ;
    public final void rule__Refresh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( rule__Refresh__Group__1__Impl )
            // InternalMyDsl.g:1751:2: rule__Refresh__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Refresh__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refresh__Group__1"


    // $ANTLR start "rule__Refresh__Group__1__Impl"
    // InternalMyDsl.g:1757:1: rule__Refresh__Group__1__Impl : ( 'Refresh' ) ;
    public final void rule__Refresh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( 'Refresh' ) )
            // InternalMyDsl.g:1762:1: ( 'Refresh' )
            {
            // InternalMyDsl.g:1762:1: ( 'Refresh' )
            // InternalMyDsl.g:1763:2: 'Refresh'
            {
             before(grammarAccess.getRefreshAccess().getRefreshKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRefreshAccess().getRefreshKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refresh__Group__1__Impl"


    // $ANTLR start "rule__Navigate__Group__0"
    // InternalMyDsl.g:1773:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalMyDsl.g:1778:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Navigate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__0"


    // $ANTLR start "rule__Navigate__Group__0__Impl"
    // InternalMyDsl.g:1785:1: rule__Navigate__Group__0__Impl : ( 'Navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( 'Navigate' ) )
            // InternalMyDsl.g:1790:1: ( 'Navigate' )
            {
            // InternalMyDsl.g:1790:1: ( 'Navigate' )
            // InternalMyDsl.g:1791:2: 'Navigate'
            {
             before(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__0__Impl"


    // $ANTLR start "rule__Navigate__Group__1"
    // InternalMyDsl.g:1800:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( rule__Navigate__Group__1__Impl )
            // InternalMyDsl.g:1805:2: rule__Navigate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__1"


    // $ANTLR start "rule__Navigate__Group__1__Impl"
    // InternalMyDsl.g:1811:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1816:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1816:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalMyDsl.g:1817:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1818:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalMyDsl.g:1818:3: rule__Navigate__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalMyDsl.g:1827:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyDsl.g:1832:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalMyDsl.g:1839:1: rule__Store__Group__0__Impl : ( 'var' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( 'var' ) )
            // InternalMyDsl.g:1844:1: ( 'var' )
            {
            // InternalMyDsl.g:1844:1: ( 'var' )
            // InternalMyDsl.g:1845:2: 'var'
            {
             before(grammarAccess.getStoreAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalMyDsl.g:1854:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyDsl.g:1859:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalMyDsl.g:1866:1: rule__Store__Group__1__Impl : ( ( rule__Store__ObjNameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( ( ( rule__Store__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:1871:1: ( ( rule__Store__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1871:1: ( ( rule__Store__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:1872:2: ( rule__Store__ObjNameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:1873:2: ( rule__Store__ObjNameAssignment_1 )
            // InternalMyDsl.g:1873:3: rule__Store__ObjNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__ObjNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getObjNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalMyDsl.g:1881:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyDsl.g:1886:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalMyDsl.g:1893:1: rule__Store__Group__2__Impl : ( '=' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( '=' ) )
            // InternalMyDsl.g:1898:1: ( '=' )
            {
            // InternalMyDsl.g:1898:1: ( '=' )
            // InternalMyDsl.g:1899:2: '='
            {
             before(grammarAccess.getStoreAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalMyDsl.g:1908:1: rule__Store__Group__3 : rule__Store__Group__3__Impl ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( rule__Store__Group__3__Impl )
            // InternalMyDsl.g:1913:2: rule__Store__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalMyDsl.g:1919:1: rule__Store__Group__3__Impl : ( ( rule__Store__ObjAssignment_3 ) ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( ( ( rule__Store__ObjAssignment_3 ) ) )
            // InternalMyDsl.g:1924:1: ( ( rule__Store__ObjAssignment_3 ) )
            {
            // InternalMyDsl.g:1924:1: ( ( rule__Store__ObjAssignment_3 ) )
            // InternalMyDsl.g:1925:2: ( rule__Store__ObjAssignment_3 )
            {
             before(grammarAccess.getStoreAccess().getObjAssignment_3()); 
            // InternalMyDsl.g:1926:2: ( rule__Store__ObjAssignment_3 )
            // InternalMyDsl.g:1926:3: rule__Store__ObjAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Store__ObjAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getObjAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__ReDefine__Group__0"
    // InternalMyDsl.g:1935:1: rule__ReDefine__Group__0 : rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1 ;
    public final void rule__ReDefine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1 )
            // InternalMyDsl.g:1940:2: rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ReDefine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDefine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__0"


    // $ANTLR start "rule__ReDefine__Group__0__Impl"
    // InternalMyDsl.g:1947:1: rule__ReDefine__Group__0__Impl : ( 'Redefine' ) ;
    public final void rule__ReDefine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( 'Redefine' ) )
            // InternalMyDsl.g:1952:1: ( 'Redefine' )
            {
            // InternalMyDsl.g:1952:1: ( 'Redefine' )
            // InternalMyDsl.g:1953:2: 'Redefine'
            {
             before(grammarAccess.getReDefineAccess().getRedefineKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReDefineAccess().getRedefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__0__Impl"


    // $ANTLR start "rule__ReDefine__Group__1"
    // InternalMyDsl.g:1962:1: rule__ReDefine__Group__1 : rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2 ;
    public final void rule__ReDefine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2 )
            // InternalMyDsl.g:1967:2: rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ReDefine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDefine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__1"


    // $ANTLR start "rule__ReDefine__Group__1__Impl"
    // InternalMyDsl.g:1974:1: rule__ReDefine__Group__1__Impl : ( ( rule__ReDefine__ObjNameAssignment_1 ) ) ;
    public final void rule__ReDefine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( ( ( rule__ReDefine__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:1979:1: ( ( rule__ReDefine__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1979:1: ( ( rule__ReDefine__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:1980:2: ( rule__ReDefine__ObjNameAssignment_1 )
            {
             before(grammarAccess.getReDefineAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:1981:2: ( rule__ReDefine__ObjNameAssignment_1 )
            // InternalMyDsl.g:1981:3: rule__ReDefine__ObjNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReDefine__ObjNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReDefineAccess().getObjNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__1__Impl"


    // $ANTLR start "rule__ReDefine__Group__2"
    // InternalMyDsl.g:1989:1: rule__ReDefine__Group__2 : rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3 ;
    public final void rule__ReDefine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3 )
            // InternalMyDsl.g:1994:2: rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ReDefine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReDefine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__2"


    // $ANTLR start "rule__ReDefine__Group__2__Impl"
    // InternalMyDsl.g:2001:1: rule__ReDefine__Group__2__Impl : ( 'as' ) ;
    public final void rule__ReDefine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( 'as' ) )
            // InternalMyDsl.g:2006:1: ( 'as' )
            {
            // InternalMyDsl.g:2006:1: ( 'as' )
            // InternalMyDsl.g:2007:2: 'as'
            {
             before(grammarAccess.getReDefineAccess().getAsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReDefineAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__2__Impl"


    // $ANTLR start "rule__ReDefine__Group__3"
    // InternalMyDsl.g:2016:1: rule__ReDefine__Group__3 : rule__ReDefine__Group__3__Impl ;
    public final void rule__ReDefine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( rule__ReDefine__Group__3__Impl )
            // InternalMyDsl.g:2021:2: rule__ReDefine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReDefine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__3"


    // $ANTLR start "rule__ReDefine__Group__3__Impl"
    // InternalMyDsl.g:2027:1: rule__ReDefine__Group__3__Impl : ( ( rule__ReDefine__ObjAssignment_3 ) ) ;
    public final void rule__ReDefine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( ( ( rule__ReDefine__ObjAssignment_3 ) ) )
            // InternalMyDsl.g:2032:1: ( ( rule__ReDefine__ObjAssignment_3 ) )
            {
            // InternalMyDsl.g:2032:1: ( ( rule__ReDefine__ObjAssignment_3 ) )
            // InternalMyDsl.g:2033:2: ( rule__ReDefine__ObjAssignment_3 )
            {
             before(grammarAccess.getReDefineAccess().getObjAssignment_3()); 
            // InternalMyDsl.g:2034:2: ( rule__ReDefine__ObjAssignment_3 )
            // InternalMyDsl.g:2034:3: rule__ReDefine__ObjAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReDefine__ObjAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReDefineAccess().getObjAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalMyDsl.g:2043:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMyDsl.g:2048:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalMyDsl.g:2055:1: rule__Delete__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( ( 'Delete' ) )
            // InternalMyDsl.g:2060:1: ( 'Delete' )
            {
            // InternalMyDsl.g:2060:1: ( 'Delete' )
            // InternalMyDsl.g:2061:2: 'Delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalMyDsl.g:2070:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( rule__Delete__Group__1__Impl )
            // InternalMyDsl.g:2075:2: rule__Delete__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalMyDsl.g:2081:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__ObjNameAssignment_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( ( ( rule__Delete__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:2086:1: ( ( rule__Delete__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2086:1: ( ( rule__Delete__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:2087:2: ( rule__Delete__ObjNameAssignment_1 )
            {
             before(grammarAccess.getDeleteAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:2088:2: ( rule__Delete__ObjNameAssignment_1 )
            // InternalMyDsl.g:2088:3: rule__Delete__ObjNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ObjNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getObjNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__ActionSelect__Group__0"
    // InternalMyDsl.g:2097:1: rule__ActionSelect__Group__0 : rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 ;
    public final void rule__ActionSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 )
            // InternalMyDsl.g:2102:2: rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionSelect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__0"


    // $ANTLR start "rule__ActionSelect__Group__0__Impl"
    // InternalMyDsl.g:2109:1: rule__ActionSelect__Group__0__Impl : ( 'Select' ) ;
    public final void rule__ActionSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( ( 'Select' ) )
            // InternalMyDsl.g:2114:1: ( 'Select' )
            {
            // InternalMyDsl.g:2114:1: ( 'Select' )
            // InternalMyDsl.g:2115:2: 'Select'
            {
             before(grammarAccess.getActionSelectAccess().getSelectKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActionSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__0__Impl"


    // $ANTLR start "rule__ActionSelect__Group__1"
    // InternalMyDsl.g:2124:1: rule__ActionSelect__Group__1 : rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 ;
    public final void rule__ActionSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 )
            // InternalMyDsl.g:2129:2: rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ActionSelect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionSelect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__1"


    // $ANTLR start "rule__ActionSelect__Group__1__Impl"
    // InternalMyDsl.g:2136:1: rule__ActionSelect__Group__1__Impl : ( ( rule__ActionSelect__OptionAssignment_1 ) ) ;
    public final void rule__ActionSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( ( ( rule__ActionSelect__OptionAssignment_1 ) ) )
            // InternalMyDsl.g:2141:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            {
            // InternalMyDsl.g:2141:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            // InternalMyDsl.g:2142:2: ( rule__ActionSelect__OptionAssignment_1 )
            {
             before(grammarAccess.getActionSelectAccess().getOptionAssignment_1()); 
            // InternalMyDsl.g:2143:2: ( rule__ActionSelect__OptionAssignment_1 )
            // InternalMyDsl.g:2143:3: rule__ActionSelect__OptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionSelect__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionSelectAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__1__Impl"


    // $ANTLR start "rule__ActionSelect__Group__2"
    // InternalMyDsl.g:2151:1: rule__ActionSelect__Group__2 : rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 ;
    public final void rule__ActionSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 )
            // InternalMyDsl.g:2156:2: rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ActionSelect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionSelect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__2"


    // $ANTLR start "rule__ActionSelect__Group__2__Impl"
    // InternalMyDsl.g:2163:1: rule__ActionSelect__Group__2__Impl : ( 'from' ) ;
    public final void rule__ActionSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( ( 'from' ) )
            // InternalMyDsl.g:2168:1: ( 'from' )
            {
            // InternalMyDsl.g:2168:1: ( 'from' )
            // InternalMyDsl.g:2169:2: 'from'
            {
             before(grammarAccess.getActionSelectAccess().getFromKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActionSelectAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__2__Impl"


    // $ANTLR start "rule__ActionSelect__Group__3"
    // InternalMyDsl.g:2178:1: rule__ActionSelect__Group__3 : rule__ActionSelect__Group__3__Impl ;
    public final void rule__ActionSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( rule__ActionSelect__Group__3__Impl )
            // InternalMyDsl.g:2183:2: rule__ActionSelect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionSelect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__3"


    // $ANTLR start "rule__ActionSelect__Group__3__Impl"
    // InternalMyDsl.g:2189:1: rule__ActionSelect__Group__3__Impl : ( ( rule__ActionSelect__XpathAssignment_3 ) ) ;
    public final void rule__ActionSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( ( rule__ActionSelect__XpathAssignment_3 ) ) )
            // InternalMyDsl.g:2194:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            {
            // InternalMyDsl.g:2194:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            // InternalMyDsl.g:2195:2: ( rule__ActionSelect__XpathAssignment_3 )
            {
             before(grammarAccess.getActionSelectAccess().getXpathAssignment_3()); 
            // InternalMyDsl.g:2196:2: ( rule__ActionSelect__XpathAssignment_3 )
            // InternalMyDsl.g:2196:3: rule__ActionSelect__XpathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActionSelect__XpathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionSelectAccess().getXpathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__Group__3__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalMyDsl.g:2205:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:2210:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalMyDsl.g:2217:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( ( () ) )
            // InternalMyDsl.g:2222:1: ( () )
            {
            // InternalMyDsl.g:2222:1: ( () )
            // InternalMyDsl.g:2223:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalMyDsl.g:2224:2: ()
            // InternalMyDsl.g:2224:3: 
            {
            }

             after(grammarAccess.getClickAccess().getClickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalMyDsl.g:2232:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( rule__Click__Group__1__Impl )
            // InternalMyDsl.g:2237:2: rule__Click__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalMyDsl.g:2243:1: rule__Click__Group__1__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( ( 'Click' ) )
            // InternalMyDsl.g:2248:1: ( 'Click' )
            {
            // InternalMyDsl.g:2248:1: ( 'Click' )
            // InternalMyDsl.g:2249:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // InternalMyDsl.g:2259:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalMyDsl.g:2264:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // InternalMyDsl.g:2271:1: rule__Fill__Group__0__Impl : ( 'Write' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( ( 'Write' ) )
            // InternalMyDsl.g:2276:1: ( 'Write' )
            {
            // InternalMyDsl.g:2276:1: ( 'Write' )
            // InternalMyDsl.g:2277:2: 'Write'
            {
             before(grammarAccess.getFillAccess().getWriteKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getWriteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // InternalMyDsl.g:2286:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalMyDsl.g:2291:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // InternalMyDsl.g:2298:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__ContentAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( ( rule__Fill__ContentAssignment_1 ) ) )
            // InternalMyDsl.g:2303:1: ( ( rule__Fill__ContentAssignment_1 ) )
            {
            // InternalMyDsl.g:2303:1: ( ( rule__Fill__ContentAssignment_1 ) )
            // InternalMyDsl.g:2304:2: ( rule__Fill__ContentAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getContentAssignment_1()); 
            // InternalMyDsl.g:2305:2: ( rule__Fill__ContentAssignment_1 )
            // InternalMyDsl.g:2305:3: rule__Fill__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // InternalMyDsl.g:2313:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( rule__Fill__Group__2__Impl )
            // InternalMyDsl.g:2318:2: rule__Fill__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // InternalMyDsl.g:2324:1: rule__Fill__Group__2__Impl : ( 'inside' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( 'inside' ) )
            // InternalMyDsl.g:2329:1: ( 'inside' )
            {
            // InternalMyDsl.g:2329:1: ( 'inside' )
            // InternalMyDsl.g:2330:2: 'inside'
            {
             before(grammarAccess.getFillAccess().getInsideKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getInsideKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__CheckBox__Group__0"
    // InternalMyDsl.g:2340:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // InternalMyDsl.g:2345:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CheckBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__0"


    // $ANTLR start "rule__CheckBox__Group__0__Impl"
    // InternalMyDsl.g:2352:1: rule__CheckBox__Group__0__Impl : ( 'CheckBox' ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( 'CheckBox' ) )
            // InternalMyDsl.g:2357:1: ( 'CheckBox' )
            {
            // InternalMyDsl.g:2357:1: ( 'CheckBox' )
            // InternalMyDsl.g:2358:2: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__0__Impl"


    // $ANTLR start "rule__CheckBox__Group__1"
    // InternalMyDsl.g:2367:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // InternalMyDsl.g:2372:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CheckBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__1"


    // $ANTLR start "rule__CheckBox__Group__1__Impl"
    // InternalMyDsl.g:2379:1: rule__CheckBox__Group__1__Impl : ( ( rule__CheckBox__NametagAssignment_1 ) ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2383:1: ( ( ( rule__CheckBox__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:2384:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:2384:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            // InternalMyDsl.g:2385:2: ( rule__CheckBox__NametagAssignment_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:2386:2: ( rule__CheckBox__NametagAssignment_1 )
            // InternalMyDsl.g:2386:3: rule__CheckBox__NametagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__NametagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getNametagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__1__Impl"


    // $ANTLR start "rule__CheckBox__Group__2"
    // InternalMyDsl.g:2394:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2398:1: ( rule__CheckBox__Group__2__Impl )
            // InternalMyDsl.g:2399:2: rule__CheckBox__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__2"


    // $ANTLR start "rule__CheckBox__Group__2__Impl"
    // InternalMyDsl.g:2405:1: rule__CheckBox__Group__2__Impl : ( ( rule__CheckBox__Group_2__0 )? ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2409:1: ( ( ( rule__CheckBox__Group_2__0 )? ) )
            // InternalMyDsl.g:2410:1: ( ( rule__CheckBox__Group_2__0 )? )
            {
            // InternalMyDsl.g:2410:1: ( ( rule__CheckBox__Group_2__0 )? )
            // InternalMyDsl.g:2411:2: ( rule__CheckBox__Group_2__0 )?
            {
             before(grammarAccess.getCheckBoxAccess().getGroup_2()); 
            // InternalMyDsl.g:2412:2: ( rule__CheckBox__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2412:3: rule__CheckBox__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CheckBox__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckBoxAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__2__Impl"


    // $ANTLR start "rule__CheckBox__Group_2__0"
    // InternalMyDsl.g:2421:1: rule__CheckBox__Group_2__0 : rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 ;
    public final void rule__CheckBox__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 )
            // InternalMyDsl.g:2426:2: rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__CheckBox__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckBox__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group_2__0"


    // $ANTLR start "rule__CheckBox__Group_2__0__Impl"
    // InternalMyDsl.g:2433:1: rule__CheckBox__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__CheckBox__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( ( 'to' ) )
            // InternalMyDsl.g:2438:1: ( 'to' )
            {
            // InternalMyDsl.g:2438:1: ( 'to' )
            // InternalMyDsl.g:2439:2: 'to'
            {
             before(grammarAccess.getCheckBoxAccess().getToKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group_2__0__Impl"


    // $ANTLR start "rule__CheckBox__Group_2__1"
    // InternalMyDsl.g:2448:1: rule__CheckBox__Group_2__1 : rule__CheckBox__Group_2__1__Impl ;
    public final void rule__CheckBox__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( rule__CheckBox__Group_2__1__Impl )
            // InternalMyDsl.g:2453:2: rule__CheckBox__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group_2__1"


    // $ANTLR start "rule__CheckBox__Group_2__1__Impl"
    // InternalMyDsl.g:2459:1: rule__CheckBox__Group_2__1__Impl : ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) ;
    public final void rule__CheckBox__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:2464:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2464:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            // InternalMyDsl.g:2465:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAssignment_2_1()); 
            // InternalMyDsl.g:2466:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            // InternalMyDsl.g:2466:3: rule__CheckBox__NewValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__NewValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getNewValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group_2__1__Impl"


    // $ANTLR start "rule__Rickroll__Group__0"
    // InternalMyDsl.g:2475:1: rule__Rickroll__Group__0 : rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 ;
    public final void rule__Rickroll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 )
            // InternalMyDsl.g:2480:2: rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Rickroll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rickroll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rickroll__Group__0"


    // $ANTLR start "rule__Rickroll__Group__0__Impl"
    // InternalMyDsl.g:2487:1: rule__Rickroll__Group__0__Impl : ( () ) ;
    public final void rule__Rickroll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( () ) )
            // InternalMyDsl.g:2492:1: ( () )
            {
            // InternalMyDsl.g:2492:1: ( () )
            // InternalMyDsl.g:2493:2: ()
            {
             before(grammarAccess.getRickrollAccess().getRickrollAction_0()); 
            // InternalMyDsl.g:2494:2: ()
            // InternalMyDsl.g:2494:3: 
            {
            }

             after(grammarAccess.getRickrollAccess().getRickrollAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rickroll__Group__0__Impl"


    // $ANTLR start "rule__Rickroll__Group__1"
    // InternalMyDsl.g:2502:1: rule__Rickroll__Group__1 : rule__Rickroll__Group__1__Impl ;
    public final void rule__Rickroll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( rule__Rickroll__Group__1__Impl )
            // InternalMyDsl.g:2507:2: rule__Rickroll__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rickroll__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rickroll__Group__1"


    // $ANTLR start "rule__Rickroll__Group__1__Impl"
    // InternalMyDsl.g:2513:1: rule__Rickroll__Group__1__Impl : ( 'RickRoll' ) ;
    public final void rule__Rickroll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( 'RickRoll' ) )
            // InternalMyDsl.g:2518:1: ( 'RickRoll' )
            {
            // InternalMyDsl.g:2518:1: ( 'RickRoll' )
            // InternalMyDsl.g:2519:2: 'RickRoll'
            {
             before(grammarAccess.getRickrollAccess().getRickRollKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRickrollAccess().getRickRollKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rickroll__Group__1__Impl"


    // $ANTLR start "rule__DoWait__Group__0"
    // InternalMyDsl.g:2529:1: rule__DoWait__Group__0 : rule__DoWait__Group__0__Impl rule__DoWait__Group__1 ;
    public final void rule__DoWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( rule__DoWait__Group__0__Impl rule__DoWait__Group__1 )
            // InternalMyDsl.g:2534:2: rule__DoWait__Group__0__Impl rule__DoWait__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DoWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__0"


    // $ANTLR start "rule__DoWait__Group__0__Impl"
    // InternalMyDsl.g:2541:1: rule__DoWait__Group__0__Impl : ( 'Wait' ) ;
    public final void rule__DoWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( 'Wait' ) )
            // InternalMyDsl.g:2546:1: ( 'Wait' )
            {
            // InternalMyDsl.g:2546:1: ( 'Wait' )
            // InternalMyDsl.g:2547:2: 'Wait'
            {
             before(grammarAccess.getDoWaitAccess().getWaitKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDoWaitAccess().getWaitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__0__Impl"


    // $ANTLR start "rule__DoWait__Group__1"
    // InternalMyDsl.g:2556:1: rule__DoWait__Group__1 : rule__DoWait__Group__1__Impl rule__DoWait__Group__2 ;
    public final void rule__DoWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( rule__DoWait__Group__1__Impl rule__DoWait__Group__2 )
            // InternalMyDsl.g:2561:2: rule__DoWait__Group__1__Impl rule__DoWait__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__DoWait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__1"


    // $ANTLR start "rule__DoWait__Group__1__Impl"
    // InternalMyDsl.g:2568:1: rule__DoWait__Group__1__Impl : ( 'for' ) ;
    public final void rule__DoWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( 'for' ) )
            // InternalMyDsl.g:2573:1: ( 'for' )
            {
            // InternalMyDsl.g:2573:1: ( 'for' )
            // InternalMyDsl.g:2574:2: 'for'
            {
             before(grammarAccess.getDoWaitAccess().getForKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDoWaitAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__1__Impl"


    // $ANTLR start "rule__DoWait__Group__2"
    // InternalMyDsl.g:2583:1: rule__DoWait__Group__2 : rule__DoWait__Group__2__Impl rule__DoWait__Group__3 ;
    public final void rule__DoWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( rule__DoWait__Group__2__Impl rule__DoWait__Group__3 )
            // InternalMyDsl.g:2588:2: rule__DoWait__Group__2__Impl rule__DoWait__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__DoWait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__2"


    // $ANTLR start "rule__DoWait__Group__2__Impl"
    // InternalMyDsl.g:2595:1: rule__DoWait__Group__2__Impl : ( ( rule__DoWait__MillisecAssignment_2 ) ) ;
    public final void rule__DoWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( ( rule__DoWait__MillisecAssignment_2 ) ) )
            // InternalMyDsl.g:2600:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            {
            // InternalMyDsl.g:2600:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            // InternalMyDsl.g:2601:2: ( rule__DoWait__MillisecAssignment_2 )
            {
             before(grammarAccess.getDoWaitAccess().getMillisecAssignment_2()); 
            // InternalMyDsl.g:2602:2: ( rule__DoWait__MillisecAssignment_2 )
            // InternalMyDsl.g:2602:3: rule__DoWait__MillisecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoWait__MillisecAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoWaitAccess().getMillisecAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__2__Impl"


    // $ANTLR start "rule__DoWait__Group__3"
    // InternalMyDsl.g:2610:1: rule__DoWait__Group__3 : rule__DoWait__Group__3__Impl ;
    public final void rule__DoWait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( rule__DoWait__Group__3__Impl )
            // InternalMyDsl.g:2615:2: rule__DoWait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoWait__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__3"


    // $ANTLR start "rule__DoWait__Group__3__Impl"
    // InternalMyDsl.g:2621:1: rule__DoWait__Group__3__Impl : ( 'milliseconds' ) ;
    public final void rule__DoWait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( ( 'milliseconds' ) )
            // InternalMyDsl.g:2626:1: ( 'milliseconds' )
            {
            // InternalMyDsl.g:2626:1: ( 'milliseconds' )
            // InternalMyDsl.g:2627:2: 'milliseconds'
            {
             before(grammarAccess.getDoWaitAccess().getMillisecondsKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDoWaitAccess().getMillisecondsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__Group__3__Impl"


    // $ANTLR start "rule__IsIn__Group__0"
    // InternalMyDsl.g:2637:1: rule__IsIn__Group__0 : rule__IsIn__Group__0__Impl rule__IsIn__Group__1 ;
    public final void rule__IsIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( rule__IsIn__Group__0__Impl rule__IsIn__Group__1 )
            // InternalMyDsl.g:2642:2: rule__IsIn__Group__0__Impl rule__IsIn__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__IsIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__0"


    // $ANTLR start "rule__IsIn__Group__0__Impl"
    // InternalMyDsl.g:2649:1: rule__IsIn__Group__0__Impl : ( ( rule__IsIn__Alternatives_0 ) ) ;
    public final void rule__IsIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( ( rule__IsIn__Alternatives_0 ) ) )
            // InternalMyDsl.g:2654:1: ( ( rule__IsIn__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2654:1: ( ( rule__IsIn__Alternatives_0 ) )
            // InternalMyDsl.g:2655:2: ( rule__IsIn__Alternatives_0 )
            {
             before(grammarAccess.getIsInAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2656:2: ( rule__IsIn__Alternatives_0 )
            // InternalMyDsl.g:2656:3: rule__IsIn__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__0__Impl"


    // $ANTLR start "rule__IsIn__Group__1"
    // InternalMyDsl.g:2664:1: rule__IsIn__Group__1 : rule__IsIn__Group__1__Impl rule__IsIn__Group__2 ;
    public final void rule__IsIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( rule__IsIn__Group__1__Impl rule__IsIn__Group__2 )
            // InternalMyDsl.g:2669:2: rule__IsIn__Group__1__Impl rule__IsIn__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__IsIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__1"


    // $ANTLR start "rule__IsIn__Group__1__Impl"
    // InternalMyDsl.g:2676:1: rule__IsIn__Group__1__Impl : ( 'contains' ) ;
    public final void rule__IsIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( ( 'contains' ) )
            // InternalMyDsl.g:2681:1: ( 'contains' )
            {
            // InternalMyDsl.g:2681:1: ( 'contains' )
            // InternalMyDsl.g:2682:2: 'contains'
            {
             before(grammarAccess.getIsInAccess().getContainsKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getContainsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__1__Impl"


    // $ANTLR start "rule__IsIn__Group__2"
    // InternalMyDsl.g:2691:1: rule__IsIn__Group__2 : rule__IsIn__Group__2__Impl ;
    public final void rule__IsIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( rule__IsIn__Group__2__Impl )
            // InternalMyDsl.g:2696:2: rule__IsIn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__2"


    // $ANTLR start "rule__IsIn__Group__2__Impl"
    // InternalMyDsl.g:2702:1: rule__IsIn__Group__2__Impl : ( ( rule__IsIn__TextAssignment_2 ) ) ;
    public final void rule__IsIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2706:1: ( ( ( rule__IsIn__TextAssignment_2 ) ) )
            // InternalMyDsl.g:2707:1: ( ( rule__IsIn__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:2707:1: ( ( rule__IsIn__TextAssignment_2 ) )
            // InternalMyDsl.g:2708:2: ( rule__IsIn__TextAssignment_2 )
            {
             before(grammarAccess.getIsInAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:2709:2: ( rule__IsIn__TextAssignment_2 )
            // InternalMyDsl.g:2709:3: rule__IsIn__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__2__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalMyDsl.g:2718:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMyDsl.g:2723:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Not__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // InternalMyDsl.g:2730:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( 'Not' ) )
            // InternalMyDsl.g:2735:1: ( 'Not' )
            {
            // InternalMyDsl.g:2735:1: ( 'Not' )
            // InternalMyDsl.g:2736:2: 'Not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // InternalMyDsl.g:2745:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( rule__Not__Group__1__Impl )
            // InternalMyDsl.g:2750:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // InternalMyDsl.g:2756:1: rule__Not__Group__1__Impl : ( ( rule__Not__CondAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2760:1: ( ( ( rule__Not__CondAssignment_1 ) ) )
            // InternalMyDsl.g:2761:1: ( ( rule__Not__CondAssignment_1 ) )
            {
            // InternalMyDsl.g:2761:1: ( ( rule__Not__CondAssignment_1 ) )
            // InternalMyDsl.g:2762:2: ( rule__Not__CondAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getCondAssignment_1()); 
            // InternalMyDsl.g:2763:2: ( rule__Not__CondAssignment_1 )
            // InternalMyDsl.g:2763:3: rule__Not__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Not__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalMyDsl.g:2772:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:2777:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalMyDsl.g:2784:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( 'If' ) )
            // InternalMyDsl.g:2789:1: ( 'If' )
            {
            // InternalMyDsl.g:2789:1: ( 'If' )
            // InternalMyDsl.g:2790:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalMyDsl.g:2799:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2804:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalMyDsl.g:2811:1: rule__If__Group__1__Impl : ( ':' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( ( ':' ) )
            // InternalMyDsl.g:2816:1: ( ':' )
            {
            // InternalMyDsl.g:2816:1: ( ':' )
            // InternalMyDsl.g:2817:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalMyDsl.g:2826:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2831:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalMyDsl.g:2838:1: rule__If__Group__2__Impl : ( ( rule__If__CondAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( ( ( rule__If__CondAssignment_2 ) ) )
            // InternalMyDsl.g:2843:1: ( ( rule__If__CondAssignment_2 ) )
            {
            // InternalMyDsl.g:2843:1: ( ( rule__If__CondAssignment_2 ) )
            // InternalMyDsl.g:2844:2: ( rule__If__CondAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getCondAssignment_2()); 
            // InternalMyDsl.g:2845:2: ( rule__If__CondAssignment_2 )
            // InternalMyDsl.g:2845:3: rule__If__CondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__CondAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCondAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalMyDsl.g:2853:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalMyDsl.g:2858:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalMyDsl.g:2865:1: rule__If__Group__3__Impl : ( 'Then' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2869:1: ( ( 'Then' ) )
            // InternalMyDsl.g:2870:1: ( 'Then' )
            {
            // InternalMyDsl.g:2870:1: ( 'Then' )
            // InternalMyDsl.g:2871:2: 'Then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalMyDsl.g:2880:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalMyDsl.g:2885:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalMyDsl.g:2892:1: rule__If__Group__4__Impl : ( ':' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( ( ':' ) )
            // InternalMyDsl.g:2897:1: ( ':' )
            {
            // InternalMyDsl.g:2897:1: ( ':' )
            // InternalMyDsl.g:2898:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalMyDsl.g:2907:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalMyDsl.g:2912:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalMyDsl.g:2919:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( ( '{' ) )
            // InternalMyDsl.g:2924:1: ( '{' )
            {
            // InternalMyDsl.g:2924:1: ( '{' )
            // InternalMyDsl.g:2925:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalMyDsl.g:2934:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalMyDsl.g:2939:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalMyDsl.g:2946:1: rule__If__Group__6__Impl : ( ( rule__If__ActionThenAssignment_6 )* ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ( rule__If__ActionThenAssignment_6 )* ) )
            // InternalMyDsl.g:2951:1: ( ( rule__If__ActionThenAssignment_6 )* )
            {
            // InternalMyDsl.g:2951:1: ( ( rule__If__ActionThenAssignment_6 )* )
            // InternalMyDsl.g:2952:2: ( rule__If__ActionThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getActionThenAssignment_6()); 
            // InternalMyDsl.g:2953:2: ( rule__If__ActionThenAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=30 && LA18_0<=32)||LA18_0==34||(LA18_0>=36 && LA18_0<=37)||(LA18_0>=39 && LA18_0<=40)||LA18_0==42||(LA18_0>=44 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2953:3: rule__If__ActionThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__If__ActionThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getActionThenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalMyDsl.g:2961:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalMyDsl.g:2966:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // InternalMyDsl.g:2973:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( ( '}' ) )
            // InternalMyDsl.g:2978:1: ( '}' )
            {
            // InternalMyDsl.g:2978:1: ( '}' )
            // InternalMyDsl.g:2979:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // InternalMyDsl.g:2988:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( rule__If__Group__8__Impl )
            // InternalMyDsl.g:2993:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // InternalMyDsl.g:2999:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalMyDsl.g:3004:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalMyDsl.g:3004:1: ( ( rule__If__Group_8__0 )? )
            // InternalMyDsl.g:3005:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalMyDsl.g:3006:2: ( rule__If__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3006:3: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // InternalMyDsl.g:3015:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalMyDsl.g:3020:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // InternalMyDsl.g:3027:1: rule__If__Group_8__0__Impl : ( 'Else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( 'Else' ) )
            // InternalMyDsl.g:3032:1: ( 'Else' )
            {
            // InternalMyDsl.g:3032:1: ( 'Else' )
            // InternalMyDsl.g:3033:2: 'Else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // InternalMyDsl.g:3042:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // InternalMyDsl.g:3047:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__If__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // InternalMyDsl.g:3054:1: rule__If__Group_8__1__Impl : ( ':' ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3058:1: ( ( ':' ) )
            // InternalMyDsl.g:3059:1: ( ':' )
            {
            // InternalMyDsl.g:3059:1: ( ':' )
            // InternalMyDsl.g:3060:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_8_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8__2"
    // InternalMyDsl.g:3069:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // InternalMyDsl.g:3074:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_32);
            rule__If__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2"


    // $ANTLR start "rule__If__Group_8__2__Impl"
    // InternalMyDsl.g:3081:1: rule__If__Group_8__2__Impl : ( '{' ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3085:1: ( ( '{' ) )
            // InternalMyDsl.g:3086:1: ( '{' )
            {
            // InternalMyDsl.g:3086:1: ( '{' )
            // InternalMyDsl.g:3087:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2__Impl"


    // $ANTLR start "rule__If__Group_8__3"
    // InternalMyDsl.g:3096:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl rule__If__Group_8__4 ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( rule__If__Group_8__3__Impl rule__If__Group_8__4 )
            // InternalMyDsl.g:3101:2: rule__If__Group_8__3__Impl rule__If__Group_8__4
            {
            pushFollow(FOLLOW_32);
            rule__If__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3"


    // $ANTLR start "rule__If__Group_8__3__Impl"
    // InternalMyDsl.g:3108:1: rule__If__Group_8__3__Impl : ( ( rule__If__ActionElseAssignment_8_3 )* ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( ( rule__If__ActionElseAssignment_8_3 )* ) )
            // InternalMyDsl.g:3113:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            {
            // InternalMyDsl.g:3113:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            // InternalMyDsl.g:3114:2: ( rule__If__ActionElseAssignment_8_3 )*
            {
             before(grammarAccess.getIfAccess().getActionElseAssignment_8_3()); 
            // InternalMyDsl.g:3115:2: ( rule__If__ActionElseAssignment_8_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=32)||LA20_0==34||(LA20_0>=36 && LA20_0<=37)||(LA20_0>=39 && LA20_0<=40)||LA20_0==42||(LA20_0>=44 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3115:3: rule__If__ActionElseAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__If__ActionElseAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getActionElseAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3__Impl"


    // $ANTLR start "rule__If__Group_8__4"
    // InternalMyDsl.g:3123:1: rule__If__Group_8__4 : rule__If__Group_8__4__Impl ;
    public final void rule__If__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( rule__If__Group_8__4__Impl )
            // InternalMyDsl.g:3128:2: rule__If__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__4"


    // $ANTLR start "rule__If__Group_8__4__Impl"
    // InternalMyDsl.g:3134:1: rule__If__Group_8__4__Impl : ( '}' ) ;
    public final void rule__If__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3138:1: ( ( '}' ) )
            // InternalMyDsl.g:3139:1: ( '}' )
            {
            // InternalMyDsl.g:3139:1: ( '}' )
            // InternalMyDsl.g:3140:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__4__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalMyDsl.g:3150:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:3155:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalMyDsl.g:3162:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:3167:1: ( 'Loop' )
            {
            // InternalMyDsl.g:3167:1: ( 'Loop' )
            // InternalMyDsl.g:3168:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalMyDsl.g:3177:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:3182:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalMyDsl.g:3189:1: rule__Loop__Group__1__Impl : ( ':' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3193:1: ( ( ':' ) )
            // InternalMyDsl.g:3194:1: ( ':' )
            {
            // InternalMyDsl.g:3194:1: ( ':' )
            // InternalMyDsl.g:3195:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalMyDsl.g:3204:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMyDsl.g:3209:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalMyDsl.g:3216:1: rule__Loop__Group__2__Impl : ( 'Condition' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3220:1: ( ( 'Condition' ) )
            // InternalMyDsl.g:3221:1: ( 'Condition' )
            {
            // InternalMyDsl.g:3221:1: ( 'Condition' )
            // InternalMyDsl.g:3222:2: 'Condition'
            {
             before(grammarAccess.getLoopAccess().getConditionKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getConditionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalMyDsl.g:3231:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:3236:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalMyDsl.g:3243:1: rule__Loop__Group__3__Impl : ( ':' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ':' ) )
            // InternalMyDsl.g:3248:1: ( ':' )
            {
            // InternalMyDsl.g:3248:1: ( ':' )
            // InternalMyDsl.g:3249:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalMyDsl.g:3258:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:3263:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalMyDsl.g:3270:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__CondAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( ( ( rule__Loop__CondAssignment_4 ) ) )
            // InternalMyDsl.g:3275:1: ( ( rule__Loop__CondAssignment_4 ) )
            {
            // InternalMyDsl.g:3275:1: ( ( rule__Loop__CondAssignment_4 ) )
            // InternalMyDsl.g:3276:2: ( rule__Loop__CondAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getCondAssignment_4()); 
            // InternalMyDsl.g:3277:2: ( rule__Loop__CondAssignment_4 )
            // InternalMyDsl.g:3277:3: rule__Loop__CondAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Loop__CondAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getCondAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalMyDsl.g:3285:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:3290:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalMyDsl.g:3297:1: rule__Loop__Group__5__Impl : ( 'Interval' ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( 'Interval' ) )
            // InternalMyDsl.g:3302:1: ( 'Interval' )
            {
            // InternalMyDsl.g:3302:1: ( 'Interval' )
            // InternalMyDsl.g:3303:2: 'Interval'
            {
             before(grammarAccess.getLoopAccess().getIntervalKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIntervalKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalMyDsl.g:3312:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:3317:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalMyDsl.g:3324:1: rule__Loop__Group__6__Impl : ( ':' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( ( ':' ) )
            // InternalMyDsl.g:3329:1: ( ':' )
            {
            // InternalMyDsl.g:3329:1: ( ':' )
            // InternalMyDsl.g:3330:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__Loop__Group__7"
    // InternalMyDsl.g:3339:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalMyDsl.g:3344:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__7"


    // $ANTLR start "rule__Loop__Group__7__Impl"
    // InternalMyDsl.g:3351:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__MillisecondsAssignment_7 ) ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( ( rule__Loop__MillisecondsAssignment_7 ) ) )
            // InternalMyDsl.g:3356:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            {
            // InternalMyDsl.g:3356:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            // InternalMyDsl.g:3357:2: ( rule__Loop__MillisecondsAssignment_7 )
            {
             before(grammarAccess.getLoopAccess().getMillisecondsAssignment_7()); 
            // InternalMyDsl.g:3358:2: ( rule__Loop__MillisecondsAssignment_7 )
            // InternalMyDsl.g:3358:3: rule__Loop__MillisecondsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Loop__MillisecondsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getMillisecondsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__7__Impl"


    // $ANTLR start "rule__Loop__Group__8"
    // InternalMyDsl.g:3366:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalMyDsl.g:3371:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__8"


    // $ANTLR start "rule__Loop__Group__8__Impl"
    // InternalMyDsl.g:3378:1: rule__Loop__Group__8__Impl : ( 'Do' ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3382:1: ( ( 'Do' ) )
            // InternalMyDsl.g:3383:1: ( 'Do' )
            {
            // InternalMyDsl.g:3383:1: ( 'Do' )
            // InternalMyDsl.g:3384:2: 'Do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getDoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__8__Impl"


    // $ANTLR start "rule__Loop__Group__9"
    // InternalMyDsl.g:3393:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalMyDsl.g:3398:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__9"


    // $ANTLR start "rule__Loop__Group__9__Impl"
    // InternalMyDsl.g:3405:1: rule__Loop__Group__9__Impl : ( ':' ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( ( ':' ) )
            // InternalMyDsl.g:3410:1: ( ':' )
            {
            // InternalMyDsl.g:3410:1: ( ':' )
            // InternalMyDsl.g:3411:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__9__Impl"


    // $ANTLR start "rule__Loop__Group__10"
    // InternalMyDsl.g:3420:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalMyDsl.g:3425:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_32);
            rule__Loop__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__10"


    // $ANTLR start "rule__Loop__Group__10__Impl"
    // InternalMyDsl.g:3432:1: rule__Loop__Group__10__Impl : ( '{' ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( ( '{' ) )
            // InternalMyDsl.g:3437:1: ( '{' )
            {
            // InternalMyDsl.g:3437:1: ( '{' )
            // InternalMyDsl.g:3438:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__10__Impl"


    // $ANTLR start "rule__Loop__Group__11"
    // InternalMyDsl.g:3447:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalMyDsl.g:3452:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_32);
            rule__Loop__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__11"


    // $ANTLR start "rule__Loop__Group__11__Impl"
    // InternalMyDsl.g:3459:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__ActionsAssignment_11 )* ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3463:1: ( ( ( rule__Loop__ActionsAssignment_11 )* ) )
            // InternalMyDsl.g:3464:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            {
            // InternalMyDsl.g:3464:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            // InternalMyDsl.g:3465:2: ( rule__Loop__ActionsAssignment_11 )*
            {
             before(grammarAccess.getLoopAccess().getActionsAssignment_11()); 
            // InternalMyDsl.g:3466:2: ( rule__Loop__ActionsAssignment_11 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=32)||LA21_0==34||(LA21_0>=36 && LA21_0<=37)||(LA21_0>=39 && LA21_0<=40)||LA21_0==42||(LA21_0>=44 && LA21_0<=45)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:3466:3: rule__Loop__ActionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Loop__ActionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getActionsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__11__Impl"


    // $ANTLR start "rule__Loop__Group__12"
    // InternalMyDsl.g:3474:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( rule__Loop__Group__12__Impl )
            // InternalMyDsl.g:3479:2: rule__Loop__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__12"


    // $ANTLR start "rule__Loop__Group__12__Impl"
    // InternalMyDsl.g:3485:1: rule__Loop__Group__12__Impl : ( '}' ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3489:1: ( ( '}' ) )
            // InternalMyDsl.g:3490:1: ( '}' )
            {
            // InternalMyDsl.g:3490:1: ( '}' )
            // InternalMyDsl.g:3491:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__12__Impl"


    // $ANTLR start "rule__DoAll__Group__0"
    // InternalMyDsl.g:3501:1: rule__DoAll__Group__0 : rule__DoAll__Group__0__Impl rule__DoAll__Group__1 ;
    public final void rule__DoAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( rule__DoAll__Group__0__Impl rule__DoAll__Group__1 )
            // InternalMyDsl.g:3506:2: rule__DoAll__Group__0__Impl rule__DoAll__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DoAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__0"


    // $ANTLR start "rule__DoAll__Group__0__Impl"
    // InternalMyDsl.g:3513:1: rule__DoAll__Group__0__Impl : ( 'For' ) ;
    public final void rule__DoAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3517:1: ( ( 'For' ) )
            // InternalMyDsl.g:3518:1: ( 'For' )
            {
            // InternalMyDsl.g:3518:1: ( 'For' )
            // InternalMyDsl.g:3519:2: 'For'
            {
             before(grammarAccess.getDoAllAccess().getForKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__0__Impl"


    // $ANTLR start "rule__DoAll__Group__1"
    // InternalMyDsl.g:3528:1: rule__DoAll__Group__1 : rule__DoAll__Group__1__Impl rule__DoAll__Group__2 ;
    public final void rule__DoAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( rule__DoAll__Group__1__Impl rule__DoAll__Group__2 )
            // InternalMyDsl.g:3533:2: rule__DoAll__Group__1__Impl rule__DoAll__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__DoAll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__1"


    // $ANTLR start "rule__DoAll__Group__1__Impl"
    // InternalMyDsl.g:3540:1: rule__DoAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__DoAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( 'all' ) )
            // InternalMyDsl.g:3545:1: ( 'all' )
            {
            // InternalMyDsl.g:3545:1: ( 'all' )
            // InternalMyDsl.g:3546:2: 'all'
            {
             before(grammarAccess.getDoAllAccess().getAllKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__1__Impl"


    // $ANTLR start "rule__DoAll__Group__2"
    // InternalMyDsl.g:3555:1: rule__DoAll__Group__2 : rule__DoAll__Group__2__Impl rule__DoAll__Group__3 ;
    public final void rule__DoAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( rule__DoAll__Group__2__Impl rule__DoAll__Group__3 )
            // InternalMyDsl.g:3560:2: rule__DoAll__Group__2__Impl rule__DoAll__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__DoAll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__2"


    // $ANTLR start "rule__DoAll__Group__2__Impl"
    // InternalMyDsl.g:3567:1: rule__DoAll__Group__2__Impl : ( 'in' ) ;
    public final void rule__DoAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3571:1: ( ( 'in' ) )
            // InternalMyDsl.g:3572:1: ( 'in' )
            {
            // InternalMyDsl.g:3572:1: ( 'in' )
            // InternalMyDsl.g:3573:2: 'in'
            {
             before(grammarAccess.getDoAllAccess().getInKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__2__Impl"


    // $ANTLR start "rule__DoAll__Group__3"
    // InternalMyDsl.g:3582:1: rule__DoAll__Group__3 : rule__DoAll__Group__3__Impl rule__DoAll__Group__4 ;
    public final void rule__DoAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( rule__DoAll__Group__3__Impl rule__DoAll__Group__4 )
            // InternalMyDsl.g:3587:2: rule__DoAll__Group__3__Impl rule__DoAll__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__DoAll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__3"


    // $ANTLR start "rule__DoAll__Group__3__Impl"
    // InternalMyDsl.g:3594:1: rule__DoAll__Group__3__Impl : ( ( rule__DoAll__CollAssignment_3 ) ) ;
    public final void rule__DoAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3598:1: ( ( ( rule__DoAll__CollAssignment_3 ) ) )
            // InternalMyDsl.g:3599:1: ( ( rule__DoAll__CollAssignment_3 ) )
            {
            // InternalMyDsl.g:3599:1: ( ( rule__DoAll__CollAssignment_3 ) )
            // InternalMyDsl.g:3600:2: ( rule__DoAll__CollAssignment_3 )
            {
             before(grammarAccess.getDoAllAccess().getCollAssignment_3()); 
            // InternalMyDsl.g:3601:2: ( rule__DoAll__CollAssignment_3 )
            // InternalMyDsl.g:3601:3: rule__DoAll__CollAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__CollAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoAllAccess().getCollAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__3__Impl"


    // $ANTLR start "rule__DoAll__Group__4"
    // InternalMyDsl.g:3609:1: rule__DoAll__Group__4 : rule__DoAll__Group__4__Impl rule__DoAll__Group__5 ;
    public final void rule__DoAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( rule__DoAll__Group__4__Impl rule__DoAll__Group__5 )
            // InternalMyDsl.g:3614:2: rule__DoAll__Group__4__Impl rule__DoAll__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DoAll__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__4"


    // $ANTLR start "rule__DoAll__Group__4__Impl"
    // InternalMyDsl.g:3621:1: rule__DoAll__Group__4__Impl : ( 'do' ) ;
    public final void rule__DoAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( 'do' ) )
            // InternalMyDsl.g:3626:1: ( 'do' )
            {
            // InternalMyDsl.g:3626:1: ( 'do' )
            // InternalMyDsl.g:3627:2: 'do'
            {
             before(grammarAccess.getDoAllAccess().getDoKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__4__Impl"


    // $ANTLR start "rule__DoAll__Group__5"
    // InternalMyDsl.g:3636:1: rule__DoAll__Group__5 : rule__DoAll__Group__5__Impl rule__DoAll__Group__6 ;
    public final void rule__DoAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( rule__DoAll__Group__5__Impl rule__DoAll__Group__6 )
            // InternalMyDsl.g:3641:2: rule__DoAll__Group__5__Impl rule__DoAll__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__DoAll__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__5"


    // $ANTLR start "rule__DoAll__Group__5__Impl"
    // InternalMyDsl.g:3648:1: rule__DoAll__Group__5__Impl : ( ':' ) ;
    public final void rule__DoAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( ':' ) )
            // InternalMyDsl.g:3653:1: ( ':' )
            {
            // InternalMyDsl.g:3653:1: ( ':' )
            // InternalMyDsl.g:3654:2: ':'
            {
             before(grammarAccess.getDoAllAccess().getColonKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__5__Impl"


    // $ANTLR start "rule__DoAll__Group__6"
    // InternalMyDsl.g:3663:1: rule__DoAll__Group__6 : rule__DoAll__Group__6__Impl rule__DoAll__Group__7 ;
    public final void rule__DoAll__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( rule__DoAll__Group__6__Impl rule__DoAll__Group__7 )
            // InternalMyDsl.g:3668:2: rule__DoAll__Group__6__Impl rule__DoAll__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__DoAll__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__6"


    // $ANTLR start "rule__DoAll__Group__6__Impl"
    // InternalMyDsl.g:3675:1: rule__DoAll__Group__6__Impl : ( '{' ) ;
    public final void rule__DoAll__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3679:1: ( ( '{' ) )
            // InternalMyDsl.g:3680:1: ( '{' )
            {
            // InternalMyDsl.g:3680:1: ( '{' )
            // InternalMyDsl.g:3681:2: '{'
            {
             before(grammarAccess.getDoAllAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__6__Impl"


    // $ANTLR start "rule__DoAll__Group__7"
    // InternalMyDsl.g:3690:1: rule__DoAll__Group__7 : rule__DoAll__Group__7__Impl rule__DoAll__Group__8 ;
    public final void rule__DoAll__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( rule__DoAll__Group__7__Impl rule__DoAll__Group__8 )
            // InternalMyDsl.g:3695:2: rule__DoAll__Group__7__Impl rule__DoAll__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__DoAll__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAll__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__7"


    // $ANTLR start "rule__DoAll__Group__7__Impl"
    // InternalMyDsl.g:3702:1: rule__DoAll__Group__7__Impl : ( ( rule__DoAll__TodoAssignment_7 )* ) ;
    public final void rule__DoAll__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ( rule__DoAll__TodoAssignment_7 )* ) )
            // InternalMyDsl.g:3707:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            {
            // InternalMyDsl.g:3707:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            // InternalMyDsl.g:3708:2: ( rule__DoAll__TodoAssignment_7 )*
            {
             before(grammarAccess.getDoAllAccess().getTodoAssignment_7()); 
            // InternalMyDsl.g:3709:2: ( rule__DoAll__TodoAssignment_7 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=29 && LA22_0<=32)||LA22_0==34||(LA22_0>=36 && LA22_0<=37)||(LA22_0>=39 && LA22_0<=40)||LA22_0==42||(LA22_0>=44 && LA22_0<=45)||LA22_0==50||LA22_0==53||LA22_0==57||LA22_0==60) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3709:3: rule__DoAll__TodoAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DoAll__TodoAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDoAllAccess().getTodoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__7__Impl"


    // $ANTLR start "rule__DoAll__Group__8"
    // InternalMyDsl.g:3717:1: rule__DoAll__Group__8 : rule__DoAll__Group__8__Impl ;
    public final void rule__DoAll__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( rule__DoAll__Group__8__Impl )
            // InternalMyDsl.g:3722:2: rule__DoAll__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__8"


    // $ANTLR start "rule__DoAll__Group__8__Impl"
    // InternalMyDsl.g:3728:1: rule__DoAll__Group__8__Impl : ( '}' ) ;
    public final void rule__DoAll__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3732:1: ( ( '}' ) )
            // InternalMyDsl.g:3733:1: ( '}' )
            {
            // InternalMyDsl.g:3733:1: ( '}' )
            // InternalMyDsl.g:3734:2: '}'
            {
             before(grammarAccess.getDoAllAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDoAllAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__Group__8__Impl"


    // $ANTLR start "rule__Execute__Group_0__0"
    // InternalMyDsl.g:3744:1: rule__Execute__Group_0__0 : rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1 ;
    public final void rule__Execute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1 )
            // InternalMyDsl.g:3749:2: rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Execute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Execute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_0__0"


    // $ANTLR start "rule__Execute__Group_0__0__Impl"
    // InternalMyDsl.g:3756:1: rule__Execute__Group_0__0__Impl : ( 'Execute' ) ;
    public final void rule__Execute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( 'Execute' ) )
            // InternalMyDsl.g:3761:1: ( 'Execute' )
            {
            // InternalMyDsl.g:3761:1: ( 'Execute' )
            // InternalMyDsl.g:3762:2: 'Execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteKeyword_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getExecuteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_0__0__Impl"


    // $ANTLR start "rule__Execute__Group_0__1"
    // InternalMyDsl.g:3771:1: rule__Execute__Group_0__1 : rule__Execute__Group_0__1__Impl ;
    public final void rule__Execute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( rule__Execute__Group_0__1__Impl )
            // InternalMyDsl.g:3776:2: rule__Execute__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_0__1"


    // $ANTLR start "rule__Execute__Group_0__1__Impl"
    // InternalMyDsl.g:3782:1: rule__Execute__Group_0__1__Impl : ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) ) ;
    public final void rule__Execute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3786:1: ( ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) ) )
            // InternalMyDsl.g:3787:1: ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:3787:1: ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) )
            // InternalMyDsl.g:3788:2: ( rule__Execute__SubProcedureNameAssignment_0_1 )
            {
             before(grammarAccess.getExecuteAccess().getSubProcedureNameAssignment_0_1()); 
            // InternalMyDsl.g:3789:2: ( rule__Execute__SubProcedureNameAssignment_0_1 )
            // InternalMyDsl.g:3789:3: rule__Execute__SubProcedureNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Execute__SubProcedureNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getSubProcedureNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_0__1__Impl"


    // $ANTLR start "rule__Main__FileNameAssignment_1"
    // InternalMyDsl.g:3798:1: rule__Main__FileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Main__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3803:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3803:2: ( RULE_STRING )
            // InternalMyDsl.g:3804:3: RULE_STRING
            {
             before(grammarAccess.getMainAccess().getFileNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getFileNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__FileNameAssignment_1"


    // $ANTLR start "rule__Main__BrowserNameAssignment_4"
    // InternalMyDsl.g:3813:1: rule__Main__BrowserNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Main__BrowserNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3818:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3818:2: ( RULE_STRING )
            // InternalMyDsl.g:3819:3: RULE_STRING
            {
             before(grammarAccess.getMainAccess().getBrowserNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getBrowserNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__BrowserNameAssignment_4"


    // $ANTLR start "rule__Main__OrdersAssignment_6"
    // InternalMyDsl.g:3828:1: rule__Main__OrdersAssignment_6 : ( ( rule__Main__OrdersAlternatives_6_0 ) ) ;
    public final void rule__Main__OrdersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( ( rule__Main__OrdersAlternatives_6_0 ) ) )
            // InternalMyDsl.g:3833:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            {
            // InternalMyDsl.g:3833:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            // InternalMyDsl.g:3834:3: ( rule__Main__OrdersAlternatives_6_0 )
            {
             before(grammarAccess.getMainAccess().getOrdersAlternatives_6_0()); 
            // InternalMyDsl.g:3835:3: ( rule__Main__OrdersAlternatives_6_0 )
            // InternalMyDsl.g:3835:4: rule__Main__OrdersAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__OrdersAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getOrdersAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__OrdersAssignment_6"


    // $ANTLR start "rule__ActionWithObject__ObjectAssignment_1"
    // InternalMyDsl.g:3843:1: rule__ActionWithObject__ObjectAssignment_1 : ( ruleObject ) ;
    public final void rule__ActionWithObject__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3848:2: ( ruleObject )
            {
            // InternalMyDsl.g:3848:2: ( ruleObject )
            // InternalMyDsl.g:3849:3: ruleObject
            {
             before(grammarAccess.getActionWithObjectAccess().getObjectObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getActionWithObjectAccess().getObjectObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionWithObject__ObjectAssignment_1"


    // $ANTLR start "rule__Object__ObjNameAssignment_0"
    // InternalMyDsl.g:3858:1: rule__Object__ObjNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__ObjNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3862:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3863:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3863:2: ( RULE_ID )
            // InternalMyDsl.g:3864:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getObjNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ObjNameAssignment_0"


    // $ANTLR start "rule__Object__HtmltypeAssignment_2_0"
    // InternalMyDsl.g:3873:1: rule__Object__HtmltypeAssignment_2_0 : ( ruleHTMLTYPE ) ;
    public final void rule__Object__HtmltypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3877:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:3878:2: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:3878:2: ( ruleHTMLTYPE )
            // InternalMyDsl.g:3879:3: ruleHTMLTYPE
            {
             before(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLTYPE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__HtmltypeAssignment_2_0"


    // $ANTLR start "rule__Object__ObjectDefAssignment_2_1"
    // InternalMyDsl.g:3888:1: rule__Object__ObjectDefAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Object__ObjectDefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3893:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3893:2: ( RULE_STRING )
            // InternalMyDsl.g:3894:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getObjectDefSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectDefSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ObjectDefAssignment_2_1"


    // $ANTLR start "rule__HTMLTYPE__TypeAssignment"
    // InternalMyDsl.g:3903:1: rule__HTMLTYPE__TypeAssignment : ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) ;
    public final void rule__HTMLTYPE__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3907:1: ( ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) )
            // InternalMyDsl.g:3908:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            {
            // InternalMyDsl.g:3908:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            // InternalMyDsl.g:3909:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            {
             before(grammarAccess.getHTMLTYPEAccess().getTypeAlternatives_0()); 
            // InternalMyDsl.g:3910:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            // InternalMyDsl.g:3910:4: rule__HTMLTYPE__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__HTMLTYPE__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getHTMLTYPEAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLTYPE__TypeAssignment"


    // $ANTLR start "rule__Collection__ObjAssignment_1_0_1"
    // InternalMyDsl.g:3918:1: rule__Collection__ObjAssignment_1_0_1 : ( ruleObject ) ;
    public final void rule__Collection__ObjAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3923:2: ( ruleObject )
            {
            // InternalMyDsl.g:3923:2: ( ruleObject )
            // InternalMyDsl.g:3924:3: ruleObject
            {
             before(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__ObjAssignment_1_0_1"


    // $ANTLR start "rule__Collection__HtmltypeAssignment_1_1_2"
    // InternalMyDsl.g:3933:1: rule__Collection__HtmltypeAssignment_1_1_2 : ( ruleHTMLTYPE ) ;
    public final void rule__Collection__HtmltypeAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:3938:2: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:3938:2: ( ruleHTMLTYPE )
            // InternalMyDsl.g:3939:3: ruleHTMLTYPE
            {
             before(grammarAccess.getCollectionAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLTYPE();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__HtmltypeAssignment_1_1_2"


    // $ANTLR start "rule__Collection__ObjectRuleAssignment_1_1_3"
    // InternalMyDsl.g:3948:1: rule__Collection__ObjectRuleAssignment_1_1_3 : ( RULE_STRING ) ;
    public final void rule__Collection__ObjectRuleAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3953:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3953:2: ( RULE_STRING )
            // InternalMyDsl.g:3954:3: RULE_STRING
            {
             before(grammarAccess.getCollectionAccess().getObjectRuleSTRINGTerminalRuleCall_1_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getObjectRuleSTRINGTerminalRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__ObjectRuleAssignment_1_1_3"


    // $ANTLR start "rule__SubProcedure__ActionsAssignment_2"
    // InternalMyDsl.g:3963:1: rule__SubProcedure__ActionsAssignment_2 : ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) ) ;
    public final void rule__SubProcedure__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:3968:2: ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:3968:2: ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) )
            // InternalMyDsl.g:3969:3: ( rule__SubProcedure__ActionsAlternatives_2_0 )
            {
             before(grammarAccess.getSubProcedureAccess().getActionsAlternatives_2_0()); 
            // InternalMyDsl.g:3970:3: ( rule__SubProcedure__ActionsAlternatives_2_0 )
            // InternalMyDsl.g:3970:4: rule__SubProcedure__ActionsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SubProcedure__ActionsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSubProcedureAccess().getActionsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProcedure__ActionsAssignment_2"


    // $ANTLR start "rule__Navigate__UrlAssignment_1"
    // InternalMyDsl.g:3978:1: rule__Navigate__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3983:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3983:2: ( RULE_STRING )
            // InternalMyDsl.g:3984:3: RULE_STRING
            {
             before(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__UrlAssignment_1"


    // $ANTLR start "rule__Store__ObjNameAssignment_1"
    // InternalMyDsl.g:3993:1: rule__Store__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3997:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3998:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3998:2: ( RULE_ID )
            // InternalMyDsl.g:3999:3: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getObjNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getObjNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ObjNameAssignment_1"


    // $ANTLR start "rule__Store__ObjAssignment_3"
    // InternalMyDsl.g:4008:1: rule__Store__ObjAssignment_3 : ( ruleObject ) ;
    public final void rule__Store__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4012:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4013:2: ( ruleObject )
            {
            // InternalMyDsl.g:4013:2: ( ruleObject )
            // InternalMyDsl.g:4014:3: ruleObject
            {
             before(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ObjAssignment_3"


    // $ANTLR start "rule__ReDefine__ObjNameAssignment_1"
    // InternalMyDsl.g:4023:1: rule__ReDefine__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReDefine__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4027:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4028:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4028:2: ( RULE_ID )
            // InternalMyDsl.g:4029:3: RULE_ID
            {
             before(grammarAccess.getReDefineAccess().getObjNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReDefineAccess().getObjNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__ObjNameAssignment_1"


    // $ANTLR start "rule__ReDefine__ObjAssignment_3"
    // InternalMyDsl.g:4038:1: rule__ReDefine__ObjAssignment_3 : ( ruleObject ) ;
    public final void rule__ReDefine__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4042:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4043:2: ( ruleObject )
            {
            // InternalMyDsl.g:4043:2: ( ruleObject )
            // InternalMyDsl.g:4044:3: ruleObject
            {
             before(grammarAccess.getReDefineAccess().getObjObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getReDefineAccess().getObjObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReDefine__ObjAssignment_3"


    // $ANTLR start "rule__Delete__ObjNameAssignment_1"
    // InternalMyDsl.g:4053:1: rule__Delete__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delete__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4058:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4058:2: ( RULE_ID )
            // InternalMyDsl.g:4059:3: RULE_ID
            {
             before(grammarAccess.getDeleteAccess().getObjNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getObjNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__ObjNameAssignment_1"


    // $ANTLR start "rule__ActionSelect__OptionAssignment_1"
    // InternalMyDsl.g:4068:1: rule__ActionSelect__OptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4073:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4073:2: ( RULE_STRING )
            // InternalMyDsl.g:4074:3: RULE_STRING
            {
             before(grammarAccess.getActionSelectAccess().getOptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionSelectAccess().getOptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__OptionAssignment_1"


    // $ANTLR start "rule__ActionSelect__XpathAssignment_3"
    // InternalMyDsl.g:4083:1: rule__ActionSelect__XpathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__XpathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4088:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4088:2: ( RULE_STRING )
            // InternalMyDsl.g:4089:3: RULE_STRING
            {
             before(grammarAccess.getActionSelectAccess().getXpathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionSelectAccess().getXpathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionSelect__XpathAssignment_3"


    // $ANTLR start "rule__Fill__ContentAssignment_1"
    // InternalMyDsl.g:4098:1: rule__Fill__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4103:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4103:2: ( RULE_STRING )
            // InternalMyDsl.g:4104:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ContentAssignment_1"


    // $ANTLR start "rule__CheckBox__NametagAssignment_1"
    // InternalMyDsl.g:4113:1: rule__CheckBox__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CheckBox__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4118:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4118:2: ( RULE_STRING )
            // InternalMyDsl.g:4119:3: RULE_STRING
            {
             before(grammarAccess.getCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__NametagAssignment_1"


    // $ANTLR start "rule__CheckBox__NewValueAssignment_2_1"
    // InternalMyDsl.g:4128:1: rule__CheckBox__NewValueAssignment_2_1 : ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) ;
    public final void rule__CheckBox__NewValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4132:1: ( ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:4133:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:4133:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:4134:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:4135:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            // InternalMyDsl.g:4135:4: rule__CheckBox__NewValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__NewValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getNewValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__NewValueAssignment_2_1"


    // $ANTLR start "rule__DoWait__MillisecAssignment_2"
    // InternalMyDsl.g:4143:1: rule__DoWait__MillisecAssignment_2 : ( RULE_INT ) ;
    public final void rule__DoWait__MillisecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4147:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4148:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4148:2: ( RULE_INT )
            // InternalMyDsl.g:4149:3: RULE_INT
            {
             before(grammarAccess.getDoWaitAccess().getMillisecINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoWaitAccess().getMillisecINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWait__MillisecAssignment_2"


    // $ANTLR start "rule__IsIn__ObjAssignment_0_0"
    // InternalMyDsl.g:4158:1: rule__IsIn__ObjAssignment_0_0 : ( ruleObject ) ;
    public final void rule__IsIn__ObjAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4163:2: ( ruleObject )
            {
            // InternalMyDsl.g:4163:2: ( ruleObject )
            // InternalMyDsl.g:4164:3: ruleObject
            {
             before(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__ObjAssignment_0_0"


    // $ANTLR start "rule__IsIn__BodyAssignment_0_1"
    // InternalMyDsl.g:4173:1: rule__IsIn__BodyAssignment_0_1 : ( ( 'body' ) ) ;
    public final void rule__IsIn__BodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4177:1: ( ( ( 'body' ) ) )
            // InternalMyDsl.g:4178:2: ( ( 'body' ) )
            {
            // InternalMyDsl.g:4178:2: ( ( 'body' ) )
            // InternalMyDsl.g:4179:3: ( 'body' )
            {
             before(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 
            // InternalMyDsl.g:4180:3: ( 'body' )
            // InternalMyDsl.g:4181:4: 'body'
            {
             before(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 

            }

             after(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__BodyAssignment_0_1"


    // $ANTLR start "rule__IsIn__TextAssignment_2"
    // InternalMyDsl.g:4192:1: rule__IsIn__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IsIn__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4197:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4197:2: ( RULE_STRING )
            // InternalMyDsl.g:4198:3: RULE_STRING
            {
             before(grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__TextAssignment_2"


    // $ANTLR start "rule__Not__CondAssignment_1"
    // InternalMyDsl.g:4207:1: rule__Not__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4211:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4212:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4212:2: ( ruleCondition )
            // InternalMyDsl.g:4213:3: ruleCondition
            {
             before(grammarAccess.getNotAccess().getCondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getNotAccess().getCondConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__CondAssignment_1"


    // $ANTLR start "rule__If__CondAssignment_2"
    // InternalMyDsl.g:4222:1: rule__If__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__If__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4227:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4227:2: ( ruleCondition )
            // InternalMyDsl.g:4228:3: ruleCondition
            {
             before(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CondAssignment_2"


    // $ANTLR start "rule__If__ActionThenAssignment_6"
    // InternalMyDsl.g:4237:1: rule__If__ActionThenAssignment_6 : ( ruleAction ) ;
    public final void rule__If__ActionThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4242:2: ( ruleAction )
            {
            // InternalMyDsl.g:4242:2: ( ruleAction )
            // InternalMyDsl.g:4243:3: ruleAction
            {
             before(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ActionThenAssignment_6"


    // $ANTLR start "rule__If__ActionElseAssignment_8_3"
    // InternalMyDsl.g:4252:1: rule__If__ActionElseAssignment_8_3 : ( ruleAction ) ;
    public final void rule__If__ActionElseAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4257:2: ( ruleAction )
            {
            // InternalMyDsl.g:4257:2: ( ruleAction )
            // InternalMyDsl.g:4258:3: ruleAction
            {
             before(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ActionElseAssignment_8_3"


    // $ANTLR start "rule__Loop__CondAssignment_4"
    // InternalMyDsl.g:4267:1: rule__Loop__CondAssignment_4 : ( ruleCondition ) ;
    public final void rule__Loop__CondAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4272:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4272:2: ( ruleCondition )
            // InternalMyDsl.g:4273:3: ruleCondition
            {
             before(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__CondAssignment_4"


    // $ANTLR start "rule__Loop__MillisecondsAssignment_7"
    // InternalMyDsl.g:4282:1: rule__Loop__MillisecondsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Loop__MillisecondsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4286:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4287:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4287:2: ( RULE_INT )
            // InternalMyDsl.g:4288:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getMillisecondsINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getMillisecondsINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__MillisecondsAssignment_7"


    // $ANTLR start "rule__Loop__ActionsAssignment_11"
    // InternalMyDsl.g:4297:1: rule__Loop__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__Loop__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4302:2: ( ruleAction )
            {
            // InternalMyDsl.g:4302:2: ( ruleAction )
            // InternalMyDsl.g:4303:3: ruleAction
            {
             before(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ActionsAssignment_11"


    // $ANTLR start "rule__DoAll__CollAssignment_3"
    // InternalMyDsl.g:4312:1: rule__DoAll__CollAssignment_3 : ( ruleCollection ) ;
    public final void rule__DoAll__CollAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:4317:2: ( ruleCollection )
            {
            // InternalMyDsl.g:4317:2: ( ruleCollection )
            // InternalMyDsl.g:4318:3: ruleCollection
            {
             before(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__CollAssignment_3"


    // $ANTLR start "rule__DoAll__TodoAssignment_7"
    // InternalMyDsl.g:4327:1: rule__DoAll__TodoAssignment_7 : ( ( rule__DoAll__TodoAlternatives_7_0 ) ) ;
    public final void rule__DoAll__TodoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4331:1: ( ( ( rule__DoAll__TodoAlternatives_7_0 ) ) )
            // InternalMyDsl.g:4332:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            {
            // InternalMyDsl.g:4332:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            // InternalMyDsl.g:4333:3: ( rule__DoAll__TodoAlternatives_7_0 )
            {
             before(grammarAccess.getDoAllAccess().getTodoAlternatives_7_0()); 
            // InternalMyDsl.g:4334:3: ( rule__DoAll__TodoAlternatives_7_0 )
            // InternalMyDsl.g:4334:4: rule__DoAll__TodoAlternatives_7_0
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__TodoAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getDoAllAccess().getTodoAlternatives_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__TodoAssignment_7"


    // $ANTLR start "rule__Execute__SubProcedureNameAssignment_0_1"
    // InternalMyDsl.g:4342:1: rule__Execute__SubProcedureNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Execute__SubProcedureNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4346:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4347:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4347:2: ( RULE_ID )
            // InternalMyDsl.g:4348:3: RULE_ID
            {
             before(grammarAccess.getExecuteAccess().getSubProcedureNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getSubProcedureNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__SubProcedureNameAssignment_0_1"


    // $ANTLR start "rule__Execute__SubprocedureAssignment_1"
    // InternalMyDsl.g:4357:1: rule__Execute__SubprocedureAssignment_1 : ( ruleSubProcedure ) ;
    public final void rule__Execute__SubprocedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4361:1: ( ( ruleSubProcedure ) )
            // InternalMyDsl.g:4362:2: ( ruleSubProcedure )
            {
            // InternalMyDsl.g:4362:2: ( ruleSubProcedure )
            // InternalMyDsl.g:4363:3: ruleSubProcedure
            {
             before(grammarAccess.getExecuteAccess().getSubprocedureSubProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubProcedure();

            state._fsp--;

             after(grammarAccess.getExecuteAccess().getSubprocedureSubProcedureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__SubprocedureAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x122435B5E0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x122435B5E0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x122435B5E003F820L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x122435B5E403F820L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x122435B5E003F822L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x122435B5E4000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x322635B5E003F820L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000035B5C4000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000035B5C0000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});

}