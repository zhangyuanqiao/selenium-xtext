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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'File'", "'with'", "'browser'", "':'", "'guess'", "'title'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'Collection'", "'{'", "'}'", "'of'", "'all'", "'Subprocedure'", "'Refresh'", "'Navigate'", "'var'", "'='", "'Redefine'", "'as'", "'Delete'", "'Select'", "'from'", "'Click'", "'Fill'", "'CheckBox'", "'to'", "'true'", "'false'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'body'", "'contains'", "'Not'", "'If'", "'Then'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'in'", "'do'", "'Execute'"
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

                if ( ((LA2_0>=28 && LA2_0<=30)||LA2_0==32||(LA2_0>=34 && LA2_0<=35)||(LA2_0>=37 && LA2_0<=39)||(LA2_0>=43 && LA2_0<=44)||LA2_0==50||LA2_0==53||LA2_0==57||LA2_0==60) ) {
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

            	    if ( ((LA1_0>=28 && LA1_0<=30)||LA1_0==32||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=37 && LA1_0<=39)||(LA1_0>=43 && LA1_0<=44)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==50||LA1_0==53||LA1_0==57||LA1_0==60) ) {
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
    // InternalMyDsl.g:179:1: ruleAction returns [EObject current=null] : (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_ActionSelect_5= ruleActionSelect | this_Store_6= ruleStore | this_ReDefine_7= ruleReDefine | this_Delete_8= ruleDelete | this_Rickroll_9= ruleRickroll | this_DoWait_10= ruleDoWait ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Navigate_0 = null;

        EObject this_Click_1 = null;

        EObject this_Fill_2 = null;

        EObject this_CheckBox_3 = null;

        EObject this_Refresh_4 = null;

        EObject this_ActionSelect_5 = null;

        EObject this_Store_6 = null;

        EObject this_ReDefine_7 = null;

        EObject this_Delete_8 = null;

        EObject this_Rickroll_9 = null;

        EObject this_DoWait_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_ActionSelect_5= ruleActionSelect | this_Store_6= ruleStore | this_ReDefine_7= ruleReDefine | this_Delete_8= ruleDelete | this_Rickroll_9= ruleRickroll | this_DoWait_10= ruleDoWait ) )
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_ActionSelect_5= ruleActionSelect | this_Store_6= ruleStore | this_ReDefine_7= ruleReDefine | this_Delete_8= ruleDelete | this_Rickroll_9= ruleRickroll | this_DoWait_10= ruleDoWait )
            {
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Click_1= ruleClick | this_Fill_2= ruleFill | this_CheckBox_3= ruleCheckBox | this_Refresh_4= ruleRefresh | this_ActionSelect_5= ruleActionSelect | this_Store_6= ruleStore | this_ReDefine_7= ruleReDefine | this_Delete_8= ruleDelete | this_Rickroll_9= ruleRickroll | this_DoWait_10= ruleDoWait )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 35:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 32:
                {
                alt3=8;
                }
                break;
            case 34:
                {
                alt3=9;
                }
                break;
            case 43:
                {
                alt3=10;
                }
                break;
            case 44:
                {
                alt3=11;
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
                    // InternalMyDsl.g:232:3: this_ActionSelect_5= ruleActionSelect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionSelectParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSelect_5=ruleActionSelect();

                    state._fsp--;


                    			current = this_ActionSelect_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:241:3: this_Store_6= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStoreParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_6=ruleStore();

                    state._fsp--;


                    			current = this_Store_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:250:3: this_ReDefine_7= ruleReDefine
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getReDefineParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReDefine_7=ruleReDefine();

                    state._fsp--;


                    			current = this_ReDefine_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:259:3: this_Delete_8= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_8=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:268:3: this_Rickroll_9= ruleRickroll
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRickrollParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rickroll_9=ruleRickroll();

                    state._fsp--;


                    			current = this_Rickroll_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:277:3: this_DoWait_10= ruleDoWait
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDoWaitParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWait_10=ruleDoWait();

                    state._fsp--;


                    			current = this_DoWait_10;
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
    // InternalMyDsl.g:289:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalMyDsl.g:289:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalMyDsl.g:290:2: iv_ruleStructure= ruleStructure EOF
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
    // InternalMyDsl.g:296:1: ruleStructure returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_DoAll_2 = null;

        EObject this_Execute_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:302:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute ) )
            // InternalMyDsl.g:303:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute )
            {
            // InternalMyDsl.g:303:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute )
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
                    // InternalMyDsl.g:304:3: this_If_0= ruleIf
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
                    // InternalMyDsl.g:313:3: this_Loop_1= ruleLoop
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
                    // InternalMyDsl.g:322:3: this_DoAll_2= ruleDoAll
                    {

                    			newCompositeNode(grammarAccess.getStructureAccess().getDoAllParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoAll_2=ruleDoAll();

                    state._fsp--;


                    			current = this_DoAll_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:331:3: this_Execute_3= ruleExecute
                    {

                    			newCompositeNode(grammarAccess.getStructureAccess().getExecuteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Execute_3=ruleExecute();

                    state._fsp--;


                    			current = this_Execute_3;
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
    // InternalMyDsl.g:343:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:343:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:344:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:350:1: ruleCondition returns [EObject current=null] : (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IsIn_0 = null;

        EObject this_Not_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:356:2: ( (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) )
            // InternalMyDsl.g:357:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            {
            // InternalMyDsl.g:357:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||(LA5_0>=15 && LA5_0<=21)||LA5_0==27||LA5_0==47) ) {
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
                    // InternalMyDsl.g:358:3: this_IsIn_0= ruleIsIn
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
                    // InternalMyDsl.g:367:3: this_Not_1= ruleNot
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
    // InternalMyDsl.g:379:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:379:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:380:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:386:1: ruleObject returns [EObject current=null] : ( ( (lv_objName_0_0= RULE_STRING ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_objName_0_0=null;
        Token lv_objectDef_3_0=null;
        EObject this_SubProcedure_1 = null;

        EObject lv_htmltype_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:392:2: ( ( ( (lv_objName_0_0= RULE_STRING ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:393:2: ( ( (lv_objName_0_0= RULE_STRING ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) )
            {
            // InternalMyDsl.g:393:2: ( ( (lv_objName_0_0= RULE_STRING ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
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
                    // InternalMyDsl.g:394:3: ( (lv_objName_0_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:394:3: ( (lv_objName_0_0= RULE_STRING ) )
                    // InternalMyDsl.g:395:4: (lv_objName_0_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:395:4: (lv_objName_0_0= RULE_STRING )
                    // InternalMyDsl.g:396:5: lv_objName_0_0= RULE_STRING
                    {
                    lv_objName_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_objName_0_0, grammarAccess.getObjectAccess().getObjNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"objName",
                    						lv_objName_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:3: this_SubProcedure_1= ruleSubProcedure
                    {

                    			newCompositeNode(grammarAccess.getObjectAccess().getSubProcedureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubProcedure_1=ruleSubProcedure();

                    state._fsp--;


                    			current = this_SubProcedure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:422:3: ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:422:3: ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:423:4: ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:423:4: ( (lv_htmltype_2_0= ruleHTMLTYPE ) )
                    // InternalMyDsl.g:424:5: (lv_htmltype_2_0= ruleHTMLTYPE )
                    {
                    // InternalMyDsl.g:424:5: (lv_htmltype_2_0= ruleHTMLTYPE )
                    // InternalMyDsl.g:425:6: lv_htmltype_2_0= ruleHTMLTYPE
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getHtmltypeHTMLTYPEParserRuleCall_2_0_0());
                    					
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

                    // InternalMyDsl.g:442:4: ( (lv_objectDef_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:443:5: (lv_objectDef_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:443:5: (lv_objectDef_3_0= RULE_STRING )
                    // InternalMyDsl.g:444:6: lv_objectDef_3_0= RULE_STRING
                    {
                    lv_objectDef_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_objectDef_3_0, grammarAccess.getObjectAccess().getObjectDefSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectDef",
                    							lv_objectDef_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // InternalMyDsl.g:465:1: entryRuleHTMLTYPE returns [EObject current=null] : iv_ruleHTMLTYPE= ruleHTMLTYPE EOF ;
    public final EObject entryRuleHTMLTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTMLTYPE = null;


        try {
            // InternalMyDsl.g:465:49: (iv_ruleHTMLTYPE= ruleHTMLTYPE EOF )
            // InternalMyDsl.g:466:2: iv_ruleHTMLTYPE= ruleHTMLTYPE EOF
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
    // InternalMyDsl.g:472:1: ruleHTMLTYPE returns [EObject current=null] : ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) ) ;
    public final EObject ruleHTMLTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:478:2: ( ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) ) )
            // InternalMyDsl.g:479:2: ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) )
            {
            // InternalMyDsl.g:479:2: ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) )
            // InternalMyDsl.g:480:3: ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) )
            {
            // InternalMyDsl.g:480:3: ( (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) )
            // InternalMyDsl.g:481:4: (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' )
            {
            // InternalMyDsl.g:481:4: (lv_type_0_1= 'guess' | lv_type_0_2= 'title' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:482:5: lv_type_0_1= 'guess'
                    {
                    lv_type_0_1=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getHTMLTYPEAccess().getTypeGuessKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:493:5: lv_type_0_2= 'title'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getHTMLTYPEAccess().getTypeTitleKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:504:5: lv_type_0_3= 'class'
                    {
                    lv_type_0_3=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getHTMLTYPEAccess().getTypeClassKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:515:5: lv_type_0_4= 'id'
                    {
                    lv_type_0_4=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getHTMLTYPEAccess().getTypeIdKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:526:5: lv_type_0_5= 'name'
                    {
                    lv_type_0_5=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getHTMLTYPEAccess().getTypeNameKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:537:5: lv_type_0_6= 'CSS Selector'
                    {
                    lv_type_0_6=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getHTMLTYPEAccess().getTypeCSSSelectorKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:548:5: lv_type_0_7= 'XPath'
                    {
                    lv_type_0_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getHTMLTYPEAccess().getTypeXPathKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

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
    // InternalMyDsl.g:564:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:564:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:565:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalMyDsl.g:571:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objectRule_7_0=null;
        EObject lv_obj_2_0 = null;

        EObject lv_htmltype_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:577:2: ( (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) ) )
            // InternalMyDsl.g:578:2: (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) )
            {
            // InternalMyDsl.g:578:2: (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:579:3: otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
            		
            // InternalMyDsl.g:583:3: ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:584:4: (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' )
                    {
                    // InternalMyDsl.g:584:4: (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' )
                    // InternalMyDsl.g:585:5: otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:589:5: ( (lv_obj_2_0= ruleObject ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING||(LA8_0>=15 && LA8_0<=21)||LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:590:6: (lv_obj_2_0= ruleObject )
                    	    {
                    	    // InternalMyDsl.g:590:6: (lv_obj_2_0= ruleObject )
                    	    // InternalMyDsl.g:591:7: lv_obj_2_0= ruleObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_obj_2_0=ruleObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"obj",
                    	    								lv_obj_2_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Object");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:614:4: (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:614:4: (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:615:5: otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionAccess().getOfKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,26,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getAllKeyword_1_1_1());
                    				
                    // InternalMyDsl.g:623:5: ( (lv_htmltype_6_0= ruleHTMLTYPE ) )
                    // InternalMyDsl.g:624:6: (lv_htmltype_6_0= ruleHTMLTYPE )
                    {
                    // InternalMyDsl.g:624:6: (lv_htmltype_6_0= ruleHTMLTYPE )
                    // InternalMyDsl.g:625:7: lv_htmltype_6_0= ruleHTMLTYPE
                    {

                    							newCompositeNode(grammarAccess.getCollectionAccess().getHtmltypeHTMLTYPEParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_htmltype_6_0=ruleHTMLTYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionRule());
                    							}
                    							set(
                    								current,
                    								"htmltype",
                    								lv_htmltype_6_0,
                    								"org.xtext.example.mydsl.MyDsl.HTMLTYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:642:5: ( (lv_objectRule_7_0= RULE_STRING ) )
                    // InternalMyDsl.g:643:6: (lv_objectRule_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:643:6: (lv_objectRule_7_0= RULE_STRING )
                    // InternalMyDsl.g:644:7: lv_objectRule_7_0= RULE_STRING
                    {
                    lv_objectRule_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_objectRule_7_0, grammarAccess.getCollectionAccess().getObjectRuleSTRINGTerminalRuleCall_1_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCollectionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"objectRule",
                    								lv_objectRule_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleSubProcedure"
    // InternalMyDsl.g:666:1: entryRuleSubProcedure returns [EObject current=null] : iv_ruleSubProcedure= ruleSubProcedure EOF ;
    public final EObject entryRuleSubProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProcedure = null;


        try {
            // InternalMyDsl.g:666:53: (iv_ruleSubProcedure= ruleSubProcedure EOF )
            // InternalMyDsl.g:667:2: iv_ruleSubProcedure= ruleSubProcedure EOF
            {
             newCompositeNode(grammarAccess.getSubProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubProcedure=ruleSubProcedure();

            state._fsp--;

             current =iv_ruleSubProcedure; 
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
    // $ANTLR end "entryRuleSubProcedure"


    // $ANTLR start "ruleSubProcedure"
    // InternalMyDsl.g:673:1: ruleSubProcedure returns [EObject current=null] : (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_1 = null;

        EObject lv_actions_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:679:2: ( (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:680:2: (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:680:2: (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' )
            // InternalMyDsl.g:681:3: otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSubProcedureAccess().getSubprocedureKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubProcedureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:689:3: ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=30)||LA11_0==32||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=37 && LA11_0<=39)||(LA11_0>=43 && LA11_0<=44)||LA11_0==50||LA11_0==53||LA11_0==57||LA11_0==60) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:690:4: ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) )
            	    {
            	    // InternalMyDsl.g:690:4: ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) )
            	    // InternalMyDsl.g:691:5: (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure )
            	    {
            	    // InternalMyDsl.g:691:5: (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=28 && LA10_0<=30)||LA10_0==32||(LA10_0>=34 && LA10_0<=35)||(LA10_0>=37 && LA10_0<=39)||(LA10_0>=43 && LA10_0<=44)) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==50||LA10_0==53||LA10_0==57||LA10_0==60) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:692:6: lv_actions_2_1= ruleAction
            	            {

            	            						newCompositeNode(grammarAccess.getSubProcedureAccess().getActionsActionParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_2_1=ruleAction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubProcedureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_2_1,
            	            							"org.xtext.example.mydsl.MyDsl.Action");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:708:6: lv_actions_2_2= ruleStructure
            	            {

            	            						newCompositeNode(grammarAccess.getSubProcedureAccess().getActionsStructureParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_2_2=ruleStructure();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubProcedureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_2_2,
            	            							"org.xtext.example.mydsl.MyDsl.Structure");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSubProcedureAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSubProcedure"


    // $ANTLR start "entryRuleRefresh"
    // InternalMyDsl.g:734:1: entryRuleRefresh returns [EObject current=null] : iv_ruleRefresh= ruleRefresh EOF ;
    public final EObject entryRuleRefresh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefresh = null;


        try {
            // InternalMyDsl.g:734:48: (iv_ruleRefresh= ruleRefresh EOF )
            // InternalMyDsl.g:735:2: iv_ruleRefresh= ruleRefresh EOF
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
    // InternalMyDsl.g:741:1: ruleRefresh returns [EObject current=null] : ( () otherlv_1= 'Refresh' ) ;
    public final EObject ruleRefresh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:747:2: ( ( () otherlv_1= 'Refresh' ) )
            // InternalMyDsl.g:748:2: ( () otherlv_1= 'Refresh' )
            {
            // InternalMyDsl.g:748:2: ( () otherlv_1= 'Refresh' )
            // InternalMyDsl.g:749:3: () otherlv_1= 'Refresh'
            {
            // InternalMyDsl.g:749:3: ()
            // InternalMyDsl.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefreshAccess().getRefreshAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:764:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalMyDsl.g:764:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalMyDsl.g:765:2: iv_ruleNavigate= ruleNavigate EOF
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
    // InternalMyDsl.g:771:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:778:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:778:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:779:3: otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalMyDsl.g:783:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:784:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:784:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:785:5: lv_url_1_0= RULE_STRING
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
    // InternalMyDsl.g:805:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:805:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:806:2: iv_ruleStore= ruleStore EOF
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
    // InternalMyDsl.g:812:1: ruleStore returns [EObject current=null] : (otherlv_0= 'var' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;
        Token otherlv_2=null;
        EObject lv_obj_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:818:2: ( (otherlv_0= 'var' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) ) )
            // InternalMyDsl.g:819:2: (otherlv_0= 'var' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:819:2: (otherlv_0= 'var' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) )
            // InternalMyDsl.g:820:3: otherlv_0= 'var' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getVarKeyword_0());
            		
            // InternalMyDsl.g:824:3: ( (lv_objName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:825:4: (lv_objName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:825:4: (lv_objName_1_0= RULE_STRING )
            // InternalMyDsl.g:826:5: lv_objName_1_0= RULE_STRING
            {
            lv_objName_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:846:3: ( (lv_obj_3_0= ruleObject ) )
            // InternalMyDsl.g:847:4: (lv_obj_3_0= ruleObject )
            {
            // InternalMyDsl.g:847:4: (lv_obj_3_0= ruleObject )
            // InternalMyDsl.g:848:5: lv_obj_3_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_obj_3_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_3_0,
            						"org.xtext.example.mydsl.MyDsl.Object");
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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleReDefine"
    // InternalMyDsl.g:869:1: entryRuleReDefine returns [EObject current=null] : iv_ruleReDefine= ruleReDefine EOF ;
    public final EObject entryRuleReDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDefine = null;


        try {
            // InternalMyDsl.g:869:49: (iv_ruleReDefine= ruleReDefine EOF )
            // InternalMyDsl.g:870:2: iv_ruleReDefine= ruleReDefine EOF
            {
             newCompositeNode(grammarAccess.getReDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReDefine=ruleReDefine();

            state._fsp--;

             current =iv_ruleReDefine; 
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
    // $ANTLR end "entryRuleReDefine"


    // $ANTLR start "ruleReDefine"
    // InternalMyDsl.g:876:1: ruleReDefine returns [EObject current=null] : (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) ) ;
    public final EObject ruleReDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;
        Token otherlv_2=null;
        EObject lv_obj_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:882:2: ( (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) ) )
            // InternalMyDsl.g:883:2: (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:883:2: (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) )
            // InternalMyDsl.g:884:3: otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReDefineAccess().getRedefineKeyword_0());
            		
            // InternalMyDsl.g:888:3: ( (lv_objName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:889:4: (lv_objName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:889:4: (lv_objName_1_0= RULE_STRING )
            // InternalMyDsl.g:890:5: lv_objName_1_0= RULE_STRING
            {
            lv_objName_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getReDefineAccess().getObjNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getReDefineAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:910:3: ( (lv_obj_3_0= ruleObject ) )
            // InternalMyDsl.g:911:4: (lv_obj_3_0= ruleObject )
            {
            // InternalMyDsl.g:911:4: (lv_obj_3_0= ruleObject )
            // InternalMyDsl.g:912:5: lv_obj_3_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getReDefineAccess().getObjObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_obj_3_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReDefineRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_3_0,
            						"org.xtext.example.mydsl.MyDsl.Object");
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
    // $ANTLR end "ruleReDefine"


    // $ANTLR start "entryRuleDelete"
    // InternalMyDsl.g:933:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalMyDsl.g:933:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalMyDsl.g:934:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyDsl.g:940:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:946:2: ( (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:947:2: (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:947:2: (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:948:3: otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
            		
            // InternalMyDsl.g:952:3: ( (lv_objName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:953:4: (lv_objName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:953:4: (lv_objName_1_0= RULE_STRING )
            // InternalMyDsl.g:954:5: lv_objName_1_0= RULE_STRING
            {
            lv_objName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getDeleteAccess().getObjNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleActionSelect"
    // InternalMyDsl.g:974:1: entryRuleActionSelect returns [EObject current=null] : iv_ruleActionSelect= ruleActionSelect EOF ;
    public final EObject entryRuleActionSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSelect = null;


        try {
            // InternalMyDsl.g:974:53: (iv_ruleActionSelect= ruleActionSelect EOF )
            // InternalMyDsl.g:975:2: iv_ruleActionSelect= ruleActionSelect EOF
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
    // InternalMyDsl.g:981:1: ruleActionSelect returns [EObject current=null] : (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_0=null;
        Token otherlv_2=null;
        Token lv_xpath_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:988:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:988:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:989:3: otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionSelectAccess().getSelectKeyword_0());
            		
            // InternalMyDsl.g:993:3: ( (lv_option_1_0= RULE_STRING ) )
            // InternalMyDsl.g:994:4: (lv_option_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:994:4: (lv_option_1_0= RULE_STRING )
            // InternalMyDsl.g:995:5: lv_option_1_0= RULE_STRING
            {
            lv_option_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionSelectAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1015:3: ( (lv_xpath_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1016:4: (lv_xpath_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1016:4: (lv_xpath_3_0= RULE_STRING )
            // InternalMyDsl.g:1017:5: lv_xpath_3_0= RULE_STRING
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
    // InternalMyDsl.g:1037:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:1037:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:1038:2: iv_ruleClick= ruleClick EOF
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
    // InternalMyDsl.g:1044:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_object_1_0= ruleObject ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_object_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1050:2: ( (otherlv_0= 'Click' ( (lv_object_1_0= ruleObject ) ) ) )
            // InternalMyDsl.g:1051:2: (otherlv_0= 'Click' ( (lv_object_1_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:1051:2: (otherlv_0= 'Click' ( (lv_object_1_0= ruleObject ) ) )
            // InternalMyDsl.g:1052:3: otherlv_0= 'Click' ( (lv_object_1_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalMyDsl.g:1056:3: ( (lv_object_1_0= ruleObject ) )
            // InternalMyDsl.g:1057:4: (lv_object_1_0= ruleObject )
            {
            // InternalMyDsl.g:1057:4: (lv_object_1_0= ruleObject )
            // InternalMyDsl.g:1058:5: lv_object_1_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getClickAccess().getObjectObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_object_1_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_1_0,
            						"org.xtext.example.mydsl.MyDsl.Object");
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalMyDsl.g:1079:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalMyDsl.g:1079:45: (iv_ruleFill= ruleFill EOF )
            // InternalMyDsl.g:1080:2: iv_ruleFill= ruleFill EOF
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
    // InternalMyDsl.g:1086:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1092:2: ( (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1093:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1093:2: (otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1094:3: otherlv_0= 'Fill' ( (lv_nametag_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_content_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalMyDsl.g:1098:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1099:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1099:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:1100:5: lv_nametag_1_0= RULE_STRING
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
            		
            // InternalMyDsl.g:1120:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1121:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1121:4: (lv_content_3_0= RULE_STRING )
            // InternalMyDsl.g:1122:5: lv_content_3_0= RULE_STRING
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
    // InternalMyDsl.g:1142:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalMyDsl.g:1142:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalMyDsl.g:1143:2: iv_ruleCheckBox= ruleCheckBox EOF
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
    // InternalMyDsl.g:1149:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;
        Token otherlv_2=null;
        Token lv_newValue_3_1=null;
        Token lv_newValue_3_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1155:2: ( (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) )
            // InternalMyDsl.g:1156:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            {
            // InternalMyDsl.g:1156:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            // InternalMyDsl.g:1157:3: otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0());
            		
            // InternalMyDsl.g:1161:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1162:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1162:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:1163:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalMyDsl.g:1179:3: (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1180:4: otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getToKeyword_2_0());
                    			
                    // InternalMyDsl.g:1184:4: ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    // InternalMyDsl.g:1185:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    {
                    // InternalMyDsl.g:1185:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    // InternalMyDsl.g:1186:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    {
                    // InternalMyDsl.g:1186:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==41) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==42) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:1187:7: lv_newValue_3_1= 'true'
                            {
                            lv_newValue_3_1=(Token)match(input,41,FOLLOW_2); 

                            							newLeafNode(lv_newValue_3_1, grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCheckBoxRule());
                            							}
                            							setWithLastConsumed(current, "newValue", lv_newValue_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1198:7: lv_newValue_3_2= 'false'
                            {
                            lv_newValue_3_2=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMyDsl.g:1216:1: entryRuleRickroll returns [EObject current=null] : iv_ruleRickroll= ruleRickroll EOF ;
    public final EObject entryRuleRickroll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRickroll = null;


        try {
            // InternalMyDsl.g:1216:49: (iv_ruleRickroll= ruleRickroll EOF )
            // InternalMyDsl.g:1217:2: iv_ruleRickroll= ruleRickroll EOF
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
    // InternalMyDsl.g:1223:1: ruleRickroll returns [EObject current=null] : ( () otherlv_1= 'RickRoll' ) ;
    public final EObject ruleRickroll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1229:2: ( ( () otherlv_1= 'RickRoll' ) )
            // InternalMyDsl.g:1230:2: ( () otherlv_1= 'RickRoll' )
            {
            // InternalMyDsl.g:1230:2: ( () otherlv_1= 'RickRoll' )
            // InternalMyDsl.g:1231:3: () otherlv_1= 'RickRoll'
            {
            // InternalMyDsl.g:1231:3: ()
            // InternalMyDsl.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRickrollAccess().getRickrollAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyDsl.g:1246:1: entryRuleDoWait returns [EObject current=null] : iv_ruleDoWait= ruleDoWait EOF ;
    public final EObject entryRuleDoWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWait = null;


        try {
            // InternalMyDsl.g:1246:47: (iv_ruleDoWait= ruleDoWait EOF )
            // InternalMyDsl.g:1247:2: iv_ruleDoWait= ruleDoWait EOF
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
    // InternalMyDsl.g:1253:1: ruleDoWait returns [EObject current=null] : (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) ;
    public final EObject ruleDoWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_millisec_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1259:2: ( (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) )
            // InternalMyDsl.g:1260:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            {
            // InternalMyDsl.g:1260:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            // InternalMyDsl.g:1261:3: otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWaitAccess().getWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDoWaitAccess().getForKeyword_1());
            		
            // InternalMyDsl.g:1269:3: ( (lv_millisec_2_0= RULE_INT ) )
            // InternalMyDsl.g:1270:4: (lv_millisec_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1270:4: (lv_millisec_2_0= RULE_INT )
            // InternalMyDsl.g:1271:5: lv_millisec_2_0= RULE_INT
            {
            lv_millisec_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_2); 

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
    // InternalMyDsl.g:1295:1: entryRuleIsIn returns [EObject current=null] : iv_ruleIsIn= ruleIsIn EOF ;
    public final EObject entryRuleIsIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsIn = null;


        try {
            // InternalMyDsl.g:1295:45: (iv_ruleIsIn= ruleIsIn EOF )
            // InternalMyDsl.g:1296:2: iv_ruleIsIn= ruleIsIn EOF
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
    // InternalMyDsl.g:1302:1: ruleIsIn returns [EObject current=null] : ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleIsIn() throws RecognitionException {
        EObject current = null;

        Token lv_body_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1308:2: ( ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1309:2: ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1309:2: ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1310:3: ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1310:3: ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=15 && LA14_0<=21)||LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==47) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1311:4: ( (lv_obj_0_0= ruleObject ) )
                    {
                    // InternalMyDsl.g:1311:4: ( (lv_obj_0_0= ruleObject ) )
                    // InternalMyDsl.g:1312:5: (lv_obj_0_0= ruleObject )
                    {
                    // InternalMyDsl.g:1312:5: (lv_obj_0_0= ruleObject )
                    // InternalMyDsl.g:1313:6: lv_obj_0_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1331:4: ( (lv_body_1_0= 'body' ) )
                    {
                    // InternalMyDsl.g:1331:4: ( (lv_body_1_0= 'body' ) )
                    // InternalMyDsl.g:1332:5: (lv_body_1_0= 'body' )
                    {
                    // InternalMyDsl.g:1332:5: (lv_body_1_0= 'body' )
                    // InternalMyDsl.g:1333:6: lv_body_1_0= 'body'
                    {
                    lv_body_1_0=(Token)match(input,47,FOLLOW_22); 

                    						newLeafNode(lv_body_1_0, grammarAccess.getIsInAccess().getBodyBodyKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsInRule());
                    						}
                    						setWithLastConsumed(current, "body", lv_body_1_0, "body");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIsInAccess().getContainsKeyword_1());
            		
            // InternalMyDsl.g:1350:3: ( (lv_text_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1351:4: (lv_text_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1351:4: (lv_text_3_0= RULE_STRING )
            // InternalMyDsl.g:1352:5: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_3_0, grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_3_0,
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
    // InternalMyDsl.g:1372:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:1372:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:1373:2: iv_ruleNot= ruleNot EOF
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
    // InternalMyDsl.g:1379:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1385:2: ( (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:1386:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:1386:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            // InternalMyDsl.g:1387:3: otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalMyDsl.g:1391:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalMyDsl.g:1392:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalMyDsl.g:1392:4: (lv_cond_1_0= ruleCondition )
            // InternalMyDsl.g:1393:5: lv_cond_1_0= ruleCondition
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
    // InternalMyDsl.g:1414:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:1414:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:1415:2: iv_ruleIf= ruleIf EOF
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
    // InternalMyDsl.g:1421:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) ;
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
            // InternalMyDsl.g:1427:2: ( (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) )
            // InternalMyDsl.g:1428:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            {
            // InternalMyDsl.g:1428:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            // InternalMyDsl.g:1429:3: otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1437:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:1438:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:1438:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:1439:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1468:3: ( (lv_actionThen_6_0= ruleAction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=28 && LA15_0<=30)||LA15_0==32||(LA15_0>=34 && LA15_0<=35)||(LA15_0>=37 && LA15_0<=39)||(LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1469:4: (lv_actionThen_6_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1469:4: (lv_actionThen_6_0= ruleAction )
            	    // InternalMyDsl.g:1470:5: lv_actionThen_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1491:3: (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1492:4: otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMyDsl.g:1504:4: ( (lv_actionElse_11_0= ruleAction ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=28 && LA16_0<=30)||LA16_0==32||(LA16_0>=34 && LA16_0<=35)||(LA16_0>=37 && LA16_0<=39)||(LA16_0>=43 && LA16_0<=44)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:1505:5: (lv_actionElse_11_0= ruleAction )
                    	    {
                    	    // InternalMyDsl.g:1505:5: (lv_actionElse_11_0= ruleAction )
                    	    // InternalMyDsl.g:1506:6: lv_actionElse_11_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:1532:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1532:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1533:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:1539:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1545:2: ( (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:1546:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:1546:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            // InternalMyDsl.g:1547:3: otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getConditionKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1563:3: ( (lv_cond_4_0= ruleCondition ) )
            // InternalMyDsl.g:1564:4: (lv_cond_4_0= ruleCondition )
            {
            // InternalMyDsl.g:1564:4: (lv_cond_4_0= ruleCondition )
            // InternalMyDsl.g:1565:5: lv_cond_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getIntervalKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:1590:3: ( (lv_milliseconds_7_0= RULE_INT ) )
            // InternalMyDsl.g:1591:4: (lv_milliseconds_7_0= RULE_INT )
            {
            // InternalMyDsl.g:1591:4: (lv_milliseconds_7_0= RULE_INT )
            // InternalMyDsl.g:1592:5: lv_milliseconds_7_0= RULE_INT
            {
            lv_milliseconds_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

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

            otherlv_8=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getDoKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:1620:3: ( (lv_actions_11_0= ruleAction ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=28 && LA18_0<=30)||LA18_0==32||(LA18_0>=34 && LA18_0<=35)||(LA18_0>=37 && LA18_0<=39)||(LA18_0>=43 && LA18_0<=44)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1621:4: (lv_actions_11_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1621:4: (lv_actions_11_0= ruleAction )
            	    // InternalMyDsl.g:1622:5: lv_actions_11_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:1647:1: entryRuleDoAll returns [EObject current=null] : iv_ruleDoAll= ruleDoAll EOF ;
    public final EObject entryRuleDoAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoAll = null;


        try {
            // InternalMyDsl.g:1647:46: (iv_ruleDoAll= ruleDoAll EOF )
            // InternalMyDsl.g:1648:2: iv_ruleDoAll= ruleDoAll EOF
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
    // InternalMyDsl.g:1654:1: ruleDoAll returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleDoAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_coll_3_0 = null;

        EObject lv_todo_7_1 = null;

        EObject lv_todo_7_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1660:2: ( (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:1661:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:1661:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' )
            // InternalMyDsl.g:1662:3: otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDoAllAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDoAllAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getDoAllAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1674:3: ( (lv_coll_3_0= ruleCollection ) )
            // InternalMyDsl.g:1675:4: (lv_coll_3_0= ruleCollection )
            {
            // InternalMyDsl.g:1675:4: (lv_coll_3_0= ruleCollection )
            // InternalMyDsl.g:1676:5: lv_coll_3_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_4=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAllAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDoAllAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDoAllAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1705:3: ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=28 && LA20_0<=30)||LA20_0==32||(LA20_0>=34 && LA20_0<=35)||(LA20_0>=37 && LA20_0<=39)||(LA20_0>=43 && LA20_0<=44)||LA20_0==50||LA20_0==53||LA20_0==57||LA20_0==60) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1706:4: ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) )
            	    {
            	    // InternalMyDsl.g:1706:4: ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) )
            	    // InternalMyDsl.g:1707:5: (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure )
            	    {
            	    // InternalMyDsl.g:1707:5: (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=28 && LA19_0<=30)||LA19_0==32||(LA19_0>=34 && LA19_0<=35)||(LA19_0>=37 && LA19_0<=39)||(LA19_0>=43 && LA19_0<=44)) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==50||LA19_0==53||LA19_0==57||LA19_0==60) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalMyDsl.g:1708:6: lv_todo_7_1= ruleAction
            	            {

            	            						newCompositeNode(grammarAccess.getDoAllAccess().getTodoActionParserRuleCall_7_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_todo_7_1=ruleAction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDoAllRule());
            	            						}
            	            						add(
            	            							current,
            	            							"todo",
            	            							lv_todo_7_1,
            	            							"org.xtext.example.mydsl.MyDsl.Action");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1724:6: lv_todo_7_2= ruleStructure
            	            {

            	            						newCompositeNode(grammarAccess.getDoAllAccess().getTodoStructureParserRuleCall_7_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_todo_7_2=ruleStructure();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDoAllRule());
            	            						}
            	            						add(
            	            							current,
            	            							"todo",
            	            							lv_todo_7_2,
            	            							"org.xtext.example.mydsl.MyDsl.Structure");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDoAllAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleExecute"
    // InternalMyDsl.g:1750:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalMyDsl.g:1750:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalMyDsl.g:1751:2: iv_ruleExecute= ruleExecute EOF
            {
             newCompositeNode(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecute=ruleExecute();

            state._fsp--;

             current =iv_ruleExecute; 
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
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalMyDsl.g:1757:1: ruleExecute returns [EObject current=null] : (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_subProcedureName_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1763:2: ( (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1764:2: (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1764:2: (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1765:3: otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExecuteAccess().getExecuteKeyword_0());
            		
            // InternalMyDsl.g:1769:3: ( (lv_subProcedureName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1770:4: (lv_subProcedureName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1770:4: (lv_subProcedureName_1_0= RULE_STRING )
            // InternalMyDsl.g:1771:5: lv_subProcedureName_1_0= RULE_STRING
            {
            lv_subProcedureName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_subProcedureName_1_0, grammarAccess.getExecuteAccess().getSubProcedureNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subProcedureName",
            						lv_subProcedureName_1_0,
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
    // $ANTLR end "ruleExecute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x122418ED70000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000093F8010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000083F8010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x122418ED71000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00028000083F8010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000018ED71000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000000L});

}