package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'File'", "'with'", "'browser'", "':'", "'class'", "'id'", "'name'", "'Alert'", "'Refresh'", "'Navigate'", "'Store'", "'as'", "'Click'", "'Fill'", "'SetCheckBox'", "'Is'", "'in'", "'?'", "'Not'", "'If'", "'Then'", "'{'", "'}'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'all'", "'do'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Main";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMain"
    // InternalMyDsl.g:64:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleMain= ruleMain EOF )
            // InternalMyDsl.g:65:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyDsl.g:71:1: ruleMain returns [EObject current=null] : (otherlv_0= 'File' ( (lv_fileName_1_0= RULE_STRING ) ) otherlv_2= 'with' otherlv_3= 'browser' ( (lv_browserName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_browserName_4_0=null;
        Token otherlv_5=null;
        EObject lv_orders_6_1 = null;

        EObject lv_orders_6_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'File' ( (lv_fileName_1_0= RULE_STRING ) ) otherlv_2= 'with' otherlv_3= 'browser' ( (lv_browserName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'File' ( (lv_fileName_1_0= RULE_STRING ) ) otherlv_2= 'with' otherlv_3= 'browser' ( (lv_browserName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'File' ( (lv_fileName_1_0= RULE_STRING ) ) otherlv_2= 'with' otherlv_3= 'browser' ( (lv_browserName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'File' ( (lv_fileName_1_0= RULE_STRING ) ) otherlv_2= 'with' otherlv_3= 'browser' ( (lv_browserName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getFileKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_fileName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STRING )
            // InternalMyDsl.g:85:5: lv_fileName_1_0= RULE_STRING
            {
            lv_fileName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getMainAccess().getFileNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMainAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMainAccess().getBrowserKeyword_3());
            		
            // InternalMyDsl.g:109:3: ( (lv_browserName_4_0= RULE_STRING ) )
            // InternalMyDsl.g:110:4: (lv_browserName_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:110:4: (lv_browserName_4_0= RULE_STRING )
            // InternalMyDsl.g:111:5: lv_browserName_4_0= RULE_STRING
            {
            lv_browserName_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_browserName_4_0, grammarAccess.getMainAccess().getBrowserNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"browserName",
            						lv_browserName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMainAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:131:3: ( ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=21)||(LA2_0>=23 && LA2_0<=25)||LA2_0==30||LA2_0==35||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:132:4: ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) )
            	    {
            	    // InternalMyDsl.g:132:4: ( (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure ) )
            	    // InternalMyDsl.g:133:5: (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure )
            	    {
            	    // InternalMyDsl.g:133:5: (lv_orders_6_1= ruleAction | lv_orders_6_2= ruleStructure )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=18 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=25)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==30||LA1_0==35||LA1_0==39) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDsl.g:134:6: lv_orders_6_1= ruleAction
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getOrdersActionParserRuleCall_6_0_0());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_orders_6_1=ruleAction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"orders",
            	            							lv_orders_6_1,
            	            							"org.xtext.example.mydsl.MyDsl.Action");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:150:6: lv_orders_6_2= ruleStructure
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getOrdersStructureParserRuleCall_6_0_1());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_orders_6_2=ruleStructure();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"orders",
            	            							lv_orders_6_2,
            	            							"org.xtext.example.mydsl.MyDsl.Structure");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:172:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:172:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:173:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:179:1: ruleAction returns [EObject current=null] : (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_SetCheckBox_3= ruleSetCheckBox | ruleRefresh | this_Alert_5= ruleAlert | this_Store_6= ruleStore ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Navigate_0 = null;

        EObject this_Click_1 = null;

        EObject this_Fill_2 = null;

        EObject this_SetCheckBox_3 = null;

        EObject this_Alert_5 = null;

        EObject this_Store_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_SetCheckBox_3= ruleSetCheckBox | ruleRefresh | this_Alert_5= ruleAlert | this_Store_6= ruleStore ) )
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_SetCheckBox_3= ruleSetCheckBox | ruleRefresh | this_Alert_5= ruleAlert | this_Store_6= ruleStore )
            {
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_SetCheckBox_3= ruleSetCheckBox | ruleRefresh | this_Alert_5= ruleAlert | this_Store_6= ruleStore )
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
            case 19:
                {
                alt3=5;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:187:3: this_Navigate_0= ruleNavigate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getNavigateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navigate_0=ruleNavigate();

                    state._fsp--;


                    			current = this_Navigate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:196:3: this_Click_1= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_1=ruleClick();

                    state._fsp--;


                    			current = this_Click_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:205:3: this_Fill_2= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_2=ruleFill();

                    state._fsp--;


                    			current = this_Fill_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:214:3: this_SetCheckBox_3= ruleSetCheckBox
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSetCheckBoxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetCheckBox_3=ruleSetCheckBox();

                    state._fsp--;


                    			current = this_SetCheckBox_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:223:3: ruleRefresh
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRefreshParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    ruleRefresh();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:231:3: this_Alert_5= ruleAlert
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAlertParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alert_5=ruleAlert();

                    state._fsp--;


                    			current = this_Alert_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:240:3: this_Store_6= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStoreParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_6=ruleStore();

                    state._fsp--;


                    			current = this_Store_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleStructure"
    // InternalMyDsl.g:252:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalMyDsl.g:252:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalMyDsl.g:253:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalMyDsl.g:259:1: ruleStructure returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_DoAll_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:265:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll ) )
            // InternalMyDsl.g:266:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll )
            {
            // InternalMyDsl.g:266:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll )
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
                    // InternalMyDsl.g:267:3: this_If_0= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStructureAccess().getIfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;


                    			current = this_If_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:276:3: this_Loop_1= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getStructureAccess().getLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_1=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:285:3: this_DoAll_2= ruleDoAll
                    {

                    			newCompositeNode(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoAll_2=ruleDoAll();

                    state._fsp--;


                    			current = this_DoAll_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:297:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:297:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:298:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:304:1: ruleCondition returns [EObject current=null] : (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IsIn_0 = null;

        EObject this_Not_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:310:2: ( (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) )
            // InternalMyDsl.g:311:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            {
            // InternalMyDsl.g:311:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
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
                    // InternalMyDsl.g:312:3: this_IsIn_0= ruleIsIn
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getIsInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsIn_0=ruleIsIn();

                    state._fsp--;


                    			current = this_IsIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:321:3: this_Not_1= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getNotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_1=ruleNot();

                    state._fsp--;


                    			current = this_Not_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleObject"
    // InternalMyDsl.g:333:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:333:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:334:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalMyDsl.g:340:1: ruleObject returns [EObject current=null] : ( ruleHTMLTYPE ( (lv_typeName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( ( ruleHTMLTYPE ( (lv_typeName_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:347:2: ( ruleHTMLTYPE ( (lv_typeName_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:347:2: ( ruleHTMLTYPE ( (lv_typeName_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:348:3: ruleHTMLTYPE ( (lv_typeName_1_0= RULE_STRING ) )
            {

            			newCompositeNode(grammarAccess.getObjectAccess().getHTMLTYPEParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleHTMLTYPE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:355:3: ( (lv_typeName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:356:4: (lv_typeName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:356:4: (lv_typeName_1_0= RULE_STRING )
            // InternalMyDsl.g:357:5: lv_typeName_1_0= RULE_STRING
            {
            lv_typeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_typeName_1_0, grammarAccess.getObjectAccess().getTypeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleHTMLTYPE"
    // InternalMyDsl.g:377:1: entryRuleHTMLTYPE returns [String current=null] : iv_ruleHTMLTYPE= ruleHTMLTYPE EOF ;
    public final String entryRuleHTMLTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHTMLTYPE = null;


        try {
            // InternalMyDsl.g:377:48: (iv_ruleHTMLTYPE= ruleHTMLTYPE EOF )
            // InternalMyDsl.g:378:2: iv_ruleHTMLTYPE= ruleHTMLTYPE EOF
            {
             newCompositeNode(grammarAccess.getHTMLTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHTMLTYPE=ruleHTMLTYPE();

            state._fsp--;

             current =iv_ruleHTMLTYPE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHTMLTYPE"


    // $ANTLR start "ruleHTMLTYPE"
    // InternalMyDsl.g:384:1: ruleHTMLTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'id' | kw= 'name' ) ;
    public final AntlrDatatypeRuleToken ruleHTMLTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:390:2: ( (kw= 'class' | kw= 'id' | kw= 'name' ) )
            // InternalMyDsl.g:391:2: (kw= 'class' | kw= 'id' | kw= 'name' )
            {
            // InternalMyDsl.g:391:2: (kw= 'class' | kw= 'id' | kw= 'name' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
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
                    // InternalMyDsl.g:392:3: kw= 'class'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHTMLTYPEAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:398:3: kw= 'id'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHTMLTYPEAccess().getIdKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:404:3: kw= 'name'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHTMLTYPEAccess().getNameKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHTMLTYPE"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:413:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:413:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:414:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:420:1: ruleCollection returns [EObject current=null] : ( (lv_obj_0_0= ruleObject ) )* ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:426:2: ( ( (lv_obj_0_0= ruleObject ) )* )
            // InternalMyDsl.g:427:2: ( (lv_obj_0_0= ruleObject ) )*
            {
            // InternalMyDsl.g:427:2: ( (lv_obj_0_0= ruleObject ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:428:3: (lv_obj_0_0= ruleObject )
            	    {
            	    // InternalMyDsl.g:428:3: (lv_obj_0_0= ruleObject )
            	    // InternalMyDsl.g:429:4: lv_obj_0_0= ruleObject
            	    {

            	    				newCompositeNode(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_8);
            	    lv_obj_0_0=ruleObject();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCollectionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"obj",
            	    					lv_obj_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Object");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleAlert"
    // InternalMyDsl.g:449:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // InternalMyDsl.g:449:46: (iv_ruleAlert= ruleAlert EOF )
            // InternalMyDsl.g:450:2: iv_ruleAlert= ruleAlert EOF
            {
             newCompositeNode(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlert=ruleAlert();

            state._fsp--;

             current =iv_ruleAlert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // InternalMyDsl.g:456:1: ruleAlert returns [EObject current=null] : (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:463:2: (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:463:2: (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:464:3: otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlertAccess().getAlertKeyword_0());
            		
            // InternalMyDsl.g:468:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:469:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:469:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:470:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getAlertAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlert"


    // $ANTLR start "entryRuleRefresh"
    // InternalMyDsl.g:490:1: entryRuleRefresh returns [String current=null] : iv_ruleRefresh= ruleRefresh EOF ;
    public final String entryRuleRefresh() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRefresh = null;


        try {
            // InternalMyDsl.g:490:47: (iv_ruleRefresh= ruleRefresh EOF )
            // InternalMyDsl.g:491:2: iv_ruleRefresh= ruleRefresh EOF
            {
             newCompositeNode(grammarAccess.getRefreshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefresh=ruleRefresh();

            state._fsp--;

             current =iv_ruleRefresh.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefresh"


    // $ANTLR start "ruleRefresh"
    // InternalMyDsl.g:497:1: ruleRefresh returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Refresh' ;
    public final AntlrDatatypeRuleToken ruleRefresh() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:503:2: (kw= 'Refresh' )
            // InternalMyDsl.g:504:2: kw= 'Refresh'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRefreshAccess().getRefreshKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefresh"


    // $ANTLR start "entryRuleNavigate"
    // InternalMyDsl.g:512:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalMyDsl.g:512:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalMyDsl.g:513:2: iv_ruleNavigate= ruleNavigate EOF
            {
             newCompositeNode(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigate=ruleNavigate();

            state._fsp--;

             current =iv_ruleNavigate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // InternalMyDsl.g:519:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:526:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:526:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:527:3: otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalMyDsl.g:531:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:532:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:532:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:533:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:553:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:553:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:554:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:560:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_objName_3_0=null;
        EObject lv_obj_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:566:2: ( (otherlv_0= 'Store' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:567:2: (otherlv_0= 'Store' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:567:2: (otherlv_0= 'Store' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:568:3: otherlv_0= 'Store' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:572:3: ( (lv_obj_1_0= ruleObject ) )
            // InternalMyDsl.g:573:4: (lv_obj_1_0= ruleObject )
            {
            // InternalMyDsl.g:573:4: (lv_obj_1_0= ruleObject )
            // InternalMyDsl.g:574:5: lv_obj_1_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_obj_1_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_1_0,
            						"org.xtext.example.mydsl.MyDsl.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:595:3: ( (lv_objName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:596:4: (lv_objName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:596:4: (lv_objName_3_0= RULE_STRING )
            // InternalMyDsl.g:597:5: lv_objName_3_0= RULE_STRING
            {
            lv_objName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_objName_3_0, grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:617:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:617:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:618:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:624:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_innerhtml_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_innerhtml_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:630:2: ( (otherlv_0= 'Click' ( (lv_innerhtml_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:631:2: (otherlv_0= 'Click' ( (lv_innerhtml_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:631:2: (otherlv_0= 'Click' ( (lv_innerhtml_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:632:3: otherlv_0= 'Click' ( (lv_innerhtml_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalMyDsl.g:636:3: ( (lv_innerhtml_1_0= RULE_STRING ) )
            // InternalMyDsl.g:637:4: (lv_innerhtml_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:637:4: (lv_innerhtml_1_0= RULE_STRING )
            // InternalMyDsl.g:638:5: lv_innerhtml_1_0= RULE_STRING
            {
            lv_innerhtml_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_innerhtml_1_0, grammarAccess.getClickAccess().getInnerhtmlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"innerhtml",
            						lv_innerhtml_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalMyDsl.g:658:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalMyDsl.g:658:45: (iv_ruleFill= ruleFill EOF )
            // InternalMyDsl.g:659:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalMyDsl.g:665:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:671:2: ( (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:672:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:672:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:673:3: otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalMyDsl.g:677:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:678:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:678:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:679:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_nametag_1_0, grammarAccess.getFillAccess().getNametagSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nametag",
            						lv_nametag_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSetCheckBox"
    // InternalMyDsl.g:699:1: entryRuleSetCheckBox returns [EObject current=null] : iv_ruleSetCheckBox= ruleSetCheckBox EOF ;
    public final EObject entryRuleSetCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCheckBox = null;


        try {
            // InternalMyDsl.g:699:52: (iv_ruleSetCheckBox= ruleSetCheckBox EOF )
            // InternalMyDsl.g:700:2: iv_ruleSetCheckBox= ruleSetCheckBox EOF
            {
             newCompositeNode(grammarAccess.getSetCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCheckBox=ruleSetCheckBox();

            state._fsp--;

             current =iv_ruleSetCheckBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetCheckBox"


    // $ANTLR start "ruleSetCheckBox"
    // InternalMyDsl.g:706:1: ruleSetCheckBox returns [EObject current=null] : (otherlv_0= 'SetCheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSetCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:712:2: ( (otherlv_0= 'SetCheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:713:2: (otherlv_0= 'SetCheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:713:2: (otherlv_0= 'SetCheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:714:3: otherlv_0= 'SetCheckBox' ( (lv_nametag_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCheckBoxAccess().getSetCheckBoxKeyword_0());
            		
            // InternalMyDsl.g:718:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:719:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:719:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:720:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_nametag_1_0, grammarAccess.getSetCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetCheckBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nametag",
            						lv_nametag_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetCheckBox"


    // $ANTLR start "entryRuleIsIn"
    // InternalMyDsl.g:740:1: entryRuleIsIn returns [EObject current=null] : iv_ruleIsIn= ruleIsIn EOF ;
    public final EObject entryRuleIsIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsIn = null;


        try {
            // InternalMyDsl.g:740:45: (iv_ruleIsIn= ruleIsIn EOF )
            // InternalMyDsl.g:741:2: iv_ruleIsIn= ruleIsIn EOF
            {
             newCompositeNode(grammarAccess.getIsInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsIn=ruleIsIn();

            state._fsp--;

             current =iv_ruleIsIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsIn"


    // $ANTLR start "ruleIsIn"
    // InternalMyDsl.g:747:1: ruleIsIn returns [EObject current=null] : (otherlv_0= 'Is' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) ) otherlv_5= '?' ) ;
    public final EObject ruleIsIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;
        Token otherlv_5=null;
        EObject lv_obj_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:753:2: ( (otherlv_0= 'Is' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) ) otherlv_5= '?' ) )
            // InternalMyDsl.g:754:2: (otherlv_0= 'Is' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) ) otherlv_5= '?' )
            {
            // InternalMyDsl.g:754:2: (otherlv_0= 'Is' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) ) otherlv_5= '?' )
            // InternalMyDsl.g:755:3: otherlv_0= 'Is' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) ) otherlv_5= '?'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsInAccess().getIsKeyword_0());
            		
            // InternalMyDsl.g:759:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:760:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:760:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:761:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_1_0, grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIsInAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:781:3: ( ( (lv_title_3_0= RULE_STRING ) ) | ( (lv_obj_4_0= ruleObject ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=15 && LA8_0<=17)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:782:4: ( (lv_title_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:782:4: ( (lv_title_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:783:5: (lv_title_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:783:5: (lv_title_3_0= RULE_STRING )
                    // InternalMyDsl.g:784:6: lv_title_3_0= RULE_STRING
                    {
                    lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_title_3_0, grammarAccess.getIsInAccess().getTitleSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsInRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:801:4: ( (lv_obj_4_0= ruleObject ) )
                    {
                    // InternalMyDsl.g:801:4: ( (lv_obj_4_0= ruleObject ) )
                    // InternalMyDsl.g:802:5: (lv_obj_4_0= ruleObject )
                    {
                    // InternalMyDsl.g:802:5: (lv_obj_4_0= ruleObject )
                    // InternalMyDsl.g:803:6: lv_obj_4_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_obj_4_0=ruleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsInRule());
                    						}
                    						set(
                    							current,
                    							"obj",
                    							lv_obj_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Object");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIsInAccess().getQuestionMarkKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsIn"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:829:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:829:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:830:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMyDsl.g:836:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:842:2: ( (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:843:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:843:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            // InternalMyDsl.g:844:3: otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalMyDsl.g:848:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalMyDsl.g:849:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalMyDsl.g:849:4: (lv_cond_1_0= ruleCondition )
            // InternalMyDsl.g:850:5: lv_cond_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getNotAccess().getCondConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cond_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:871:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:871:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:872:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:878:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_cond_2_0 = null;

        EObject lv_actionThen_6_0 = null;

        EObject lv_actionElse_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:884:2: ( (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) )
            // InternalMyDsl.g:885:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            {
            // InternalMyDsl.g:885:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            // InternalMyDsl.g:886:3: otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:894:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:895:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:895:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:896:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_cond_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:925:3: ( (lv_actionThen_6_0= ruleAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=18 && LA9_0<=21)||(LA9_0>=23 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:926:4: (lv_actionThen_6_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:926:4: (lv_actionThen_6_0= ruleAction )
            	    // InternalMyDsl.g:927:5: lv_actionThen_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_actionThen_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					set(
            	    						current,
            	    						"actionThen",
            	    						lv_actionThen_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:948:3: (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:949:4: otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMyDsl.g:961:4: ( (lv_actionElse_11_0= ruleAction ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=18 && LA10_0<=21)||(LA10_0>=23 && LA10_0<=25)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:962:5: (lv_actionElse_11_0= ruleAction )
                    	    {
                    	    // InternalMyDsl.g:962:5: (lv_actionElse_11_0= ruleAction )
                    	    // InternalMyDsl.g:963:6: lv_actionElse_11_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_actionElse_11_0=ruleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfRule());
                    	    						}
                    	    						set(
                    	    							current,
                    	    							"actionElse",
                    	    							lv_actionElse_11_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Action");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:989:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:989:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:990:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:996:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_milliseconds_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_cond_4_0 = null;

        EObject lv_actions_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1002:2: ( (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:1003:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:1003:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            // InternalMyDsl.g:1004:3: otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getConditionKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1020:3: ( (lv_cond_4_0= ruleCondition ) )
            // InternalMyDsl.g:1021:4: (lv_cond_4_0= ruleCondition )
            {
            // InternalMyDsl.g:1021:4: (lv_cond_4_0= ruleCondition )
            // InternalMyDsl.g:1022:5: lv_cond_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_cond_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_4_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getIntervalKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:1047:3: ( (lv_milliseconds_7_0= RULE_INT ) )
            // InternalMyDsl.g:1048:4: (lv_milliseconds_7_0= RULE_INT )
            {
            // InternalMyDsl.g:1048:4: (lv_milliseconds_7_0= RULE_INT )
            // InternalMyDsl.g:1049:5: lv_milliseconds_7_0= RULE_INT
            {
            lv_milliseconds_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_milliseconds_7_0, grammarAccess.getLoopAccess().getMillisecondsINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getDoKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:1077:3: ( (lv_actions_11_0= ruleAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=21)||(LA12_0>=23 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1078:4: (lv_actions_11_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1078:4: (lv_actions_11_0= ruleAction )
            	    // InternalMyDsl.g:1079:5: lv_actions_11_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_actions_11_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					set(
            	    						current,
            	    						"actions",
            	    						lv_actions_11_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleDoAll"
    // InternalMyDsl.g:1104:1: entryRuleDoAll returns [EObject current=null] : iv_ruleDoAll= ruleDoAll EOF ;
    public final EObject entryRuleDoAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoAll = null;


        try {
            // InternalMyDsl.g:1104:46: (iv_ruleDoAll= ruleDoAll EOF )
            // InternalMyDsl.g:1105:2: iv_ruleDoAll= ruleDoAll EOF
            {
             newCompositeNode(grammarAccess.getDoAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoAll=ruleDoAll();

            state._fsp--;

             current =iv_ruleDoAll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoAll"


    // $ANTLR start "ruleDoAll"
    // InternalMyDsl.g:1111:1: ruleDoAll returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) ) ;
    public final EObject ruleDoAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_coll_3_0 = null;

        EObject lv_todo_6_1 = null;

        EObject lv_todo_6_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1117:2: ( (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) ) )
            // InternalMyDsl.g:1118:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) )
            {
            // InternalMyDsl.g:1118:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) )
            // InternalMyDsl.g:1119:3: otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDoAllAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDoAllAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDoAllAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1131:3: ( (lv_coll_3_0= ruleCollection ) )
            // InternalMyDsl.g:1132:4: (lv_coll_3_0= ruleCollection )
            {
            // InternalMyDsl.g:1132:4: (lv_coll_3_0= ruleCollection )
            // InternalMyDsl.g:1133:5: lv_coll_3_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_coll_3_0=ruleCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoAllRule());
            					}
            					set(
            						current,
            						"coll",
            						lv_coll_3_0,
            						"org.xtext.example.mydsl.MyDsl.Collection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAllAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getDoAllAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:1158:3: ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) )
            // InternalMyDsl.g:1159:4: ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) )
            {
            // InternalMyDsl.g:1159:4: ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) )
            // InternalMyDsl.g:1160:5: (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure )
            {
            // InternalMyDsl.g:1160:5: (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=21)||(LA13_0>=23 && LA13_0<=25)) ) {
                alt13=1;
            }
            else if ( (LA13_0==30||LA13_0==35||LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1161:6: lv_todo_6_1= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_todo_6_1=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoAllRule());
                    						}
                    						set(
                    							current,
                    							"todo",
                    							lv_todo_6_1,
                    							"org.xtext.example.mydsl.MyDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1177:6: lv_todo_6_2= ruleStructure
                    {

                    						newCompositeNode(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_6_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_todo_6_2=ruleStructure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoAllRule());
                    						}
                    						set(
                    							current,
                    							"todo",
                    							lv_todo_6_2,
                    							"org.xtext.example.mydsl.MyDsl.Structure");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoAll"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008843BC0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000438000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010038010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000203BC0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008843BC0000L});

}