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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Refresh'", "'class'", "'id'", "'name'", "'File'", "'with'", "'browser'", "':'", "'Alert'", "'Navigate'", "'Store'", "'as'", "'Click'", "'Fill'", "'SetCheckBox'", "'Is'", "'in'", "'?'", "'Not'", "'If'", "'Then'", "'{'", "'}'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'all'", "'do'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:162:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Object__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Object__Group__0 )
            // InternalMyDsl.g:169:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:187:1: ruleHTMLTYPE : ( ( rule__HTMLTYPE__Alternatives ) ) ;
    public final void ruleHTMLTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__HTMLTYPE__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__HTMLTYPE__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__HTMLTYPE__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__HTMLTYPE__Alternatives )
            {
             before(grammarAccess.getHTMLTYPEAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__HTMLTYPE__Alternatives )
            // InternalMyDsl.g:194:4: rule__HTMLTYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HTMLTYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHTMLTYPEAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMyDsl.g:212:1: ruleCollection : ( ( rule__Collection__ObjAssignment )* ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Collection__ObjAssignment )* ) )
            // InternalMyDsl.g:217:2: ( ( rule__Collection__ObjAssignment )* )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Collection__ObjAssignment )* )
            // InternalMyDsl.g:218:3: ( rule__Collection__ObjAssignment )*
            {
             before(grammarAccess.getCollectionAccess().getObjAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__Collection__ObjAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:219:4: rule__Collection__ObjAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Collection__ObjAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

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


    // $ANTLR start "entryRuleAlert"
    // InternalMyDsl.g:228:1: entryRuleAlert : ruleAlert EOF ;
    public final void entryRuleAlert() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAlert EOF )
            // InternalMyDsl.g:230:1: ruleAlert EOF
            {
             before(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_1);
            ruleAlert();

            state._fsp--;

             after(grammarAccess.getAlertRule()); 
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
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // InternalMyDsl.g:237:1: ruleAlert : ( ( rule__Alert__Group__0 ) ) ;
    public final void ruleAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Alert__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Alert__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Alert__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Alert__Group__0 )
            {
             before(grammarAccess.getAlertAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Alert__Group__0 )
            // InternalMyDsl.g:244:4: rule__Alert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlert"


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
    // InternalMyDsl.g:262:1: ruleRefresh : ( 'Refresh' ) ;
    public final void ruleRefresh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( 'Refresh' ) )
            // InternalMyDsl.g:267:2: ( 'Refresh' )
            {
            // InternalMyDsl.g:267:2: ( 'Refresh' )
            // InternalMyDsl.g:268:3: 'Refresh'
            {
             before(grammarAccess.getRefreshAccess().getRefreshKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRefreshAccess().getRefreshKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSetCheckBox"
    // InternalMyDsl.g:378:1: entryRuleSetCheckBox : ruleSetCheckBox EOF ;
    public final void entryRuleSetCheckBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSetCheckBox EOF )
            // InternalMyDsl.g:380:1: ruleSetCheckBox EOF
            {
             before(grammarAccess.getSetCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleSetCheckBox();

            state._fsp--;

             after(grammarAccess.getSetCheckBoxRule()); 
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
    // $ANTLR end "entryRuleSetCheckBox"


    // $ANTLR start "ruleSetCheckBox"
    // InternalMyDsl.g:387:1: ruleSetCheckBox : ( ( rule__SetCheckBox__Group__0 ) ) ;
    public final void ruleSetCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SetCheckBox__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SetCheckBox__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SetCheckBox__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SetCheckBox__Group__0 )
            {
             before(grammarAccess.getSetCheckBoxAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SetCheckBox__Group__0 )
            // InternalMyDsl.g:394:4: rule__SetCheckBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetCheckBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetCheckBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetCheckBox"


    // $ANTLR start "entryRuleIsIn"
    // InternalMyDsl.g:403:1: entryRuleIsIn : ruleIsIn EOF ;
    public final void entryRuleIsIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleIsIn EOF )
            // InternalMyDsl.g:405:1: ruleIsIn EOF
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
    // InternalMyDsl.g:412:1: ruleIsIn : ( ( rule__IsIn__Group__0 ) ) ;
    public final void ruleIsIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__IsIn__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__IsIn__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__IsIn__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__IsIn__Group__0 )
            {
             before(grammarAccess.getIsInAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__IsIn__Group__0 )
            // InternalMyDsl.g:419:4: rule__IsIn__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleNot EOF )
            // InternalMyDsl.g:430:1: ruleNot EOF
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
    // InternalMyDsl.g:437:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Not__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Not__Group__0 )
            // InternalMyDsl.g:444:4: rule__Not__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleIf EOF )
            // InternalMyDsl.g:455:1: ruleIf EOF
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
    // InternalMyDsl.g:462:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:469:4: rule__If__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleLoop EOF )
            // InternalMyDsl.g:480:1: ruleLoop EOF
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
    // InternalMyDsl.g:487:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:494:4: rule__Loop__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleDoAll : ruleDoAll EOF ;
    public final void entryRuleDoAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleDoAll EOF )
            // InternalMyDsl.g:505:1: ruleDoAll EOF
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
    // InternalMyDsl.g:512:1: ruleDoAll : ( ( rule__DoAll__Group__0 ) ) ;
    public final void ruleDoAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__DoAll__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__DoAll__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__DoAll__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__DoAll__Group__0 )
            {
             before(grammarAccess.getDoAllAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__DoAll__Group__0 )
            // InternalMyDsl.g:519:4: rule__DoAll__Group__0
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
    // InternalMyDsl.g:527:1: rule__Main__OrdersAlternatives_6_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__Main__OrdersAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||(LA2_0>=19 && LA2_0<=21)||(LA2_0>=23 && LA2_0<=25)) ) {
                alt2=1;
            }
            else if ( (LA2_0==30||LA2_0==35||LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:532:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:532:2: ( ruleAction )
                    // InternalMyDsl.g:533:3: ruleAction
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
                    // InternalMyDsl.g:538:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:538:2: ( ruleStructure )
                    // InternalMyDsl.g:539:3: ruleStructure
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
    // InternalMyDsl.g:548:1: rule__Action__Alternatives : ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleSetCheckBox ) | ( ruleRefresh ) | ( ruleAlert ) | ( ruleStore ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( ruleNavigate ) | ( ruleClick ) | ( ruleFill ) | ( ruleSetCheckBox ) | ( ruleRefresh ) | ( ruleAlert ) | ( ruleStore ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 11:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:553:2: ( ruleNavigate )
                    {
                    // InternalMyDsl.g:553:2: ( ruleNavigate )
                    // InternalMyDsl.g:554:3: ruleNavigate
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
                    // InternalMyDsl.g:559:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:559:2: ( ruleClick )
                    // InternalMyDsl.g:560:3: ruleClick
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
                    // InternalMyDsl.g:565:2: ( ruleFill )
                    {
                    // InternalMyDsl.g:565:2: ( ruleFill )
                    // InternalMyDsl.g:566:3: ruleFill
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
                    // InternalMyDsl.g:571:2: ( ruleSetCheckBox )
                    {
                    // InternalMyDsl.g:571:2: ( ruleSetCheckBox )
                    // InternalMyDsl.g:572:3: ruleSetCheckBox
                    {
                     before(grammarAccess.getActionAccess().getSetCheckBoxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSetCheckBox();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSetCheckBoxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:577:2: ( ruleRefresh )
                    {
                    // InternalMyDsl.g:577:2: ( ruleRefresh )
                    // InternalMyDsl.g:578:3: ruleRefresh
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
                    // InternalMyDsl.g:583:2: ( ruleAlert )
                    {
                    // InternalMyDsl.g:583:2: ( ruleAlert )
                    // InternalMyDsl.g:584:3: ruleAlert
                    {
                     before(grammarAccess.getActionAccess().getAlertParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAlert();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getAlertParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:589:2: ( ruleStore )
                    {
                    // InternalMyDsl.g:589:2: ( ruleStore )
                    // InternalMyDsl.g:590:3: ruleStore
                    {
                     before(grammarAccess.getActionAccess().getStoreParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getStoreParserRuleCall_6()); 

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
    // InternalMyDsl.g:599:1: rule__Structure__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) );
    public final void rule__Structure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleDoAll ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:604:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:604:2: ( ruleIf )
                    // InternalMyDsl.g:605:3: ruleIf
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
                    // InternalMyDsl.g:610:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:610:2: ( ruleLoop )
                    // InternalMyDsl.g:611:3: ruleLoop
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
                    // InternalMyDsl.g:616:2: ( ruleDoAll )
                    {
                    // InternalMyDsl.g:616:2: ( ruleDoAll )
                    // InternalMyDsl.g:617:3: ruleDoAll
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
    // InternalMyDsl.g:626:1: rule__Condition__Alternatives : ( ( ruleIsIn ) | ( ruleNot ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ruleIsIn ) | ( ruleNot ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:631:2: ( ruleIsIn )
                    {
                    // InternalMyDsl.g:631:2: ( ruleIsIn )
                    // InternalMyDsl.g:632:3: ruleIsIn
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
                    // InternalMyDsl.g:637:2: ( ruleNot )
                    {
                    // InternalMyDsl.g:637:2: ( ruleNot )
                    // InternalMyDsl.g:638:3: ruleNot
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


    // $ANTLR start "rule__HTMLTYPE__Alternatives"
    // InternalMyDsl.g:647:1: rule__HTMLTYPE__Alternatives : ( ( 'class' ) | ( 'id' ) | ( 'name' ) );
    public final void rule__HTMLTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( 'class' ) | ( 'id' ) | ( 'name' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
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
                    // InternalMyDsl.g:652:2: ( 'class' )
                    {
                    // InternalMyDsl.g:652:2: ( 'class' )
                    // InternalMyDsl.g:653:3: 'class'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getClassKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:658:2: ( 'id' )
                    {
                    // InternalMyDsl.g:658:2: ( 'id' )
                    // InternalMyDsl.g:659:3: 'id'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getIdKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getIdKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:664:2: ( 'name' )
                    {
                    // InternalMyDsl.g:664:2: ( 'name' )
                    // InternalMyDsl.g:665:3: 'name'
                    {
                     before(grammarAccess.getHTMLTYPEAccess().getNameKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHTMLTYPEAccess().getNameKeyword_2()); 

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
    // $ANTLR end "rule__HTMLTYPE__Alternatives"


    // $ANTLR start "rule__IsIn__Alternatives_3"
    // InternalMyDsl.g:674:1: rule__IsIn__Alternatives_3 : ( ( ( rule__IsIn__TitleAssignment_3_0 ) ) | ( ( rule__IsIn__ObjAssignment_3_1 ) ) );
    public final void rule__IsIn__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( ( rule__IsIn__TitleAssignment_3_0 ) ) | ( ( rule__IsIn__ObjAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=12 && LA7_0<=14)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:679:2: ( ( rule__IsIn__TitleAssignment_3_0 ) )
                    {
                    // InternalMyDsl.g:679:2: ( ( rule__IsIn__TitleAssignment_3_0 ) )
                    // InternalMyDsl.g:680:3: ( rule__IsIn__TitleAssignment_3_0 )
                    {
                     before(grammarAccess.getIsInAccess().getTitleAssignment_3_0()); 
                    // InternalMyDsl.g:681:3: ( rule__IsIn__TitleAssignment_3_0 )
                    // InternalMyDsl.g:681:4: rule__IsIn__TitleAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IsIn__TitleAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIsInAccess().getTitleAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:685:2: ( ( rule__IsIn__ObjAssignment_3_1 ) )
                    {
                    // InternalMyDsl.g:685:2: ( ( rule__IsIn__ObjAssignment_3_1 ) )
                    // InternalMyDsl.g:686:3: ( rule__IsIn__ObjAssignment_3_1 )
                    {
                     before(grammarAccess.getIsInAccess().getObjAssignment_3_1()); 
                    // InternalMyDsl.g:687:3: ( rule__IsIn__ObjAssignment_3_1 )
                    // InternalMyDsl.g:687:4: rule__IsIn__ObjAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IsIn__ObjAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIsInAccess().getObjAssignment_3_1()); 

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
    // $ANTLR end "rule__IsIn__Alternatives_3"


    // $ANTLR start "rule__DoAll__TodoAlternatives_6_0"
    // InternalMyDsl.g:695:1: rule__DoAll__TodoAlternatives_6_0 : ( ( ruleAction ) | ( ruleStructure ) );
    public final void rule__DoAll__TodoAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( ( ruleAction ) | ( ruleStructure ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11||(LA8_0>=19 && LA8_0<=21)||(LA8_0>=23 && LA8_0<=25)) ) {
                alt8=1;
            }
            else if ( (LA8_0==30||LA8_0==35||LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:700:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:700:2: ( ruleAction )
                    // InternalMyDsl.g:701:3: ruleAction
                    {
                     before(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:706:2: ( ruleStructure )
                    {
                    // InternalMyDsl.g:706:2: ( ruleStructure )
                    // InternalMyDsl.g:707:3: ruleStructure
                    {
                     before(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStructure();

                    state._fsp--;

                     after(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_6_0_1()); 

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
    // $ANTLR end "rule__DoAll__TodoAlternatives_6_0"


    // $ANTLR start "rule__Main__Group__0"
    // InternalMyDsl.g:716:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyDsl.g:721:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:728:1: rule__Main__Group__0__Impl : ( 'File' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( 'File' ) )
            // InternalMyDsl.g:733:1: ( 'File' )
            {
            // InternalMyDsl.g:733:1: ( 'File' )
            // InternalMyDsl.g:734:2: 'File'
            {
             before(grammarAccess.getMainAccess().getFileKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:743:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyDsl.g:748:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:755:1: rule__Main__Group__1__Impl : ( ( rule__Main__FileNameAssignment_1 ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( ( rule__Main__FileNameAssignment_1 ) ) )
            // InternalMyDsl.g:760:1: ( ( rule__Main__FileNameAssignment_1 ) )
            {
            // InternalMyDsl.g:760:1: ( ( rule__Main__FileNameAssignment_1 ) )
            // InternalMyDsl.g:761:2: ( rule__Main__FileNameAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getFileNameAssignment_1()); 
            // InternalMyDsl.g:762:2: ( rule__Main__FileNameAssignment_1 )
            // InternalMyDsl.g:762:3: rule__Main__FileNameAssignment_1
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
    // InternalMyDsl.g:770:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyDsl.g:775:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:782:1: rule__Main__Group__2__Impl : ( 'with' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( ( 'with' ) )
            // InternalMyDsl.g:787:1: ( 'with' )
            {
            // InternalMyDsl.g:787:1: ( 'with' )
            // InternalMyDsl.g:788:2: 'with'
            {
             before(grammarAccess.getMainAccess().getWithKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:797:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyDsl.g:802:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:809:1: rule__Main__Group__3__Impl : ( 'browser' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( 'browser' ) )
            // InternalMyDsl.g:814:1: ( 'browser' )
            {
            // InternalMyDsl.g:814:1: ( 'browser' )
            // InternalMyDsl.g:815:2: 'browser'
            {
             before(grammarAccess.getMainAccess().getBrowserKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:824:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyDsl.g:829:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:836:1: rule__Main__Group__4__Impl : ( ( rule__Main__BrowserNameAssignment_4 ) ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( ( rule__Main__BrowserNameAssignment_4 ) ) )
            // InternalMyDsl.g:841:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            {
            // InternalMyDsl.g:841:1: ( ( rule__Main__BrowserNameAssignment_4 ) )
            // InternalMyDsl.g:842:2: ( rule__Main__BrowserNameAssignment_4 )
            {
             before(grammarAccess.getMainAccess().getBrowserNameAssignment_4()); 
            // InternalMyDsl.g:843:2: ( rule__Main__BrowserNameAssignment_4 )
            // InternalMyDsl.g:843:3: rule__Main__BrowserNameAssignment_4
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
    // InternalMyDsl.g:851:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyDsl.g:856:2: rule__Main__Group__5__Impl rule__Main__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:863:1: rule__Main__Group__5__Impl : ( ':' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( ':' ) )
            // InternalMyDsl.g:868:1: ( ':' )
            {
            // InternalMyDsl.g:868:1: ( ':' )
            // InternalMyDsl.g:869:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:878:1: rule__Main__Group__6 : rule__Main__Group__6__Impl ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Main__Group__6__Impl )
            // InternalMyDsl.g:883:2: rule__Main__Group__6__Impl
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
    // InternalMyDsl.g:889:1: rule__Main__Group__6__Impl : ( ( rule__Main__OrdersAssignment_6 )* ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__Main__OrdersAssignment_6 )* ) )
            // InternalMyDsl.g:894:1: ( ( rule__Main__OrdersAssignment_6 )* )
            {
            // InternalMyDsl.g:894:1: ( ( rule__Main__OrdersAssignment_6 )* )
            // InternalMyDsl.g:895:2: ( rule__Main__OrdersAssignment_6 )*
            {
             before(grammarAccess.getMainAccess().getOrdersAssignment_6()); 
            // InternalMyDsl.g:896:2: ( rule__Main__OrdersAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11||(LA9_0>=19 && LA9_0<=21)||(LA9_0>=23 && LA9_0<=25)||LA9_0==30||LA9_0==35||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:896:3: rule__Main__OrdersAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
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


    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:905:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:910:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:917:1: rule__Object__Group__0__Impl : ( ruleHTMLTYPE ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( ( ruleHTMLTYPE ) )
            // InternalMyDsl.g:922:1: ( ruleHTMLTYPE )
            {
            // InternalMyDsl.g:922:1: ( ruleHTMLTYPE )
            // InternalMyDsl.g:923:2: ruleHTMLTYPE
            {
             before(grammarAccess.getObjectAccess().getHTMLTYPEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLTYPE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getHTMLTYPEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:932:1: rule__Object__Group__1 : rule__Object__Group__1__Impl ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Object__Group__1__Impl )
            // InternalMyDsl.g:937:2: rule__Object__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:943:1: rule__Object__Group__1__Impl : ( ( rule__Object__TypeNameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ( rule__Object__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:948:1: ( ( rule__Object__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:948:1: ( ( rule__Object__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:949:2: ( rule__Object__TypeNameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:950:2: ( rule__Object__TypeNameAssignment_1 )
            // InternalMyDsl.g:950:3: rule__Object__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getTypeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Alert__Group__0"
    // InternalMyDsl.g:959:1: rule__Alert__Group__0 : rule__Alert__Group__0__Impl rule__Alert__Group__1 ;
    public final void rule__Alert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Alert__Group__0__Impl rule__Alert__Group__1 )
            // InternalMyDsl.g:964:2: rule__Alert__Group__0__Impl rule__Alert__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Alert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__0"


    // $ANTLR start "rule__Alert__Group__0__Impl"
    // InternalMyDsl.g:971:1: rule__Alert__Group__0__Impl : ( 'Alert' ) ;
    public final void rule__Alert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( 'Alert' ) )
            // InternalMyDsl.g:976:1: ( 'Alert' )
            {
            // InternalMyDsl.g:976:1: ( 'Alert' )
            // InternalMyDsl.g:977:2: 'Alert'
            {
             before(grammarAccess.getAlertAccess().getAlertKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAlertAccess().getAlertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__0__Impl"


    // $ANTLR start "rule__Alert__Group__1"
    // InternalMyDsl.g:986:1: rule__Alert__Group__1 : rule__Alert__Group__1__Impl ;
    public final void rule__Alert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__Alert__Group__1__Impl )
            // InternalMyDsl.g:991:2: rule__Alert__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alert__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__1"


    // $ANTLR start "rule__Alert__Group__1__Impl"
    // InternalMyDsl.g:997:1: rule__Alert__Group__1__Impl : ( ( rule__Alert__TextAssignment_1 ) ) ;
    public final void rule__Alert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ( rule__Alert__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1002:1: ( ( rule__Alert__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1002:1: ( ( rule__Alert__TextAssignment_1 ) )
            // InternalMyDsl.g:1003:2: ( rule__Alert__TextAssignment_1 )
            {
             before(grammarAccess.getAlertAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1004:2: ( rule__Alert__TextAssignment_1 )
            // InternalMyDsl.g:1004:3: rule__Alert__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alert__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlertAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__1__Impl"


    // $ANTLR start "rule__Navigate__Group__0"
    // InternalMyDsl.g:1013:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalMyDsl.g:1018:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1025:1: rule__Navigate__Group__0__Impl : ( 'Navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( ( 'Navigate' ) )
            // InternalMyDsl.g:1030:1: ( 'Navigate' )
            {
            // InternalMyDsl.g:1030:1: ( 'Navigate' )
            // InternalMyDsl.g:1031:2: 'Navigate'
            {
             before(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1040:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Navigate__Group__1__Impl )
            // InternalMyDsl.g:1045:2: rule__Navigate__Group__1__Impl
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
    // InternalMyDsl.g:1051:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1056:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1056:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalMyDsl.g:1057:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1058:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalMyDsl.g:1058:3: rule__Navigate__UrlAssignment_1
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
    // InternalMyDsl.g:1067:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyDsl.g:1072:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1079:1: rule__Store__Group__0__Impl : ( 'Store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( 'Store' ) )
            // InternalMyDsl.g:1084:1: ( 'Store' )
            {
            // InternalMyDsl.g:1084:1: ( 'Store' )
            // InternalMyDsl.g:1085:2: 'Store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1094:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyDsl.g:1099:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1106:1: rule__Store__Group__1__Impl : ( ( rule__Store__ObjAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ( rule__Store__ObjAssignment_1 ) ) )
            // InternalMyDsl.g:1111:1: ( ( rule__Store__ObjAssignment_1 ) )
            {
            // InternalMyDsl.g:1111:1: ( ( rule__Store__ObjAssignment_1 ) )
            // InternalMyDsl.g:1112:2: ( rule__Store__ObjAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getObjAssignment_1()); 
            // InternalMyDsl.g:1113:2: ( rule__Store__ObjAssignment_1 )
            // InternalMyDsl.g:1113:3: rule__Store__ObjAssignment_1
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
    // InternalMyDsl.g:1121:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyDsl.g:1126:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1133:1: rule__Store__Group__2__Impl : ( 'as' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( 'as' ) )
            // InternalMyDsl.g:1138:1: ( 'as' )
            {
            // InternalMyDsl.g:1138:1: ( 'as' )
            // InternalMyDsl.g:1139:2: 'as'
            {
             before(grammarAccess.getStoreAccess().getAsKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1148:1: rule__Store__Group__3 : rule__Store__Group__3__Impl ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Store__Group__3__Impl )
            // InternalMyDsl.g:1153:2: rule__Store__Group__3__Impl
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
    // InternalMyDsl.g:1159:1: rule__Store__Group__3__Impl : ( ( rule__Store__ObjNameAssignment_3 ) ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( rule__Store__ObjNameAssignment_3 ) ) )
            // InternalMyDsl.g:1164:1: ( ( rule__Store__ObjNameAssignment_3 ) )
            {
            // InternalMyDsl.g:1164:1: ( ( rule__Store__ObjNameAssignment_3 ) )
            // InternalMyDsl.g:1165:2: ( rule__Store__ObjNameAssignment_3 )
            {
             before(grammarAccess.getStoreAccess().getObjNameAssignment_3()); 
            // InternalMyDsl.g:1166:2: ( rule__Store__ObjNameAssignment_3 )
            // InternalMyDsl.g:1166:3: rule__Store__ObjNameAssignment_3
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


    // $ANTLR start "rule__Click__Group__0"
    // InternalMyDsl.g:1175:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:1180:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1187:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( 'Click' ) )
            // InternalMyDsl.g:1192:1: ( 'Click' )
            {
            // InternalMyDsl.g:1192:1: ( 'Click' )
            // InternalMyDsl.g:1193:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1202:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Click__Group__1__Impl )
            // InternalMyDsl.g:1207:2: rule__Click__Group__1__Impl
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
    // InternalMyDsl.g:1213:1: rule__Click__Group__1__Impl : ( ( rule__Click__InnerhtmlAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( ( ( rule__Click__InnerhtmlAssignment_1 ) ) )
            // InternalMyDsl.g:1218:1: ( ( rule__Click__InnerhtmlAssignment_1 ) )
            {
            // InternalMyDsl.g:1218:1: ( ( rule__Click__InnerhtmlAssignment_1 ) )
            // InternalMyDsl.g:1219:2: ( rule__Click__InnerhtmlAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getInnerhtmlAssignment_1()); 
            // InternalMyDsl.g:1220:2: ( rule__Click__InnerhtmlAssignment_1 )
            // InternalMyDsl.g:1220:3: rule__Click__InnerhtmlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__InnerhtmlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getInnerhtmlAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1229:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalMyDsl.g:1234:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1241:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( 'Fill' ) )
            // InternalMyDsl.g:1246:1: ( 'Fill' )
            {
            // InternalMyDsl.g:1246:1: ( 'Fill' )
            // InternalMyDsl.g:1247:2: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1256:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Fill__Group__1__Impl )
            // InternalMyDsl.g:1261:2: rule__Fill__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1267:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__NametagAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( ( rule__Fill__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:1272:1: ( ( rule__Fill__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:1272:1: ( ( rule__Fill__NametagAssignment_1 ) )
            // InternalMyDsl.g:1273:2: ( rule__Fill__NametagAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:1274:2: ( rule__Fill__NametagAssignment_1 )
            // InternalMyDsl.g:1274:3: rule__Fill__NametagAssignment_1
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


    // $ANTLR start "rule__SetCheckBox__Group__0"
    // InternalMyDsl.g:1283:1: rule__SetCheckBox__Group__0 : rule__SetCheckBox__Group__0__Impl rule__SetCheckBox__Group__1 ;
    public final void rule__SetCheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__SetCheckBox__Group__0__Impl rule__SetCheckBox__Group__1 )
            // InternalMyDsl.g:1288:2: rule__SetCheckBox__Group__0__Impl rule__SetCheckBox__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SetCheckBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCheckBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCheckBox__Group__0"


    // $ANTLR start "rule__SetCheckBox__Group__0__Impl"
    // InternalMyDsl.g:1295:1: rule__SetCheckBox__Group__0__Impl : ( 'SetCheckBox' ) ;
    public final void rule__SetCheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( 'SetCheckBox' ) )
            // InternalMyDsl.g:1300:1: ( 'SetCheckBox' )
            {
            // InternalMyDsl.g:1300:1: ( 'SetCheckBox' )
            // InternalMyDsl.g:1301:2: 'SetCheckBox'
            {
             before(grammarAccess.getSetCheckBoxAccess().getSetCheckBoxKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetCheckBoxAccess().getSetCheckBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCheckBox__Group__0__Impl"


    // $ANTLR start "rule__SetCheckBox__Group__1"
    // InternalMyDsl.g:1310:1: rule__SetCheckBox__Group__1 : rule__SetCheckBox__Group__1__Impl ;
    public final void rule__SetCheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__SetCheckBox__Group__1__Impl )
            // InternalMyDsl.g:1315:2: rule__SetCheckBox__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetCheckBox__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCheckBox__Group__1"


    // $ANTLR start "rule__SetCheckBox__Group__1__Impl"
    // InternalMyDsl.g:1321:1: rule__SetCheckBox__Group__1__Impl : ( ( rule__SetCheckBox__NametagAssignment_1 ) ) ;
    public final void rule__SetCheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( ( rule__SetCheckBox__NametagAssignment_1 ) ) )
            // InternalMyDsl.g:1326:1: ( ( rule__SetCheckBox__NametagAssignment_1 ) )
            {
            // InternalMyDsl.g:1326:1: ( ( rule__SetCheckBox__NametagAssignment_1 ) )
            // InternalMyDsl.g:1327:2: ( rule__SetCheckBox__NametagAssignment_1 )
            {
             before(grammarAccess.getSetCheckBoxAccess().getNametagAssignment_1()); 
            // InternalMyDsl.g:1328:2: ( rule__SetCheckBox__NametagAssignment_1 )
            // InternalMyDsl.g:1328:3: rule__SetCheckBox__NametagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetCheckBox__NametagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetCheckBoxAccess().getNametagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCheckBox__Group__1__Impl"


    // $ANTLR start "rule__IsIn__Group__0"
    // InternalMyDsl.g:1337:1: rule__IsIn__Group__0 : rule__IsIn__Group__0__Impl rule__IsIn__Group__1 ;
    public final void rule__IsIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__IsIn__Group__0__Impl rule__IsIn__Group__1 )
            // InternalMyDsl.g:1342:2: rule__IsIn__Group__0__Impl rule__IsIn__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1349:1: rule__IsIn__Group__0__Impl : ( 'Is' ) ;
    public final void rule__IsIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( 'Is' ) )
            // InternalMyDsl.g:1354:1: ( 'Is' )
            {
            // InternalMyDsl.g:1354:1: ( 'Is' )
            // InternalMyDsl.g:1355:2: 'Is'
            {
             before(grammarAccess.getIsInAccess().getIsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getIsKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1364:1: rule__IsIn__Group__1 : rule__IsIn__Group__1__Impl rule__IsIn__Group__2 ;
    public final void rule__IsIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__IsIn__Group__1__Impl rule__IsIn__Group__2 )
            // InternalMyDsl.g:1369:2: rule__IsIn__Group__1__Impl rule__IsIn__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1376:1: rule__IsIn__Group__1__Impl : ( ( rule__IsIn__TextAssignment_1 ) ) ;
    public final void rule__IsIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( ( ( rule__IsIn__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1381:1: ( ( rule__IsIn__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1381:1: ( ( rule__IsIn__TextAssignment_1 ) )
            // InternalMyDsl.g:1382:2: ( rule__IsIn__TextAssignment_1 )
            {
             before(grammarAccess.getIsInAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1383:2: ( rule__IsIn__TextAssignment_1 )
            // InternalMyDsl.g:1383:3: rule__IsIn__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1391:1: rule__IsIn__Group__2 : rule__IsIn__Group__2__Impl rule__IsIn__Group__3 ;
    public final void rule__IsIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__IsIn__Group__2__Impl rule__IsIn__Group__3 )
            // InternalMyDsl.g:1396:2: rule__IsIn__Group__2__Impl rule__IsIn__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__IsIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsIn__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1403:1: rule__IsIn__Group__2__Impl : ( 'in' ) ;
    public final void rule__IsIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( 'in' ) )
            // InternalMyDsl.g:1408:1: ( 'in' )
            {
            // InternalMyDsl.g:1408:1: ( 'in' )
            // InternalMyDsl.g:1409:2: 'in'
            {
             before(grammarAccess.getIsInAccess().getInKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getInKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__IsIn__Group__3"
    // InternalMyDsl.g:1418:1: rule__IsIn__Group__3 : rule__IsIn__Group__3__Impl rule__IsIn__Group__4 ;
    public final void rule__IsIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( rule__IsIn__Group__3__Impl rule__IsIn__Group__4 )
            // InternalMyDsl.g:1423:2: rule__IsIn__Group__3__Impl rule__IsIn__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__IsIn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsIn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__3"


    // $ANTLR start "rule__IsIn__Group__3__Impl"
    // InternalMyDsl.g:1430:1: rule__IsIn__Group__3__Impl : ( ( rule__IsIn__Alternatives_3 ) ) ;
    public final void rule__IsIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( ( rule__IsIn__Alternatives_3 ) ) )
            // InternalMyDsl.g:1435:1: ( ( rule__IsIn__Alternatives_3 ) )
            {
            // InternalMyDsl.g:1435:1: ( ( rule__IsIn__Alternatives_3 ) )
            // InternalMyDsl.g:1436:2: ( rule__IsIn__Alternatives_3 )
            {
             before(grammarAccess.getIsInAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1437:2: ( rule__IsIn__Alternatives_3 )
            // InternalMyDsl.g:1437:3: rule__IsIn__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getIsInAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__3__Impl"


    // $ANTLR start "rule__IsIn__Group__4"
    // InternalMyDsl.g:1445:1: rule__IsIn__Group__4 : rule__IsIn__Group__4__Impl ;
    public final void rule__IsIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__IsIn__Group__4__Impl )
            // InternalMyDsl.g:1450:2: rule__IsIn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsIn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__4"


    // $ANTLR start "rule__IsIn__Group__4__Impl"
    // InternalMyDsl.g:1456:1: rule__IsIn__Group__4__Impl : ( '?' ) ;
    public final void rule__IsIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( '?' ) )
            // InternalMyDsl.g:1461:1: ( '?' )
            {
            // InternalMyDsl.g:1461:1: ( '?' )
            // InternalMyDsl.g:1462:2: '?'
            {
             before(grammarAccess.getIsInAccess().getQuestionMarkKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getQuestionMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__Group__4__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalMyDsl.g:1472:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMyDsl.g:1477:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1484:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( 'Not' ) )
            // InternalMyDsl.g:1489:1: ( 'Not' )
            {
            // InternalMyDsl.g:1489:1: ( 'Not' )
            // InternalMyDsl.g:1490:2: 'Not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1499:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__Not__Group__1__Impl )
            // InternalMyDsl.g:1504:2: rule__Not__Group__1__Impl
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
    // InternalMyDsl.g:1510:1: rule__Not__Group__1__Impl : ( ( rule__Not__CondAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__Not__CondAssignment_1 ) ) )
            // InternalMyDsl.g:1515:1: ( ( rule__Not__CondAssignment_1 ) )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__Not__CondAssignment_1 ) )
            // InternalMyDsl.g:1516:2: ( rule__Not__CondAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getCondAssignment_1()); 
            // InternalMyDsl.g:1517:2: ( rule__Not__CondAssignment_1 )
            // InternalMyDsl.g:1517:3: rule__Not__CondAssignment_1
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
    // InternalMyDsl.g:1526:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:1531:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1538:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( 'If' ) )
            // InternalMyDsl.g:1543:1: ( 'If' )
            {
            // InternalMyDsl.g:1543:1: ( 'If' )
            // InternalMyDsl.g:1544:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1553:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:1558:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1565:1: rule__If__Group__1__Impl : ( ':' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ':' ) )
            // InternalMyDsl.g:1570:1: ( ':' )
            {
            // InternalMyDsl.g:1570:1: ( ':' )
            // InternalMyDsl.g:1571:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1580:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:1585:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1592:1: rule__If__Group__2__Impl : ( ( rule__If__CondAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( ( rule__If__CondAssignment_2 ) ) )
            // InternalMyDsl.g:1597:1: ( ( rule__If__CondAssignment_2 ) )
            {
            // InternalMyDsl.g:1597:1: ( ( rule__If__CondAssignment_2 ) )
            // InternalMyDsl.g:1598:2: ( rule__If__CondAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getCondAssignment_2()); 
            // InternalMyDsl.g:1599:2: ( rule__If__CondAssignment_2 )
            // InternalMyDsl.g:1599:3: rule__If__CondAssignment_2
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
    // InternalMyDsl.g:1607:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalMyDsl.g:1612:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1619:1: rule__If__Group__3__Impl : ( 'Then' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( 'Then' ) )
            // InternalMyDsl.g:1624:1: ( 'Then' )
            {
            // InternalMyDsl.g:1624:1: ( 'Then' )
            // InternalMyDsl.g:1625:2: 'Then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1634:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalMyDsl.g:1639:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1646:1: rule__If__Group__4__Impl : ( ':' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ':' ) )
            // InternalMyDsl.g:1651:1: ( ':' )
            {
            // InternalMyDsl.g:1651:1: ( ':' )
            // InternalMyDsl.g:1652:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1661:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalMyDsl.g:1666:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1673:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( '{' ) )
            // InternalMyDsl.g:1678:1: ( '{' )
            {
            // InternalMyDsl.g:1678:1: ( '{' )
            // InternalMyDsl.g:1679:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1688:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalMyDsl.g:1693:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1700:1: rule__If__Group__6__Impl : ( ( rule__If__ActionThenAssignment_6 )* ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( rule__If__ActionThenAssignment_6 )* ) )
            // InternalMyDsl.g:1705:1: ( ( rule__If__ActionThenAssignment_6 )* )
            {
            // InternalMyDsl.g:1705:1: ( ( rule__If__ActionThenAssignment_6 )* )
            // InternalMyDsl.g:1706:2: ( rule__If__ActionThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getActionThenAssignment_6()); 
            // InternalMyDsl.g:1707:2: ( rule__If__ActionThenAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11||(LA10_0>=19 && LA10_0<=21)||(LA10_0>=23 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1707:3: rule__If__ActionThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__If__ActionThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1715:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalMyDsl.g:1720:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1727:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( '}' ) )
            // InternalMyDsl.g:1732:1: ( '}' )
            {
            // InternalMyDsl.g:1732:1: ( '}' )
            // InternalMyDsl.g:1733:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1742:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__If__Group__8__Impl )
            // InternalMyDsl.g:1747:2: rule__If__Group__8__Impl
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
    // InternalMyDsl.g:1753:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalMyDsl.g:1758:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalMyDsl.g:1758:1: ( ( rule__If__Group_8__0 )? )
            // InternalMyDsl.g:1759:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalMyDsl.g:1760:2: ( rule__If__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1760:3: rule__If__Group_8__0
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
    // InternalMyDsl.g:1769:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalMyDsl.g:1774:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1781:1: rule__If__Group_8__0__Impl : ( 'Else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( 'Else' ) )
            // InternalMyDsl.g:1786:1: ( 'Else' )
            {
            // InternalMyDsl.g:1786:1: ( 'Else' )
            // InternalMyDsl.g:1787:2: 'Else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1796:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // InternalMyDsl.g:1801:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1808:1: rule__If__Group_8__1__Impl : ( ':' ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( ':' ) )
            // InternalMyDsl.g:1813:1: ( ':' )
            {
            // InternalMyDsl.g:1813:1: ( ':' )
            // InternalMyDsl.g:1814:2: ':'
            {
             before(grammarAccess.getIfAccess().getColonKeyword_8_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1823:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // InternalMyDsl.g:1828:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1835:1: rule__If__Group_8__2__Impl : ( '{' ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( ( '{' ) )
            // InternalMyDsl.g:1840:1: ( '{' )
            {
            // InternalMyDsl.g:1840:1: ( '{' )
            // InternalMyDsl.g:1841:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1850:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl rule__If__Group_8__4 ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__If__Group_8__3__Impl rule__If__Group_8__4 )
            // InternalMyDsl.g:1855:2: rule__If__Group_8__3__Impl rule__If__Group_8__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1862:1: rule__If__Group_8__3__Impl : ( ( rule__If__ActionElseAssignment_8_3 )* ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( ( rule__If__ActionElseAssignment_8_3 )* ) )
            // InternalMyDsl.g:1867:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            {
            // InternalMyDsl.g:1867:1: ( ( rule__If__ActionElseAssignment_8_3 )* )
            // InternalMyDsl.g:1868:2: ( rule__If__ActionElseAssignment_8_3 )*
            {
             before(grammarAccess.getIfAccess().getActionElseAssignment_8_3()); 
            // InternalMyDsl.g:1869:2: ( rule__If__ActionElseAssignment_8_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11||(LA12_0>=19 && LA12_0<=21)||(LA12_0>=23 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1869:3: rule__If__ActionElseAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__If__ActionElseAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1877:1: rule__If__Group_8__4 : rule__If__Group_8__4__Impl ;
    public final void rule__If__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__If__Group_8__4__Impl )
            // InternalMyDsl.g:1882:2: rule__If__Group_8__4__Impl
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
    // InternalMyDsl.g:1888:1: rule__If__Group_8__4__Impl : ( '}' ) ;
    public final void rule__If__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( '}' ) )
            // InternalMyDsl.g:1893:1: ( '}' )
            {
            // InternalMyDsl.g:1893:1: ( '}' )
            // InternalMyDsl.g:1894:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1904:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:1909:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1916:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:1921:1: ( 'Loop' )
            {
            // InternalMyDsl.g:1921:1: ( 'Loop' )
            // InternalMyDsl.g:1922:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1931:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:1936:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1943:1: rule__Loop__Group__1__Impl : ( ':' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ':' ) )
            // InternalMyDsl.g:1948:1: ( ':' )
            {
            // InternalMyDsl.g:1948:1: ( ':' )
            // InternalMyDsl.g:1949:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1958:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMyDsl.g:1963:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1970:1: rule__Loop__Group__2__Impl : ( 'Condition' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( 'Condition' ) )
            // InternalMyDsl.g:1975:1: ( 'Condition' )
            {
            // InternalMyDsl.g:1975:1: ( 'Condition' )
            // InternalMyDsl.g:1976:2: 'Condition'
            {
             before(grammarAccess.getLoopAccess().getConditionKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1985:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:1990:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1997:1: rule__Loop__Group__3__Impl : ( ':' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( ':' ) )
            // InternalMyDsl.g:2002:1: ( ':' )
            {
            // InternalMyDsl.g:2002:1: ( ':' )
            // InternalMyDsl.g:2003:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2012:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:2017:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2024:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__CondAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ( rule__Loop__CondAssignment_4 ) ) )
            // InternalMyDsl.g:2029:1: ( ( rule__Loop__CondAssignment_4 ) )
            {
            // InternalMyDsl.g:2029:1: ( ( rule__Loop__CondAssignment_4 ) )
            // InternalMyDsl.g:2030:2: ( rule__Loop__CondAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getCondAssignment_4()); 
            // InternalMyDsl.g:2031:2: ( rule__Loop__CondAssignment_4 )
            // InternalMyDsl.g:2031:3: rule__Loop__CondAssignment_4
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
    // InternalMyDsl.g:2039:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:2044:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2051:1: rule__Loop__Group__5__Impl : ( 'Interval' ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2055:1: ( ( 'Interval' ) )
            // InternalMyDsl.g:2056:1: ( 'Interval' )
            {
            // InternalMyDsl.g:2056:1: ( 'Interval' )
            // InternalMyDsl.g:2057:2: 'Interval'
            {
             before(grammarAccess.getLoopAccess().getIntervalKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2066:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:2071:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2078:1: rule__Loop__Group__6__Impl : ( ':' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ':' ) )
            // InternalMyDsl.g:2083:1: ( ':' )
            {
            // InternalMyDsl.g:2083:1: ( ':' )
            // InternalMyDsl.g:2084:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2093:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalMyDsl.g:2098:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2105:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__MillisecondsAssignment_7 ) ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ( rule__Loop__MillisecondsAssignment_7 ) ) )
            // InternalMyDsl.g:2110:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            {
            // InternalMyDsl.g:2110:1: ( ( rule__Loop__MillisecondsAssignment_7 ) )
            // InternalMyDsl.g:2111:2: ( rule__Loop__MillisecondsAssignment_7 )
            {
             before(grammarAccess.getLoopAccess().getMillisecondsAssignment_7()); 
            // InternalMyDsl.g:2112:2: ( rule__Loop__MillisecondsAssignment_7 )
            // InternalMyDsl.g:2112:3: rule__Loop__MillisecondsAssignment_7
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
    // InternalMyDsl.g:2120:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalMyDsl.g:2125:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2132:1: rule__Loop__Group__8__Impl : ( 'Do' ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( 'Do' ) )
            // InternalMyDsl.g:2137:1: ( 'Do' )
            {
            // InternalMyDsl.g:2137:1: ( 'Do' )
            // InternalMyDsl.g:2138:2: 'Do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_8()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2147:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalMyDsl.g:2152:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2159:1: rule__Loop__Group__9__Impl : ( ':' ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ':' ) )
            // InternalMyDsl.g:2164:1: ( ':' )
            {
            // InternalMyDsl.g:2164:1: ( ':' )
            // InternalMyDsl.g:2165:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2174:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalMyDsl.g:2179:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2186:1: rule__Loop__Group__10__Impl : ( '{' ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2190:1: ( ( '{' ) )
            // InternalMyDsl.g:2191:1: ( '{' )
            {
            // InternalMyDsl.g:2191:1: ( '{' )
            // InternalMyDsl.g:2192:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2201:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalMyDsl.g:2206:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2213:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__ActionsAssignment_11 )* ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( ( rule__Loop__ActionsAssignment_11 )* ) )
            // InternalMyDsl.g:2218:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            {
            // InternalMyDsl.g:2218:1: ( ( rule__Loop__ActionsAssignment_11 )* )
            // InternalMyDsl.g:2219:2: ( rule__Loop__ActionsAssignment_11 )*
            {
             before(grammarAccess.getLoopAccess().getActionsAssignment_11()); 
            // InternalMyDsl.g:2220:2: ( rule__Loop__ActionsAssignment_11 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11||(LA13_0>=19 && LA13_0<=21)||(LA13_0>=23 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2220:3: rule__Loop__ActionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Loop__ActionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2228:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( rule__Loop__Group__12__Impl )
            // InternalMyDsl.g:2233:2: rule__Loop__Group__12__Impl
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
    // InternalMyDsl.g:2239:1: rule__Loop__Group__12__Impl : ( '}' ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( '}' ) )
            // InternalMyDsl.g:2244:1: ( '}' )
            {
            // InternalMyDsl.g:2244:1: ( '}' )
            // InternalMyDsl.g:2245:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_12()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2255:1: rule__DoAll__Group__0 : rule__DoAll__Group__0__Impl rule__DoAll__Group__1 ;
    public final void rule__DoAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( rule__DoAll__Group__0__Impl rule__DoAll__Group__1 )
            // InternalMyDsl.g:2260:2: rule__DoAll__Group__0__Impl rule__DoAll__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2267:1: rule__DoAll__Group__0__Impl : ( 'For' ) ;
    public final void rule__DoAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( ( 'For' ) )
            // InternalMyDsl.g:2272:1: ( 'For' )
            {
            // InternalMyDsl.g:2272:1: ( 'For' )
            // InternalMyDsl.g:2273:2: 'For'
            {
             before(grammarAccess.getDoAllAccess().getForKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2282:1: rule__DoAll__Group__1 : rule__DoAll__Group__1__Impl rule__DoAll__Group__2 ;
    public final void rule__DoAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( rule__DoAll__Group__1__Impl rule__DoAll__Group__2 )
            // InternalMyDsl.g:2287:2: rule__DoAll__Group__1__Impl rule__DoAll__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2294:1: rule__DoAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__DoAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( 'all' ) )
            // InternalMyDsl.g:2299:1: ( 'all' )
            {
            // InternalMyDsl.g:2299:1: ( 'all' )
            // InternalMyDsl.g:2300:2: 'all'
            {
             before(grammarAccess.getDoAllAccess().getAllKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2309:1: rule__DoAll__Group__2 : rule__DoAll__Group__2__Impl rule__DoAll__Group__3 ;
    public final void rule__DoAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( rule__DoAll__Group__2__Impl rule__DoAll__Group__3 )
            // InternalMyDsl.g:2314:2: rule__DoAll__Group__2__Impl rule__DoAll__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2321:1: rule__DoAll__Group__2__Impl : ( 'in' ) ;
    public final void rule__DoAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( 'in' ) )
            // InternalMyDsl.g:2326:1: ( 'in' )
            {
            // InternalMyDsl.g:2326:1: ( 'in' )
            // InternalMyDsl.g:2327:2: 'in'
            {
             before(grammarAccess.getDoAllAccess().getInKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2336:1: rule__DoAll__Group__3 : rule__DoAll__Group__3__Impl rule__DoAll__Group__4 ;
    public final void rule__DoAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( rule__DoAll__Group__3__Impl rule__DoAll__Group__4 )
            // InternalMyDsl.g:2341:2: rule__DoAll__Group__3__Impl rule__DoAll__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2348:1: rule__DoAll__Group__3__Impl : ( ( rule__DoAll__CollAssignment_3 ) ) ;
    public final void rule__DoAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2352:1: ( ( ( rule__DoAll__CollAssignment_3 ) ) )
            // InternalMyDsl.g:2353:1: ( ( rule__DoAll__CollAssignment_3 ) )
            {
            // InternalMyDsl.g:2353:1: ( ( rule__DoAll__CollAssignment_3 ) )
            // InternalMyDsl.g:2354:2: ( rule__DoAll__CollAssignment_3 )
            {
             before(grammarAccess.getDoAllAccess().getCollAssignment_3()); 
            // InternalMyDsl.g:2355:2: ( rule__DoAll__CollAssignment_3 )
            // InternalMyDsl.g:2355:3: rule__DoAll__CollAssignment_3
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
    // InternalMyDsl.g:2363:1: rule__DoAll__Group__4 : rule__DoAll__Group__4__Impl rule__DoAll__Group__5 ;
    public final void rule__DoAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( rule__DoAll__Group__4__Impl rule__DoAll__Group__5 )
            // InternalMyDsl.g:2368:2: rule__DoAll__Group__4__Impl rule__DoAll__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2375:1: rule__DoAll__Group__4__Impl : ( 'do' ) ;
    public final void rule__DoAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( 'do' ) )
            // InternalMyDsl.g:2380:1: ( 'do' )
            {
            // InternalMyDsl.g:2380:1: ( 'do' )
            // InternalMyDsl.g:2381:2: 'do'
            {
             before(grammarAccess.getDoAllAccess().getDoKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2390:1: rule__DoAll__Group__5 : rule__DoAll__Group__5__Impl rule__DoAll__Group__6 ;
    public final void rule__DoAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( rule__DoAll__Group__5__Impl rule__DoAll__Group__6 )
            // InternalMyDsl.g:2395:2: rule__DoAll__Group__5__Impl rule__DoAll__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2402:1: rule__DoAll__Group__5__Impl : ( ':' ) ;
    public final void rule__DoAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( ':' ) )
            // InternalMyDsl.g:2407:1: ( ':' )
            {
            // InternalMyDsl.g:2407:1: ( ':' )
            // InternalMyDsl.g:2408:2: ':'
            {
             before(grammarAccess.getDoAllAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2417:1: rule__DoAll__Group__6 : rule__DoAll__Group__6__Impl ;
    public final void rule__DoAll__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( rule__DoAll__Group__6__Impl )
            // InternalMyDsl.g:2422:2: rule__DoAll__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2428:1: rule__DoAll__Group__6__Impl : ( ( rule__DoAll__TodoAssignment_6 ) ) ;
    public final void rule__DoAll__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( ( rule__DoAll__TodoAssignment_6 ) ) )
            // InternalMyDsl.g:2433:1: ( ( rule__DoAll__TodoAssignment_6 ) )
            {
            // InternalMyDsl.g:2433:1: ( ( rule__DoAll__TodoAssignment_6 ) )
            // InternalMyDsl.g:2434:2: ( rule__DoAll__TodoAssignment_6 )
            {
             before(grammarAccess.getDoAllAccess().getTodoAssignment_6()); 
            // InternalMyDsl.g:2435:2: ( rule__DoAll__TodoAssignment_6 )
            // InternalMyDsl.g:2435:3: rule__DoAll__TodoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__TodoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDoAllAccess().getTodoAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Main__FileNameAssignment_1"
    // InternalMyDsl.g:2444:1: rule__Main__FileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Main__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2449:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2449:2: ( RULE_STRING )
            // InternalMyDsl.g:2450:3: RULE_STRING
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
    // InternalMyDsl.g:2459:1: rule__Main__BrowserNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Main__BrowserNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2464:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2464:2: ( RULE_STRING )
            // InternalMyDsl.g:2465:3: RULE_STRING
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
    // InternalMyDsl.g:2474:1: rule__Main__OrdersAssignment_6 : ( ( rule__Main__OrdersAlternatives_6_0 ) ) ;
    public final void rule__Main__OrdersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( ( rule__Main__OrdersAlternatives_6_0 ) ) )
            // InternalMyDsl.g:2479:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            {
            // InternalMyDsl.g:2479:2: ( ( rule__Main__OrdersAlternatives_6_0 ) )
            // InternalMyDsl.g:2480:3: ( rule__Main__OrdersAlternatives_6_0 )
            {
             before(grammarAccess.getMainAccess().getOrdersAlternatives_6_0()); 
            // InternalMyDsl.g:2481:3: ( rule__Main__OrdersAlternatives_6_0 )
            // InternalMyDsl.g:2481:4: rule__Main__OrdersAlternatives_6_0
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


    // $ANTLR start "rule__Object__TypeNameAssignment_1"
    // InternalMyDsl.g:2489:1: rule__Object__TypeNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Object__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2494:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2494:2: ( RULE_STRING )
            // InternalMyDsl.g:2495:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getTypeNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getTypeNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__TypeNameAssignment_1"


    // $ANTLR start "rule__Collection__ObjAssignment"
    // InternalMyDsl.g:2504:1: rule__Collection__ObjAssignment : ( ruleObject ) ;
    public final void rule__Collection__ObjAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ruleObject ) )
            // InternalMyDsl.g:2509:2: ( ruleObject )
            {
            // InternalMyDsl.g:2509:2: ( ruleObject )
            // InternalMyDsl.g:2510:3: ruleObject
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


    // $ANTLR start "rule__Alert__TextAssignment_1"
    // InternalMyDsl.g:2519:1: rule__Alert__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Alert__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2524:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2524:2: ( RULE_STRING )
            // InternalMyDsl.g:2525:3: RULE_STRING
            {
             before(grammarAccess.getAlertAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlertAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__TextAssignment_1"


    // $ANTLR start "rule__Navigate__UrlAssignment_1"
    // InternalMyDsl.g:2534:1: rule__Navigate__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2539:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2539:2: ( RULE_STRING )
            // InternalMyDsl.g:2540:3: RULE_STRING
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
    // InternalMyDsl.g:2549:1: rule__Store__ObjAssignment_1 : ( ruleObject ) ;
    public final void rule__Store__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ruleObject ) )
            // InternalMyDsl.g:2554:2: ( ruleObject )
            {
            // InternalMyDsl.g:2554:2: ( ruleObject )
            // InternalMyDsl.g:2555:3: ruleObject
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
    // InternalMyDsl.g:2564:1: rule__Store__ObjNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Store__ObjNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2569:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2569:2: ( RULE_STRING )
            // InternalMyDsl.g:2570:3: RULE_STRING
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


    // $ANTLR start "rule__Click__InnerhtmlAssignment_1"
    // InternalMyDsl.g:2579:1: rule__Click__InnerhtmlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Click__InnerhtmlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2584:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2584:2: ( RULE_STRING )
            // InternalMyDsl.g:2585:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getInnerhtmlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getInnerhtmlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__InnerhtmlAssignment_1"


    // $ANTLR start "rule__Fill__NametagAssignment_1"
    // InternalMyDsl.g:2594:1: rule__Fill__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2598:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2599:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2599:2: ( RULE_STRING )
            // InternalMyDsl.g:2600:3: RULE_STRING
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


    // $ANTLR start "rule__SetCheckBox__NametagAssignment_1"
    // InternalMyDsl.g:2609:1: rule__SetCheckBox__NametagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SetCheckBox__NametagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2613:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2614:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2614:2: ( RULE_STRING )
            // InternalMyDsl.g:2615:3: RULE_STRING
            {
             before(grammarAccess.getSetCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCheckBox__NametagAssignment_1"


    // $ANTLR start "rule__IsIn__TextAssignment_1"
    // InternalMyDsl.g:2624:1: rule__IsIn__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IsIn__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2629:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2629:2: ( RULE_STRING )
            // InternalMyDsl.g:2630:3: RULE_STRING
            {
             before(grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__TextAssignment_1"


    // $ANTLR start "rule__IsIn__TitleAssignment_3_0"
    // InternalMyDsl.g:2639:1: rule__IsIn__TitleAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__IsIn__TitleAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2643:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2644:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2644:2: ( RULE_STRING )
            // InternalMyDsl.g:2645:3: RULE_STRING
            {
             before(grammarAccess.getIsInAccess().getTitleSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIsInAccess().getTitleSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__TitleAssignment_3_0"


    // $ANTLR start "rule__IsIn__ObjAssignment_3_1"
    // InternalMyDsl.g:2654:1: rule__IsIn__ObjAssignment_3_1 : ( ruleObject ) ;
    public final void rule__IsIn__ObjAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( ( ruleObject ) )
            // InternalMyDsl.g:2659:2: ( ruleObject )
            {
            // InternalMyDsl.g:2659:2: ( ruleObject )
            // InternalMyDsl.g:2660:3: ruleObject
            {
             before(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsIn__ObjAssignment_3_1"


    // $ANTLR start "rule__Not__CondAssignment_1"
    // InternalMyDsl.g:2669:1: rule__Not__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2674:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2674:2: ( ruleCondition )
            // InternalMyDsl.g:2675:3: ruleCondition
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
    // InternalMyDsl.g:2684:1: rule__If__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__If__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2689:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2689:2: ( ruleCondition )
            // InternalMyDsl.g:2690:3: ruleCondition
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
    // InternalMyDsl.g:2699:1: rule__If__ActionThenAssignment_6 : ( ruleAction ) ;
    public final void rule__If__ActionThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2703:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2704:2: ( ruleAction )
            {
            // InternalMyDsl.g:2704:2: ( ruleAction )
            // InternalMyDsl.g:2705:3: ruleAction
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
    // InternalMyDsl.g:2714:1: rule__If__ActionElseAssignment_8_3 : ( ruleAction ) ;
    public final void rule__If__ActionElseAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2719:2: ( ruleAction )
            {
            // InternalMyDsl.g:2719:2: ( ruleAction )
            // InternalMyDsl.g:2720:3: ruleAction
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
    // InternalMyDsl.g:2729:1: rule__Loop__CondAssignment_4 : ( ruleCondition ) ;
    public final void rule__Loop__CondAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2734:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2734:2: ( ruleCondition )
            // InternalMyDsl.g:2735:3: ruleCondition
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
    // InternalMyDsl.g:2744:1: rule__Loop__MillisecondsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Loop__MillisecondsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2749:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2749:2: ( RULE_INT )
            // InternalMyDsl.g:2750:3: RULE_INT
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
    // InternalMyDsl.g:2759:1: rule__Loop__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__Loop__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2764:2: ( ruleAction )
            {
            // InternalMyDsl.g:2764:2: ( ruleAction )
            // InternalMyDsl.g:2765:3: ruleAction
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
    // InternalMyDsl.g:2774:1: rule__DoAll__CollAssignment_3 : ( ruleCollection ) ;
    public final void rule__DoAll__CollAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:2779:2: ( ruleCollection )
            {
            // InternalMyDsl.g:2779:2: ( ruleCollection )
            // InternalMyDsl.g:2780:3: ruleCollection
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


    // $ANTLR start "rule__DoAll__TodoAssignment_6"
    // InternalMyDsl.g:2789:1: rule__DoAll__TodoAssignment_6 : ( ( rule__DoAll__TodoAlternatives_6_0 ) ) ;
    public final void rule__DoAll__TodoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( ( ( rule__DoAll__TodoAlternatives_6_0 ) ) )
            // InternalMyDsl.g:2794:2: ( ( rule__DoAll__TodoAlternatives_6_0 ) )
            {
            // InternalMyDsl.g:2794:2: ( ( rule__DoAll__TodoAlternatives_6_0 ) )
            // InternalMyDsl.g:2795:3: ( rule__DoAll__TodoAlternatives_6_0 )
            {
             before(grammarAccess.getDoAllAccess().getTodoAlternatives_6_0()); 
            // InternalMyDsl.g:2796:3: ( rule__DoAll__TodoAlternatives_6_0 )
            // InternalMyDsl.g:2796:4: rule__DoAll__TodoAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__DoAll__TodoAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDoAllAccess().getTodoAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAll__TodoAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008843B80800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008843B80802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000203B80800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003B80802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});

}