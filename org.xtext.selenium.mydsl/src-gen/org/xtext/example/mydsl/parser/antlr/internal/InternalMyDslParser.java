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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'File'", "'with'", "'browser'", "':'", "'body'", "'['", "']'", "'title'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'Alert'", "'Refresh'", "'Navigate'", "'Store : '", "'as'", "'Select'", "'from'", "'Click'", "'Fill'", "'CheckBox'", "'to'", "'true'", "'false'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'contains'", "'Not'", "'If'", "'Then'", "'{'", "'}'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'all'", "'in'", "'do'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
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

                if ( ((LA2_0>=24 && LA2_0<=27)||LA2_0==29||(LA2_0>=31 && LA2_0<=33)||(LA2_0>=37 && LA2_0<=38)||LA2_0==43||LA2_0==48||LA2_0==52) ) {
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

            	    if ( ((LA1_0>=24 && LA1_0<=27)||LA1_0==29||(LA1_0>=31 && LA1_0<=33)||(LA1_0>=37 && LA1_0<=38)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==43||LA1_0==48||LA1_0==52) ) {
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
    // InternalMyDsl.g:179:1: ruleAction returns [EObject current=null] : (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_Alert_5= ruleAlert | this_ActionSelect_6= ruleActionSelect | this_Store_7= ruleStore | this_Rickroll_8= ruleRickroll | this_DoWait_9= ruleDoWait ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Navigate_0 = null;

        EObject this_Click_1 = null;

        EObject this_Fill_2 = null;

        EObject this_CheckBox_3 = null;

        EObject this_Refresh_4 = null;

        EObject this_Alert_5 = null;

        EObject this_ActionSelect_6 = null;

        EObject this_Store_7 = null;

        EObject this_Rickroll_8 = null;

        EObject this_DoWait_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_Alert_5= ruleAlert | this_ActionSelect_6= ruleActionSelect | this_Store_7= ruleStore | this_Rickroll_8= ruleRickroll | this_DoWait_9= ruleDoWait ) )
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_Alert_5= ruleAlert | this_ActionSelect_6= ruleActionSelect | this_Store_7= ruleStore | this_Rickroll_8= ruleRickroll | this_DoWait_9= ruleDoWait )
            {
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_Alert_5= ruleAlert | this_ActionSelect_6= ruleActionSelect | this_Store_7= ruleStore | this_Rickroll_8= ruleRickroll | this_DoWait_9= ruleDoWait )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            case 29:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case 37:
                {
                alt3=9;
                }
                break;
            case 38:
                {
                alt3=10;
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
                    // InternalMyDsl.g:214:3: this_CheckBox_3= ruleCheckBox
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckBox_3=ruleCheckBox();

                    state._fsp--;


                    			current = this_CheckBox_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:223:3: this_Refresh_4= ruleRefresh
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRefreshParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Refresh_4=ruleRefresh();

                    state._fsp--;


                    			current = this_Refresh_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:232:3: this_Alert_5= ruleAlert
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
                    // InternalMyDsl.g:241:3: this_ActionSelect_6= ruleActionSelect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionSelectParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSelect_6=ruleActionSelect();

                    state._fsp--;


                    			current = this_ActionSelect_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:250:3: this_Store_7= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStoreParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_7=ruleStore();

                    state._fsp--;


                    			current = this_Store_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:259:3: this_Rickroll_8= ruleRickroll
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRickrollParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rickroll_8=ruleRickroll();

                    state._fsp--;


                    			current = this_Rickroll_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:268:3: this_DoWait_9= ruleDoWait
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDoWaitParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWait_9=ruleDoWait();

                    state._fsp--;


                    			current = this_DoWait_9;
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
    // InternalMyDsl.g:280:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalMyDsl.g:280:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalMyDsl.g:281:2: iv_ruleStructure= ruleStructure EOF
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
    // InternalMyDsl.g:287:1: ruleStructure returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_DoAll_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:293:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll ) )
            // InternalMyDsl.g:294:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll )
            {
            // InternalMyDsl.g:294:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case 52:
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
                    // InternalMyDsl.g:295:3: this_If_0= ruleIf
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
                    // InternalMyDsl.g:304:3: this_Loop_1= ruleLoop
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
                    // InternalMyDsl.g:313:3: this_DoAll_2= ruleDoAll
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
    // InternalMyDsl.g:325:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:325:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:326:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:332:1: ruleCondition returns [EObject current=null] : (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IsIn_0 = null;

        EObject this_Not_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:338:2: ( (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) )
            // InternalMyDsl.g:339:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            {
            // InternalMyDsl.g:339:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:340:3: this_IsIn_0= ruleIsIn
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
                    // InternalMyDsl.g:349:3: this_Not_1= ruleNot
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
    // InternalMyDsl.g:361:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:361:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:362:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:368:1: ruleObject returns [EObject current=null] : ( ( (lv_body_0_0= 'body' ) ) | (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;
        Token otherlv_1=null;
        Token lv_objectName_3_0=null;
        Token otherlv_4=null;
        EObject lv_htmltype_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:374:2: ( ( ( (lv_body_0_0= 'body' ) ) | (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' ) ) )
            // InternalMyDsl.g:375:2: ( ( (lv_body_0_0= 'body' ) ) | (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' ) )
            {
            // InternalMyDsl.g:375:2: ( ( (lv_body_0_0= 'body' ) ) | (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:376:3: ( (lv_body_0_0= 'body' ) )
                    {
                    // InternalMyDsl.g:376:3: ( (lv_body_0_0= 'body' ) )
                    // InternalMyDsl.g:377:4: (lv_body_0_0= 'body' )
                    {
                    // InternalMyDsl.g:377:4: (lv_body_0_0= 'body' )
                    // InternalMyDsl.g:378:5: lv_body_0_0= 'body'
                    {
                    lv_body_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_body_0_0, grammarAccess.getObjectAccess().getBodyBodyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectRule());
                    					}
                    					setWithLastConsumed(current, "body", lv_body_0_0, "body");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:391:3: (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' )
                    {
                    // InternalMyDsl.g:391:3: (otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']' )
                    // InternalMyDsl.g:392:4: otherlv_1= '[' ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:396:4: ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:397:5: ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectName_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:397:5: ( (lv_htmltype_2_0= ruleHTMLTYPE ) )
                    // InternalMyDsl.g:398:6: (lv_htmltype_2_0= ruleHTMLTYPE )
                    {
                    // InternalMyDsl.g:398:6: (lv_htmltype_2_0= ruleHTMLTYPE )
                    // InternalMyDsl.g:399:7: lv_htmltype_2_0= ruleHTMLTYPE
                    {

                    							newCompositeNode(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_htmltype_2_0=ruleHTMLTYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getObjectRule());
                    							}
                    							set(
                    								current,
                    								"htmltype",
                    								lv_htmltype_2_0,
                    								"org.xtext.example.mydsl.MyDsl.HTMLTYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:416:5: ( (lv_objectName_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:417:6: (lv_objectName_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:417:6: (lv_objectName_3_0= RULE_STRING )
                    // InternalMyDsl.g:418:7: lv_objectName_3_0= RULE_STRING
                    {
                    lv_objectName_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_objectName_3_0, grammarAccess.getObjectAccess().getObjectNameSTRINGTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"objectName",
                    								lv_objectName_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleHTMLTYPE"
    // InternalMyDsl.g:444:1: entryRuleHTMLTYPE returns [EObject current=null] : iv_ruleHTMLTYPE= ruleHTMLTYPE EOF ;
    public final EObject entryRuleHTMLTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTMLTYPE = null;


        try {
            // InternalMyDsl.g:444:49: (iv_ruleHTMLTYPE= ruleHTMLTYPE EOF )
            // InternalMyDsl.g:445:2: iv_ruleHTMLTYPE= ruleHTMLTYPE EOF
            {
             newCompositeNode(grammarAccess.getHTMLTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHTMLTYPE=ruleHTMLTYPE();

            state._fsp--;

             current =iv_ruleHTMLTYPE; 
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
    // InternalMyDsl.g:451:1: ruleHTMLTYPE returns [EObject current=null] : ( ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) ) ) ;
    public final EObject ruleHTMLTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:457:2: ( ( ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) ) ) )
            // InternalMyDsl.g:458:2: ( ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) ) )
            {
            // InternalMyDsl.g:458:2: ( ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) ) )
            // InternalMyDsl.g:459:3: ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) )
            {
            // InternalMyDsl.g:459:3: ( (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' ) )
            // InternalMyDsl.g:460:4: (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' )
            {
            // InternalMyDsl.g:460:4: (lv_type_0_1= 'title' | lv_type_0_2= 'class' | lv_type_0_3= 'id' | lv_type_0_4= 'name' | lv_type_0_5= 'CSS Selector' | lv_type_0_6= 'XPath' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            case 23:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:461:5: lv_type_0_1= 'title'
                    {
                    lv_type_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:472:5: lv_type_0_2= 'class'
                    {
                    lv_type_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:483:5: lv_type_0_3= 'id'
                    {
                    lv_type_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:494:5: lv_type_0_4= 'name'
                    {
                    lv_type_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:505:5: lv_type_0_5= 'CSS Selector'
                    {
                    lv_type_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:516:5: lv_type_0_6= 'XPath'
                    {
                    lv_type_0_6=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleHTMLTYPE"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:532:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:532:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:533:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalMyDsl.g:539:1: ruleCollection returns [EObject current=null] : ( (lv_obj_0_0= ruleObject ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:545:2: ( ( (lv_obj_0_0= ruleObject ) ) )
            // InternalMyDsl.g:546:2: ( (lv_obj_0_0= ruleObject ) )
            {
            // InternalMyDsl.g:546:2: ( (lv_obj_0_0= ruleObject ) )
            // InternalMyDsl.g:547:3: (lv_obj_0_0= ruleObject )
            {
            // InternalMyDsl.g:547:3: (lv_obj_0_0= ruleObject )
            // InternalMyDsl.g:548:4: lv_obj_0_0= ruleObject
            {

            				newCompositeNode(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
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
    // InternalMyDsl.g:568:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // InternalMyDsl.g:568:46: (iv_ruleAlert= ruleAlert EOF )
            // InternalMyDsl.g:569:2: iv_ruleAlert= ruleAlert EOF
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
    // InternalMyDsl.g:575:1: ruleAlert returns [EObject current=null] : (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:581:2: ( (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:582:2: (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:582:2: (otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:583:3: otherlv_0= 'Alert' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlertAccess().getAlertKeyword_0());
            		
            // InternalMyDsl.g:587:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:588:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:588:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:589:5: lv_text_1_0= RULE_STRING
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
    // InternalMyDsl.g:609:1: entryRuleRefresh returns [EObject current=null] : iv_ruleRefresh= ruleRefresh EOF ;
    public final EObject entryRuleRefresh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefresh = null;


        try {
            // InternalMyDsl.g:609:48: (iv_ruleRefresh= ruleRefresh EOF )
            // InternalMyDsl.g:610:2: iv_ruleRefresh= ruleRefresh EOF
            {
             newCompositeNode(grammarAccess.getRefreshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefresh=ruleRefresh();

            state._fsp--;

             current =iv_ruleRefresh; 
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
    // InternalMyDsl.g:616:1: ruleRefresh returns [EObject current=null] : ( () otherlv_1= 'Refresh' ) ;
    public final EObject ruleRefresh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:622:2: ( ( () otherlv_1= 'Refresh' ) )
            // InternalMyDsl.g:623:2: ( () otherlv_1= 'Refresh' )
            {
            // InternalMyDsl.g:623:2: ( () otherlv_1= 'Refresh' )
            // InternalMyDsl.g:624:3: () otherlv_1= 'Refresh'
            {
            // InternalMyDsl.g:624:3: ()
            // InternalMyDsl.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefreshAccess().getRefreshAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRefreshAccess().getRefreshKeyword_1());
            		

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
    // $ANTLR end "ruleRefresh"


    // $ANTLR start "entryRuleNavigate"
    // InternalMyDsl.g:639:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalMyDsl.g:639:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalMyDsl.g:640:2: iv_ruleNavigate= ruleNavigate EOF
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
    // InternalMyDsl.g:646:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:652:2: ( (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:653:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:653:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:654:3: otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalMyDsl.g:658:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:659:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:659:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:660:5: lv_url_1_0= RULE_STRING
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
    // InternalMyDsl.g:680:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:680:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:681:2: iv_ruleStore= ruleStore EOF
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
    // InternalMyDsl.g:687:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store : ' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_objName_3_0=null;
        EObject lv_obj_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( (otherlv_0= 'Store : ' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:694:2: (otherlv_0= 'Store : ' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:694:2: (otherlv_0= 'Store : ' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:695:3: otherlv_0= 'Store : ' ( (lv_obj_1_0= ruleObject ) ) otherlv_2= 'as' ( (lv_objName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:699:3: ( (lv_obj_1_0= ruleObject ) )
            // InternalMyDsl.g:700:4: (lv_obj_1_0= ruleObject )
            {
            // InternalMyDsl.g:700:4: (lv_obj_1_0= ruleObject )
            // InternalMyDsl.g:701:5: lv_obj_1_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:722:3: ( (lv_objName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:723:4: (lv_objName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:723:4: (lv_objName_3_0= RULE_STRING )
            // InternalMyDsl.g:724:5: lv_objName_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleActionSelect"
    // InternalMyDsl.g:744:1: entryRuleActionSelect returns [EObject current=null] : iv_ruleActionSelect= ruleActionSelect EOF ;
    public final EObject entryRuleActionSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSelect = null;


        try {
            // InternalMyDsl.g:744:53: (iv_ruleActionSelect= ruleActionSelect EOF )
            // InternalMyDsl.g:745:2: iv_ruleActionSelect= ruleActionSelect EOF
            {
             newCompositeNode(grammarAccess.getActionSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSelect=ruleActionSelect();

            state._fsp--;

             current =iv_ruleActionSelect; 
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
    // $ANTLR end "entryRuleActionSelect"


    // $ANTLR start "ruleActionSelect"
    // InternalMyDsl.g:751:1: ruleActionSelect returns [EObject current=null] : (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_0=null;
        Token otherlv_2=null;
        Token lv_xpath_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:757:2: ( (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:758:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:758:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:759:3: otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionSelectAccess().getSelectKeyword_0());
            		
            // InternalMyDsl.g:763:3: ( (lv_option_1_0= RULE_STRING ) )
            // InternalMyDsl.g:764:4: (lv_option_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:764:4: (lv_option_1_0= RULE_STRING )
            // InternalMyDsl.g:765:5: lv_option_1_0= RULE_STRING
            {
            lv_option_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_option_1_0, grammarAccess.getActionSelectAccess().getOptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"option",
            						lv_option_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionSelectAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:785:3: ( (lv_xpath_3_0= RULE_STRING ) )
            // InternalMyDsl.g:786:4: (lv_xpath_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:786:4: (lv_xpath_3_0= RULE_STRING )
            // InternalMyDsl.g:787:5: lv_xpath_3_0= RULE_STRING
            {
            lv_xpath_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_xpath_3_0, grammarAccess.getActionSelectAccess().getXpathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xpath",
            						lv_xpath_3_0,
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
    // $ANTLR end "ruleActionSelect"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:807:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:807:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:808:2: iv_ruleClick= ruleClick EOF
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
    // InternalMyDsl.g:814:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:820:2: ( (otherlv_0= 'Click' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:821:2: (otherlv_0= 'Click' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:821:2: (otherlv_0= 'Click' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:822:3: otherlv_0= 'Click' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalMyDsl.g:826:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:827:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:827:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:828:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalMyDsl.g:848:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalMyDsl.g:848:45: (iv_ruleFill= ruleFill EOF )
            // InternalMyDsl.g:849:2: iv_ruleFill= ruleFill EOF
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
    // InternalMyDsl.g:855:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:861:2: ( (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:862:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:862:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:863:3: otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalMyDsl.g:867:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:868:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:868:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:869:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFillAccess().getWithKeyword_2());
            		
            // InternalMyDsl.g:889:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalMyDsl.g:890:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:890:4: (lv_content_3_0= RULE_STRING )
            // InternalMyDsl.g:891:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_3_0, grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
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


    // $ANTLR start "entryRuleCheckBox"
    // InternalMyDsl.g:911:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalMyDsl.g:911:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalMyDsl.g:912:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalMyDsl.g:918:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;
        Token otherlv_2=null;
        Token lv_newValue_3_1=null;
        Token lv_newValue_3_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:924:2: ( (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) )
            // InternalMyDsl.g:925:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            {
            // InternalMyDsl.g:925:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            // InternalMyDsl.g:926:3: otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0());
            		
            // InternalMyDsl.g:930:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:931:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:931:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:932:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_nametag_1_0, grammarAccess.getCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nametag",
            						lv_nametag_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:948:3: (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:949:4: otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getToKeyword_2_0());
                    			
                    // InternalMyDsl.g:953:4: ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    // InternalMyDsl.g:954:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    {
                    // InternalMyDsl.g:954:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    // InternalMyDsl.g:955:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    {
                    // InternalMyDsl.g:955:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==35) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==36) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:956:7: lv_newValue_3_1= 'true'
                            {
                            lv_newValue_3_1=(Token)match(input,35,FOLLOW_2); 

                            							newLeafNode(lv_newValue_3_1, grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCheckBoxRule());
                            							}
                            							setWithLastConsumed(current, "newValue", lv_newValue_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:967:7: lv_newValue_3_2= 'false'
                            {
                            lv_newValue_3_2=(Token)match(input,36,FOLLOW_2); 

                            							newLeafNode(lv_newValue_3_2, grammarAccess.getCheckBoxAccess().getNewValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCheckBoxRule());
                            							}
                            							setWithLastConsumed(current, "newValue", lv_newValue_3_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRickroll"
    // InternalMyDsl.g:985:1: entryRuleRickroll returns [EObject current=null] : iv_ruleRickroll= ruleRickroll EOF ;
    public final EObject entryRuleRickroll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRickroll = null;


        try {
            // InternalMyDsl.g:985:49: (iv_ruleRickroll= ruleRickroll EOF )
            // InternalMyDsl.g:986:2: iv_ruleRickroll= ruleRickroll EOF
            {
             newCompositeNode(grammarAccess.getRickrollRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRickroll=ruleRickroll();

            state._fsp--;

             current =iv_ruleRickroll; 
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
    // $ANTLR end "entryRuleRickroll"


    // $ANTLR start "ruleRickroll"
    // InternalMyDsl.g:992:1: ruleRickroll returns [EObject current=null] : ( () otherlv_1= 'RickRoll' ) ;
    public final EObject ruleRickroll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:998:2: ( ( () otherlv_1= 'RickRoll' ) )
            // InternalMyDsl.g:999:2: ( () otherlv_1= 'RickRoll' )
            {
            // InternalMyDsl.g:999:2: ( () otherlv_1= 'RickRoll' )
            // InternalMyDsl.g:1000:3: () otherlv_1= 'RickRoll'
            {
            // InternalMyDsl.g:1000:3: ()
            // InternalMyDsl.g:1001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRickrollAccess().getRickrollAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRickrollAccess().getRickRollKeyword_1());
            		

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
    // $ANTLR end "ruleRickroll"


    // $ANTLR start "entryRuleDoWait"
    // InternalMyDsl.g:1015:1: entryRuleDoWait returns [EObject current=null] : iv_ruleDoWait= ruleDoWait EOF ;
    public final EObject entryRuleDoWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWait = null;


        try {
            // InternalMyDsl.g:1015:47: (iv_ruleDoWait= ruleDoWait EOF )
            // InternalMyDsl.g:1016:2: iv_ruleDoWait= ruleDoWait EOF
            {
             newCompositeNode(grammarAccess.getDoWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoWait=ruleDoWait();

            state._fsp--;

             current =iv_ruleDoWait; 
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
    // $ANTLR end "entryRuleDoWait"


    // $ANTLR start "ruleDoWait"
    // InternalMyDsl.g:1022:1: ruleDoWait returns [EObject current=null] : (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) ;
    public final EObject ruleDoWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_millisec_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1028:2: ( (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) )
            // InternalMyDsl.g:1029:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            {
            // InternalMyDsl.g:1029:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            // InternalMyDsl.g:1030:3: otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWaitAccess().getWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDoWaitAccess().getForKeyword_1());
            		
            // InternalMyDsl.g:1038:3: ( (lv_millisec_2_0= RULE_INT ) )
            // InternalMyDsl.g:1039:4: (lv_millisec_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1039:4: (lv_millisec_2_0= RULE_INT )
            // InternalMyDsl.g:1040:5: lv_millisec_2_0= RULE_INT
            {
            lv_millisec_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_millisec_2_0, grammarAccess.getDoWaitAccess().getMillisecINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoWaitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisec",
            						lv_millisec_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDoWaitAccess().getMillisecondsKeyword_3());
            		

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
    // $ANTLR end "ruleDoWait"


    // $ANTLR start "entryRuleIsIn"
    // InternalMyDsl.g:1064:1: entryRuleIsIn returns [EObject current=null] : iv_ruleIsIn= ruleIsIn EOF ;
    public final EObject entryRuleIsIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsIn = null;


        try {
            // InternalMyDsl.g:1064:45: (iv_ruleIsIn= ruleIsIn EOF )
            // InternalMyDsl.g:1065:2: iv_ruleIsIn= ruleIsIn EOF
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
    // InternalMyDsl.g:1071:1: ruleIsIn returns [EObject current=null] : ( ( (lv_obj_0_0= ruleObject ) ) otherlv_1= 'contains' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIsIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1077:2: ( ( ( (lv_obj_0_0= ruleObject ) ) otherlv_1= 'contains' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1078:2: ( ( (lv_obj_0_0= ruleObject ) ) otherlv_1= 'contains' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1078:2: ( ( (lv_obj_0_0= ruleObject ) ) otherlv_1= 'contains' ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1079:3: ( (lv_obj_0_0= ruleObject ) ) otherlv_1= 'contains' ( (lv_text_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1079:3: ( (lv_obj_0_0= ruleObject ) )
            // InternalMyDsl.g:1080:4: (lv_obj_0_0= ruleObject )
            {
            // InternalMyDsl.g:1080:4: (lv_obj_0_0= ruleObject )
            // InternalMyDsl.g:1081:5: lv_obj_0_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_obj_0_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsInRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_0_0,
            						"org.xtext.example.mydsl.MyDsl.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInAccess().getContainsKeyword_1());
            		
            // InternalMyDsl.g:1102:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1103:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1103:4: (lv_text_2_0= RULE_STRING )
            // InternalMyDsl.g:1104:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
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
    // $ANTLR end "ruleIsIn"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:1124:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:1124:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:1125:2: iv_ruleNot= ruleNot EOF
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
    // InternalMyDsl.g:1131:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1137:2: ( (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:1138:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:1138:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            // InternalMyDsl.g:1139:3: otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalMyDsl.g:1143:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalMyDsl.g:1144:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalMyDsl.g:1144:4: (lv_cond_1_0= ruleCondition )
            // InternalMyDsl.g:1145:5: lv_cond_1_0= ruleCondition
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
    // InternalMyDsl.g:1166:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:1166:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:1167:2: iv_ruleIf= ruleIf EOF
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
    // InternalMyDsl.g:1173:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) ;
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
            // InternalMyDsl.g:1179:2: ( (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) )
            // InternalMyDsl.g:1180:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            {
            // InternalMyDsl.g:1180:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            // InternalMyDsl.g:1181:3: otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1189:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:1190:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:1190:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:1191:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,45,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1220:3: ( (lv_actionThen_6_0= ruleAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=27)||LA10_0==29||(LA10_0>=31 && LA10_0<=33)||(LA10_0>=37 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1221:4: (lv_actionThen_6_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1221:4: (lv_actionThen_6_0= ruleAction )
            	    // InternalMyDsl.g:1222:5: lv_actionThen_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_actionThen_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actionThen",
            	    						lv_actionThen_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,46,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1243:3: (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1244:4: otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMyDsl.g:1256:4: ( (lv_actionElse_11_0= ruleAction ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=24 && LA11_0<=27)||LA11_0==29||(LA11_0>=31 && LA11_0<=33)||(LA11_0>=37 && LA11_0<=38)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:1257:5: (lv_actionElse_11_0= ruleAction )
                    	    {
                    	    // InternalMyDsl.g:1257:5: (lv_actionElse_11_0= ruleAction )
                    	    // InternalMyDsl.g:1258:6: lv_actionElse_11_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_actionElse_11_0=ruleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actionElse",
                    	    							lv_actionElse_11_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Action");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,46,FOLLOW_2); 

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
    // InternalMyDsl.g:1284:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1284:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1285:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:1291:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1297:2: ( (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1298:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1298:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1299:3: otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getConditionKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1315:3: ( (lv_cond_4_0= ruleCondition ) )
            // InternalMyDsl.g:1316:4: (lv_cond_4_0= ruleCondition )
            {
            // InternalMyDsl.g:1316:4: (lv_cond_4_0= ruleCondition )
            // InternalMyDsl.g:1317:5: lv_cond_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getIntervalKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:1342:3: ( (lv_milliseconds_7_0= RULE_INT ) )
            // InternalMyDsl.g:1343:4: (lv_milliseconds_7_0= RULE_INT )
            {
            // InternalMyDsl.g:1343:4: (lv_milliseconds_7_0= RULE_INT )
            // InternalMyDsl.g:1344:5: lv_milliseconds_7_0= RULE_INT
            {
            lv_milliseconds_7_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            otherlv_8=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getDoKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:1372:3: ( (lv_actions_11_0= ruleAction ) )
            // InternalMyDsl.g:1373:4: (lv_actions_11_0= ruleAction )
            {
            // InternalMyDsl.g:1373:4: (lv_actions_11_0= ruleAction )
            // InternalMyDsl.g:1374:5: lv_actions_11_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_28);
            lv_actions_11_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_11_0,
            						"org.xtext.example.mydsl.MyDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,46,FOLLOW_2); 

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
    // InternalMyDsl.g:1399:1: entryRuleDoAll returns [EObject current=null] : iv_ruleDoAll= ruleDoAll EOF ;
    public final EObject entryRuleDoAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoAll = null;


        try {
            // InternalMyDsl.g:1399:46: (iv_ruleDoAll= ruleDoAll EOF )
            // InternalMyDsl.g:1400:2: iv_ruleDoAll= ruleDoAll EOF
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
    // InternalMyDsl.g:1406:1: ruleDoAll returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) ) ;
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
            // InternalMyDsl.g:1412:2: ( (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) ) )
            // InternalMyDsl.g:1413:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) )
            {
            // InternalMyDsl.g:1413:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) ) )
            // InternalMyDsl.g:1414:3: otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDoAllAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDoAllAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDoAllAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1426:3: ( (lv_coll_3_0= ruleCollection ) )
            // InternalMyDsl.g:1427:4: (lv_coll_3_0= ruleCollection )
            {
            // InternalMyDsl.g:1427:4: (lv_coll_3_0= ruleCollection )
            // InternalMyDsl.g:1428:5: lv_coll_3_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAllAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getDoAllAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:1453:3: ( ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) ) )
            // InternalMyDsl.g:1454:4: ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) )
            {
            // InternalMyDsl.g:1454:4: ( (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure ) )
            // InternalMyDsl.g:1455:5: (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure )
            {
            // InternalMyDsl.g:1455:5: (lv_todo_6_1= ruleAction | lv_todo_6_2= ruleStructure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=27)||LA13_0==29||(LA13_0>=31 && LA13_0<=33)||(LA13_0>=37 && LA13_0<=38)) ) {
                alt13=1;
            }
            else if ( (LA13_0==43||LA13_0==48||LA13_0==52) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1456:6: lv_todo_6_1= ruleAction
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
                    // InternalMyDsl.g:1472:6: lv_todo_6_2= ruleStructure
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00110863AF000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00004063AF000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000063AF000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00110863AF000000L});

}