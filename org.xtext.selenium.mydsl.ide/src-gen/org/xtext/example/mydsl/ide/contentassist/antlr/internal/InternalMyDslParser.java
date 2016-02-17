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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'guess'", "'title'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'true'", "'false'", "'File'", "'with'", "'browser'", "':'", "'Collection'", "'{'", "'}'", "'of'", "'all'", "'Subprocedure'", "'Refresh'", "'Navigate'", "'var'", "'='", "'Redefine'", "'as'", "'Delete'", "'Select'", "'from'", "'Click'", "'Fill'", "'CheckBox'", "'to'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'contains'", "'Not'", "'If'", "'Then'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'in'", "'do'", "'Execute'", "'body'"
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


    // $ANTLR start "entryRuleStructure"
    // InternalMyDsl.g:103:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleStructure EOF )
            // InternalMyDsl.g:105:1: ruleStructure EOF
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
    // InternalMyDsl.g:112:1: ruleStructure : ( ( rule__Structure__Alternatives ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Structure__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Structure__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Structure__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Structure__Alternatives )
            {
             before(grammarAccess.getStructureAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Structure__Alternatives )
            // InternalMyDsl.g:119:4: rule__Structure__Alternatives
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
    // InternalMyDsl.g:128:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCondition EOF )
            // InternalMyDsl.g:130:1: ruleCondition EOF
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
    // InternalMyDsl.g:137:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Condition__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Condition__Alternatives )
            // InternalMyDsl.g:144:4: rule__Condition__Alternatives
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
    // InternalMyDsl.g:153:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleObject EOF )
            // InternalMyDsl.g:155:1: ruleObject EOF
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
    // InternalMyDsl.g:162:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Object__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Object__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Object__Alternatives )
            // InternalMyDsl.g:169:4: rule__Object__Alternatives
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
    // InternalMyDsl.g:178:1: entryRuleHTMLTYPE : ruleHTMLTYPE EOF ;
    public final void entryRuleHTMLTYPE() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleHTMLTYPE EOF )
            // InternalMyDsl.g:180:1: ruleHTMLTYPE EOF
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
    // InternalMyDsl.g:187:1: ruleHTMLTYPE : ( ( rule__HTMLTYPE__TypeAssignment ) ) ;
    public final void ruleHTMLTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__HTMLTYPE__TypeAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__HTMLTYPE__TypeAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__HTMLTYPE__TypeAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__HTMLTYPE__TypeAssignment )
            {
             before(grammarAccess.getHTMLTYPEAccess().getTypeAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__HTMLTYPE__TypeAssignment )
            // InternalMyDsl.g:194:4: rule__HTMLTYPE__TypeAssignment
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
    // InternalMyDsl.g:203:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleCollection EOF )
            // InternalMyDsl.g:205:1: ruleCollection EOF
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
    // InternalMyDsl.g:212:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Collection__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Collection__Group__0 )
            // InternalMyDsl.g:219:4: rule__Collection__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleSubProcedure : ruleSubProcedure EOF ;
    public final void entryRuleSubProcedure() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSubProcedure EOF )
            // InternalMyDsl.g:230:1: ruleSubProcedure EOF
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
    // InternalMyDsl.g:237:1: ruleSubProcedure : ( ( rule__SubProcedure__Group__0 ) ) ;
    public final void ruleSubProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__SubProcedure__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__SubProcedure__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__SubProcedure__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__SubProcedure__Group__0 )
            {
             before(grammarAccess.getSubProcedureAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__SubProcedure__Group__0 )
            // InternalMyDsl.g:244:4: rule__SubProcedure__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleRefresh : ruleRefresh EOF ;
    public final void entryRuleRefresh() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRefresh EOF )
            // InternalMyDsl.g:255:1: ruleRefresh EOF
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
    // InternalMyDsl.g:262:1: ruleRefresh : ( ( rule__Refresh__Group__0 ) ) ;
    public final void ruleRefresh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Refresh__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Refresh__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Refresh__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Refresh__Group__0 )
            {
             before(grammarAccess.getRefreshAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Refresh__Group__0 )
            // InternalMyDsl.g:269:4: rule__Refresh__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleNavigate : ruleNavigate EOF ;
    public final void entryRuleNavigate() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleNavigate EOF )
            // InternalMyDsl.g:280:1: ruleNavigate EOF
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
    // InternalMyDsl.g:287:1: ruleNavigate : ( ( rule__Navigate__Group__0 ) ) ;
    public final void ruleNavigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Navigate__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Navigate__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Navigate__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Navigate__Group__0 )
            {
             before(grammarAccess.getNavigateAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Navigate__Group__0 )
            // InternalMyDsl.g:294:4: rule__Navigate__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleStore EOF )
            // InternalMyDsl.g:305:1: ruleStore EOF
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
    // InternalMyDsl.g:312:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Store__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Store__Group__0 )
            // InternalMyDsl.g:319:4: rule__Store__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleReDefine : ruleReDefine EOF ;
    public final void entryRuleReDefine() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleReDefine EOF )
            // InternalMyDsl.g:330:1: ruleReDefine EOF
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
    // InternalMyDsl.g:337:1: ruleReDefine : ( ( rule__ReDefine__Group__0 ) ) ;
    public final void ruleReDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ReDefine__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ReDefine__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ReDefine__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ReDefine__Group__0 )
            {
             before(grammarAccess.getReDefineAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ReDefine__Group__0 )
            // InternalMyDsl.g:344:4: rule__ReDefine__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleDelete EOF )
            // InternalMyDsl.g:355:1: ruleDelete EOF
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
    // InternalMyDsl.g:362:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Delete__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Delete__Group__0 )
            // InternalMyDsl.g:369:4: rule__Delete__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleActionSelect : ruleActionSelect EOF ;
    public final void entryRuleActionSelect() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleActionSelect EOF )
            // InternalMyDsl.g:380:1: ruleActionSelect EOF
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
    // InternalMyDsl.g:387:1: ruleActionSelect : ( ( rule__ActionSelect__Group__0 ) ) ;
    public final void ruleActionSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ActionSelect__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ActionSelect__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ActionSelect__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ActionSelect__Group__0 )
            {
             before(grammarAccess.getActionSelectAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ActionSelect__Group__0 )
            // InternalMyDsl.g:394:4: rule__ActionSelect__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleClick EOF )
            // InternalMyDsl.g:405:1: ruleClick EOF
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
    // InternalMyDsl.g:412:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Click__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Click__Group__0 )
            // InternalMyDsl.g:419:4: rule__Click__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleFill EOF )
            // InternalMyDsl.g:430:1: ruleFill EOF
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
    // InternalMyDsl.g:437:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Fill__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Fill__Group__0 )
            // InternalMyDsl.g:444:4: rule__Fill__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleCheckBox EOF )
            // InternalMyDsl.g:455:1: ruleCheckBox EOF
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
    // InternalMyDsl.g:462:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__CheckBox__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__CheckBox__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__CheckBox__Group__0 )
            // InternalMyDsl.g:469:4: rule__CheckBox__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleRickroll : ruleRickroll EOF ;
    public final void entryRuleRickroll() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleRickroll EOF )
            // InternalMyDsl.g:480:1: ruleRickroll EOF
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
    // InternalMyDsl.g:487:1: ruleRickroll : ( ( rule__Rickroll__Group__0 ) ) ;
    public final void ruleRickroll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Rickroll__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Rickroll__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Rickroll__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Rickroll__Group__0 )
            {
             before(grammarAccess.getRickrollAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Rickroll__Group__0 )
            // InternalMyDsl.g:494:4: rule__Rickroll__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleDoWait : ruleDoWait EOF ;
    public final void entryRuleDoWait() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleDoWait EOF )
            // InternalMyDsl.g:505:1: ruleDoWait EOF
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
    // InternalMyDsl.g:512:1: ruleDoWait : ( ( rule__DoWait__Group__0 ) ) ;
    public final void ruleDoWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__DoWait__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__DoWait__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__DoWait__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__DoWait__Group__0 )
            {
             before(grammarAccess.getDoWaitAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__DoWait__Group__0 )
            // InternalMyDsl.g:519:4: rule__DoWait__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleIsIn : ruleIsIn EOF ;
    public final void entryRuleIsIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleIsIn EOF )
            // InternalMyDsl.g:530:1: ruleIsIn EOF
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
    // InternalMyDsl.g:537:1: ruleIsIn : ( ( rule__IsIn__Group__0 ) ) ;
    public final void ruleIsIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__IsIn__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__IsIn__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__IsIn__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__IsIn__Group__0 )
            {
             before(grammarAccess.getIsInAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__IsIn__Group__0 )
            // InternalMyDsl.g:544:4: rule__IsIn__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleNot EOF )
            // InternalMyDsl.g:555:1: ruleNot EOF
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
    // InternalMyDsl.g:562:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Not__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Not__Group__0 )
            // InternalMyDsl.g:569:4: rule__Not__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleIf EOF )
            // InternalMyDsl.g:580:1: ruleIf EOF
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
    // InternalMyDsl.g:587:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:594:4: rule__If__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleLoop EOF )
            // InternalMyDsl.g:605:1: ruleLoop EOF
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
    // InternalMyDsl.g:612:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:619:4: rule__Loop__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleDoAll : ruleDoAll EOF ;
    public final void entryRuleDoAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleDoAll EOF )
            // InternalMyDsl.g:630:1: ruleDoAll EOF
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
    // InternalMyDsl.g:637:1: ruleDoAll : ( ( rule__DoAll__Group__0 ) ) ;
    public final void ruleDoAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__DoAll__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__DoAll__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__DoAll__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__DoAll__Group__0 )
            {
             before(grammarAccess.getDoAllAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__DoAll__Group__0 )
            // InternalMyDsl.g:644:4: rule__DoAll__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleExecute : ruleExecute EOF ;
    public final void entryRuleExecute() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleExecute EOF )
            // InternalMyDsl.g:655:1: ruleExecute EOF
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
    // InternalMyDsl.g:662:1: ruleExecute : ( ( rule__Execute__Alternatives ) ) ;
    public final void ruleExecute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Execute__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Execute__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Execute__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__Execute__Alternatives )
            {
             before(grammarAccess.getExecuteAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__Execute__Alternatives )
            // InternalMyDsl.g:669:4: rule__Execute__Alternatives
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
    // InternalMyDsl.g:677:1: rule__Main__OrdersAlternatives_6_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__Main__OrdersAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=30 && LA1_0<=32)||LA1_0==34||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=43 && LA1_0<=44)) ) {
                alt1=1;
            }
            else if ( (LA1_0==29||LA1_0==49||LA1_0==52||LA1_0==56||LA1_0==59) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:682:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:682:2: ( ruleAction )
                    // InternalMyDsl.g:683:3: ruleAction
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
                    // InternalMyDsl.g:688:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:688:2: ( ruleStructure )
                    // InternalMyDsl.g:689:3: ruleStructure
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
    // InternalMyDsl.g:698:1: rule__Action__Alternatives : ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleCheckBox ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleStore ) | ( ruleReDefine ) | ( ruleDelete ) | ( ruleRickroll ) | ( ruleDoWait ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleCheckBox ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleStore ) | ( ruleReDefine ) | ( ruleDelete ) | ( ruleRickroll ) | ( ruleDoWait ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            case 41:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 32:
                {
                alt2=7;
                }
                break;
            case 34:
                {
                alt2=8;
                }
                break;
            case 36:
                {
                alt2=9;
                }
                break;
            case 43:
                {
                alt2=10;
                }
                break;
            case 44:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:703:2: ( ruleNavigate )
                    {
                    // InternalMyDsl.g:703:2: ( ruleNavigate )
                    // InternalMyDsl.g:704:3: ruleNavigate
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
                    // InternalMyDsl.g:709:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:709:2: ( ruleClick )
                    // InternalMyDsl.g:710:3: ruleClick
                    {
                     before(grammarAccess.getActionAccess().getClickParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getClickParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:715:2: ( ruleFill )
                    {
                    // InternalMyDsl.g:715:2: ( ruleFill )
                    // InternalMyDsl.g:716:3: ruleFill
                    {
                     before(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:721:2: ( ruleCheckBox )
                    {
                    // InternalMyDsl.g:721:2: ( ruleCheckBox )
                    // InternalMyDsl.g:722:3: ruleCheckBox
                    {
                     before(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:727:2: ( ruleRefresh )
                    {
                    // InternalMyDsl.g:727:2: ( ruleRefresh )
                    // InternalMyDsl.g:728:3: ruleRefresh
                    {
                     before(grammarAccess.getActionAccess().getRefreshParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRefresh();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRefreshParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:733:2: ( ruleActionSelect )
                    {
                    // InternalMyDsl.g:733:2: ( ruleActionSelect )
                    // InternalMyDsl.g:734:3: ruleActionSelect
                    {
                     before(grammarAccess.getActionAccess().getActionSelectParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleActionSelect();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getActionSelectParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:739:2: ( ruleStore )
                    {
                    // InternalMyDsl.g:739:2: ( ruleStore )
                    // InternalMyDsl.g:740:3: ruleStore
                    {
                     before(grammarAccess.getActionAccess().getStoreParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getStoreParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:745:2: ( ruleReDefine )
                    {
                    // InternalMyDsl.g:745:2: ( ruleReDefine )
                    // InternalMyDsl.g:746:3: ruleReDefine
                    {
                     before(grammarAccess.getActionAccess().getReDefineParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleReDefine();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getReDefineParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:751:2: ( ruleDelete )
                    {
                    // InternalMyDsl.g:751:2: ( ruleDelete )
                    // InternalMyDsl.g:752:3: ruleDelete
                    {
                     before(grammarAccess.getActionAccess().getDeleteParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDeleteParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:757:2: ( ruleRickroll )
                    {
                    // InternalMyDsl.g:757:2: ( ruleRickroll )
                    // InternalMyDsl.g:758:3: ruleRickroll
                    {
                     before(grammarAccess.getActionAccess().getRickrollParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRickroll();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRickrollParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:763:2: ( ruleDoWait )
                    {
                    // InternalMyDsl.g:763:2: ( ruleDoWait )
                    // InternalMyDsl.g:764:3: ruleDoWait
                    {
                     before(grammarAccess.getActionAccess().getDoWaitParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleDoWait();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDoWaitParserRuleCall_10()); 

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


    // $ANTLR start "rule__Structure__Alternatives"
    // InternalMyDsl.g:773:1: rule__Structure__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) | ( ruleExecute ) );
    public final void rule__Structure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) | ( ruleExecute ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 52:
                {
                alt3=2;
                }
                break;
            case 56:
                {
                alt3=3;
                }
                break;
            case 29:
            case 59:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:778:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:778:2: ( ruleIf )
                    // InternalMyDsl.g:779:3: ruleIf
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
                    // InternalMyDsl.g:784:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:784:2: ( ruleLoop )
                    // InternalMyDsl.g:785:3: ruleLoop
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
                    // InternalMyDsl.g:790:2: ( ruleDoAll )
                    {
                    // InternalMyDsl.g:790:2: ( ruleDoAll )
                    // InternalMyDsl.g:791:3: ruleDoAll
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
                    // InternalMyDsl.g:796:2: ( ruleExecute )
                    {
                    // InternalMyDsl.g:796:2: ( ruleExecute )
                    // InternalMyDsl.g:797:3: ruleExecute
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
    // InternalMyDsl.g:806:1: rule__Condition__Alternatives : ( ( ruleIsIn ) | ( ruleNot ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( ruleIsIn ) | ( ruleNot ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=17)||LA4_0==29||LA4_0==60) ) {
                alt4=1;
            }
            else if ( (LA4_0==48) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:811:2: ( ruleIsIn )
                    {
                    // InternalMyDsl.g:811:2: ( ruleIsIn )
                    // InternalMyDsl.g:812:3: ruleIsIn
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
                    // InternalMyDsl.g:817:2: ( ruleNot )
                    {
                    // InternalMyDsl.g:817:2: ( ruleNot )
                    // InternalMyDsl.g:818:3: ruleNot
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
    // InternalMyDsl.g:827:1: rule__Object__Alternatives : ( ( ( rule__Object__ObjNameAssignment_0 ) ) | ( ruleSubProcedure ) | ( ( rule__Object__Group_2__0 ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ( rule__Object__ObjNameAssignment_0 ) ) | ( ruleSubProcedure ) | ( ( rule__Object__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
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
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:832:2: ( ( rule__Object__ObjNameAssignment_0 ) )
                    {
                    // InternalMyDsl.g:832:2: ( ( rule__Object__ObjNameAssignment_0 ) )
                    // InternalMyDsl.g:833:3: ( rule__Object__ObjNameAssignment_0 )
                    {
                     before(grammarAccess.getObjectAccess().getObjNameAssignment_0()); 
                    // InternalMyDsl.g:834:3: ( rule__Object__ObjNameAssignment_0 )
                    // InternalMyDsl.g:834:4: rule__Object__ObjNameAssignment_0
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
                    // InternalMyDsl.g:838:2: ( ruleSubProcedure )
                    {
                    // InternalMyDsl.g:838:2: ( ruleSubProcedure )
                    // InternalMyDsl.g:839:3: ruleSubProcedure
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
                    // InternalMyDsl.g:844:2: ( ( rule__Object__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:844:2: ( ( rule__Object__Group_2__0 ) )
                    // InternalMyDsl.g:845:3: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalMyDsl.g:846:3: ( rule__Object__Group_2__0 )
                    // InternalMyDsl.g:846:4: rule__Object__Group_2__0
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
    // InternalMyDsl.g:854:1: rule__HTMLTYPE__TypeAlternatives_0 : ( ( 'guess' ) | ( 'title' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) );
    public final void rule__HTMLTYPE__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( 'guess' ) | ( 'title' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:859:2: ( 'guess' )
                    {
                    // InternalMyDsl.g:859:2: ( 'guess' )
                    // InternalMyDsl.g:860:3: 'guess'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeGuessKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeGuessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:865:2: ( 'title' )
                    {
                    // InternalMyDsl.g:865:2: ( 'title' )
                    // InternalMyDsl.g:866:3: 'title'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:871:2: ( 'class' )
                    {
                    // InternalMyDsl.g:871:2: ( 'class' )
                    // InternalMyDsl.g:872:3: 'class'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:877:2: ( 'id' )
                    {
                    // InternalMyDsl.g:877:2: ( 'id' )
                    // InternalMyDsl.g:878:3: 'id'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:883:2: ( 'name' )
                    {
                    // InternalMyDsl.g:883:2: ( 'name' )
                    // InternalMyDsl.g:884:3: 'name'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:889:2: ( 'CSS Selector' )
                    {
                    // InternalMyDsl.g:889:2: ( 'CSS Selector' )
                    // InternalMyDsl.g:890:3: 'CSS Selector'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:895:2: ( 'XPath' )
                    {
                    // InternalMyDsl.g:895:2: ( 'XPath' )
                    // InternalMyDsl.g:896:3: 'XPath'
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
    // InternalMyDsl.g:905:1: rule__Collection__Alternatives_1 : ( ( ( rule__Collection__Group_1_0__0 ) ) | ( ( rule__Collection__Group_1_1__0 ) ) );
    public final void rule__Collection__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( ( rule__Collection__Group_1_0__0 ) ) | ( ( rule__Collection__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:910:2: ( ( rule__Collection__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:910:2: ( ( rule__Collection__Group_1_0__0 ) )
                    // InternalMyDsl.g:911:3: ( rule__Collection__Group_1_0__0 )
                    {
                     before(grammarAccess.getCollectionAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:912:3: ( rule__Collection__Group_1_0__0 )
                    // InternalMyDsl.g:912:4: rule__Collection__Group_1_0__0
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
                    // InternalMyDsl.g:916:2: ( ( rule__Collection__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:916:2: ( ( rule__Collection__Group_1_1__0 ) )
                    // InternalMyDsl.g:917:3: ( rule__Collection__Group_1_1__0 )
                    {
                     before(grammarAccess.getCollectionAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:918:3: ( rule__Collection__Group_1_1__0 )
                    // InternalMyDsl.g:918:4: rule__Collection__Group_1_1__0
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
    // InternalMyDsl.g:926:1: rule__SubProcedure__ActionsAlternatives_2_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__SubProcedure__ActionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=30 && LA8_0<=32)||LA8_0==34||(LA8_0>=36 && LA8_0<=37)||(LA8_0>=39 && LA8_0<=41)||(LA8_0>=43 && LA8_0<=44)) ) {
                alt8=1;
            }
            else if ( (LA8_0==29||LA8_0==49||LA8_0==52||LA8_0==56||LA8_0==59) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:931:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:931:2: ( ruleAction )
                    // InternalMyDsl.g:932:3: ruleAction
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
                    // InternalMyDsl.g:937:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:937:2: ( ruleStructure )
                    // InternalMyDsl.g:938:3: ruleStructure
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
    // InternalMyDsl.g:947:1: rule__CheckBox__NewValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__CheckBox__NewValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:952:2: ( 'true' )
                    {
                    // InternalMyDsl.g:952:2: ( 'true' )
                    // InternalMyDsl.g:953:3: 'true'
                    {
                     before(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:958:2: ( 'false' )
                    {
                    // InternalMyDsl.g:958:2: ( 'false' )
                    // InternalMyDsl.g:959:3: 'false'
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
    // InternalMyDsl.g:968:1: rule__IsIn__Alternatives_0 : ( ( ( rule__IsIn__ObjAssignment_0_0 ) ) | ( ( rule__IsIn__BodyAssignment_0_1 ) ) );
    public final void rule__IsIn__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__IsIn__ObjAssignment_0_0 ) ) | ( ( rule__IsIn__BodyAssignment_0_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=17)||LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==60) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:973:2: ( ( rule__IsIn__ObjAssignment_0_0 ) )
                    {
                    // InternalMyDsl.g:973:2: ( ( rule__IsIn__ObjAssignment_0_0 ) )
                    // InternalMyDsl.g:974:3: ( rule__IsIn__ObjAssignment_0_0 )
                    {
                     before(grammarAccess.getIsInAccess().getObjAssignment_0_0()); 
                    // InternalMyDsl.g:975:3: ( rule__IsIn__ObjAssignment_0_0 )
                    // InternalMyDsl.g:975:4: rule__IsIn__ObjAssignment_0_0
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
                    // InternalMyDsl.g:979:2: ( ( rule__IsIn__BodyAssignment_0_1 ) )
                    {
                    // InternalMyDsl.g:979:2: ( ( rule__IsIn__BodyAssignment_0_1 ) )
                    // InternalMyDsl.g:980:3: ( rule__IsIn__BodyAssignment_0_1 )
                    {
                     before(grammarAccess.getIsInAccess().getBodyAssignment_0_1()); 
                    // InternalMyDsl.g:981:3: ( rule__IsIn__BodyAssignment_0_1 )
                    // InternalMyDsl.g:981:4: rule__IsIn__BodyAssignment_0_1
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
    // InternalMyDsl.g:989:1: rule__DoAll__TodoAlternatives_7_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__DoAll__TodoAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=30 && LA11_0<=32)||LA11_0==34||(LA11_0>=36 && LA11_0<=37)||(LA11_0>=39 && LA11_0<=41)||(LA11_0>=43 && LA11_0<=44)) ) {
                alt11=1;
            }
            else if ( (LA11_0==29||LA11_0==49||LA11_0==52||LA11_0==56||LA11_0==59) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:994:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:994:2: ( ruleAction )
                    // InternalMyDsl.g:995:3: ruleAction
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
                    // InternalMyDsl.g:1000:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:1000:2: ( ruleStructure )
                    // InternalMyDsl.g:1001:3: ruleStructure
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
    // InternalMyDsl.g:1010:1: rule__Execute__Alternatives : ( ( ( rule__Execute__Group_0__0 ) ) | ( ( rule__Execute__SubprocedureAssignment_1 ) ) );
    public final void rule__Execute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( ( rule__Execute__Group_0__0 ) ) | ( ( rule__Execute__SubprocedureAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1015:2: ( ( rule__Execute__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1015:2: ( ( rule__Execute__Group_0__0 ) )
                    // InternalMyDsl.g:1016:3: ( rule__Execute__Group_0__0 )
                    {
                     before(grammarAccess.getExecuteAccess().getGroup_0()); 
                    // InternalMyDsl.g:1017:3: ( rule__Execute__Group_0__0 )
                    // InternalMyDsl.g:1017:4: rule__Execute__Group_0__0
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
                    // InternalMyDsl.g:1021:2: ( ( rule__Execute__SubprocedureAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1021:2: ( ( rule__Execute__SubprocedureAssignment_1 ) )
                    // InternalMyDsl.g:1022:3: ( rule__Execute__SubprocedureAssignment_1 )
                    {
                     before(grammarAccess.getExecuteAccess().getSubprocedureAssignment_1()); 
                    // InternalMyDsl.g:1023:3: ( rule__Execute__SubprocedureAssignment_1 )
                    // InternalMyDsl.g:1023:4: rule__Execute__SubprocedureAssignment_1
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
    // InternalMyDsl.g:1031:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyDsl.g:1036:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalMyDsl.g:1043:1: rule__Main__Group__0__Impl : ( 'File' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( ( 'File' ) )
            // InternalMyDsl.g:1048:1: ( 'File' )
            {
            // InternalMyDsl.g:1048:1: ( 'File' )
            // InternalMyDsl.g:1049:2: 'File'
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
    // InternalMyDsl.g:1058:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyDsl.g:1063:2: rule__Main__Group__1__Impl rule__Main__Group__2
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
    // InternalMyDsl.g:1070:1: rule__Main__Group__1__Impl : ( ( rule__Main__FileNameAssignment_1 ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( ( rule__Main__FileNameAssignment_1 ) ) )
            // InternalMyDsl.g:1075:1: ( ( rule__Main__FileNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1075:1: ( ( rule__Main__FileNameAssignment_1 ) )
            // InternalMyDsl.g:1076:2: ( rule__Main__FileNameAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getFileNameAssignment_1()); 
            // InternalMyDsl.g:1077:2: ( rule__Main__FileNameAssignment_1 )
            // InternalMyDsl.g:1077:3: rule__Main__FileNameAssignment_1
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
    // InternalMyDsl.g:1085:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyDsl.g:1090:2: rule__Main__Group__2__Impl rule__Main__Group__3
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
    // InternalMyDsl.g:1097:1: rule__Main__Group__2__Impl : ( 'with' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( ( 'with' ) )
            // InternalMyDsl.g:1102:1: ( 'with' )
            {
            // InternalMyDsl.g:1102:1: ( 'with' )
            // InternalMyDsl.g:1103:2: 'with'
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
    // InternalMyDsl.g:1112:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyDsl.g:1117:2: rule__Main__Group__3__Impl rule__Main__Group__4
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
    // InternalMyDsl.g:1124:1: rule__Main__Group__3__Impl : ( 'browser' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( 'browser' ) )
            // InternalMyDsl.g:1129:1: ( 'browser' )
            {
            // InternalMyDsl.g:1129:1: ( 'browser' )
            // InternalMyDsl.g:1130:2: 'browser'
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
    // InternalMyDsl.g:1139:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyDsl.g:1144:2: rule__Main__Group__4__Impl rule__Main__Group__5
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
    // InternalMyDsl.g:1151:1: rule__Main__Group__4__Impl : ( ( rule__Main__BrowserNameAssignment_4 ) ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( ( rule__Main__BrowserNameAssignment_4 ) ) )
            // InternalMyDsl.g:1156:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            {
            // InternalMyDsl.g:1156:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            // InternalMyDsl.g:1157:2: ( rule__Main__BrowserNameAssignment_4 )
            {
             before(grammarAccess.getMainAccess().getBrowserNameAssignment_4()); 
            // InternalMyDsl.g:1158:2: ( rule__Main__BrowserNameAssignment_4 )
            // InternalMyDsl.g:1158:3: rule__Main__BrowserNameAssignment_4
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
    // InternalMyDsl.g:1166:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyDsl.g:1171:2: rule__Main__Group__5__Impl rule__Main__Group__6
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
    // InternalMyDsl.g:1178:1: rule__Main__Group__5__Impl : ( ':' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( ':' ) )
            // InternalMyDsl.g:1183:1: ( ':' )
            {
            // InternalMyDsl.g:1183:1: ( ':' )
            // InternalMyDsl.g:1184:2: ':'
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
    // InternalMyDsl.g:1193:1: rule__Main__Group__6 : rule__Main__Group__6__Impl ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( rule__Main__Group__6__Impl )
            // InternalMyDsl.g:1198:2: rule__Main__Group__6__Impl
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
    // InternalMyDsl.g:1204:1: rule__Main__Group__6__Impl : ( ( rule__Main__OrdersAssignment_6 )* ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( ( rule__Main__OrdersAssignment_6 )* ) )
            // InternalMyDsl.g:1209:1: ( ( rule__Main__OrdersAssignment_6 )* )
            {
            // InternalMyDsl.g:1209:1: ( ( rule__Main__OrdersAssignment_6 )* )
            // InternalMyDsl.g:1210:2: ( rule__Main__OrdersAssignment_6 )*
            {
             before(grammarAccess.getMainAccess().getOrdersAssignment_6()); 
            // InternalMyDsl.g:1211:2: ( rule__Main__OrdersAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=32)||LA13_0==34||(LA13_0>=36 && LA13_0<=37)||(LA13_0>=39 && LA13_0<=41)||(LA13_0>=43 && LA13_0<=44)||LA13_0==49||LA13_0==52||LA13_0==56||LA13_0==59) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1211:3: rule__Main__OrdersAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Main__OrdersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalMyDsl.g:1220:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalMyDsl.g:1225:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
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
    // InternalMyDsl.g:1232:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__HtmltypeAssignment_2_0 ) ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( ( ( rule__Object__HtmltypeAssignment_2_0 ) ) )
            // InternalMyDsl.g:1237:1: ( ( rule__Object__HtmltypeAssignment_2_0 ) )
            {
            // InternalMyDsl.g:1237:1: ( ( rule__Object__HtmltypeAssignment_2_0 ) )
            // InternalMyDsl.g:1238:2: ( rule__Object__HtmltypeAssignment_2_0 )
            {
             before(grammarAccess.getObjectAccess().getHtmltypeAssignment_2_0()); 
            // InternalMyDsl.g:1239:2: ( rule__Object__HtmltypeAssignment_2_0 )
            // InternalMyDsl.g:1239:3: rule__Object__HtmltypeAssignment_2_0
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
    // InternalMyDsl.g:1247:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( rule__Object__Group_2__1__Impl )
            // InternalMyDsl.g:1252:2: rule__Object__Group_2__1__Impl
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
    // InternalMyDsl.g:1258:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__ObjectDefAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ( rule__Object__ObjectDefAssignment_2_1 ) ) )
            // InternalMyDsl.g:1263:1: ( ( rule__Object__ObjectDefAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1263:1: ( ( rule__Object__ObjectDefAssignment_2_1 ) )
            // InternalMyDsl.g:1264:2: ( rule__Object__ObjectDefAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getObjectDefAssignment_2_1()); 
            // InternalMyDsl.g:1265:2: ( rule__Object__ObjectDefAssignment_2_1 )
            // InternalMyDsl.g:1265:3: rule__Object__ObjectDefAssignment_2_1
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
    // InternalMyDsl.g:1274:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalMyDsl.g:1279:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1286:1: rule__Collection__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:1291:1: ( 'Collection' )
            {
            // InternalMyDsl.g:1291:1: ( 'Collection' )
            // InternalMyDsl.g:1292:2: 'Collection'
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
    // InternalMyDsl.g:1301:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( rule__Collection__Group__1__Impl )
            // InternalMyDsl.g:1306:2: rule__Collection__Group__1__Impl
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
    // InternalMyDsl.g:1312:1: rule__Collection__Group__1__Impl : ( ( rule__Collection__Alternatives_1 ) ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( ( ( rule__Collection__Alternatives_1 ) ) )
            // InternalMyDsl.g:1317:1: ( ( rule__Collection__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1317:1: ( ( rule__Collection__Alternatives_1 ) )
            // InternalMyDsl.g:1318:2: ( rule__Collection__Alternatives_1 )
            {
             before(grammarAccess.getCollectionAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1319:2: ( rule__Collection__Alternatives_1 )
            // InternalMyDsl.g:1319:3: rule__Collection__Alternatives_1
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
    // InternalMyDsl.g:1328:1: rule__Collection__Group_1_0__0 : rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1 ;
    public final void rule__Collection__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1 )
            // InternalMyDsl.g:1333:2: rule__Collection__Group_1_0__0__Impl rule__Collection__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1340:1: rule__Collection__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__Collection__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( ( '{' ) )
            // InternalMyDsl.g:1345:1: ( '{' )
            {
            // InternalMyDsl.g:1345:1: ( '{' )
            // InternalMyDsl.g:1346:2: '{'
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
    // InternalMyDsl.g:1355:1: rule__Collection__Group_1_0__1 : rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2 ;
    public final void rule__Collection__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2 )
            // InternalMyDsl.g:1360:2: rule__Collection__Group_1_0__1__Impl rule__Collection__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1367:1: rule__Collection__Group_1_0__1__Impl : ( ( rule__Collection__ObjAssignment_1_0_1 )* ) ;
    public final void rule__Collection__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( ( ( rule__Collection__ObjAssignment_1_0_1 )* ) )
            // InternalMyDsl.g:1372:1: ( ( rule__Collection__ObjAssignment_1_0_1 )* )
            {
            // InternalMyDsl.g:1372:1: ( ( rule__Collection__ObjAssignment_1_0_1 )* )
            // InternalMyDsl.g:1373:2: ( rule__Collection__ObjAssignment_1_0_1 )*
            {
             before(grammarAccess.getCollectionAccess().getObjAssignment_1_0_1()); 
            // InternalMyDsl.g:1374:2: ( rule__Collection__ObjAssignment_1_0_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=11 && LA14_0<=17)||LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1374:3: rule__Collection__ObjAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Collection__ObjAssignment_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1382:1: rule__Collection__Group_1_0__2 : rule__Collection__Group_1_0__2__Impl ;
    public final void rule__Collection__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( rule__Collection__Group_1_0__2__Impl )
            // InternalMyDsl.g:1387:2: rule__Collection__Group_1_0__2__Impl
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
    // InternalMyDsl.g:1393:1: rule__Collection__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__Collection__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( ( '}' ) )
            // InternalMyDsl.g:1398:1: ( '}' )
            {
            // InternalMyDsl.g:1398:1: ( '}' )
            // InternalMyDsl.g:1399:2: '}'
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
    // InternalMyDsl.g:1409:1: rule__Collection__Group_1_1__0 : rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1 ;
    public final void rule__Collection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1 )
            // InternalMyDsl.g:1414:2: rule__Collection__Group_1_1__0__Impl rule__Collection__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1421:1: rule__Collection__Group_1_1__0__Impl : ( 'of' ) ;
    public final void rule__Collection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( 'of' ) )
            // InternalMyDsl.g:1426:1: ( 'of' )
            {
            // InternalMyDsl.g:1426:1: ( 'of' )
            // InternalMyDsl.g:1427:2: 'of'
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
    // InternalMyDsl.g:1436:1: rule__Collection__Group_1_1__1 : rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2 ;
    public final void rule__Collection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2 )
            // InternalMyDsl.g:1441:2: rule__Collection__Group_1_1__1__Impl rule__Collection__Group_1_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1448:1: rule__Collection__Group_1_1__1__Impl : ( 'all' ) ;
    public final void rule__Collection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( ( 'all' ) )
            // InternalMyDsl.g:1453:1: ( 'all' )
            {
            // InternalMyDsl.g:1453:1: ( 'all' )
            // InternalMyDsl.g:1454:2: 'all'
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
    // InternalMyDsl.g:1463:1: rule__Collection__Group_1_1__2 : rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3 ;
    public final void rule__Collection__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3 )
            // InternalMyDsl.g:1468:2: rule__Collection__Group_1_1__2__Impl rule__Collection__Group_1_1__3
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
    // InternalMyDsl.g:1475:1: rule__Collection__Group_1_1__2__Impl : ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) ) ;
    public final void rule__Collection__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1480:1: ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1480:1: ( ( rule__Collection__HtmltypeAssignment_1_1_2 ) )
            // InternalMyDsl.g:1481:2: ( rule__Collection__HtmltypeAssignment_1_1_2 )
            {
             before(grammarAccess.getCollectionAccess().getHtmltypeAssignment_1_1_2()); 
            // InternalMyDsl.g:1482:2: ( rule__Collection__HtmltypeAssignment_1_1_2 )
            // InternalMyDsl.g:1482:3: rule__Collection__HtmltypeAssignment_1_1_2
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
    // InternalMyDsl.g:1490:1: rule__Collection__Group_1_1__3 : rule__Collection__Group_1_1__3__Impl ;
    public final void rule__Collection__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__Collection__Group_1_1__3__Impl )
            // InternalMyDsl.g:1495:2: rule__Collection__Group_1_1__3__Impl
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
    // InternalMyDsl.g:1501:1: rule__Collection__Group_1_1__3__Impl : ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) ) ;
    public final void rule__Collection__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) ) )
            // InternalMyDsl.g:1506:1: ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) )
            {
            // InternalMyDsl.g:1506:1: ( ( rule__Collection__ObjectRuleAssignment_1_1_3 ) )
            // InternalMyDsl.g:1507:2: ( rule__Collection__ObjectRuleAssignment_1_1_3 )
            {
             before(grammarAccess.getCollectionAccess().getObjectRuleAssignment_1_1_3()); 
            // InternalMyDsl.g:1508:2: ( rule__Collection__ObjectRuleAssignment_1_1_3 )
            // InternalMyDsl.g:1508:3: rule__Collection__ObjectRuleAssignment_1_1_3
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
    // InternalMyDsl.g:1517:1: rule__SubProcedure__Group__0 : rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1 ;
    public final void rule__SubProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1 )
            // InternalMyDsl.g:1522:2: rule__SubProcedure__Group__0__Impl rule__SubProcedure__Group__1
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
    // InternalMyDsl.g:1529:1: rule__SubProcedure__Group__0__Impl : ( 'Subprocedure' ) ;
    public final void rule__SubProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( 'Subprocedure' ) )
            // InternalMyDsl.g:1534:1: ( 'Subprocedure' )
            {
            // InternalMyDsl.g:1534:1: ( 'Subprocedure' )
            // InternalMyDsl.g:1535:2: 'Subprocedure'
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
    // InternalMyDsl.g:1544:1: rule__SubProcedure__Group__1 : rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2 ;
    public final void rule__SubProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2 )
            // InternalMyDsl.g:1549:2: rule__SubProcedure__Group__1__Impl rule__SubProcedure__Group__2
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
    // InternalMyDsl.g:1556:1: rule__SubProcedure__Group__1__Impl : ( '{' ) ;
    public final void rule__SubProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( '{' ) )
            // InternalMyDsl.g:1561:1: ( '{' )
            {
            // InternalMyDsl.g:1561:1: ( '{' )
            // InternalMyDsl.g:1562:2: '{'
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
    // InternalMyDsl.g:1571:1: rule__SubProcedure__Group__2 : rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3 ;
    public final void rule__SubProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3 )
            // InternalMyDsl.g:1576:2: rule__SubProcedure__Group__2__Impl rule__SubProcedure__Group__3
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
    // InternalMyDsl.g:1583:1: rule__SubProcedure__Group__2__Impl : ( ( rule__SubProcedure__ActionsAssignment_2 )* ) ;
    public final void rule__SubProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( ( ( rule__SubProcedure__ActionsAssignment_2 )* ) )
            // InternalMyDsl.g:1588:1: ( ( rule__SubProcedure__ActionsAssignment_2 )* )
            {
            // InternalMyDsl.g:1588:1: ( ( rule__SubProcedure__ActionsAssignment_2 )* )
            // InternalMyDsl.g:1589:2: ( rule__SubProcedure__ActionsAssignment_2 )*
            {
             before(grammarAccess.getSubProcedureAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:1590:2: ( rule__SubProcedure__ActionsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=32)||LA15_0==34||(LA15_0>=36 && LA15_0<=37)||(LA15_0>=39 && LA15_0<=41)||(LA15_0>=43 && LA15_0<=44)||LA15_0==49||LA15_0==52||LA15_0==56||LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1590:3: rule__SubProcedure__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubProcedure__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1598:1: rule__SubProcedure__Group__3 : rule__SubProcedure__Group__3__Impl ;
    public final void rule__SubProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__SubProcedure__Group__3__Impl )
            // InternalMyDsl.g:1603:2: rule__SubProcedure__Group__3__Impl
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
    // InternalMyDsl.g:1609:1: rule__SubProcedure__Group__3__Impl : ( '}' ) ;
    public final void rule__SubProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( ( '}' ) )
            // InternalMyDsl.g:1614:1: ( '}' )
            {
            // InternalMyDsl.g:1614:1: ( '}' )
            // InternalMyDsl.g:1615:2: '}'
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
    // InternalMyDsl.g:1625:1: rule__Refresh__Group__0 : rule__Refresh__Group__0__Impl rule__Refresh__Group__1 ;
    public final void rule__Refresh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__Refresh__Group__0__Impl rule__Refresh__Group__1 )
            // InternalMyDsl.g:1630:2: rule__Refresh__Group__0__Impl rule__Refresh__Group__1
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
    // InternalMyDsl.g:1637:1: rule__Refresh__Group__0__Impl : ( () ) ;
    public final void rule__Refresh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( () ) )
            // InternalMyDsl.g:1642:1: ( () )
            {
            // InternalMyDsl.g:1642:1: ( () )
            // InternalMyDsl.g:1643:2: ()
            {
             before(grammarAccess.getRefreshAccess().getRefreshAction_0()); 
            // InternalMyDsl.g:1644:2: ()
            // InternalMyDsl.g:1644:3: 
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
    // InternalMyDsl.g:1652:1: rule__Refresh__Group__1 : rule__Refresh__Group__1__Impl ;
    public final void rule__Refresh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__Refresh__Group__1__Impl )
            // InternalMyDsl.g:1657:2: rule__Refresh__Group__1__Impl
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
    // InternalMyDsl.g:1663:1: rule__Refresh__Group__1__Impl : ( 'Refresh' ) ;
    public final void rule__Refresh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( ( 'Refresh' ) )
            // InternalMyDsl.g:1668:1: ( 'Refresh' )
            {
            // InternalMyDsl.g:1668:1: ( 'Refresh' )
            // InternalMyDsl.g:1669:2: 'Refresh'
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
    // InternalMyDsl.g:1679:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalMyDsl.g:1684:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
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
    // InternalMyDsl.g:1691:1: rule__Navigate__Group__0__Impl : ( 'Navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( 'Navigate' ) )
            // InternalMyDsl.g:1696:1: ( 'Navigate' )
            {
            // InternalMyDsl.g:1696:1: ( 'Navigate' )
            // InternalMyDsl.g:1697:2: 'Navigate'
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
    // InternalMyDsl.g:1706:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__Navigate__Group__1__Impl )
            // InternalMyDsl.g:1711:2: rule__Navigate__Group__1__Impl
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
    // InternalMyDsl.g:1717:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1722:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1722:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalMyDsl.g:1723:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1724:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalMyDsl.g:1724:3: rule__Navigate__UrlAssignment_1
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
    // InternalMyDsl.g:1733:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyDsl.g:1738:2: rule__Store__Group__0__Impl rule__Store__Group__1
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
    // InternalMyDsl.g:1745:1: rule__Store__Group__0__Impl : ( 'var' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( ( 'var' ) )
            // InternalMyDsl.g:1750:1: ( 'var' )
            {
            // InternalMyDsl.g:1750:1: ( 'var' )
            // InternalMyDsl.g:1751:2: 'var'
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
    // InternalMyDsl.g:1760:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyDsl.g:1765:2: rule__Store__Group__1__Impl rule__Store__Group__2
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
    // InternalMyDsl.g:1772:1: rule__Store__Group__1__Impl : ( ( rule__Store__ObjNameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( ( rule__Store__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:1777:1: ( ( rule__Store__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1777:1: ( ( rule__Store__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:1778:2: ( rule__Store__ObjNameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:1779:2: ( rule__Store__ObjNameAssignment_1 )
            // InternalMyDsl.g:1779:3: rule__Store__ObjNameAssignment_1
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
    // InternalMyDsl.g:1787:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyDsl.g:1792:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1799:1: rule__Store__Group__2__Impl : ( '=' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( '=' ) )
            // InternalMyDsl.g:1804:1: ( '=' )
            {
            // InternalMyDsl.g:1804:1: ( '=' )
            // InternalMyDsl.g:1805:2: '='
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
    // InternalMyDsl.g:1814:1: rule__Store__Group__3 : rule__Store__Group__3__Impl ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( rule__Store__Group__3__Impl )
            // InternalMyDsl.g:1819:2: rule__Store__Group__3__Impl
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
    // InternalMyDsl.g:1825:1: rule__Store__Group__3__Impl : ( ( rule__Store__ObjAssignment_3 ) ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1829:1: ( ( ( rule__Store__ObjAssignment_3 ) ) )
            // InternalMyDsl.g:1830:1: ( ( rule__Store__ObjAssignment_3 ) )
            {
            // InternalMyDsl.g:1830:1: ( ( rule__Store__ObjAssignment_3 ) )
            // InternalMyDsl.g:1831:2: ( rule__Store__ObjAssignment_3 )
            {
             before(grammarAccess.getStoreAccess().getObjAssignment_3()); 
            // InternalMyDsl.g:1832:2: ( rule__Store__ObjAssignment_3 )
            // InternalMyDsl.g:1832:3: rule__Store__ObjAssignment_3
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
    // InternalMyDsl.g:1841:1: rule__ReDefine__Group__0 : rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1 ;
    public final void rule__ReDefine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1 )
            // InternalMyDsl.g:1846:2: rule__ReDefine__Group__0__Impl rule__ReDefine__Group__1
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
    // InternalMyDsl.g:1853:1: rule__ReDefine__Group__0__Impl : ( 'Redefine' ) ;
    public final void rule__ReDefine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( 'Redefine' ) )
            // InternalMyDsl.g:1858:1: ( 'Redefine' )
            {
            // InternalMyDsl.g:1858:1: ( 'Redefine' )
            // InternalMyDsl.g:1859:2: 'Redefine'
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
    // InternalMyDsl.g:1868:1: rule__ReDefine__Group__1 : rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2 ;
    public final void rule__ReDefine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2 )
            // InternalMyDsl.g:1873:2: rule__ReDefine__Group__1__Impl rule__ReDefine__Group__2
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
    // InternalMyDsl.g:1880:1: rule__ReDefine__Group__1__Impl : ( ( rule__ReDefine__ObjNameAssignment_1 ) ) ;
    public final void rule__ReDefine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( ( ( rule__ReDefine__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:1885:1: ( ( rule__ReDefine__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1885:1: ( ( rule__ReDefine__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:1886:2: ( rule__ReDefine__ObjNameAssignment_1 )
            {
             before(grammarAccess.getReDefineAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:1887:2: ( rule__ReDefine__ObjNameAssignment_1 )
            // InternalMyDsl.g:1887:3: rule__ReDefine__ObjNameAssignment_1
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
    // InternalMyDsl.g:1895:1: rule__ReDefine__Group__2 : rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3 ;
    public final void rule__ReDefine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3 )
            // InternalMyDsl.g:1900:2: rule__ReDefine__Group__2__Impl rule__ReDefine__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1907:1: rule__ReDefine__Group__2__Impl : ( 'as' ) ;
    public final void rule__ReDefine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( 'as' ) )
            // InternalMyDsl.g:1912:1: ( 'as' )
            {
            // InternalMyDsl.g:1912:1: ( 'as' )
            // InternalMyDsl.g:1913:2: 'as'
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
    // InternalMyDsl.g:1922:1: rule__ReDefine__Group__3 : rule__ReDefine__Group__3__Impl ;
    public final void rule__ReDefine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( rule__ReDefine__Group__3__Impl )
            // InternalMyDsl.g:1927:2: rule__ReDefine__Group__3__Impl
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
    // InternalMyDsl.g:1933:1: rule__ReDefine__Group__3__Impl : ( ( rule__ReDefine__ObjAssignment_3 ) ) ;
    public final void rule__ReDefine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( ( ( rule__ReDefine__ObjAssignment_3 ) ) )
            // InternalMyDsl.g:1938:1: ( ( rule__ReDefine__ObjAssignment_3 ) )
            {
            // InternalMyDsl.g:1938:1: ( ( rule__ReDefine__ObjAssignment_3 ) )
            // InternalMyDsl.g:1939:2: ( rule__ReDefine__ObjAssignment_3 )
            {
             before(grammarAccess.getReDefineAccess().getObjAssignment_3()); 
            // InternalMyDsl.g:1940:2: ( rule__ReDefine__ObjAssignment_3 )
            // InternalMyDsl.g:1940:3: rule__ReDefine__ObjAssignment_3
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
    // InternalMyDsl.g:1949:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMyDsl.g:1954:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
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
    // InternalMyDsl.g:1961:1: rule__Delete__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( 'Delete' ) )
            // InternalMyDsl.g:1966:1: ( 'Delete' )
            {
            // InternalMyDsl.g:1966:1: ( 'Delete' )
            // InternalMyDsl.g:1967:2: 'Delete'
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
    // InternalMyDsl.g:1976:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( rule__Delete__Group__1__Impl )
            // InternalMyDsl.g:1981:2: rule__Delete__Group__1__Impl
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
    // InternalMyDsl.g:1987:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__ObjNameAssignment_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( ( ( rule__Delete__ObjNameAssignment_1 ) ) )
            // InternalMyDsl.g:1992:1: ( ( rule__Delete__ObjNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1992:1: ( ( rule__Delete__ObjNameAssignment_1 ) )
            // InternalMyDsl.g:1993:2: ( rule__Delete__ObjNameAssignment_1 )
            {
             before(grammarAccess.getDeleteAccess().getObjNameAssignment_1()); 
            // InternalMyDsl.g:1994:2: ( rule__Delete__ObjNameAssignment_1 )
            // InternalMyDsl.g:1994:3: rule__Delete__ObjNameAssignment_1
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
    // InternalMyDsl.g:2003:1: rule__ActionSelect__Group__0 : rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 ;
    public final void rule__ActionSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 )
            // InternalMyDsl.g:2008:2: rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1
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
    // InternalMyDsl.g:2015:1: rule__ActionSelect__Group__0__Impl : ( 'Select' ) ;
    public final void rule__ActionSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( 'Select' ) )
            // InternalMyDsl.g:2020:1: ( 'Select' )
            {
            // InternalMyDsl.g:2020:1: ( 'Select' )
            // InternalMyDsl.g:2021:2: 'Select'
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
    // InternalMyDsl.g:2030:1: rule__ActionSelect__Group__1 : rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 ;
    public final void rule__ActionSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 )
            // InternalMyDsl.g:2035:2: rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2
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
    // InternalMyDsl.g:2042:1: rule__ActionSelect__Group__1__Impl : ( ( rule__ActionSelect__OptionAssignment_1 ) ) ;
    public final void rule__ActionSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( ( rule__ActionSelect__OptionAssignment_1 ) ) )
            // InternalMyDsl.g:2047:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            {
            // InternalMyDsl.g:2047:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            // InternalMyDsl.g:2048:2: ( rule__ActionSelect__OptionAssignment_1 )
            {
             before(grammarAccess.getActionSelectAccess().getOptionAssignment_1()); 
            // InternalMyDsl.g:2049:2: ( rule__ActionSelect__OptionAssignment_1 )
            // InternalMyDsl.g:2049:3: rule__ActionSelect__OptionAssignment_1
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
    // InternalMyDsl.g:2057:1: rule__ActionSelect__Group__2 : rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 ;
    public final void rule__ActionSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 )
            // InternalMyDsl.g:2062:2: rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3
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
    // InternalMyDsl.g:2069:1: rule__ActionSelect__Group__2__Impl : ( 'from' ) ;
    public final void rule__ActionSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( 'from' ) )
            // InternalMyDsl.g:2074:1: ( 'from' )
            {
            // InternalMyDsl.g:2074:1: ( 'from' )
            // InternalMyDsl.g:2075:2: 'from'
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
    // InternalMyDsl.g:2084:1: rule__ActionSelect__Group__3 : rule__ActionSelect__Group__3__Impl ;
    public final void rule__ActionSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( rule__ActionSelect__Group__3__Impl )
            // InternalMyDsl.g:2089:2: rule__ActionSelect__Group__3__Impl
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
    // InternalMyDsl.g:2095:1: rule__ActionSelect__Group__3__Impl : ( ( rule__ActionSelect__XpathAssignment_3 ) ) ;
    public final void rule__ActionSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( ( ( rule__ActionSelect__XpathAssignment_3 ) ) )
            // InternalMyDsl.g:2100:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            {
            // InternalMyDsl.g:2100:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            // InternalMyDsl.g:2101:2: ( rule__ActionSelect__XpathAssignment_3 )
            {
             before(grammarAccess.getActionSelectAccess().getXpathAssignment_3()); 
            // InternalMyDsl.g:2102:2: ( rule__ActionSelect__XpathAssignment_3 )
            // InternalMyDsl.g:2102:3: rule__ActionSelect__XpathAssignment_3
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
    // InternalMyDsl.g:2111:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:2116:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2123:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( 'Click' ) )
            // InternalMyDsl.g:2128:1: ( 'Click' )
            {
            // InternalMyDsl.g:2128:1: ( 'Click' )
            // InternalMyDsl.g:2129:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalMyDsl.g:2138:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( rule__Click__Group__1__Impl )
            // InternalMyDsl.g:2143:2: rule__Click__Group__1__Impl
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
    // InternalMyDsl.g:2149:1: rule__Click__Group__1__Impl : ( ( rule__Click__ObjectAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( ( ( rule__Click__ObjectAssignment_1 ) ) )
            // InternalMyDsl.g:2154:1: ( ( rule__Click__ObjectAssignment_1 ) )
            {
            // InternalMyDsl.g:2154:1: ( ( rule__Click__ObjectAssignment_1 ) )
            // InternalMyDsl.g:2155:2: ( rule__Click__ObjectAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getObjectAssignment_1()); 
            // InternalMyDsl.g:2156:2: ( rule__Click__ObjectAssignment_1 )
            // InternalMyDsl.g:2156:3: rule__Click__ObjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__ObjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getObjectAssignment_1()); 

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
    // InternalMyDsl.g:2165:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalMyDsl.g:2170:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
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
    // InternalMyDsl.g:2177:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( 'Fill' ) )
            // InternalMyDsl.g:2182:1: ( 'Fill' )
            {
            // InternalMyDsl.g:2182:1: ( 'Fill' )
            // InternalMyDsl.g:2183:2: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

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
    // InternalMyDsl.g:2192:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalMyDsl.g:2197:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2204:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__NametagAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( ( ( rule__Fill__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:2209:1: ( ( rule__Fill__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:2209:1: ( ( rule__Fill__NametagAssignment_1 ) )
            // InternalMyDsl.g:2210:2: ( rule__Fill__NametagAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:2211:2: ( rule__Fill__NametagAssignment_1 )
            // InternalMyDsl.g:2211:3: rule__Fill__NametagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__NametagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getNametagAssignment_1()); 

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
    // InternalMyDsl.g:2219:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // InternalMyDsl.g:2224:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__3();

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
    // InternalMyDsl.g:2231:1: rule__Fill__Group__2__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( 'with' ) )
            // InternalMyDsl.g:2236:1: ( 'with' )
            {
            // InternalMyDsl.g:2236:1: ( 'with' )
            // InternalMyDsl.g:2237:2: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getWithKeyword_2()); 

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


    // $ANTLR start "rule__Fill__Group__3"
    // InternalMyDsl.g:2246:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( rule__Fill__Group__3__Impl )
            // InternalMyDsl.g:2251:2: rule__Fill__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__3__Impl();

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
    // $ANTLR end "rule__Fill__Group__3"


    // $ANTLR start "rule__Fill__Group__3__Impl"
    // InternalMyDsl.g:2257:1: rule__Fill__Group__3__Impl : ( ( rule__Fill__ContentAssignment_3 ) ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2261:1: ( ( ( rule__Fill__ContentAssignment_3 ) ) )
            // InternalMyDsl.g:2262:1: ( ( rule__Fill__ContentAssignment_3 ) )
            {
            // InternalMyDsl.g:2262:1: ( ( rule__Fill__ContentAssignment_3 ) )
            // InternalMyDsl.g:2263:2: ( rule__Fill__ContentAssignment_3 )
            {
             before(grammarAccess.getFillAccess().getContentAssignment_3()); 
            // InternalMyDsl.g:2264:2: ( rule__Fill__ContentAssignment_3 )
            // InternalMyDsl.g:2264:3: rule__Fill__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getContentAssignment_3()); 

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
    // $ANTLR end "rule__Fill__Group__3__Impl"


    // $ANTLR start "rule__CheckBox__Group__0"
    // InternalMyDsl.g:2273:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // InternalMyDsl.g:2278:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
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
    // InternalMyDsl.g:2285:1: rule__CheckBox__Group__0__Impl : ( 'CheckBox' ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2289:1: ( ( 'CheckBox' ) )
            // InternalMyDsl.g:2290:1: ( 'CheckBox' )
            {
            // InternalMyDsl.g:2290:1: ( 'CheckBox' )
            // InternalMyDsl.g:2291:2: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2300:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2304:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // InternalMyDsl.g:2305:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2312:1: rule__CheckBox__Group__1__Impl : ( ( rule__CheckBox__NametagAssignment_1 ) ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( ( ( rule__CheckBox__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:2317:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:2317:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            // InternalMyDsl.g:2318:2: ( rule__CheckBox__NametagAssignment_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:2319:2: ( rule__CheckBox__NametagAssignment_1 )
            // InternalMyDsl.g:2319:3: rule__CheckBox__NametagAssignment_1
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
    // InternalMyDsl.g:2327:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( rule__CheckBox__Group__2__Impl )
            // InternalMyDsl.g:2332:2: rule__CheckBox__Group__2__Impl
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
    // InternalMyDsl.g:2338:1: rule__CheckBox__Group__2__Impl : ( ( rule__CheckBox__Group_2__0 )? ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2342:1: ( ( ( rule__CheckBox__Group_2__0 )? ) )
            // InternalMyDsl.g:2343:1: ( ( rule__CheckBox__Group_2__0 )? )
            {
            // InternalMyDsl.g:2343:1: ( ( rule__CheckBox__Group_2__0 )? )
            // InternalMyDsl.g:2344:2: ( rule__CheckBox__Group_2__0 )?
            {
             before(grammarAccess.getCheckBoxAccess().getGroup_2()); 
            // InternalMyDsl.g:2345:2: ( rule__CheckBox__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2345:3: rule__CheckBox__Group_2__0
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
    // InternalMyDsl.g:2354:1: rule__CheckBox__Group_2__0 : rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 ;
    public final void rule__CheckBox__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 )
            // InternalMyDsl.g:2359:2: rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2366:1: rule__CheckBox__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__CheckBox__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( 'to' ) )
            // InternalMyDsl.g:2371:1: ( 'to' )
            {
            // InternalMyDsl.g:2371:1: ( 'to' )
            // InternalMyDsl.g:2372:2: 'to'
            {
             before(grammarAccess.getCheckBoxAccess().getToKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2381:1: rule__CheckBox__Group_2__1 : rule__CheckBox__Group_2__1__Impl ;
    public final void rule__CheckBox__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( rule__CheckBox__Group_2__1__Impl )
            // InternalMyDsl.g:2386:2: rule__CheckBox__Group_2__1__Impl
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
    // InternalMyDsl.g:2392:1: rule__CheckBox__Group_2__1__Impl : ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) ;
    public final void rule__CheckBox__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:2397:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2397:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            // InternalMyDsl.g:2398:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAssignment_2_1()); 
            // InternalMyDsl.g:2399:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            // InternalMyDsl.g:2399:3: rule__CheckBox__NewValueAssignment_2_1
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
    // InternalMyDsl.g:2408:1: rule__Rickroll__Group__0 : rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 ;
    public final void rule__Rickroll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 )
            // InternalMyDsl.g:2413:2: rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2420:1: rule__Rickroll__Group__0__Impl : ( () ) ;
    public final void rule__Rickroll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2424:1: ( ( () ) )
            // InternalMyDsl.g:2425:1: ( () )
            {
            // InternalMyDsl.g:2425:1: ( () )
            // InternalMyDsl.g:2426:2: ()
            {
             before(grammarAccess.getRickrollAccess().getRickrollAction_0()); 
            // InternalMyDsl.g:2427:2: ()
            // InternalMyDsl.g:2427:3: 
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
    // InternalMyDsl.g:2435:1: rule__Rickroll__Group__1 : rule__Rickroll__Group__1__Impl ;
    public final void rule__Rickroll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( rule__Rickroll__Group__1__Impl )
            // InternalMyDsl.g:2440:2: rule__Rickroll__Group__1__Impl
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
    // InternalMyDsl.g:2446:1: rule__Rickroll__Group__1__Impl : ( 'RickRoll' ) ;
    public final void rule__Rickroll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( ( 'RickRoll' ) )
            // InternalMyDsl.g:2451:1: ( 'RickRoll' )
            {
            // InternalMyDsl.g:2451:1: ( 'RickRoll' )
            // InternalMyDsl.g:2452:2: 'RickRoll'
            {
             before(grammarAccess.getRickrollAccess().getRickRollKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2462:1: rule__DoWait__Group__0 : rule__DoWait__Group__0__Impl rule__DoWait__Group__1 ;
    public final void rule__DoWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( rule__DoWait__Group__0__Impl rule__DoWait__Group__1 )
            // InternalMyDsl.g:2467:2: rule__DoWait__Group__0__Impl rule__DoWait__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2474:1: rule__DoWait__Group__0__Impl : ( 'Wait' ) ;
    public final void rule__DoWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( 'Wait' ) )
            // InternalMyDsl.g:2479:1: ( 'Wait' )
            {
            // InternalMyDsl.g:2479:1: ( 'Wait' )
            // InternalMyDsl.g:2480:2: 'Wait'
            {
             before(grammarAccess.getDoWaitAccess().getWaitKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:2489:1: rule__DoWait__Group__1 : rule__DoWait__Group__1__Impl rule__DoWait__Group__2 ;
    public final void rule__DoWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( rule__DoWait__Group__1__Impl rule__DoWait__Group__2 )
            // InternalMyDsl.g:2494:2: rule__DoWait__Group__1__Impl rule__DoWait__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2501:1: rule__DoWait__Group__1__Impl : ( 'for' ) ;
    public final void rule__DoWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( ( 'for' ) )
            // InternalMyDsl.g:2506:1: ( 'for' )
            {
            // InternalMyDsl.g:2506:1: ( 'for' )
            // InternalMyDsl.g:2507:2: 'for'
            {
             before(grammarAccess.getDoWaitAccess().getForKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:2516:1: rule__DoWait__Group__2 : rule__DoWait__Group__2__Impl rule__DoWait__Group__3 ;
    public final void rule__DoWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( rule__DoWait__Group__2__Impl rule__DoWait__Group__3 )
            // InternalMyDsl.g:2521:2: rule__DoWait__Group__2__Impl rule__DoWait__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2528:1: rule__DoWait__Group__2__Impl : ( ( rule__DoWait__MillisecAssignment_2 ) ) ;
    public final void rule__DoWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( ( ( rule__DoWait__MillisecAssignment_2 ) ) )
            // InternalMyDsl.g:2533:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            {
            // InternalMyDsl.g:2533:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            // InternalMyDsl.g:2534:2: ( rule__DoWait__MillisecAssignment_2 )
            {
             before(grammarAccess.getDoWaitAccess().getMillisecAssignment_2()); 
            // InternalMyDsl.g:2535:2: ( rule__DoWait__MillisecAssignment_2 )
            // InternalMyDsl.g:2535:3: rule__DoWait__MillisecAssignment_2
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
    // InternalMyDsl.g:2543:1: rule__DoWait__Group__3 : rule__DoWait__Group__3__Impl ;
    public final void rule__DoWait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( rule__DoWait__Group__3__Impl )
            // InternalMyDsl.g:2548:2: rule__DoWait__Group__3__Impl
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
    // InternalMyDsl.g:2554:1: rule__DoWait__Group__3__Impl : ( 'milliseconds' ) ;
    public final void rule__DoWait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( ( 'milliseconds' ) )
            // InternalMyDsl.g:2559:1: ( 'milliseconds' )
            {
            // InternalMyDsl.g:2559:1: ( 'milliseconds' )
            // InternalMyDsl.g:2560:2: 'milliseconds'
            {
             before(grammarAccess.getDoWaitAccess().getMillisecondsKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2570:1: rule__IsIn__Group__0 : rule__IsIn__Group__0__Impl rule__IsIn__Group__1 ;
    public final void rule__IsIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( rule__IsIn__Group__0__Impl rule__IsIn__Group__1 )
            // InternalMyDsl.g:2575:2: rule__IsIn__Group__0__Impl rule__IsIn__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2582:1: rule__IsIn__Group__0__Impl : ( ( rule__IsIn__Alternatives_0 ) ) ;
    public final void rule__IsIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( ( rule__IsIn__Alternatives_0 ) ) )
            // InternalMyDsl.g:2587:1: ( ( rule__IsIn__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2587:1: ( ( rule__IsIn__Alternatives_0 ) )
            // InternalMyDsl.g:2588:2: ( rule__IsIn__Alternatives_0 )
            {
             before(grammarAccess.getIsInAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2589:2: ( rule__IsIn__Alternatives_0 )
            // InternalMyDsl.g:2589:3: rule__IsIn__Alternatives_0
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
    // InternalMyDsl.g:2597:1: rule__IsIn__Group__1 : rule__IsIn__Group__1__Impl rule__IsIn__Group__2 ;
    public final void rule__IsIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( rule__IsIn__Group__1__Impl rule__IsIn__Group__2 )
            // InternalMyDsl.g:2602:2: rule__IsIn__Group__1__Impl rule__IsIn__Group__2
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
    // InternalMyDsl.g:2609:1: rule__IsIn__Group__1__Impl : ( 'contains' ) ;
    public final void rule__IsIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2613:1: ( ( 'contains' ) )
            // InternalMyDsl.g:2614:1: ( 'contains' )
            {
            // InternalMyDsl.g:2614:1: ( 'contains' )
            // InternalMyDsl.g:2615:2: 'contains'
            {
             before(grammarAccess.getIsInAccess().getContainsKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2624:1: rule__IsIn__Group__2 : rule__IsIn__Group__2__Impl ;
    public final void rule__IsIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( rule__IsIn__Group__2__Impl )
            // InternalMyDsl.g:2629:2: rule__IsIn__Group__2__Impl
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
    // InternalMyDsl.g:2635:1: rule__IsIn__Group__2__Impl : ( ( rule__IsIn__TextAssignment_2 ) ) ;
    public final void rule__IsIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2639:1: ( ( ( rule__IsIn__TextAssignment_2 ) ) )
            // InternalMyDsl.g:2640:1: ( ( rule__IsIn__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:2640:1: ( ( rule__IsIn__TextAssignment_2 ) )
            // InternalMyDsl.g:2641:2: ( rule__IsIn__TextAssignment_2 )
            {
             before(grammarAccess.getIsInAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:2642:2: ( rule__IsIn__TextAssignment_2 )
            // InternalMyDsl.g:2642:3: rule__IsIn__TextAssignment_2
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
    // InternalMyDsl.g:2651:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMyDsl.g:2656:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2663:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2667:1: ( ( 'Not' ) )
            // InternalMyDsl.g:2668:1: ( 'Not' )
            {
            // InternalMyDsl.g:2668:1: ( 'Not' )
            // InternalMyDsl.g:2669:2: 'Not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2678:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( rule__Not__Group__1__Impl )
            // InternalMyDsl.g:2683:2: rule__Not__Group__1__Impl
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
    // InternalMyDsl.g:2689:1: rule__Not__Group__1__Impl : ( ( rule__Not__CondAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2693:1: ( ( ( rule__Not__CondAssignment_1 ) ) )
            // InternalMyDsl.g:2694:1: ( ( rule__Not__CondAssignment_1 ) )
            {
            // InternalMyDsl.g:2694:1: ( ( rule__Not__CondAssignment_1 ) )
            // InternalMyDsl.g:2695:2: ( rule__Not__CondAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getCondAssignment_1()); 
            // InternalMyDsl.g:2696:2: ( rule__Not__CondAssignment_1 )
            // InternalMyDsl.g:2696:3: rule__Not__CondAssignment_1
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
    // InternalMyDsl.g:2705:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:2710:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalMyDsl.g:2717:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2721:1: ( ( 'If' ) )
            // InternalMyDsl.g:2722:1: ( 'If' )
            {
            // InternalMyDsl.g:2722:1: ( 'If' )
            // InternalMyDsl.g:2723:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:2732:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2737:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2744:1: rule__If__Group__1__Impl : ( ':' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( ':' ) )
            // InternalMyDsl.g:2749:1: ( ':' )
            {
            // InternalMyDsl.g:2749:1: ( ':' )
            // InternalMyDsl.g:2750:2: ':'
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
    // InternalMyDsl.g:2759:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2764:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2771:1: rule__If__Group__2__Impl : ( ( rule__If__CondAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( ( rule__If__CondAssignment_2 ) ) )
            // InternalMyDsl.g:2776:1: ( ( rule__If__CondAssignment_2 ) )
            {
            // InternalMyDsl.g:2776:1: ( ( rule__If__CondAssignment_2 ) )
            // InternalMyDsl.g:2777:2: ( rule__If__CondAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getCondAssignment_2()); 
            // InternalMyDsl.g:2778:2: ( rule__If__CondAssignment_2 )
            // InternalMyDsl.g:2778:3: rule__If__CondAssignment_2
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
    // InternalMyDsl.g:2786:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalMyDsl.g:2791:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalMyDsl.g:2798:1: rule__If__Group__3__Impl : ( 'Then' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( ( 'Then' ) )
            // InternalMyDsl.g:2803:1: ( 'Then' )
            {
            // InternalMyDsl.g:2803:1: ( 'Then' )
            // InternalMyDsl.g:2804:2: 'Then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2813:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalMyDsl.g:2818:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalMyDsl.g:2825:1: rule__If__Group__4__Impl : ( ':' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( ( ':' ) )
            // InternalMyDsl.g:2830:1: ( ':' )
            {
            // InternalMyDsl.g:2830:1: ( ':' )
            // InternalMyDsl.g:2831:2: ':'
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
    // InternalMyDsl.g:2840:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalMyDsl.g:2845:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2852:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2856:1: ( ( '{' ) )
            // InternalMyDsl.g:2857:1: ( '{' )
            {
            // InternalMyDsl.g:2857:1: ( '{' )
            // InternalMyDsl.g:2858:2: '{'
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
    // InternalMyDsl.g:2867:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2871:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalMyDsl.g:2872:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2879:1: rule__If__Group__6__Impl : ( ( rule__If__ActionThenAssignment_6 )* ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( ( rule__If__ActionThenAssignment_6 )* ) )
            // InternalMyDsl.g:2884:1: ( ( rule__If__ActionThenAssignment_6 )* )
            {
            // InternalMyDsl.g:2884:1: ( ( rule__If__ActionThenAssignment_6 )* )
            // InternalMyDsl.g:2885:2: ( rule__If__ActionThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getActionThenAssignment_6()); 
            // InternalMyDsl.g:2886:2: ( rule__If__ActionThenAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=30 && LA17_0<=32)||LA17_0==34||(LA17_0>=36 && LA17_0<=37)||(LA17_0>=39 && LA17_0<=41)||(LA17_0>=43 && LA17_0<=44)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2886:3: rule__If__ActionThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__If__ActionThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:2894:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalMyDsl.g:2899:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:2906:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( ( '}' ) )
            // InternalMyDsl.g:2911:1: ( '}' )
            {
            // InternalMyDsl.g:2911:1: ( '}' )
            // InternalMyDsl.g:2912:2: '}'
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
    // InternalMyDsl.g:2921:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2925:1: ( rule__If__Group__8__Impl )
            // InternalMyDsl.g:2926:2: rule__If__Group__8__Impl
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
    // InternalMyDsl.g:2932:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2936:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalMyDsl.g:2937:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalMyDsl.g:2937:1: ( ( rule__If__Group_8__0 )? )
            // InternalMyDsl.g:2938:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalMyDsl.g:2939:2: ( rule__If__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2939:3: rule__If__Group_8__0
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
    // InternalMyDsl.g:2948:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2952:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalMyDsl.g:2953:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
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
    // InternalMyDsl.g:2960:1: rule__If__Group_8__0__Impl : ( 'Else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( ( 'Else' ) )
            // InternalMyDsl.g:2965:1: ( 'Else' )
            {
            // InternalMyDsl.g:2965:1: ( 'Else' )
            // InternalMyDsl.g:2966:2: 'Else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2975:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // InternalMyDsl.g:2980:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
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
    // InternalMyDsl.g:2987:1: rule__If__Group_8__1__Impl : ( ':' ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( ( ':' ) )
            // InternalMyDsl.g:2992:1: ( ':' )
            {
            // InternalMyDsl.g:2992:1: ( ':' )
            // InternalMyDsl.g:2993:2: ':'
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
    // InternalMyDsl.g:3002:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3006:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // InternalMyDsl.g:3007:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3014:1: rule__If__Group_8__2__Impl : ( '{' ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( ( '{' ) )
            // InternalMyDsl.g:3019:1: ( '{' )
            {
            // InternalMyDsl.g:3019:1: ( '{' )
            // InternalMyDsl.g:3020:2: '{'
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
    // InternalMyDsl.g:3029:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl rule__If__Group_8__4 ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( rule__If__Group_8__3__Impl rule__If__Group_8__4 )
            // InternalMyDsl.g:3034:2: rule__If__Group_8__3__Impl rule__If__Group_8__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3041:1: rule__If__Group_8__3__Impl : ( ( rule__If__ActionElseAssignment_8_3 )* ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ( rule__If__ActionElseAssignment_8_3 )* ) )
            // InternalMyDsl.g:3046:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            {
            // InternalMyDsl.g:3046:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            // InternalMyDsl.g:3047:2: ( rule__If__ActionElseAssignment_8_3 )*
            {
             before(grammarAccess.getIfAccess().getActionElseAssignment_8_3()); 
            // InternalMyDsl.g:3048:2: ( rule__If__ActionElseAssignment_8_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=30 && LA19_0<=32)||LA19_0==34||(LA19_0>=36 && LA19_0<=37)||(LA19_0>=39 && LA19_0<=41)||(LA19_0>=43 && LA19_0<=44)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:3048:3: rule__If__ActionElseAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__If__ActionElseAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:3056:1: rule__If__Group_8__4 : rule__If__Group_8__4__Impl ;
    public final void rule__If__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( rule__If__Group_8__4__Impl )
            // InternalMyDsl.g:3061:2: rule__If__Group_8__4__Impl
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
    // InternalMyDsl.g:3067:1: rule__If__Group_8__4__Impl : ( '}' ) ;
    public final void rule__If__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3071:1: ( ( '}' ) )
            // InternalMyDsl.g:3072:1: ( '}' )
            {
            // InternalMyDsl.g:3072:1: ( '}' )
            // InternalMyDsl.g:3073:2: '}'
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
    // InternalMyDsl.g:3083:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:3088:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalMyDsl.g:3095:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:3100:1: ( 'Loop' )
            {
            // InternalMyDsl.g:3100:1: ( 'Loop' )
            // InternalMyDsl.g:3101:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3110:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3114:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:3115:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3122:1: rule__Loop__Group__1__Impl : ( ':' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( ( ':' ) )
            // InternalMyDsl.g:3127:1: ( ':' )
            {
            // InternalMyDsl.g:3127:1: ( ':' )
            // InternalMyDsl.g:3128:2: ':'
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
    // InternalMyDsl.g:3137:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMyDsl.g:3142:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
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
    // InternalMyDsl.g:3149:1: rule__Loop__Group__2__Impl : ( 'Condition' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3153:1: ( ( 'Condition' ) )
            // InternalMyDsl.g:3154:1: ( 'Condition' )
            {
            // InternalMyDsl.g:3154:1: ( 'Condition' )
            // InternalMyDsl.g:3155:2: 'Condition'
            {
             before(grammarAccess.getLoopAccess().getConditionKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:3164:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3168:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:3169:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3176:1: rule__Loop__Group__3__Impl : ( ':' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3180:1: ( ( ':' ) )
            // InternalMyDsl.g:3181:1: ( ':' )
            {
            // InternalMyDsl.g:3181:1: ( ':' )
            // InternalMyDsl.g:3182:2: ':'
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
    // InternalMyDsl.g:3191:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:3196:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3203:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__CondAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3207:1: ( ( ( rule__Loop__CondAssignment_4 ) ) )
            // InternalMyDsl.g:3208:1: ( ( rule__Loop__CondAssignment_4 ) )
            {
            // InternalMyDsl.g:3208:1: ( ( rule__Loop__CondAssignment_4 ) )
            // InternalMyDsl.g:3209:2: ( rule__Loop__CondAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getCondAssignment_4()); 
            // InternalMyDsl.g:3210:2: ( rule__Loop__CondAssignment_4 )
            // InternalMyDsl.g:3210:3: rule__Loop__CondAssignment_4
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
    // InternalMyDsl.g:3218:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3222:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:3223:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
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
    // InternalMyDsl.g:3230:1: rule__Loop__Group__5__Impl : ( 'Interval' ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3234:1: ( ( 'Interval' ) )
            // InternalMyDsl.g:3235:1: ( 'Interval' )
            {
            // InternalMyDsl.g:3235:1: ( 'Interval' )
            // InternalMyDsl.g:3236:2: 'Interval'
            {
             before(grammarAccess.getLoopAccess().getIntervalKeyword_5()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:3245:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:3250:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3257:1: rule__Loop__Group__6__Impl : ( ':' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( ( ':' ) )
            // InternalMyDsl.g:3262:1: ( ':' )
            {
            // InternalMyDsl.g:3262:1: ( ':' )
            // InternalMyDsl.g:3263:2: ':'
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
    // InternalMyDsl.g:3272:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3276:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalMyDsl.g:3277:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3284:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__MillisecondsAssignment_7 ) ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3288:1: ( ( ( rule__Loop__MillisecondsAssignment_7 ) ) )
            // InternalMyDsl.g:3289:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            {
            // InternalMyDsl.g:3289:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            // InternalMyDsl.g:3290:2: ( rule__Loop__MillisecondsAssignment_7 )
            {
             before(grammarAccess.getLoopAccess().getMillisecondsAssignment_7()); 
            // InternalMyDsl.g:3291:2: ( rule__Loop__MillisecondsAssignment_7 )
            // InternalMyDsl.g:3291:3: rule__Loop__MillisecondsAssignment_7
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
    // InternalMyDsl.g:3299:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3303:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalMyDsl.g:3304:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
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
    // InternalMyDsl.g:3311:1: rule__Loop__Group__8__Impl : ( 'Do' ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3315:1: ( ( 'Do' ) )
            // InternalMyDsl.g:3316:1: ( 'Do' )
            {
            // InternalMyDsl.g:3316:1: ( 'Do' )
            // InternalMyDsl.g:3317:2: 'Do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_8()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:3326:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3330:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalMyDsl.g:3331:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
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
    // InternalMyDsl.g:3338:1: rule__Loop__Group__9__Impl : ( ':' ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( ( ':' ) )
            // InternalMyDsl.g:3343:1: ( ':' )
            {
            // InternalMyDsl.g:3343:1: ( ':' )
            // InternalMyDsl.g:3344:2: ':'
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
    // InternalMyDsl.g:3353:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3357:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalMyDsl.g:3358:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3365:1: rule__Loop__Group__10__Impl : ( '{' ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( ( '{' ) )
            // InternalMyDsl.g:3370:1: ( '{' )
            {
            // InternalMyDsl.g:3370:1: ( '{' )
            // InternalMyDsl.g:3371:2: '{'
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
    // InternalMyDsl.g:3380:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3384:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalMyDsl.g:3385:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3392:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__ActionsAssignment_11 )* ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( ( ( rule__Loop__ActionsAssignment_11 )* ) )
            // InternalMyDsl.g:3397:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            {
            // InternalMyDsl.g:3397:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            // InternalMyDsl.g:3398:2: ( rule__Loop__ActionsAssignment_11 )*
            {
             before(grammarAccess.getLoopAccess().getActionsAssignment_11()); 
            // InternalMyDsl.g:3399:2: ( rule__Loop__ActionsAssignment_11 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=32)||LA20_0==34||(LA20_0>=36 && LA20_0<=37)||(LA20_0>=39 && LA20_0<=41)||(LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3399:3: rule__Loop__ActionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Loop__ActionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:3407:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3411:1: ( rule__Loop__Group__12__Impl )
            // InternalMyDsl.g:3412:2: rule__Loop__Group__12__Impl
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
    // InternalMyDsl.g:3418:1: rule__Loop__Group__12__Impl : ( '}' ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3422:1: ( ( '}' ) )
            // InternalMyDsl.g:3423:1: ( '}' )
            {
            // InternalMyDsl.g:3423:1: ( '}' )
            // InternalMyDsl.g:3424:2: '}'
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
    // InternalMyDsl.g:3434:1: rule__DoAll__Group__0 : rule__DoAll__Group__0__Impl rule__DoAll__Group__1 ;
    public final void rule__DoAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3438:1: ( rule__DoAll__Group__0__Impl rule__DoAll__Group__1 )
            // InternalMyDsl.g:3439:2: rule__DoAll__Group__0__Impl rule__DoAll__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3446:1: rule__DoAll__Group__0__Impl : ( 'For' ) ;
    public final void rule__DoAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( ( 'For' ) )
            // InternalMyDsl.g:3451:1: ( 'For' )
            {
            // InternalMyDsl.g:3451:1: ( 'For' )
            // InternalMyDsl.g:3452:2: 'For'
            {
             before(grammarAccess.getDoAllAccess().getForKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:3461:1: rule__DoAll__Group__1 : rule__DoAll__Group__1__Impl rule__DoAll__Group__2 ;
    public final void rule__DoAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3465:1: ( rule__DoAll__Group__1__Impl rule__DoAll__Group__2 )
            // InternalMyDsl.g:3466:2: rule__DoAll__Group__1__Impl rule__DoAll__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3473:1: rule__DoAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__DoAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( ( 'all' ) )
            // InternalMyDsl.g:3478:1: ( 'all' )
            {
            // InternalMyDsl.g:3478:1: ( 'all' )
            // InternalMyDsl.g:3479:2: 'all'
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
    // InternalMyDsl.g:3488:1: rule__DoAll__Group__2 : rule__DoAll__Group__2__Impl rule__DoAll__Group__3 ;
    public final void rule__DoAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3492:1: ( rule__DoAll__Group__2__Impl rule__DoAll__Group__3 )
            // InternalMyDsl.g:3493:2: rule__DoAll__Group__2__Impl rule__DoAll__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3500:1: rule__DoAll__Group__2__Impl : ( 'in' ) ;
    public final void rule__DoAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( ( 'in' ) )
            // InternalMyDsl.g:3505:1: ( 'in' )
            {
            // InternalMyDsl.g:3505:1: ( 'in' )
            // InternalMyDsl.g:3506:2: 'in'
            {
             before(grammarAccess.getDoAllAccess().getInKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:3515:1: rule__DoAll__Group__3 : rule__DoAll__Group__3__Impl rule__DoAll__Group__4 ;
    public final void rule__DoAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3519:1: ( rule__DoAll__Group__3__Impl rule__DoAll__Group__4 )
            // InternalMyDsl.g:3520:2: rule__DoAll__Group__3__Impl rule__DoAll__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3527:1: rule__DoAll__Group__3__Impl : ( ( rule__DoAll__CollAssignment_3 ) ) ;
    public final void rule__DoAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3531:1: ( ( ( rule__DoAll__CollAssignment_3 ) ) )
            // InternalMyDsl.g:3532:1: ( ( rule__DoAll__CollAssignment_3 ) )
            {
            // InternalMyDsl.g:3532:1: ( ( rule__DoAll__CollAssignment_3 ) )
            // InternalMyDsl.g:3533:2: ( rule__DoAll__CollAssignment_3 )
            {
             before(grammarAccess.getDoAllAccess().getCollAssignment_3()); 
            // InternalMyDsl.g:3534:2: ( rule__DoAll__CollAssignment_3 )
            // InternalMyDsl.g:3534:3: rule__DoAll__CollAssignment_3
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
    // InternalMyDsl.g:3542:1: rule__DoAll__Group__4 : rule__DoAll__Group__4__Impl rule__DoAll__Group__5 ;
    public final void rule__DoAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3546:1: ( rule__DoAll__Group__4__Impl rule__DoAll__Group__5 )
            // InternalMyDsl.g:3547:2: rule__DoAll__Group__4__Impl rule__DoAll__Group__5
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
    // InternalMyDsl.g:3554:1: rule__DoAll__Group__4__Impl : ( 'do' ) ;
    public final void rule__DoAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3558:1: ( ( 'do' ) )
            // InternalMyDsl.g:3559:1: ( 'do' )
            {
            // InternalMyDsl.g:3559:1: ( 'do' )
            // InternalMyDsl.g:3560:2: 'do'
            {
             before(grammarAccess.getDoAllAccess().getDoKeyword_4()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:3569:1: rule__DoAll__Group__5 : rule__DoAll__Group__5__Impl rule__DoAll__Group__6 ;
    public final void rule__DoAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3573:1: ( rule__DoAll__Group__5__Impl rule__DoAll__Group__6 )
            // InternalMyDsl.g:3574:2: rule__DoAll__Group__5__Impl rule__DoAll__Group__6
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
    // InternalMyDsl.g:3581:1: rule__DoAll__Group__5__Impl : ( ':' ) ;
    public final void rule__DoAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( ( ':' ) )
            // InternalMyDsl.g:3586:1: ( ':' )
            {
            // InternalMyDsl.g:3586:1: ( ':' )
            // InternalMyDsl.g:3587:2: ':'
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
    // InternalMyDsl.g:3596:1: rule__DoAll__Group__6 : rule__DoAll__Group__6__Impl rule__DoAll__Group__7 ;
    public final void rule__DoAll__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3600:1: ( rule__DoAll__Group__6__Impl rule__DoAll__Group__7 )
            // InternalMyDsl.g:3601:2: rule__DoAll__Group__6__Impl rule__DoAll__Group__7
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
    // InternalMyDsl.g:3608:1: rule__DoAll__Group__6__Impl : ( '{' ) ;
    public final void rule__DoAll__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( ( '{' ) )
            // InternalMyDsl.g:3613:1: ( '{' )
            {
            // InternalMyDsl.g:3613:1: ( '{' )
            // InternalMyDsl.g:3614:2: '{'
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
    // InternalMyDsl.g:3623:1: rule__DoAll__Group__7 : rule__DoAll__Group__7__Impl rule__DoAll__Group__8 ;
    public final void rule__DoAll__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3627:1: ( rule__DoAll__Group__7__Impl rule__DoAll__Group__8 )
            // InternalMyDsl.g:3628:2: rule__DoAll__Group__7__Impl rule__DoAll__Group__8
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
    // InternalMyDsl.g:3635:1: rule__DoAll__Group__7__Impl : ( ( rule__DoAll__TodoAssignment_7 )* ) ;
    public final void rule__DoAll__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( ( ( rule__DoAll__TodoAssignment_7 )* ) )
            // InternalMyDsl.g:3640:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            {
            // InternalMyDsl.g:3640:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            // InternalMyDsl.g:3641:2: ( rule__DoAll__TodoAssignment_7 )*
            {
             before(grammarAccess.getDoAllAccess().getTodoAssignment_7()); 
            // InternalMyDsl.g:3642:2: ( rule__DoAll__TodoAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=29 && LA21_0<=32)||LA21_0==34||(LA21_0>=36 && LA21_0<=37)||(LA21_0>=39 && LA21_0<=41)||(LA21_0>=43 && LA21_0<=44)||LA21_0==49||LA21_0==52||LA21_0==56||LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:3642:3: rule__DoAll__TodoAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DoAll__TodoAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:3650:1: rule__DoAll__Group__8 : rule__DoAll__Group__8__Impl ;
    public final void rule__DoAll__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3654:1: ( rule__DoAll__Group__8__Impl )
            // InternalMyDsl.g:3655:2: rule__DoAll__Group__8__Impl
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
    // InternalMyDsl.g:3661:1: rule__DoAll__Group__8__Impl : ( '}' ) ;
    public final void rule__DoAll__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3665:1: ( ( '}' ) )
            // InternalMyDsl.g:3666:1: ( '}' )
            {
            // InternalMyDsl.g:3666:1: ( '}' )
            // InternalMyDsl.g:3667:2: '}'
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
    // InternalMyDsl.g:3677:1: rule__Execute__Group_0__0 : rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1 ;
    public final void rule__Execute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3681:1: ( rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1 )
            // InternalMyDsl.g:3682:2: rule__Execute__Group_0__0__Impl rule__Execute__Group_0__1
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
    // InternalMyDsl.g:3689:1: rule__Execute__Group_0__0__Impl : ( 'Execute' ) ;
    public final void rule__Execute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( ( 'Execute' ) )
            // InternalMyDsl.g:3694:1: ( 'Execute' )
            {
            // InternalMyDsl.g:3694:1: ( 'Execute' )
            // InternalMyDsl.g:3695:2: 'Execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:3704:1: rule__Execute__Group_0__1 : rule__Execute__Group_0__1__Impl ;
    public final void rule__Execute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3708:1: ( rule__Execute__Group_0__1__Impl )
            // InternalMyDsl.g:3709:2: rule__Execute__Group_0__1__Impl
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
    // InternalMyDsl.g:3715:1: rule__Execute__Group_0__1__Impl : ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) ) ;
    public final void rule__Execute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3719:1: ( ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) ) )
            // InternalMyDsl.g:3720:1: ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:3720:1: ( ( rule__Execute__SubProcedureNameAssignment_0_1 ) )
            // InternalMyDsl.g:3721:2: ( rule__Execute__SubProcedureNameAssignment_0_1 )
            {
             before(grammarAccess.getExecuteAccess().getSubProcedureNameAssignment_0_1()); 
            // InternalMyDsl.g:3722:2: ( rule__Execute__SubProcedureNameAssignment_0_1 )
            // InternalMyDsl.g:3722:3: rule__Execute__SubProcedureNameAssignment_0_1
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
    // InternalMyDsl.g:3731:1: rule__Main__FileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Main__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3735:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3736:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3736:2: ( RULE_STRING )
            // InternalMyDsl.g:3737:3: RULE_STRING
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
    // InternalMyDsl.g:3746:1: rule__Main__BrowserNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Main__BrowserNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3750:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3751:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3751:2: ( RULE_STRING )
            // InternalMyDsl.g:3752:3: RULE_STRING
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
    // InternalMyDsl.g:3761:1: rule__Main__OrdersAssignment_6 : ( ( rule__Main__OrdersAlternatives_6_0 ) ) ;
    public final void rule__Main__OrdersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3765:1: ( ( ( rule__Main__OrdersAlternatives_6_0 ) ) )
            // InternalMyDsl.g:3766:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            {
            // InternalMyDsl.g:3766:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            // InternalMyDsl.g:3767:3: ( rule__Main__OrdersAlternatives_6_0 )
            {
             before(grammarAccess.getMainAccess().getOrdersAlternatives_6_0()); 
            // InternalMyDsl.g:3768:3: ( rule__Main__OrdersAlternatives_6_0 )
            // InternalMyDsl.g:3768:4: rule__Main__OrdersAlternatives_6_0
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


    // $ANTLR start "rule__Object__ObjNameAssignment_0"
    // InternalMyDsl.g:3776:1: rule__Object__ObjNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__ObjNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3780:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3781:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3781:2: ( RULE_ID )
            // InternalMyDsl.g:3782:3: RULE_ID
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
    // InternalMyDsl.g:3791:1: rule__Object__HtmltypeAssignment_2_0 : ( ruleHTMLTYPE ) ;
    public final void rule__Object__HtmltypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3795:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:3796:2: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:3796:2: ( ruleHTMLTYPE )
            // InternalMyDsl.g:3797:3: ruleHTMLTYPE
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
    // InternalMyDsl.g:3806:1: rule__Object__ObjectDefAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Object__ObjectDefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3810:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3811:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3811:2: ( RULE_STRING )
            // InternalMyDsl.g:3812:3: RULE_STRING
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
    // InternalMyDsl.g:3821:1: rule__HTMLTYPE__TypeAssignment : ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) ;
    public final void rule__HTMLTYPE__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3825:1: ( ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) )
            // InternalMyDsl.g:3826:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            {
            // InternalMyDsl.g:3826:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            // InternalMyDsl.g:3827:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            {
             before(grammarAccess.getHTMLTYPEAccess().getTypeAlternatives_0()); 
            // InternalMyDsl.g:3828:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            // InternalMyDsl.g:3828:4: rule__HTMLTYPE__TypeAlternatives_0
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
    // InternalMyDsl.g:3836:1: rule__Collection__ObjAssignment_1_0_1 : ( ruleObject ) ;
    public final void rule__Collection__ObjAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3840:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3841:2: ( ruleObject )
            {
            // InternalMyDsl.g:3841:2: ( ruleObject )
            // InternalMyDsl.g:3842:3: ruleObject
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
    // InternalMyDsl.g:3851:1: rule__Collection__HtmltypeAssignment_1_1_2 : ( ruleHTMLTYPE ) ;
    public final void rule__Collection__HtmltypeAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:3856:2: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:3856:2: ( ruleHTMLTYPE )
            // InternalMyDsl.g:3857:3: ruleHTMLTYPE
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
    // InternalMyDsl.g:3866:1: rule__Collection__ObjectRuleAssignment_1_1_3 : ( RULE_STRING ) ;
    public final void rule__Collection__ObjectRuleAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3870:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3871:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3871:2: ( RULE_STRING )
            // InternalMyDsl.g:3872:3: RULE_STRING
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
    // InternalMyDsl.g:3881:1: rule__SubProcedure__ActionsAssignment_2 : ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) ) ;
    public final void rule__SubProcedure__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:3886:2: ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:3886:2: ( ( rule__SubProcedure__ActionsAlternatives_2_0 ) )
            // InternalMyDsl.g:3887:3: ( rule__SubProcedure__ActionsAlternatives_2_0 )
            {
             before(grammarAccess.getSubProcedureAccess().getActionsAlternatives_2_0()); 
            // InternalMyDsl.g:3888:3: ( rule__SubProcedure__ActionsAlternatives_2_0 )
            // InternalMyDsl.g:3888:4: rule__SubProcedure__ActionsAlternatives_2_0
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
    // InternalMyDsl.g:3896:1: rule__Navigate__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3900:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3901:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3901:2: ( RULE_STRING )
            // InternalMyDsl.g:3902:3: RULE_STRING
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
    // InternalMyDsl.g:3911:1: rule__Store__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3915:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3916:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3916:2: ( RULE_ID )
            // InternalMyDsl.g:3917:3: RULE_ID
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
    // InternalMyDsl.g:3926:1: rule__Store__ObjAssignment_3 : ( ruleObject ) ;
    public final void rule__Store__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3930:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3931:2: ( ruleObject )
            {
            // InternalMyDsl.g:3931:2: ( ruleObject )
            // InternalMyDsl.g:3932:3: ruleObject
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
    // InternalMyDsl.g:3941:1: rule__ReDefine__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReDefine__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3946:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3946:2: ( RULE_ID )
            // InternalMyDsl.g:3947:3: RULE_ID
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
    // InternalMyDsl.g:3956:1: rule__ReDefine__ObjAssignment_3 : ( ruleObject ) ;
    public final void rule__ReDefine__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3960:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3961:2: ( ruleObject )
            {
            // InternalMyDsl.g:3961:2: ( ruleObject )
            // InternalMyDsl.g:3962:3: ruleObject
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
    // InternalMyDsl.g:3971:1: rule__Delete__ObjNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delete__ObjNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3975:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3976:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3976:2: ( RULE_ID )
            // InternalMyDsl.g:3977:3: RULE_ID
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
    // InternalMyDsl.g:3986:1: rule__ActionSelect__OptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3991:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3991:2: ( RULE_STRING )
            // InternalMyDsl.g:3992:3: RULE_STRING
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
    // InternalMyDsl.g:4001:1: rule__ActionSelect__XpathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__XpathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4005:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4006:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4006:2: ( RULE_STRING )
            // InternalMyDsl.g:4007:3: RULE_STRING
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


    // $ANTLR start "rule__Click__ObjectAssignment_1"
    // InternalMyDsl.g:4016:1: rule__Click__ObjectAssignment_1 : ( ruleObject ) ;
    public final void rule__Click__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4020:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4021:2: ( ruleObject )
            {
            // InternalMyDsl.g:4021:2: ( ruleObject )
            // InternalMyDsl.g:4022:3: ruleObject
            {
             before(grammarAccess.getClickAccess().getObjectObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getClickAccess().getObjectObjectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Click__ObjectAssignment_1"


    // $ANTLR start "rule__Fill__NametagAssignment_1"
    // InternalMyDsl.g:4031:1: rule__Fill__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4035:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4036:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4036:2: ( RULE_STRING )
            // InternalMyDsl.g:4037:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getNametagSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getNametagSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fill__NametagAssignment_1"


    // $ANTLR start "rule__Fill__ContentAssignment_3"
    // InternalMyDsl.g:4046:1: rule__Fill__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Fill__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4050:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4051:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4051:2: ( RULE_STRING )
            // InternalMyDsl.g:4052:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fill__ContentAssignment_3"


    // $ANTLR start "rule__CheckBox__NametagAssignment_1"
    // InternalMyDsl.g:4061:1: rule__CheckBox__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CheckBox__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4065:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4066:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4066:2: ( RULE_STRING )
            // InternalMyDsl.g:4067:3: RULE_STRING
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
    // InternalMyDsl.g:4076:1: rule__CheckBox__NewValueAssignment_2_1 : ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) ;
    public final void rule__CheckBox__NewValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4080:1: ( ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:4081:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:4081:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:4082:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:4083:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            // InternalMyDsl.g:4083:4: rule__CheckBox__NewValueAlternatives_2_1_0
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
    // InternalMyDsl.g:4091:1: rule__DoWait__MillisecAssignment_2 : ( RULE_INT ) ;
    public final void rule__DoWait__MillisecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4095:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4096:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4096:2: ( RULE_INT )
            // InternalMyDsl.g:4097:3: RULE_INT
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
    // InternalMyDsl.g:4106:1: rule__IsIn__ObjAssignment_0_0 : ( ruleObject ) ;
    public final void rule__IsIn__ObjAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4111:2: ( ruleObject )
            {
            // InternalMyDsl.g:4111:2: ( ruleObject )
            // InternalMyDsl.g:4112:3: ruleObject
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
    // InternalMyDsl.g:4121:1: rule__IsIn__BodyAssignment_0_1 : ( ( 'body' ) ) ;
    public final void rule__IsIn__BodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( ( ( 'body' ) ) )
            // InternalMyDsl.g:4126:2: ( ( 'body' ) )
            {
            // InternalMyDsl.g:4126:2: ( ( 'body' ) )
            // InternalMyDsl.g:4127:3: ( 'body' )
            {
             before(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 
            // InternalMyDsl.g:4128:3: ( 'body' )
            // InternalMyDsl.g:4129:4: 'body'
            {
             before(grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4140:1: rule__IsIn__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IsIn__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4145:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4145:2: ( RULE_STRING )
            // InternalMyDsl.g:4146:3: RULE_STRING
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
    // InternalMyDsl.g:4155:1: rule__Not__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4159:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4160:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4160:2: ( ruleCondition )
            // InternalMyDsl.g:4161:3: ruleCondition
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
    // InternalMyDsl.g:4170:1: rule__If__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__If__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4174:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4175:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4175:2: ( ruleCondition )
            // InternalMyDsl.g:4176:3: ruleCondition
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
    // InternalMyDsl.g:4185:1: rule__If__ActionThenAssignment_6 : ( ruleAction ) ;
    public final void rule__If__ActionThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4189:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4190:2: ( ruleAction )
            {
            // InternalMyDsl.g:4190:2: ( ruleAction )
            // InternalMyDsl.g:4191:3: ruleAction
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
    // InternalMyDsl.g:4200:1: rule__If__ActionElseAssignment_8_3 : ( ruleAction ) ;
    public final void rule__If__ActionElseAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4204:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4205:2: ( ruleAction )
            {
            // InternalMyDsl.g:4205:2: ( ruleAction )
            // InternalMyDsl.g:4206:3: ruleAction
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
    // InternalMyDsl.g:4215:1: rule__Loop__CondAssignment_4 : ( ruleCondition ) ;
    public final void rule__Loop__CondAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4219:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4220:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4220:2: ( ruleCondition )
            // InternalMyDsl.g:4221:3: ruleCondition
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
    // InternalMyDsl.g:4230:1: rule__Loop__MillisecondsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Loop__MillisecondsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4235:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4235:2: ( RULE_INT )
            // InternalMyDsl.g:4236:3: RULE_INT
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
    // InternalMyDsl.g:4245:1: rule__Loop__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__Loop__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4250:2: ( ruleAction )
            {
            // InternalMyDsl.g:4250:2: ( ruleAction )
            // InternalMyDsl.g:4251:3: ruleAction
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
    // InternalMyDsl.g:4260:1: rule__DoAll__CollAssignment_3 : ( ruleCollection ) ;
    public final void rule__DoAll__CollAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:4265:2: ( ruleCollection )
            {
            // InternalMyDsl.g:4265:2: ( ruleCollection )
            // InternalMyDsl.g:4266:3: ruleCollection
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
    // InternalMyDsl.g:4275:1: rule__DoAll__TodoAssignment_7 : ( ( rule__DoAll__TodoAlternatives_7_0 ) ) ;
    public final void rule__DoAll__TodoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( ( ( rule__DoAll__TodoAlternatives_7_0 ) ) )
            // InternalMyDsl.g:4280:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            {
            // InternalMyDsl.g:4280:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            // InternalMyDsl.g:4281:3: ( rule__DoAll__TodoAlternatives_7_0 )
            {
             before(grammarAccess.getDoAllAccess().getTodoAlternatives_7_0()); 
            // InternalMyDsl.g:4282:3: ( rule__DoAll__TodoAlternatives_7_0 )
            // InternalMyDsl.g:4282:4: rule__DoAll__TodoAlternatives_7_0
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
    // InternalMyDsl.g:4290:1: rule__Execute__SubProcedureNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Execute__SubProcedureNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4294:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4295:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4295:2: ( RULE_ID )
            // InternalMyDsl.g:4296:3: RULE_ID
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
    // InternalMyDsl.g:4305:1: rule__Execute__SubprocedureAssignment_1 : ( ruleSubProcedure ) ;
    public final void rule__Execute__SubprocedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4309:1: ( ( ruleSubProcedure ) )
            // InternalMyDsl.g:4310:2: ( ruleSubProcedure )
            {
            // InternalMyDsl.g:4310:2: ( ruleSubProcedure )
            // InternalMyDsl.g:4311:3: ruleSubProcedure
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x09121BB5E0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x09121BB5E0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x09121BB5E403F820L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x09121BB5E003F822L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x09121BB5E003F820L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x09121BB5E4000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x19131BB5E003F820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001BB5C4000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001BB5C0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});

}