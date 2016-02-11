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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'true'", "'false'", "'File'", "'with'", "'browser'", "':'", "'['", "']'", "'Refresh'", "'Navigate'", "'Store : '", "'as'", "'Select'", "'from'", "'Click'", "'Fill'", "'CheckBox'", "'to'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'contains'", "'Not'", "'If'", "'Then'", "'{'", "'}'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'all'", "'in'", "'do'", "'body'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalMyDsl.g:212:1: ruleCollection : ( ( rule__Collection__ObjAssignment ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Collection__ObjAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Collection__ObjAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Collection__ObjAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__Collection__ObjAssignment )
            {
             before(grammarAccess.getCollectionAccess().getObjAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__Collection__ObjAssignment )
            // InternalMyDsl.g:219:4: rule__Collection__ObjAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Collection__ObjAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getObjAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRefresh"
    // InternalMyDsl.g:228:1: entryRuleRefresh : ruleRefresh EOF ;
    public final void entryRuleRefresh() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRefresh EOF )
            // InternalMyDsl.g:230:1: ruleRefresh EOF
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
    // InternalMyDsl.g:237:1: ruleRefresh : ( ( rule__Refresh__Group__0 ) ) ;
    public final void ruleRefresh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Refresh__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Refresh__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Refresh__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Refresh__Group__0 )
            {
             before(grammarAccess.getRefreshAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Refresh__Group__0 )
            // InternalMyDsl.g:244:4: rule__Refresh__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleNavigate : ruleNavigate EOF ;
    public final void entryRuleNavigate() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleNavigate EOF )
            // InternalMyDsl.g:255:1: ruleNavigate EOF
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
    // InternalMyDsl.g:262:1: ruleNavigate : ( ( rule__Navigate__Group__0 ) ) ;
    public final void ruleNavigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Navigate__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Navigate__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Navigate__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Navigate__Group__0 )
            {
             before(grammarAccess.getNavigateAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Navigate__Group__0 )
            // InternalMyDsl.g:269:4: rule__Navigate__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleStore EOF )
            // InternalMyDsl.g:280:1: ruleStore EOF
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
    // InternalMyDsl.g:287:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Store__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Store__Group__0 )
            // InternalMyDsl.g:294:4: rule__Store__Group__0
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


    // $ANTLR start "entryRuleActionSelect"
    // InternalMyDsl.g:303:1: entryRuleActionSelect : ruleActionSelect EOF ;
    public final void entryRuleActionSelect() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleActionSelect EOF )
            // InternalMyDsl.g:305:1: ruleActionSelect EOF
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
    // InternalMyDsl.g:312:1: ruleActionSelect : ( ( rule__ActionSelect__Group__0 ) ) ;
    public final void ruleActionSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ActionSelect__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ActionSelect__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ActionSelect__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ActionSelect__Group__0 )
            {
             before(grammarAccess.getActionSelectAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ActionSelect__Group__0 )
            // InternalMyDsl.g:319:4: rule__ActionSelect__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleClick EOF )
            // InternalMyDsl.g:330:1: ruleClick EOF
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
    // InternalMyDsl.g:337:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Click__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Click__Group__0 )
            // InternalMyDsl.g:344:4: rule__Click__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleFill EOF )
            // InternalMyDsl.g:355:1: ruleFill EOF
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
    // InternalMyDsl.g:362:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Fill__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Fill__Group__0 )
            // InternalMyDsl.g:369:4: rule__Fill__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCheckBox EOF )
            // InternalMyDsl.g:380:1: ruleCheckBox EOF
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
    // InternalMyDsl.g:387:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__CheckBox__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__CheckBox__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__CheckBox__Group__0 )
            // InternalMyDsl.g:394:4: rule__CheckBox__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleRickroll : ruleRickroll EOF ;
    public final void entryRuleRickroll() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRickroll EOF )
            // InternalMyDsl.g:405:1: ruleRickroll EOF
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
    // InternalMyDsl.g:412:1: ruleRickroll : ( ( rule__Rickroll__Group__0 ) ) ;
    public final void ruleRickroll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Rickroll__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Rickroll__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Rickroll__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Rickroll__Group__0 )
            {
             before(grammarAccess.getRickrollAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Rickroll__Group__0 )
            // InternalMyDsl.g:419:4: rule__Rickroll__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleDoWait : ruleDoWait EOF ;
    public final void entryRuleDoWait() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleDoWait EOF )
            // InternalMyDsl.g:430:1: ruleDoWait EOF
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
    // InternalMyDsl.g:437:1: ruleDoWait : ( ( rule__DoWait__Group__0 ) ) ;
    public final void ruleDoWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__DoWait__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__DoWait__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__DoWait__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__DoWait__Group__0 )
            {
             before(grammarAccess.getDoWaitAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__DoWait__Group__0 )
            // InternalMyDsl.g:444:4: rule__DoWait__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleIsIn : ruleIsIn EOF ;
    public final void entryRuleIsIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleIsIn EOF )
            // InternalMyDsl.g:455:1: ruleIsIn EOF
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
    // InternalMyDsl.g:462:1: ruleIsIn : ( ( rule__IsIn__Group__0 ) ) ;
    public final void ruleIsIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__IsIn__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__IsIn__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__IsIn__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__IsIn__Group__0 )
            {
             before(grammarAccess.getIsInAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__IsIn__Group__0 )
            // InternalMyDsl.g:469:4: rule__IsIn__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleNot EOF )
            // InternalMyDsl.g:480:1: ruleNot EOF
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
    // InternalMyDsl.g:487:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Not__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Not__Group__0 )
            // InternalMyDsl.g:494:4: rule__Not__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleIf EOF )
            // InternalMyDsl.g:505:1: ruleIf EOF
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
    // InternalMyDsl.g:512:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:519:4: rule__If__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleLoop EOF )
            // InternalMyDsl.g:530:1: ruleLoop EOF
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
    // InternalMyDsl.g:537:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:544:4: rule__Loop__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleDoAll : ruleDoAll EOF ;
    public final void entryRuleDoAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDoAll EOF )
            // InternalMyDsl.g:555:1: ruleDoAll EOF
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
    // InternalMyDsl.g:562:1: ruleDoAll : ( ( rule__DoAll__Group__0 ) ) ;
    public final void ruleDoAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DoAll__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DoAll__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DoAll__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DoAll__Group__0 )
            {
             before(grammarAccess.getDoAllAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DoAll__Group__0 )
            // InternalMyDsl.g:569:4: rule__DoAll__Group__0
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


    // $ANTLR start "rule__Main__OrdersAlternatives_6_0"
    // InternalMyDsl.g:577:1: rule__Main__OrdersAlternatives_6_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__Main__OrdersAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=25 && LA1_0<=27)||LA1_0==29||(LA1_0>=31 && LA1_0<=33)||(LA1_0>=35 && LA1_0<=36)) ) {
                alt1=1;
            }
            else if ( (LA1_0==41||LA1_0==46||LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:582:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:582:2: ( ruleAction )
                    // InternalMyDsl.g:583:3: ruleAction
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
                    // InternalMyDsl.g:588:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:588:2: ( ruleStructure )
                    // InternalMyDsl.g:589:3: ruleStructure
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
    // InternalMyDsl.g:598:1: rule__Action__Alternatives : ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleCheckBox ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleStore ) | ( ruleRickroll ) | ( ruleDoWait ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleCheckBox ) | ( ruleRefresh ) | ( ruleActionSelect ) | ( ruleStore ) | ( ruleRickroll ) | ( ruleDoWait ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 29:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 35:
                {
                alt2=8;
                }
                break;
            case 36:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:603:2: ( ruleNavigate )
                    {
                    // InternalMyDsl.g:603:2: ( ruleNavigate )
                    // InternalMyDsl.g:604:3: ruleNavigate
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
                    // InternalMyDsl.g:609:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:609:2: ( ruleClick )
                    // InternalMyDsl.g:610:3: ruleClick
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
                    // InternalMyDsl.g:615:2: ( ruleFill )
                    {
                    // InternalMyDsl.g:615:2: ( ruleFill )
                    // InternalMyDsl.g:616:3: ruleFill
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
                    // InternalMyDsl.g:621:2: ( ruleCheckBox )
                    {
                    // InternalMyDsl.g:621:2: ( ruleCheckBox )
                    // InternalMyDsl.g:622:3: ruleCheckBox
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
                    // InternalMyDsl.g:627:2: ( ruleRefresh )
                    {
                    // InternalMyDsl.g:627:2: ( ruleRefresh )
                    // InternalMyDsl.g:628:3: ruleRefresh
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
                    // InternalMyDsl.g:633:2: ( ruleActionSelect )
                    {
                    // InternalMyDsl.g:633:2: ( ruleActionSelect )
                    // InternalMyDsl.g:634:3: ruleActionSelect
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
                    // InternalMyDsl.g:639:2: ( ruleStore )
                    {
                    // InternalMyDsl.g:639:2: ( ruleStore )
                    // InternalMyDsl.g:640:3: ruleStore
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
                    // InternalMyDsl.g:645:2: ( ruleRickroll )
                    {
                    // InternalMyDsl.g:645:2: ( ruleRickroll )
                    // InternalMyDsl.g:646:3: ruleRickroll
                    {
                     before(grammarAccess.getActionAccess().getRickrollParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRickroll();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRickrollParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:651:2: ( ruleDoWait )
                    {
                    // InternalMyDsl.g:651:2: ( ruleDoWait )
                    // InternalMyDsl.g:652:3: ruleDoWait
                    {
                     before(grammarAccess.getActionAccess().getDoWaitParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDoWait();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDoWaitParserRuleCall_8()); 

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
    // InternalMyDsl.g:661:1: rule__Structure__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) );
    public final void rule__Structure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 50:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:666:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:666:2: ( ruleIf )
                    // InternalMyDsl.g:667:3: ruleIf
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
                    // InternalMyDsl.g:672:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:672:2: ( ruleLoop )
                    // InternalMyDsl.g:673:3: ruleLoop
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
                    // InternalMyDsl.g:678:2: ( ruleDoAll )
                    {
                    // InternalMyDsl.g:678:2: ( ruleDoAll )
                    // InternalMyDsl.g:679:3: ruleDoAll
                    {
                     before(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoAll();

                    state._fsp--;

                     after(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2()); 

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
    // InternalMyDsl.g:688:1: rule__Condition__Alternatives : ( ( ruleIsIn ) | ( ruleNot ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ruleIsIn ) | ( ruleNot ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23||LA4_0==54) ) {
                alt4=1;
            }
            else if ( (LA4_0==40) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:693:2: ( ruleIsIn )
                    {
                    // InternalMyDsl.g:693:2: ( ruleIsIn )
                    // InternalMyDsl.g:694:3: ruleIsIn
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
                    // InternalMyDsl.g:699:2: ( ruleNot )
                    {
                    // InternalMyDsl.g:699:2: ( ruleNot )
                    // InternalMyDsl.g:700:3: ruleNot
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
    // InternalMyDsl.g:709:1: rule__Object__Alternatives : ( ( ( rule__Object__BodyAssignment_0 ) ) | ( ( rule__Object__Group_1__0 ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ( rule__Object__BodyAssignment_0 ) ) | ( ( rule__Object__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:714:2: ( ( rule__Object__BodyAssignment_0 ) )
                    {
                    // InternalMyDsl.g:714:2: ( ( rule__Object__BodyAssignment_0 ) )
                    // InternalMyDsl.g:715:3: ( rule__Object__BodyAssignment_0 )
                    {
                     before(grammarAccess.getObjectAccess().getBodyAssignment_0()); 
                    // InternalMyDsl.g:716:3: ( rule__Object__BodyAssignment_0 )
                    // InternalMyDsl.g:716:4: rule__Object__BodyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__BodyAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getBodyAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:720:2: ( ( rule__Object__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:720:2: ( ( rule__Object__Group_1__0 ) )
                    // InternalMyDsl.g:721:3: ( rule__Object__Group_1__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_1()); 
                    // InternalMyDsl.g:722:3: ( rule__Object__Group_1__0 )
                    // InternalMyDsl.g:722:4: rule__Object__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getGroup_1()); 

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
    // InternalMyDsl.g:730:1: rule__HTMLTYPE__TypeAlternatives_0 : ( ( 'title' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) );
    public final void rule__HTMLTYPE__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( 'title' ) | ( 'class' ) | ( 'id' ) | ( 'name' ) | ( 'CSS Selector' ) | ( 'XPath' ) )
            int alt6=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:735:2: ( 'title' )
                    {
                    // InternalMyDsl.g:735:2: ( 'title' )
                    // InternalMyDsl.g:736:3: 'title'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:741:2: ( 'class' )
                    {
                    // InternalMyDsl.g:741:2: ( 'class' )
                    // InternalMyDsl.g:742:3: 'class'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:747:2: ( 'id' )
                    {
                    // InternalMyDsl.g:747:2: ( 'id' )
                    // InternalMyDsl.g:748:3: 'id'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:753:2: ( 'name' )
                    {
                    // InternalMyDsl.g:753:2: ( 'name' )
                    // InternalMyDsl.g:754:3: 'name'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:759:2: ( 'CSS Selector' )
                    {
                    // InternalMyDsl.g:759:2: ( 'CSS Selector' )
                    // InternalMyDsl.g:760:3: 'CSS Selector'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:765:2: ( 'XPath' )
                    {
                    // InternalMyDsl.g:765:2: ( 'XPath' )
                    // InternalMyDsl.g:766:3: 'XPath'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_5()); 

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


    // $ANTLR start "rule__CheckBox__NewValueAlternatives_2_1_0"
    // InternalMyDsl.g:775:1: rule__CheckBox__NewValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__CheckBox__NewValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:780:2: ( 'true' )
                    {
                    // InternalMyDsl.g:780:2: ( 'true' )
                    // InternalMyDsl.g:781:3: 'true'
                    {
                     before(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:786:2: ( 'false' )
                    {
                    // InternalMyDsl.g:786:2: ( 'false' )
                    // InternalMyDsl.g:787:3: 'false'
                    {
                     before(grammarAccess.getCheckBoxAccess().getNewValueFalseKeyword_2_1_0_1()); 
                    match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__DoAll__TodoAlternatives_7_0"
    // InternalMyDsl.g:796:1: rule__DoAll__TodoAlternatives_7_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__DoAll__TodoAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=27)||LA8_0==29||(LA8_0>=31 && LA8_0<=33)||(LA8_0>=35 && LA8_0<=36)) ) {
                alt8=1;
            }
            else if ( (LA8_0==41||LA8_0==46||LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:801:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:801:2: ( ruleAction )
                    // InternalMyDsl.g:802:3: ruleAction
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
                    // InternalMyDsl.g:807:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:807:2: ( ruleStructure )
                    // InternalMyDsl.g:808:3: ruleStructure
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


    // $ANTLR start "rule__Main__Group__0"
    // InternalMyDsl.g:817:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyDsl.g:822:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalMyDsl.g:829:1: rule__Main__Group__0__Impl : ( 'File' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( 'File' ) )
            // InternalMyDsl.g:834:1: ( 'File' )
            {
            // InternalMyDsl.g:834:1: ( 'File' )
            // InternalMyDsl.g:835:2: 'File'
            {
             before(grammarAccess.getMainAccess().getFileKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:844:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyDsl.g:849:2: rule__Main__Group__1__Impl rule__Main__Group__2
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
    // InternalMyDsl.g:856:1: rule__Main__Group__1__Impl : ( ( rule__Main__FileNameAssignment_1 ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( ( rule__Main__FileNameAssignment_1 ) ) )
            // InternalMyDsl.g:861:1: ( ( rule__Main__FileNameAssignment_1 ) )
            {
            // InternalMyDsl.g:861:1: ( ( rule__Main__FileNameAssignment_1 ) )
            // InternalMyDsl.g:862:2: ( rule__Main__FileNameAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getFileNameAssignment_1()); 
            // InternalMyDsl.g:863:2: ( rule__Main__FileNameAssignment_1 )
            // InternalMyDsl.g:863:3: rule__Main__FileNameAssignment_1
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
    // InternalMyDsl.g:871:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyDsl.g:876:2: rule__Main__Group__2__Impl rule__Main__Group__3
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
    // InternalMyDsl.g:883:1: rule__Main__Group__2__Impl : ( 'with' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( 'with' ) )
            // InternalMyDsl.g:888:1: ( 'with' )
            {
            // InternalMyDsl.g:888:1: ( 'with' )
            // InternalMyDsl.g:889:2: 'with'
            {
             before(grammarAccess.getMainAccess().getWithKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:898:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyDsl.g:903:2: rule__Main__Group__3__Impl rule__Main__Group__4
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
    // InternalMyDsl.g:910:1: rule__Main__Group__3__Impl : ( 'browser' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( 'browser' ) )
            // InternalMyDsl.g:915:1: ( 'browser' )
            {
            // InternalMyDsl.g:915:1: ( 'browser' )
            // InternalMyDsl.g:916:2: 'browser'
            {
             before(grammarAccess.getMainAccess().getBrowserKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:925:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyDsl.g:930:2: rule__Main__Group__4__Impl rule__Main__Group__5
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
    // InternalMyDsl.g:937:1: rule__Main__Group__4__Impl : ( ( rule__Main__BrowserNameAssignment_4 ) ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( ( rule__Main__BrowserNameAssignment_4 ) ) )
            // InternalMyDsl.g:942:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            {
            // InternalMyDsl.g:942:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            // InternalMyDsl.g:943:2: ( rule__Main__BrowserNameAssignment_4 )
            {
             before(grammarAccess.getMainAccess().getBrowserNameAssignment_4()); 
            // InternalMyDsl.g:944:2: ( rule__Main__BrowserNameAssignment_4 )
            // InternalMyDsl.g:944:3: rule__Main__BrowserNameAssignment_4
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
    // InternalMyDsl.g:952:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyDsl.g:957:2: rule__Main__Group__5__Impl rule__Main__Group__6
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
    // InternalMyDsl.g:964:1: rule__Main__Group__5__Impl : ( ':' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( ':' ) )
            // InternalMyDsl.g:969:1: ( ':' )
            {
            // InternalMyDsl.g:969:1: ( ':' )
            // InternalMyDsl.g:970:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:979:1: rule__Main__Group__6 : rule__Main__Group__6__Impl ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__Main__Group__6__Impl )
            // InternalMyDsl.g:984:2: rule__Main__Group__6__Impl
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
    // InternalMyDsl.g:990:1: rule__Main__Group__6__Impl : ( ( rule__Main__OrdersAssignment_6 )* ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( ( rule__Main__OrdersAssignment_6 )* ) )
            // InternalMyDsl.g:995:1: ( ( rule__Main__OrdersAssignment_6 )* )
            {
            // InternalMyDsl.g:995:1: ( ( rule__Main__OrdersAssignment_6 )* )
            // InternalMyDsl.g:996:2: ( rule__Main__OrdersAssignment_6 )*
            {
             before(grammarAccess.getMainAccess().getOrdersAssignment_6()); 
            // InternalMyDsl.g:997:2: ( rule__Main__OrdersAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=27)||LA9_0==29||(LA9_0>=31 && LA9_0<=33)||(LA9_0>=35 && LA9_0<=36)||LA9_0==41||LA9_0==46||LA9_0==50) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:997:3: rule__Main__OrdersAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Main__OrdersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Object__Group_1__0"
    // InternalMyDsl.g:1006:1: rule__Object__Group_1__0 : rule__Object__Group_1__0__Impl rule__Object__Group_1__1 ;
    public final void rule__Object__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__Object__Group_1__0__Impl rule__Object__Group_1__1 )
            // InternalMyDsl.g:1011:2: rule__Object__Group_1__0__Impl rule__Object__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_1__1();

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
    // $ANTLR end "rule__Object__Group_1__0"


    // $ANTLR start "rule__Object__Group_1__0__Impl"
    // InternalMyDsl.g:1018:1: rule__Object__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Object__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( '[' ) )
            // InternalMyDsl.g:1023:1: ( '[' )
            {
            // InternalMyDsl.g:1023:1: ( '[' )
            // InternalMyDsl.g:1024:2: '['
            {
             before(grammarAccess.getObjectAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__0__Impl"


    // $ANTLR start "rule__Object__Group_1__1"
    // InternalMyDsl.g:1033:1: rule__Object__Group_1__1 : rule__Object__Group_1__1__Impl rule__Object__Group_1__2 ;
    public final void rule__Object__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__Object__Group_1__1__Impl rule__Object__Group_1__2 )
            // InternalMyDsl.g:1038:2: rule__Object__Group_1__1__Impl rule__Object__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_1__2();

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
    // $ANTLR end "rule__Object__Group_1__1"


    // $ANTLR start "rule__Object__Group_1__1__Impl"
    // InternalMyDsl.g:1045:1: rule__Object__Group_1__1__Impl : ( ( rule__Object__Group_1_1__0 ) ) ;
    public final void rule__Object__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ( rule__Object__Group_1_1__0 ) ) )
            // InternalMyDsl.g:1050:1: ( ( rule__Object__Group_1_1__0 ) )
            {
            // InternalMyDsl.g:1050:1: ( ( rule__Object__Group_1_1__0 ) )
            // InternalMyDsl.g:1051:2: ( rule__Object__Group_1_1__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1052:2: ( rule__Object__Group_1_1__0 )
            // InternalMyDsl.g:1052:3: rule__Object__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__1__Impl"


    // $ANTLR start "rule__Object__Group_1__2"
    // InternalMyDsl.g:1060:1: rule__Object__Group_1__2 : rule__Object__Group_1__2__Impl ;
    public final void rule__Object__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__Object__Group_1__2__Impl )
            // InternalMyDsl.g:1065:2: rule__Object__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_1__2__Impl();

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
    // $ANTLR end "rule__Object__Group_1__2"


    // $ANTLR start "rule__Object__Group_1__2__Impl"
    // InternalMyDsl.g:1071:1: rule__Object__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Object__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( ( ']' ) )
            // InternalMyDsl.g:1076:1: ( ']' )
            {
            // InternalMyDsl.g:1076:1: ( ']' )
            // InternalMyDsl.g:1077:2: ']'
            {
             before(grammarAccess.getObjectAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__2__Impl"


    // $ANTLR start "rule__Object__Group_1_1__0"
    // InternalMyDsl.g:1087:1: rule__Object__Group_1_1__0 : rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 ;
    public final void rule__Object__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 )
            // InternalMyDsl.g:1092:2: rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_1_1__1();

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
    // $ANTLR end "rule__Object__Group_1_1__0"


    // $ANTLR start "rule__Object__Group_1_1__0__Impl"
    // InternalMyDsl.g:1099:1: rule__Object__Group_1_1__0__Impl : ( ( rule__Object__HtmltypeAssignment_1_1_0 ) ) ;
    public final void rule__Object__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( ( ( rule__Object__HtmltypeAssignment_1_1_0 ) ) )
            // InternalMyDsl.g:1104:1: ( ( rule__Object__HtmltypeAssignment_1_1_0 ) )
            {
            // InternalMyDsl.g:1104:1: ( ( rule__Object__HtmltypeAssignment_1_1_0 ) )
            // InternalMyDsl.g:1105:2: ( rule__Object__HtmltypeAssignment_1_1_0 )
            {
             before(grammarAccess.getObjectAccess().getHtmltypeAssignment_1_1_0()); 
            // InternalMyDsl.g:1106:2: ( rule__Object__HtmltypeAssignment_1_1_0 )
            // InternalMyDsl.g:1106:3: rule__Object__HtmltypeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__HtmltypeAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getHtmltypeAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__0__Impl"


    // $ANTLR start "rule__Object__Group_1_1__1"
    // InternalMyDsl.g:1114:1: rule__Object__Group_1_1__1 : rule__Object__Group_1_1__1__Impl ;
    public final void rule__Object__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__Object__Group_1_1__1__Impl )
            // InternalMyDsl.g:1119:2: rule__Object__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Object__Group_1_1__1"


    // $ANTLR start "rule__Object__Group_1_1__1__Impl"
    // InternalMyDsl.g:1125:1: rule__Object__Group_1_1__1__Impl : ( ( rule__Object__ObjectNameAssignment_1_1_1 ) ) ;
    public final void rule__Object__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( ( rule__Object__ObjectNameAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1130:1: ( ( rule__Object__ObjectNameAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1130:1: ( ( rule__Object__ObjectNameAssignment_1_1_1 ) )
            // InternalMyDsl.g:1131:2: ( rule__Object__ObjectNameAssignment_1_1_1 )
            {
             before(grammarAccess.getObjectAccess().getObjectNameAssignment_1_1_1()); 
            // InternalMyDsl.g:1132:2: ( rule__Object__ObjectNameAssignment_1_1_1 )
            // InternalMyDsl.g:1132:3: rule__Object__ObjectNameAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjectNameAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjectNameAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__1__Impl"


    // $ANTLR start "rule__Refresh__Group__0"
    // InternalMyDsl.g:1141:1: rule__Refresh__Group__0 : rule__Refresh__Group__0__Impl rule__Refresh__Group__1 ;
    public final void rule__Refresh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__Refresh__Group__0__Impl rule__Refresh__Group__1 )
            // InternalMyDsl.g:1146:2: rule__Refresh__Group__0__Impl rule__Refresh__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1153:1: rule__Refresh__Group__0__Impl : ( () ) ;
    public final void rule__Refresh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( () ) )
            // InternalMyDsl.g:1158:1: ( () )
            {
            // InternalMyDsl.g:1158:1: ( () )
            // InternalMyDsl.g:1159:2: ()
            {
             before(grammarAccess.getRefreshAccess().getRefreshAction_0()); 
            // InternalMyDsl.g:1160:2: ()
            // InternalMyDsl.g:1160:3: 
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
    // InternalMyDsl.g:1168:1: rule__Refresh__Group__1 : rule__Refresh__Group__1__Impl ;
    public final void rule__Refresh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__Refresh__Group__1__Impl )
            // InternalMyDsl.g:1173:2: rule__Refresh__Group__1__Impl
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
    // InternalMyDsl.g:1179:1: rule__Refresh__Group__1__Impl : ( 'Refresh' ) ;
    public final void rule__Refresh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( 'Refresh' ) )
            // InternalMyDsl.g:1184:1: ( 'Refresh' )
            {
            // InternalMyDsl.g:1184:1: ( 'Refresh' )
            // InternalMyDsl.g:1185:2: 'Refresh'
            {
             before(grammarAccess.getRefreshAccess().getRefreshKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1195:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalMyDsl.g:1200:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
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
    // InternalMyDsl.g:1207:1: rule__Navigate__Group__0__Impl : ( 'Navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( 'Navigate' ) )
            // InternalMyDsl.g:1212:1: ( 'Navigate' )
            {
            // InternalMyDsl.g:1212:1: ( 'Navigate' )
            // InternalMyDsl.g:1213:2: 'Navigate'
            {
             before(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1222:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__Navigate__Group__1__Impl )
            // InternalMyDsl.g:1227:2: rule__Navigate__Group__1__Impl
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
    // InternalMyDsl.g:1233:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1238:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1238:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalMyDsl.g:1239:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1240:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalMyDsl.g:1240:3: rule__Navigate__UrlAssignment_1
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
    // InternalMyDsl.g:1249:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyDsl.g:1254:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1261:1: rule__Store__Group__0__Impl : ( 'Store : ' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( 'Store : ' ) )
            // InternalMyDsl.g:1266:1: ( 'Store : ' )
            {
            // InternalMyDsl.g:1266:1: ( 'Store : ' )
            // InternalMyDsl.g:1267:2: 'Store : '
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1276:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyDsl.g:1281:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1288:1: rule__Store__Group__1__Impl : ( ( rule__Store__ObjAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( ( rule__Store__ObjAssignment_1 ) ) )
            // InternalMyDsl.g:1293:1: ( ( rule__Store__ObjAssignment_1 ) )
            {
            // InternalMyDsl.g:1293:1: ( ( rule__Store__ObjAssignment_1 ) )
            // InternalMyDsl.g:1294:2: ( rule__Store__ObjAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getObjAssignment_1()); 
            // InternalMyDsl.g:1295:2: ( rule__Store__ObjAssignment_1 )
            // InternalMyDsl.g:1295:3: rule__Store__ObjAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getObjAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1303:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyDsl.g:1308:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1315:1: rule__Store__Group__2__Impl : ( 'as' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( 'as' ) )
            // InternalMyDsl.g:1320:1: ( 'as' )
            {
            // InternalMyDsl.g:1320:1: ( 'as' )
            // InternalMyDsl.g:1321:2: 'as'
            {
             before(grammarAccess.getStoreAccess().getAsKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getAsKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1330:1: rule__Store__Group__3 : rule__Store__Group__3__Impl ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__Store__Group__3__Impl )
            // InternalMyDsl.g:1335:2: rule__Store__Group__3__Impl
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
    // InternalMyDsl.g:1341:1: rule__Store__Group__3__Impl : ( ( rule__Store__ObjNameAssignment_3 ) ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( ( ( rule__Store__ObjNameAssignment_3 ) ) )
            // InternalMyDsl.g:1346:1: ( ( rule__Store__ObjNameAssignment_3 ) )
            {
            // InternalMyDsl.g:1346:1: ( ( rule__Store__ObjNameAssignment_3 ) )
            // InternalMyDsl.g:1347:2: ( rule__Store__ObjNameAssignment_3 )
            {
             before(grammarAccess.getStoreAccess().getObjNameAssignment_3()); 
            // InternalMyDsl.g:1348:2: ( rule__Store__ObjNameAssignment_3 )
            // InternalMyDsl.g:1348:3: rule__Store__ObjNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Store__ObjNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getObjNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ActionSelect__Group__0"
    // InternalMyDsl.g:1357:1: rule__ActionSelect__Group__0 : rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 ;
    public final void rule__ActionSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1 )
            // InternalMyDsl.g:1362:2: rule__ActionSelect__Group__0__Impl rule__ActionSelect__Group__1
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
    // InternalMyDsl.g:1369:1: rule__ActionSelect__Group__0__Impl : ( 'Select' ) ;
    public final void rule__ActionSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( 'Select' ) )
            // InternalMyDsl.g:1374:1: ( 'Select' )
            {
            // InternalMyDsl.g:1374:1: ( 'Select' )
            // InternalMyDsl.g:1375:2: 'Select'
            {
             before(grammarAccess.getActionSelectAccess().getSelectKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1384:1: rule__ActionSelect__Group__1 : rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 ;
    public final void rule__ActionSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2 )
            // InternalMyDsl.g:1389:2: rule__ActionSelect__Group__1__Impl rule__ActionSelect__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1396:1: rule__ActionSelect__Group__1__Impl : ( ( rule__ActionSelect__OptionAssignment_1 ) ) ;
    public final void rule__ActionSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( ( rule__ActionSelect__OptionAssignment_1 ) ) )
            // InternalMyDsl.g:1401:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            {
            // InternalMyDsl.g:1401:1: ( ( rule__ActionSelect__OptionAssignment_1 ) )
            // InternalMyDsl.g:1402:2: ( rule__ActionSelect__OptionAssignment_1 )
            {
             before(grammarAccess.getActionSelectAccess().getOptionAssignment_1()); 
            // InternalMyDsl.g:1403:2: ( rule__ActionSelect__OptionAssignment_1 )
            // InternalMyDsl.g:1403:3: rule__ActionSelect__OptionAssignment_1
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
    // InternalMyDsl.g:1411:1: rule__ActionSelect__Group__2 : rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 ;
    public final void rule__ActionSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3 )
            // InternalMyDsl.g:1416:2: rule__ActionSelect__Group__2__Impl rule__ActionSelect__Group__3
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
    // InternalMyDsl.g:1423:1: rule__ActionSelect__Group__2__Impl : ( 'from' ) ;
    public final void rule__ActionSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( ( 'from' ) )
            // InternalMyDsl.g:1428:1: ( 'from' )
            {
            // InternalMyDsl.g:1428:1: ( 'from' )
            // InternalMyDsl.g:1429:2: 'from'
            {
             before(grammarAccess.getActionSelectAccess().getFromKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1438:1: rule__ActionSelect__Group__3 : rule__ActionSelect__Group__3__Impl ;
    public final void rule__ActionSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( rule__ActionSelect__Group__3__Impl )
            // InternalMyDsl.g:1443:2: rule__ActionSelect__Group__3__Impl
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
    // InternalMyDsl.g:1449:1: rule__ActionSelect__Group__3__Impl : ( ( rule__ActionSelect__XpathAssignment_3 ) ) ;
    public final void rule__ActionSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( ( rule__ActionSelect__XpathAssignment_3 ) ) )
            // InternalMyDsl.g:1454:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            {
            // InternalMyDsl.g:1454:1: ( ( rule__ActionSelect__XpathAssignment_3 ) )
            // InternalMyDsl.g:1455:2: ( rule__ActionSelect__XpathAssignment_3 )
            {
             before(grammarAccess.getActionSelectAccess().getXpathAssignment_3()); 
            // InternalMyDsl.g:1456:2: ( rule__ActionSelect__XpathAssignment_3 )
            // InternalMyDsl.g:1456:3: rule__ActionSelect__XpathAssignment_3
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
    // InternalMyDsl.g:1465:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:1470:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1477:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( ( 'Click' ) )
            // InternalMyDsl.g:1482:1: ( 'Click' )
            {
            // InternalMyDsl.g:1482:1: ( 'Click' )
            // InternalMyDsl.g:1483:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1492:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( rule__Click__Group__1__Impl )
            // InternalMyDsl.g:1497:2: rule__Click__Group__1__Impl
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
    // InternalMyDsl.g:1503:1: rule__Click__Group__1__Impl : ( ( rule__Click__NameAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( ( ( rule__Click__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1508:1: ( ( rule__Click__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1508:1: ( ( rule__Click__NameAssignment_1 ) )
            // InternalMyDsl.g:1509:2: ( rule__Click__NameAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1510:2: ( rule__Click__NameAssignment_1 )
            // InternalMyDsl.g:1510:3: rule__Click__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1519:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalMyDsl.g:1524:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
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
    // InternalMyDsl.g:1531:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( ( 'Fill' ) )
            // InternalMyDsl.g:1536:1: ( 'Fill' )
            {
            // InternalMyDsl.g:1536:1: ( 'Fill' )
            // InternalMyDsl.g:1537:2: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1546:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1550:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalMyDsl.g:1551:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
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
    // InternalMyDsl.g:1558:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__NametagAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( ( rule__Fill__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:1563:1: ( ( rule__Fill__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:1563:1: ( ( rule__Fill__NametagAssignment_1 ) )
            // InternalMyDsl.g:1564:2: ( rule__Fill__NametagAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:1565:2: ( rule__Fill__NametagAssignment_1 )
            // InternalMyDsl.g:1565:3: rule__Fill__NametagAssignment_1
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
    // InternalMyDsl.g:1573:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // InternalMyDsl.g:1578:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
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
    // InternalMyDsl.g:1585:1: rule__Fill__Group__2__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( 'with' ) )
            // InternalMyDsl.g:1590:1: ( 'with' )
            {
            // InternalMyDsl.g:1590:1: ( 'with' )
            // InternalMyDsl.g:1591:2: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1600:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( rule__Fill__Group__3__Impl )
            // InternalMyDsl.g:1605:2: rule__Fill__Group__3__Impl
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
    // InternalMyDsl.g:1611:1: rule__Fill__Group__3__Impl : ( ( rule__Fill__ContentAssignment_3 ) ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( ( rule__Fill__ContentAssignment_3 ) ) )
            // InternalMyDsl.g:1616:1: ( ( rule__Fill__ContentAssignment_3 ) )
            {
            // InternalMyDsl.g:1616:1: ( ( rule__Fill__ContentAssignment_3 ) )
            // InternalMyDsl.g:1617:2: ( rule__Fill__ContentAssignment_3 )
            {
             before(grammarAccess.getFillAccess().getContentAssignment_3()); 
            // InternalMyDsl.g:1618:2: ( rule__Fill__ContentAssignment_3 )
            // InternalMyDsl.g:1618:3: rule__Fill__ContentAssignment_3
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
    // InternalMyDsl.g:1627:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // InternalMyDsl.g:1632:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
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
    // InternalMyDsl.g:1639:1: rule__CheckBox__Group__0__Impl : ( 'CheckBox' ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( ( 'CheckBox' ) )
            // InternalMyDsl.g:1644:1: ( 'CheckBox' )
            {
            // InternalMyDsl.g:1644:1: ( 'CheckBox' )
            // InternalMyDsl.g:1645:2: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1654:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // InternalMyDsl.g:1659:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1666:1: rule__CheckBox__Group__1__Impl : ( ( rule__CheckBox__NametagAssignment_1 ) ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ( rule__CheckBox__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:1671:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:1671:1: ( ( rule__CheckBox__NametagAssignment_1 ) )
            // InternalMyDsl.g:1672:2: ( rule__CheckBox__NametagAssignment_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:1673:2: ( rule__CheckBox__NametagAssignment_1 )
            // InternalMyDsl.g:1673:3: rule__CheckBox__NametagAssignment_1
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
    // InternalMyDsl.g:1681:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( rule__CheckBox__Group__2__Impl )
            // InternalMyDsl.g:1686:2: rule__CheckBox__Group__2__Impl
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
    // InternalMyDsl.g:1692:1: rule__CheckBox__Group__2__Impl : ( ( rule__CheckBox__Group_2__0 )? ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( ( rule__CheckBox__Group_2__0 )? ) )
            // InternalMyDsl.g:1697:1: ( ( rule__CheckBox__Group_2__0 )? )
            {
            // InternalMyDsl.g:1697:1: ( ( rule__CheckBox__Group_2__0 )? )
            // InternalMyDsl.g:1698:2: ( rule__CheckBox__Group_2__0 )?
            {
             before(grammarAccess.getCheckBoxAccess().getGroup_2()); 
            // InternalMyDsl.g:1699:2: ( rule__CheckBox__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1699:3: rule__CheckBox__Group_2__0
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
    // InternalMyDsl.g:1708:1: rule__CheckBox__Group_2__0 : rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 ;
    public final void rule__CheckBox__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1 )
            // InternalMyDsl.g:1713:2: rule__CheckBox__Group_2__0__Impl rule__CheckBox__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1720:1: rule__CheckBox__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__CheckBox__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( ( 'to' ) )
            // InternalMyDsl.g:1725:1: ( 'to' )
            {
            // InternalMyDsl.g:1725:1: ( 'to' )
            // InternalMyDsl.g:1726:2: 'to'
            {
             before(grammarAccess.getCheckBoxAccess().getToKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1735:1: rule__CheckBox__Group_2__1 : rule__CheckBox__Group_2__1__Impl ;
    public final void rule__CheckBox__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( rule__CheckBox__Group_2__1__Impl )
            // InternalMyDsl.g:1740:2: rule__CheckBox__Group_2__1__Impl
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
    // InternalMyDsl.g:1746:1: rule__CheckBox__Group_2__1__Impl : ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) ;
    public final void rule__CheckBox__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( ( rule__CheckBox__NewValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:1751:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1751:1: ( ( rule__CheckBox__NewValueAssignment_2_1 ) )
            // InternalMyDsl.g:1752:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAssignment_2_1()); 
            // InternalMyDsl.g:1753:2: ( rule__CheckBox__NewValueAssignment_2_1 )
            // InternalMyDsl.g:1753:3: rule__CheckBox__NewValueAssignment_2_1
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
    // InternalMyDsl.g:1762:1: rule__Rickroll__Group__0 : rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 ;
    public final void rule__Rickroll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1 )
            // InternalMyDsl.g:1767:2: rule__Rickroll__Group__0__Impl rule__Rickroll__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1774:1: rule__Rickroll__Group__0__Impl : ( () ) ;
    public final void rule__Rickroll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( ( () ) )
            // InternalMyDsl.g:1779:1: ( () )
            {
            // InternalMyDsl.g:1779:1: ( () )
            // InternalMyDsl.g:1780:2: ()
            {
             before(grammarAccess.getRickrollAccess().getRickrollAction_0()); 
            // InternalMyDsl.g:1781:2: ()
            // InternalMyDsl.g:1781:3: 
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
    // InternalMyDsl.g:1789:1: rule__Rickroll__Group__1 : rule__Rickroll__Group__1__Impl ;
    public final void rule__Rickroll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( rule__Rickroll__Group__1__Impl )
            // InternalMyDsl.g:1794:2: rule__Rickroll__Group__1__Impl
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
    // InternalMyDsl.g:1800:1: rule__Rickroll__Group__1__Impl : ( 'RickRoll' ) ;
    public final void rule__Rickroll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( 'RickRoll' ) )
            // InternalMyDsl.g:1805:1: ( 'RickRoll' )
            {
            // InternalMyDsl.g:1805:1: ( 'RickRoll' )
            // InternalMyDsl.g:1806:2: 'RickRoll'
            {
             before(grammarAccess.getRickrollAccess().getRickRollKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1816:1: rule__DoWait__Group__0 : rule__DoWait__Group__0__Impl rule__DoWait__Group__1 ;
    public final void rule__DoWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( rule__DoWait__Group__0__Impl rule__DoWait__Group__1 )
            // InternalMyDsl.g:1821:2: rule__DoWait__Group__0__Impl rule__DoWait__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1828:1: rule__DoWait__Group__0__Impl : ( 'Wait' ) ;
    public final void rule__DoWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( 'Wait' ) )
            // InternalMyDsl.g:1833:1: ( 'Wait' )
            {
            // InternalMyDsl.g:1833:1: ( 'Wait' )
            // InternalMyDsl.g:1834:2: 'Wait'
            {
             before(grammarAccess.getDoWaitAccess().getWaitKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1843:1: rule__DoWait__Group__1 : rule__DoWait__Group__1__Impl rule__DoWait__Group__2 ;
    public final void rule__DoWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( rule__DoWait__Group__1__Impl rule__DoWait__Group__2 )
            // InternalMyDsl.g:1848:2: rule__DoWait__Group__1__Impl rule__DoWait__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1855:1: rule__DoWait__Group__1__Impl : ( 'for' ) ;
    public final void rule__DoWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( ( 'for' ) )
            // InternalMyDsl.g:1860:1: ( 'for' )
            {
            // InternalMyDsl.g:1860:1: ( 'for' )
            // InternalMyDsl.g:1861:2: 'for'
            {
             before(grammarAccess.getDoWaitAccess().getForKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:1870:1: rule__DoWait__Group__2 : rule__DoWait__Group__2__Impl rule__DoWait__Group__3 ;
    public final void rule__DoWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( rule__DoWait__Group__2__Impl rule__DoWait__Group__3 )
            // InternalMyDsl.g:1875:2: rule__DoWait__Group__2__Impl rule__DoWait__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1882:1: rule__DoWait__Group__2__Impl : ( ( rule__DoWait__MillisecAssignment_2 ) ) ;
    public final void rule__DoWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( ( ( rule__DoWait__MillisecAssignment_2 ) ) )
            // InternalMyDsl.g:1887:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            {
            // InternalMyDsl.g:1887:1: ( ( rule__DoWait__MillisecAssignment_2 ) )
            // InternalMyDsl.g:1888:2: ( rule__DoWait__MillisecAssignment_2 )
            {
             before(grammarAccess.getDoWaitAccess().getMillisecAssignment_2()); 
            // InternalMyDsl.g:1889:2: ( rule__DoWait__MillisecAssignment_2 )
            // InternalMyDsl.g:1889:3: rule__DoWait__MillisecAssignment_2
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
    // InternalMyDsl.g:1897:1: rule__DoWait__Group__3 : rule__DoWait__Group__3__Impl ;
    public final void rule__DoWait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( rule__DoWait__Group__3__Impl )
            // InternalMyDsl.g:1902:2: rule__DoWait__Group__3__Impl
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
    // InternalMyDsl.g:1908:1: rule__DoWait__Group__3__Impl : ( 'milliseconds' ) ;
    public final void rule__DoWait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( 'milliseconds' ) )
            // InternalMyDsl.g:1913:1: ( 'milliseconds' )
            {
            // InternalMyDsl.g:1913:1: ( 'milliseconds' )
            // InternalMyDsl.g:1914:2: 'milliseconds'
            {
             before(grammarAccess.getDoWaitAccess().getMillisecondsKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:1924:1: rule__IsIn__Group__0 : rule__IsIn__Group__0__Impl rule__IsIn__Group__1 ;
    public final void rule__IsIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( rule__IsIn__Group__0__Impl rule__IsIn__Group__1 )
            // InternalMyDsl.g:1929:2: rule__IsIn__Group__0__Impl rule__IsIn__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1936:1: rule__IsIn__Group__0__Impl : ( ( rule__IsIn__ObjAssignment_0 ) ) ;
    public final void rule__IsIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( ( rule__IsIn__ObjAssignment_0 ) ) )
            // InternalMyDsl.g:1941:1: ( ( rule__IsIn__ObjAssignment_0 ) )
            {
            // InternalMyDsl.g:1941:1: ( ( rule__IsIn__ObjAssignment_0 ) )
            // InternalMyDsl.g:1942:2: ( rule__IsIn__ObjAssignment_0 )
            {
             before(grammarAccess.getIsInAccess().getObjAssignment_0()); 
            // InternalMyDsl.g:1943:2: ( rule__IsIn__ObjAssignment_0 )
            // InternalMyDsl.g:1943:3: rule__IsIn__ObjAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__ObjAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getObjAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1951:1: rule__IsIn__Group__1 : rule__IsIn__Group__1__Impl rule__IsIn__Group__2 ;
    public final void rule__IsIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( rule__IsIn__Group__1__Impl rule__IsIn__Group__2 )
            // InternalMyDsl.g:1956:2: rule__IsIn__Group__1__Impl rule__IsIn__Group__2
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
    // InternalMyDsl.g:1963:1: rule__IsIn__Group__1__Impl : ( 'contains' ) ;
    public final void rule__IsIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( ( 'contains' ) )
            // InternalMyDsl.g:1968:1: ( 'contains' )
            {
            // InternalMyDsl.g:1968:1: ( 'contains' )
            // InternalMyDsl.g:1969:2: 'contains'
            {
             before(grammarAccess.getIsInAccess().getContainsKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:1978:1: rule__IsIn__Group__2 : rule__IsIn__Group__2__Impl ;
    public final void rule__IsIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( rule__IsIn__Group__2__Impl )
            // InternalMyDsl.g:1983:2: rule__IsIn__Group__2__Impl
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
    // InternalMyDsl.g:1989:1: rule__IsIn__Group__2__Impl : ( ( rule__IsIn__TextAssignment_2 ) ) ;
    public final void rule__IsIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( ( rule__IsIn__TextAssignment_2 ) ) )
            // InternalMyDsl.g:1994:1: ( ( rule__IsIn__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:1994:1: ( ( rule__IsIn__TextAssignment_2 ) )
            // InternalMyDsl.g:1995:2: ( rule__IsIn__TextAssignment_2 )
            {
             before(grammarAccess.getIsInAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:1996:2: ( rule__IsIn__TextAssignment_2 )
            // InternalMyDsl.g:1996:3: rule__IsIn__TextAssignment_2
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
    // InternalMyDsl.g:2005:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2009:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMyDsl.g:2010:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2017:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( ( 'Not' ) )
            // InternalMyDsl.g:2022:1: ( 'Not' )
            {
            // InternalMyDsl.g:2022:1: ( 'Not' )
            // InternalMyDsl.g:2023:2: 'Not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2032:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( rule__Not__Group__1__Impl )
            // InternalMyDsl.g:2037:2: rule__Not__Group__1__Impl
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
    // InternalMyDsl.g:2043:1: rule__Not__Group__1__Impl : ( ( rule__Not__CondAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( ( rule__Not__CondAssignment_1 ) ) )
            // InternalMyDsl.g:2048:1: ( ( rule__Not__CondAssignment_1 ) )
            {
            // InternalMyDsl.g:2048:1: ( ( rule__Not__CondAssignment_1 ) )
            // InternalMyDsl.g:2049:2: ( rule__Not__CondAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getCondAssignment_1()); 
            // InternalMyDsl.g:2050:2: ( rule__Not__CondAssignment_1 )
            // InternalMyDsl.g:2050:3: rule__Not__CondAssignment_1
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
    // InternalMyDsl.g:2059:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:2064:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalMyDsl.g:2071:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( ( 'If' ) )
            // InternalMyDsl.g:2076:1: ( 'If' )
            {
            // InternalMyDsl.g:2076:1: ( 'If' )
            // InternalMyDsl.g:2077:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2086:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2091:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2098:1: rule__If__Group__1__Impl : ( ':' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( ( ':' ) )
            // InternalMyDsl.g:2103:1: ( ':' )
            {
            // InternalMyDsl.g:2103:1: ( ':' )
            // InternalMyDsl.g:2104:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2113:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2118:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2125:1: rule__If__Group__2__Impl : ( ( rule__If__CondAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( ( ( rule__If__CondAssignment_2 ) ) )
            // InternalMyDsl.g:2130:1: ( ( rule__If__CondAssignment_2 ) )
            {
            // InternalMyDsl.g:2130:1: ( ( rule__If__CondAssignment_2 ) )
            // InternalMyDsl.g:2131:2: ( rule__If__CondAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getCondAssignment_2()); 
            // InternalMyDsl.g:2132:2: ( rule__If__CondAssignment_2 )
            // InternalMyDsl.g:2132:3: rule__If__CondAssignment_2
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
    // InternalMyDsl.g:2140:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalMyDsl.g:2145:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalMyDsl.g:2152:1: rule__If__Group__3__Impl : ( 'Then' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( ( 'Then' ) )
            // InternalMyDsl.g:2157:1: ( 'Then' )
            {
            // InternalMyDsl.g:2157:1: ( 'Then' )
            // InternalMyDsl.g:2158:2: 'Then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2167:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalMyDsl.g:2172:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2179:1: rule__If__Group__4__Impl : ( ':' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( ( ':' ) )
            // InternalMyDsl.g:2184:1: ( ':' )
            {
            // InternalMyDsl.g:2184:1: ( ':' )
            // InternalMyDsl.g:2185:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2194:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalMyDsl.g:2199:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2206:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( '{' ) )
            // InternalMyDsl.g:2211:1: ( '{' )
            {
            // InternalMyDsl.g:2211:1: ( '{' )
            // InternalMyDsl.g:2212:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2221:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalMyDsl.g:2226:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2233:1: rule__If__Group__6__Impl : ( ( rule__If__ActionThenAssignment_6 )* ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( ( ( rule__If__ActionThenAssignment_6 )* ) )
            // InternalMyDsl.g:2238:1: ( ( rule__If__ActionThenAssignment_6 )* )
            {
            // InternalMyDsl.g:2238:1: ( ( rule__If__ActionThenAssignment_6 )* )
            // InternalMyDsl.g:2239:2: ( rule__If__ActionThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getActionThenAssignment_6()); 
            // InternalMyDsl.g:2240:2: ( rule__If__ActionThenAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=25 && LA11_0<=27)||LA11_0==29||(LA11_0>=31 && LA11_0<=33)||(LA11_0>=35 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2240:3: rule__If__ActionThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__If__ActionThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:2248:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalMyDsl.g:2253:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2260:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( ( '}' ) )
            // InternalMyDsl.g:2265:1: ( '}' )
            {
            // InternalMyDsl.g:2265:1: ( '}' )
            // InternalMyDsl.g:2266:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:2275:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2279:1: ( rule__If__Group__8__Impl )
            // InternalMyDsl.g:2280:2: rule__If__Group__8__Impl
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
    // InternalMyDsl.g:2286:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalMyDsl.g:2291:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalMyDsl.g:2291:1: ( ( rule__If__Group_8__0 )? )
            // InternalMyDsl.g:2292:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalMyDsl.g:2293:2: ( rule__If__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2293:3: rule__If__Group_8__0
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
    // InternalMyDsl.g:2302:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalMyDsl.g:2307:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
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
    // InternalMyDsl.g:2314:1: rule__If__Group_8__0__Impl : ( 'Else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( ( 'Else' ) )
            // InternalMyDsl.g:2319:1: ( 'Else' )
            {
            // InternalMyDsl.g:2319:1: ( 'Else' )
            // InternalMyDsl.g:2320:2: 'Else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:2329:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // InternalMyDsl.g:2334:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2341:1: rule__If__Group_8__1__Impl : ( ':' ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( ( ':' ) )
            // InternalMyDsl.g:2346:1: ( ':' )
            {
            // InternalMyDsl.g:2346:1: ( ':' )
            // InternalMyDsl.g:2347:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_8_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2356:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // InternalMyDsl.g:2361:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2368:1: rule__If__Group_8__2__Impl : ( '{' ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( ( '{' ) )
            // InternalMyDsl.g:2373:1: ( '{' )
            {
            // InternalMyDsl.g:2373:1: ( '{' )
            // InternalMyDsl.g:2374:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2383:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl rule__If__Group_8__4 ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( rule__If__Group_8__3__Impl rule__If__Group_8__4 )
            // InternalMyDsl.g:2388:2: rule__If__Group_8__3__Impl rule__If__Group_8__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2395:1: rule__If__Group_8__3__Impl : ( ( rule__If__ActionElseAssignment_8_3 )* ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( ( ( rule__If__ActionElseAssignment_8_3 )* ) )
            // InternalMyDsl.g:2400:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            {
            // InternalMyDsl.g:2400:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            // InternalMyDsl.g:2401:2: ( rule__If__ActionElseAssignment_8_3 )*
            {
             before(grammarAccess.getIfAccess().getActionElseAssignment_8_3()); 
            // InternalMyDsl.g:2402:2: ( rule__If__ActionElseAssignment_8_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=25 && LA13_0<=27)||LA13_0==29||(LA13_0>=31 && LA13_0<=33)||(LA13_0>=35 && LA13_0<=36)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2402:3: rule__If__ActionElseAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__If__ActionElseAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2410:1: rule__If__Group_8__4 : rule__If__Group_8__4__Impl ;
    public final void rule__If__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2414:1: ( rule__If__Group_8__4__Impl )
            // InternalMyDsl.g:2415:2: rule__If__Group_8__4__Impl
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
    // InternalMyDsl.g:2421:1: rule__If__Group_8__4__Impl : ( '}' ) ;
    public final void rule__If__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( '}' ) )
            // InternalMyDsl.g:2426:1: ( '}' )
            {
            // InternalMyDsl.g:2426:1: ( '}' )
            // InternalMyDsl.g:2427:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:2437:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:2442:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalMyDsl.g:2449:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:2454:1: ( 'Loop' )
            {
            // InternalMyDsl.g:2454:1: ( 'Loop' )
            // InternalMyDsl.g:2455:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2464:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:2469:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2476:1: rule__Loop__Group__1__Impl : ( ':' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( ( ':' ) )
            // InternalMyDsl.g:2481:1: ( ':' )
            {
            // InternalMyDsl.g:2481:1: ( ':' )
            // InternalMyDsl.g:2482:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2491:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMyDsl.g:2496:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
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
    // InternalMyDsl.g:2503:1: rule__Loop__Group__2__Impl : ( 'Condition' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( ( 'Condition' ) )
            // InternalMyDsl.g:2508:1: ( 'Condition' )
            {
            // InternalMyDsl.g:2508:1: ( 'Condition' )
            // InternalMyDsl.g:2509:2: 'Condition'
            {
             before(grammarAccess.getLoopAccess().getConditionKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2518:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:2523:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2530:1: rule__Loop__Group__3__Impl : ( ':' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( ( ':' ) )
            // InternalMyDsl.g:2535:1: ( ':' )
            {
            // InternalMyDsl.g:2535:1: ( ':' )
            // InternalMyDsl.g:2536:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2545:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:2550:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2557:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__CondAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( ( ( rule__Loop__CondAssignment_4 ) ) )
            // InternalMyDsl.g:2562:1: ( ( rule__Loop__CondAssignment_4 ) )
            {
            // InternalMyDsl.g:2562:1: ( ( rule__Loop__CondAssignment_4 ) )
            // InternalMyDsl.g:2563:2: ( rule__Loop__CondAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getCondAssignment_4()); 
            // InternalMyDsl.g:2564:2: ( rule__Loop__CondAssignment_4 )
            // InternalMyDsl.g:2564:3: rule__Loop__CondAssignment_4
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
    // InternalMyDsl.g:2572:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:2577:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
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
    // InternalMyDsl.g:2584:1: rule__Loop__Group__5__Impl : ( 'Interval' ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( ( 'Interval' ) )
            // InternalMyDsl.g:2589:1: ( 'Interval' )
            {
            // InternalMyDsl.g:2589:1: ( 'Interval' )
            // InternalMyDsl.g:2590:2: 'Interval'
            {
             before(grammarAccess.getLoopAccess().getIntervalKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2599:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:2604:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2611:1: rule__Loop__Group__6__Impl : ( ':' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( ( ':' ) )
            // InternalMyDsl.g:2616:1: ( ':' )
            {
            // InternalMyDsl.g:2616:1: ( ':' )
            // InternalMyDsl.g:2617:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2626:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalMyDsl.g:2631:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2638:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__MillisecondsAssignment_7 ) ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( ( ( rule__Loop__MillisecondsAssignment_7 ) ) )
            // InternalMyDsl.g:2643:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            {
            // InternalMyDsl.g:2643:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            // InternalMyDsl.g:2644:2: ( rule__Loop__MillisecondsAssignment_7 )
            {
             before(grammarAccess.getLoopAccess().getMillisecondsAssignment_7()); 
            // InternalMyDsl.g:2645:2: ( rule__Loop__MillisecondsAssignment_7 )
            // InternalMyDsl.g:2645:3: rule__Loop__MillisecondsAssignment_7
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
    // InternalMyDsl.g:2653:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalMyDsl.g:2658:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
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
    // InternalMyDsl.g:2665:1: rule__Loop__Group__8__Impl : ( 'Do' ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( 'Do' ) )
            // InternalMyDsl.g:2670:1: ( 'Do' )
            {
            // InternalMyDsl.g:2670:1: ( 'Do' )
            // InternalMyDsl.g:2671:2: 'Do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_8()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:2680:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalMyDsl.g:2685:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2692:1: rule__Loop__Group__9__Impl : ( ':' ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( ':' ) )
            // InternalMyDsl.g:2697:1: ( ':' )
            {
            // InternalMyDsl.g:2697:1: ( ':' )
            // InternalMyDsl.g:2698:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2707:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalMyDsl.g:2712:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2719:1: rule__Loop__Group__10__Impl : ( '{' ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( '{' ) )
            // InternalMyDsl.g:2724:1: ( '{' )
            {
            // InternalMyDsl.g:2724:1: ( '{' )
            // InternalMyDsl.g:2725:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2734:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalMyDsl.g:2739:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2746:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__ActionsAssignment_11 )* ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( ( ( rule__Loop__ActionsAssignment_11 )* ) )
            // InternalMyDsl.g:2751:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            {
            // InternalMyDsl.g:2751:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            // InternalMyDsl.g:2752:2: ( rule__Loop__ActionsAssignment_11 )*
            {
             before(grammarAccess.getLoopAccess().getActionsAssignment_11()); 
            // InternalMyDsl.g:2753:2: ( rule__Loop__ActionsAssignment_11 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=25 && LA14_0<=27)||LA14_0==29||(LA14_0>=31 && LA14_0<=33)||(LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2753:3: rule__Loop__ActionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Loop__ActionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:2761:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( rule__Loop__Group__12__Impl )
            // InternalMyDsl.g:2766:2: rule__Loop__Group__12__Impl
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
    // InternalMyDsl.g:2772:1: rule__Loop__Group__12__Impl : ( '}' ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( ( '}' ) )
            // InternalMyDsl.g:2777:1: ( '}' )
            {
            // InternalMyDsl.g:2777:1: ( '}' )
            // InternalMyDsl.g:2778:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_12()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:2788:1: rule__DoAll__Group__0 : rule__DoAll__Group__0__Impl rule__DoAll__Group__1 ;
    public final void rule__DoAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( rule__DoAll__Group__0__Impl rule__DoAll__Group__1 )
            // InternalMyDsl.g:2793:2: rule__DoAll__Group__0__Impl rule__DoAll__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2800:1: rule__DoAll__Group__0__Impl : ( 'For' ) ;
    public final void rule__DoAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( 'For' ) )
            // InternalMyDsl.g:2805:1: ( 'For' )
            {
            // InternalMyDsl.g:2805:1: ( 'For' )
            // InternalMyDsl.g:2806:2: 'For'
            {
             before(grammarAccess.getDoAllAccess().getForKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2815:1: rule__DoAll__Group__1 : rule__DoAll__Group__1__Impl rule__DoAll__Group__2 ;
    public final void rule__DoAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( rule__DoAll__Group__1__Impl rule__DoAll__Group__2 )
            // InternalMyDsl.g:2820:2: rule__DoAll__Group__1__Impl rule__DoAll__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:2827:1: rule__DoAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__DoAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( 'all' ) )
            // InternalMyDsl.g:2832:1: ( 'all' )
            {
            // InternalMyDsl.g:2832:1: ( 'all' )
            // InternalMyDsl.g:2833:2: 'all'
            {
             before(grammarAccess.getDoAllAccess().getAllKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2842:1: rule__DoAll__Group__2 : rule__DoAll__Group__2__Impl rule__DoAll__Group__3 ;
    public final void rule__DoAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( rule__DoAll__Group__2__Impl rule__DoAll__Group__3 )
            // InternalMyDsl.g:2847:2: rule__DoAll__Group__2__Impl rule__DoAll__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2854:1: rule__DoAll__Group__2__Impl : ( 'in' ) ;
    public final void rule__DoAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( ( 'in' ) )
            // InternalMyDsl.g:2859:1: ( 'in' )
            {
            // InternalMyDsl.g:2859:1: ( 'in' )
            // InternalMyDsl.g:2860:2: 'in'
            {
             before(grammarAccess.getDoAllAccess().getInKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:2869:1: rule__DoAll__Group__3 : rule__DoAll__Group__3__Impl rule__DoAll__Group__4 ;
    public final void rule__DoAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( rule__DoAll__Group__3__Impl rule__DoAll__Group__4 )
            // InternalMyDsl.g:2874:2: rule__DoAll__Group__3__Impl rule__DoAll__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:2881:1: rule__DoAll__Group__3__Impl : ( ( rule__DoAll__CollAssignment_3 ) ) ;
    public final void rule__DoAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( ( ( rule__DoAll__CollAssignment_3 ) ) )
            // InternalMyDsl.g:2886:1: ( ( rule__DoAll__CollAssignment_3 ) )
            {
            // InternalMyDsl.g:2886:1: ( ( rule__DoAll__CollAssignment_3 ) )
            // InternalMyDsl.g:2887:2: ( rule__DoAll__CollAssignment_3 )
            {
             before(grammarAccess.getDoAllAccess().getCollAssignment_3()); 
            // InternalMyDsl.g:2888:2: ( rule__DoAll__CollAssignment_3 )
            // InternalMyDsl.g:2888:3: rule__DoAll__CollAssignment_3
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
    // InternalMyDsl.g:2896:1: rule__DoAll__Group__4 : rule__DoAll__Group__4__Impl rule__DoAll__Group__5 ;
    public final void rule__DoAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( rule__DoAll__Group__4__Impl rule__DoAll__Group__5 )
            // InternalMyDsl.g:2901:2: rule__DoAll__Group__4__Impl rule__DoAll__Group__5
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
    // InternalMyDsl.g:2908:1: rule__DoAll__Group__4__Impl : ( 'do' ) ;
    public final void rule__DoAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( 'do' ) )
            // InternalMyDsl.g:2913:1: ( 'do' )
            {
            // InternalMyDsl.g:2913:1: ( 'do' )
            // InternalMyDsl.g:2914:2: 'do'
            {
             before(grammarAccess.getDoAllAccess().getDoKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:2923:1: rule__DoAll__Group__5 : rule__DoAll__Group__5__Impl rule__DoAll__Group__6 ;
    public final void rule__DoAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( rule__DoAll__Group__5__Impl rule__DoAll__Group__6 )
            // InternalMyDsl.g:2928:2: rule__DoAll__Group__5__Impl rule__DoAll__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2935:1: rule__DoAll__Group__5__Impl : ( ':' ) ;
    public final void rule__DoAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( ( ':' ) )
            // InternalMyDsl.g:2940:1: ( ':' )
            {
            // InternalMyDsl.g:2940:1: ( ':' )
            // InternalMyDsl.g:2941:2: ':'
            {
             before(grammarAccess.getDoAllAccess().getColonKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2950:1: rule__DoAll__Group__6 : rule__DoAll__Group__6__Impl rule__DoAll__Group__7 ;
    public final void rule__DoAll__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2954:1: ( rule__DoAll__Group__6__Impl rule__DoAll__Group__7 )
            // InternalMyDsl.g:2955:2: rule__DoAll__Group__6__Impl rule__DoAll__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:2962:1: rule__DoAll__Group__6__Impl : ( '{' ) ;
    public final void rule__DoAll__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( '{' ) )
            // InternalMyDsl.g:2967:1: ( '{' )
            {
            // InternalMyDsl.g:2967:1: ( '{' )
            // InternalMyDsl.g:2968:2: '{'
            {
             before(grammarAccess.getDoAllAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2977:1: rule__DoAll__Group__7 : rule__DoAll__Group__7__Impl rule__DoAll__Group__8 ;
    public final void rule__DoAll__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( rule__DoAll__Group__7__Impl rule__DoAll__Group__8 )
            // InternalMyDsl.g:2982:2: rule__DoAll__Group__7__Impl rule__DoAll__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:2989:1: rule__DoAll__Group__7__Impl : ( ( rule__DoAll__TodoAssignment_7 )* ) ;
    public final void rule__DoAll__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( ( rule__DoAll__TodoAssignment_7 )* ) )
            // InternalMyDsl.g:2994:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            {
            // InternalMyDsl.g:2994:1: ( ( rule__DoAll__TodoAssignment_7 )* )
            // InternalMyDsl.g:2995:2: ( rule__DoAll__TodoAssignment_7 )*
            {
             before(grammarAccess.getDoAllAccess().getTodoAssignment_7()); 
            // InternalMyDsl.g:2996:2: ( rule__DoAll__TodoAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=27)||LA15_0==29||(LA15_0>=31 && LA15_0<=33)||(LA15_0>=35 && LA15_0<=36)||LA15_0==41||LA15_0==46||LA15_0==50) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2996:3: rule__DoAll__TodoAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DoAll__TodoAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:3004:1: rule__DoAll__Group__8 : rule__DoAll__Group__8__Impl ;
    public final void rule__DoAll__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( rule__DoAll__Group__8__Impl )
            // InternalMyDsl.g:3009:2: rule__DoAll__Group__8__Impl
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
    // InternalMyDsl.g:3015:1: rule__DoAll__Group__8__Impl : ( '}' ) ;
    public final void rule__DoAll__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( '}' ) )
            // InternalMyDsl.g:3020:1: ( '}' )
            {
            // InternalMyDsl.g:3020:1: ( '}' )
            // InternalMyDsl.g:3021:2: '}'
            {
             before(grammarAccess.getDoAllAccess().getRightCurlyBracketKeyword_8()); 
            match(input,44,FOLLOW_2); 
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


    // $ANTLR start "rule__Main__FileNameAssignment_1"
    // InternalMyDsl.g:3031:1: rule__Main__FileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Main__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3036:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3036:2: ( RULE_STRING )
            // InternalMyDsl.g:3037:3: RULE_STRING
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
    // InternalMyDsl.g:3046:1: rule__Main__BrowserNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Main__BrowserNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3051:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3051:2: ( RULE_STRING )
            // InternalMyDsl.g:3052:3: RULE_STRING
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
    // InternalMyDsl.g:3061:1: rule__Main__OrdersAssignment_6 : ( ( rule__Main__OrdersAlternatives_6_0 ) ) ;
    public final void rule__Main__OrdersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( ( rule__Main__OrdersAlternatives_6_0 ) ) )
            // InternalMyDsl.g:3066:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            {
            // InternalMyDsl.g:3066:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            // InternalMyDsl.g:3067:3: ( rule__Main__OrdersAlternatives_6_0 )
            {
             before(grammarAccess.getMainAccess().getOrdersAlternatives_6_0()); 
            // InternalMyDsl.g:3068:3: ( rule__Main__OrdersAlternatives_6_0 )
            // InternalMyDsl.g:3068:4: rule__Main__OrdersAlternatives_6_0
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


    // $ANTLR start "rule__Object__BodyAssignment_0"
    // InternalMyDsl.g:3076:1: rule__Object__BodyAssignment_0 : ( ( 'body' ) ) ;
    public final void rule__Object__BodyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( ( ( 'body' ) ) )
            // InternalMyDsl.g:3081:2: ( ( 'body' ) )
            {
            // InternalMyDsl.g:3081:2: ( ( 'body' ) )
            // InternalMyDsl.g:3082:3: ( 'body' )
            {
             before(grammarAccess.getObjectAccess().getBodyBodyKeyword_0_0()); 
            // InternalMyDsl.g:3083:3: ( 'body' )
            // InternalMyDsl.g:3084:4: 'body'
            {
             before(grammarAccess.getObjectAccess().getBodyBodyKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getBodyBodyKeyword_0_0()); 

            }

             after(grammarAccess.getObjectAccess().getBodyBodyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__BodyAssignment_0"


    // $ANTLR start "rule__Object__HtmltypeAssignment_1_1_0"
    // InternalMyDsl.g:3095:1: rule__Object__HtmltypeAssignment_1_1_0 : ( ruleHTMLTYPE ) ;
    public final void rule__Object__HtmltypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:3100:2: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:3100:2: ( ruleHTMLTYPE )
            // InternalMyDsl.g:3101:3: ruleHTMLTYPE
            {
             before(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLTYPE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__HtmltypeAssignment_1_1_0"


    // $ANTLR start "rule__Object__ObjectNameAssignment_1_1_1"
    // InternalMyDsl.g:3110:1: rule__Object__ObjectNameAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Object__ObjectNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3114:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3115:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3115:2: ( RULE_STRING )
            // InternalMyDsl.g:3116:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getObjectNameSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectNameSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ObjectNameAssignment_1_1_1"


    // $ANTLR start "rule__HTMLTYPE__TypeAssignment"
    // InternalMyDsl.g:3125:1: rule__HTMLTYPE__TypeAssignment : ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) ;
    public final void rule__HTMLTYPE__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3129:1: ( ( ( rule__HTMLTYPE__TypeAlternatives_0 ) ) )
            // InternalMyDsl.g:3130:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            {
            // InternalMyDsl.g:3130:2: ( ( rule__HTMLTYPE__TypeAlternatives_0 ) )
            // InternalMyDsl.g:3131:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            {
             before(grammarAccess.getHTMLTYPEAccess().getTypeAlternatives_0()); 
            // InternalMyDsl.g:3132:3: ( rule__HTMLTYPE__TypeAlternatives_0 )
            // InternalMyDsl.g:3132:4: rule__HTMLTYPE__TypeAlternatives_0
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


    // $ANTLR start "rule__Collection__ObjAssignment"
    // InternalMyDsl.g:3140:1: rule__Collection__ObjAssignment : ( ruleObject ) ;
    public final void rule__Collection__ObjAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3144:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3145:2: ( ruleObject )
            {
            // InternalMyDsl.g:3145:2: ( ruleObject )
            // InternalMyDsl.g:3146:3: ruleObject
            {
             before(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__ObjAssignment"


    // $ANTLR start "rule__Navigate__UrlAssignment_1"
    // InternalMyDsl.g:3155:1: rule__Navigate__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3160:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3160:2: ( RULE_STRING )
            // InternalMyDsl.g:3161:3: RULE_STRING
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


    // $ANTLR start "rule__Store__ObjAssignment_1"
    // InternalMyDsl.g:3170:1: rule__Store__ObjAssignment_1 : ( ruleObject ) ;
    public final void rule__Store__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3174:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3175:2: ( ruleObject )
            {
            // InternalMyDsl.g:3175:2: ( ruleObject )
            // InternalMyDsl.g:3176:3: ruleObject
            {
             before(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ObjAssignment_1"


    // $ANTLR start "rule__Store__ObjNameAssignment_3"
    // InternalMyDsl.g:3185:1: rule__Store__ObjNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Store__ObjNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3189:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3190:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3190:2: ( RULE_STRING )
            // InternalMyDsl.g:3191:3: RULE_STRING
            {
             before(grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ObjNameAssignment_3"


    // $ANTLR start "rule__ActionSelect__OptionAssignment_1"
    // InternalMyDsl.g:3200:1: rule__ActionSelect__OptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3204:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3205:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3205:2: ( RULE_STRING )
            // InternalMyDsl.g:3206:3: RULE_STRING
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
    // InternalMyDsl.g:3215:1: rule__ActionSelect__XpathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ActionSelect__XpathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3219:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3220:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3220:2: ( RULE_STRING )
            // InternalMyDsl.g:3221:3: RULE_STRING
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


    // $ANTLR start "rule__Click__NameAssignment_1"
    // InternalMyDsl.g:3230:1: rule__Click__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Click__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3234:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3235:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3235:2: ( RULE_STRING )
            // InternalMyDsl.g:3236:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__NameAssignment_1"


    // $ANTLR start "rule__Fill__NametagAssignment_1"
    // InternalMyDsl.g:3245:1: rule__Fill__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3250:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3250:2: ( RULE_STRING )
            // InternalMyDsl.g:3251:3: RULE_STRING
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
    // InternalMyDsl.g:3260:1: rule__Fill__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Fill__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3264:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3265:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3265:2: ( RULE_STRING )
            // InternalMyDsl.g:3266:3: RULE_STRING
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
    // InternalMyDsl.g:3275:1: rule__CheckBox__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CheckBox__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3279:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3280:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3280:2: ( RULE_STRING )
            // InternalMyDsl.g:3281:3: RULE_STRING
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
    // InternalMyDsl.g:3290:1: rule__CheckBox__NewValueAssignment_2_1 : ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) ;
    public final void rule__CheckBox__NewValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3294:1: ( ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:3295:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:3295:2: ( ( rule__CheckBox__NewValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:3296:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getCheckBoxAccess().getNewValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:3297:3: ( rule__CheckBox__NewValueAlternatives_2_1_0 )
            // InternalMyDsl.g:3297:4: rule__CheckBox__NewValueAlternatives_2_1_0
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
    // InternalMyDsl.g:3305:1: rule__DoWait__MillisecAssignment_2 : ( RULE_INT ) ;
    public final void rule__DoWait__MillisecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3309:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3310:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3310:2: ( RULE_INT )
            // InternalMyDsl.g:3311:3: RULE_INT
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


    // $ANTLR start "rule__IsIn__ObjAssignment_0"
    // InternalMyDsl.g:3320:1: rule__IsIn__ObjAssignment_0 : ( ruleObject ) ;
    public final void rule__IsIn__ObjAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3324:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3325:2: ( ruleObject )
            {
            // InternalMyDsl.g:3325:2: ( ruleObject )
            // InternalMyDsl.g:3326:3: ruleObject
            {
             before(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__ObjAssignment_0"


    // $ANTLR start "rule__IsIn__TextAssignment_2"
    // InternalMyDsl.g:3335:1: rule__IsIn__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IsIn__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3339:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3340:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3340:2: ( RULE_STRING )
            // InternalMyDsl.g:3341:3: RULE_STRING
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
    // InternalMyDsl.g:3350:1: rule__Not__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3354:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3355:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3355:2: ( ruleCondition )
            // InternalMyDsl.g:3356:3: ruleCondition
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
    // InternalMyDsl.g:3365:1: rule__If__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__If__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3370:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3370:2: ( ruleCondition )
            // InternalMyDsl.g:3371:3: ruleCondition
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
    // InternalMyDsl.g:3380:1: rule__If__ActionThenAssignment_6 : ( ruleAction ) ;
    public final void rule__If__ActionThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3384:1: ( ( ruleAction ) )
            // InternalMyDsl.g:3385:2: ( ruleAction )
            {
            // InternalMyDsl.g:3385:2: ( ruleAction )
            // InternalMyDsl.g:3386:3: ruleAction
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
    // InternalMyDsl.g:3395:1: rule__If__ActionElseAssignment_8_3 : ( ruleAction ) ;
    public final void rule__If__ActionElseAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( ( ruleAction ) )
            // InternalMyDsl.g:3400:2: ( ruleAction )
            {
            // InternalMyDsl.g:3400:2: ( ruleAction )
            // InternalMyDsl.g:3401:3: ruleAction
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
    // InternalMyDsl.g:3410:1: rule__Loop__CondAssignment_4 : ( ruleCondition ) ;
    public final void rule__Loop__CondAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3414:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3415:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3415:2: ( ruleCondition )
            // InternalMyDsl.g:3416:3: ruleCondition
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
    // InternalMyDsl.g:3425:1: rule__Loop__MillisecondsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Loop__MillisecondsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3430:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3430:2: ( RULE_INT )
            // InternalMyDsl.g:3431:3: RULE_INT
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
    // InternalMyDsl.g:3440:1: rule__Loop__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__Loop__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( ( ruleAction ) )
            // InternalMyDsl.g:3445:2: ( ruleAction )
            {
            // InternalMyDsl.g:3445:2: ( ruleAction )
            // InternalMyDsl.g:3446:3: ruleAction
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
    // InternalMyDsl.g:3455:1: rule__DoAll__CollAssignment_3 : ( ruleCollection ) ;
    public final void rule__DoAll__CollAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3459:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:3460:2: ( ruleCollection )
            {
            // InternalMyDsl.g:3460:2: ( ruleCollection )
            // InternalMyDsl.g:3461:3: ruleCollection
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
    // InternalMyDsl.g:3470:1: rule__DoAll__TodoAssignment_7 : ( ( rule__DoAll__TodoAlternatives_7_0 ) ) ;
    public final void rule__DoAll__TodoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3474:1: ( ( ( rule__DoAll__TodoAlternatives_7_0 ) ) )
            // InternalMyDsl.g:3475:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            {
            // InternalMyDsl.g:3475:2: ( ( rule__DoAll__TodoAlternatives_7_0 ) )
            // InternalMyDsl.g:3476:3: ( rule__DoAll__TodoAlternatives_7_0 )
            {
             before(grammarAccess.getDoAllAccess().getTodoAlternatives_7_0()); 
            // InternalMyDsl.g:3477:3: ( rule__DoAll__TodoAlternatives_7_0 )
            // InternalMyDsl.g:3477:4: rule__DoAll__TodoAlternatives_7_0
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004421BAE000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004421BAE000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040010000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000101BAE000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001BAE000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004521BAE000000L});

}