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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'File'", "'with'", "'browser'", "':'", "'guess'", "'nameTag'", "'class'", "'id'", "'name'", "'CSS Selector'", "'XPath'", "'Collection'", "'{'", "'}'", "'of'", "'all'", "'Subprocedure'", "'Refresh'", "'Navigate'", "'var'", "'='", "'Redefine'", "'as'", "'Delete'", "'Select'", "'from'", "'Click'", "'Write'", "'inside'", "'CheckBox'", "'to'", "'true'", "'false'", "'RickRoll'", "'Wait'", "'for'", "'milliseconds'", "'body'", "'contains'", "'Not'", "'If'", "'Then'", "'Else'", "'Loop'", "'Condition'", "'Interval'", "'Do'", "'For'", "'in'", "'do'", "'Execute'"
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

                if ( ((LA2_0>=27 && LA2_0<=30)||LA2_0==32||(LA2_0>=34 && LA2_0<=35)||(LA2_0>=37 && LA2_0<=38)||LA2_0==40||(LA2_0>=44 && LA2_0<=45)||LA2_0==51||LA2_0==54||LA2_0==58||LA2_0==61) ) {
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

            	    if ( ((LA1_0>=28 && LA1_0<=30)||LA1_0==32||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=37 && LA1_0<=38)||LA1_0==40||(LA1_0>=44 && LA1_0<=45)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==27||LA1_0==51||LA1_0==54||LA1_0==58||LA1_0==61) ) {
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
    // InternalMyDsl.g:179:1: ruleAction returns [EObject current=null] : (this_Navigate_0= ruleNavigate | this_Refresh_1= ruleRefresh | this_ActionSelect_2= ruleActionSelect | this_Rickroll_3= ruleRickroll | this_DoWait_4= ruleDoWait | this_Store_5= ruleStore | this_ReDefine_6= ruleReDefine | this_Delete_7= ruleDelete | this_ActionWithObject_8= ruleActionWithObject | this_CheckBox_9= ruleCheckBox ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Navigate_0 = null;

        EObject this_Refresh_1 = null;

        EObject this_ActionSelect_2 = null;

        EObject this_Rickroll_3 = null;

        EObject this_DoWait_4 = null;

        EObject this_Store_5 = null;

        EObject this_ReDefine_6 = null;

        EObject this_Delete_7 = null;

        EObject this_ActionWithObject_8 = null;

        EObject this_CheckBox_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( (this_Navigate_0= ruleNavigate | this_Refresh_1= ruleRefresh | this_ActionSelect_2= ruleActionSelect | this_Rickroll_3= ruleRickroll | this_DoWait_4= ruleDoWait | this_Store_5= ruleStore | this_ReDefine_6= ruleReDefine | this_Delete_7= ruleDelete | this_ActionWithObject_8= ruleActionWithObject | this_CheckBox_9= ruleCheckBox ) )
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Refresh_1= ruleRefresh | this_ActionSelect_2= ruleActionSelect | this_Rickroll_3= ruleRickroll | this_DoWait_4= ruleDoWait | this_Store_5= ruleStore | this_ReDefine_6= ruleReDefine | this_Delete_7= ruleDelete | this_ActionWithObject_8= ruleActionWithObject | this_CheckBox_9= ruleCheckBox )
            {
            // InternalMyDsl.g:186:2: (this_Navigate_0= ruleNavigate | this_Refresh_1= ruleRefresh | this_ActionSelect_2= ruleActionSelect | this_Rickroll_3= ruleRickroll | this_DoWait_4= ruleDoWait | this_Store_5= ruleStore | this_ReDefine_6= ruleReDefine | this_Delete_7= ruleDelete | this_ActionWithObject_8= ruleActionWithObject | this_CheckBox_9= ruleCheckBox )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 45:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            case 34:
                {
                alt3=8;
                }
                break;
            case 37:
            case 38:
                {
                alt3=9;
                }
                break;
            case 40:
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
                    // InternalMyDsl.g:196:3: this_Refresh_1= ruleRefresh
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRefreshParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Refresh_1=ruleRefresh();

                    state._fsp--;


                    			current = this_Refresh_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:205:3: this_ActionSelect_2= ruleActionSelect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionSelectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSelect_2=ruleActionSelect();

                    state._fsp--;


                    			current = this_ActionSelect_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:214:3: this_Rickroll_3= ruleRickroll
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRickrollParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rickroll_3=ruleRickroll();

                    state._fsp--;


                    			current = this_Rickroll_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:223:3: this_DoWait_4= ruleDoWait
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDoWaitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWait_4=ruleDoWait();

                    state._fsp--;


                    			current = this_DoWait_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:232:3: this_Store_5= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStoreParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_5=ruleStore();

                    state._fsp--;


                    			current = this_Store_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:241:3: this_ReDefine_6= ruleReDefine
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getReDefineParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReDefine_6=ruleReDefine();

                    state._fsp--;


                    			current = this_ReDefine_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:250:3: this_Delete_7= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_7=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:259:3: this_ActionWithObject_8= ruleActionWithObject
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionWithObjectParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionWithObject_8=ruleActionWithObject();

                    state._fsp--;


                    			current = this_ActionWithObject_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:268:3: this_CheckBox_9= ruleCheckBox
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCheckBoxParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckBox_9=ruleCheckBox();

                    state._fsp--;


                    			current = this_CheckBox_9;
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


    // $ANTLR start "entryRuleActionWithObject"
    // InternalMyDsl.g:280:1: entryRuleActionWithObject returns [EObject current=null] : iv_ruleActionWithObject= ruleActionWithObject EOF ;
    public final EObject entryRuleActionWithObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionWithObject = null;


        try {
            // InternalMyDsl.g:280:57: (iv_ruleActionWithObject= ruleActionWithObject EOF )
            // InternalMyDsl.g:281:2: iv_ruleActionWithObject= ruleActionWithObject EOF
            {
             newCompositeNode(grammarAccess.getActionWithObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionWithObject=ruleActionWithObject();

            state._fsp--;

             current =iv_ruleActionWithObject; 
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
    // $ANTLR end "entryRuleActionWithObject"


    // $ANTLR start "ruleActionWithObject"
    // InternalMyDsl.g:287:1: ruleActionWithObject returns [EObject current=null] : ( (this_Click_0= ruleClick | this_Fill_1= ruleFill ) ( (lv_object_2_0= ruleObject ) ) ) ;
    public final EObject ruleActionWithObject() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Fill_1 = null;

        EObject lv_object_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:293:2: ( ( (this_Click_0= ruleClick | this_Fill_1= ruleFill ) ( (lv_object_2_0= ruleObject ) ) ) )
            // InternalMyDsl.g:294:2: ( (this_Click_0= ruleClick | this_Fill_1= ruleFill ) ( (lv_object_2_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:294:2: ( (this_Click_0= ruleClick | this_Fill_1= ruleFill ) ( (lv_object_2_0= ruleObject ) ) )
            // InternalMyDsl.g:295:3: (this_Click_0= ruleClick | this_Fill_1= ruleFill ) ( (lv_object_2_0= ruleObject ) )
            {
            // InternalMyDsl.g:295:3: (this_Click_0= ruleClick | this_Fill_1= ruleFill )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:296:4: this_Click_0= ruleClick
                    {

                    				newCompositeNode(grammarAccess.getActionWithObjectAccess().getClickParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    				current = this_Click_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:305:4: this_Fill_1= ruleFill
                    {

                    				newCompositeNode(grammarAccess.getActionWithObjectAccess().getFillParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Fill_1=ruleFill();

                    state._fsp--;


                    				current = this_Fill_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:314:3: ( (lv_object_2_0= ruleObject ) )
            // InternalMyDsl.g:315:4: (lv_object_2_0= ruleObject )
            {
            // InternalMyDsl.g:315:4: (lv_object_2_0= ruleObject )
            // InternalMyDsl.g:316:5: lv_object_2_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getActionWithObjectAccess().getObjectObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_object_2_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionWithObjectRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_2_0,
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
    // $ANTLR end "ruleActionWithObject"


    // $ANTLR start "entryRuleStructure"
    // InternalMyDsl.g:337:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalMyDsl.g:337:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalMyDsl.g:338:2: iv_ruleStructure= ruleStructure EOF
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
    // InternalMyDsl.g:344:1: ruleStructure returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_DoAll_2 = null;

        EObject this_Execute_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:350:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute ) )
            // InternalMyDsl.g:351:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute )
            {
            // InternalMyDsl.g:351:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_DoAll_2= ruleDoAll | this_Execute_3= ruleExecute )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt5=1;
                }
                break;
            case 54:
                {
                alt5=2;
                }
                break;
            case 58:
                {
                alt5=3;
                }
                break;
            case 27:
            case 61:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:352:3: this_If_0= ruleIf
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
                    // InternalMyDsl.g:361:3: this_Loop_1= ruleLoop
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
                    // InternalMyDsl.g:370:3: this_DoAll_2= ruleDoAll
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
                    // InternalMyDsl.g:379:3: this_Execute_3= ruleExecute
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
    // InternalMyDsl.g:391:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:391:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:392:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:398:1: ruleCondition returns [EObject current=null] : (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IsIn_0 = null;

        EObject this_Not_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:404:2: ( (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot ) )
            // InternalMyDsl.g:405:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            {
            // InternalMyDsl.g:405:2: (this_IsIn_0= ruleIsIn | this_Not_1= ruleNot )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=15 && LA6_0<=21)||LA6_0==27||LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==50) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:406:3: this_IsIn_0= ruleIsIn
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
                    // InternalMyDsl.g:415:3: this_Not_1= ruleNot
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
    // InternalMyDsl.g:427:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:427:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:428:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:434:1: ruleObject returns [EObject current=null] : ( ( (lv_objName_0_0= RULE_ID ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_objName_0_0=null;
        Token lv_objectDef_3_0=null;
        EObject this_SubProcedure_1 = null;

        EObject lv_htmltype_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:440:2: ( ( ( (lv_objName_0_0= RULE_ID ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:441:2: ( ( (lv_objName_0_0= RULE_ID ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) )
            {
            // InternalMyDsl.g:441:2: ( ( (lv_objName_0_0= RULE_ID ) ) | this_SubProcedure_1= ruleSubProcedure | ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
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
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:442:3: ( (lv_objName_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:442:3: ( (lv_objName_0_0= RULE_ID ) )
                    // InternalMyDsl.g:443:4: (lv_objName_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:443:4: (lv_objName_0_0= RULE_ID )
                    // InternalMyDsl.g:444:5: lv_objName_0_0= RULE_ID
                    {
                    lv_objName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_objName_0_0, grammarAccess.getObjectAccess().getObjNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"objName",
                    						lv_objName_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:461:3: this_SubProcedure_1= ruleSubProcedure
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
                    // InternalMyDsl.g:470:3: ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:470:3: ( ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:471:4: ( (lv_htmltype_2_0= ruleHTMLTYPE ) ) ( (lv_objectDef_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:471:4: ( (lv_htmltype_2_0= ruleHTMLTYPE ) )
                    // InternalMyDsl.g:472:5: (lv_htmltype_2_0= ruleHTMLTYPE )
                    {
                    // InternalMyDsl.g:472:5: (lv_htmltype_2_0= ruleHTMLTYPE )
                    // InternalMyDsl.g:473:6: lv_htmltype_2_0= ruleHTMLTYPE
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

                    // InternalMyDsl.g:490:4: ( (lv_objectDef_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:491:5: (lv_objectDef_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:491:5: (lv_objectDef_3_0= RULE_STRING )
                    // InternalMyDsl.g:492:6: lv_objectDef_3_0= RULE_STRING
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
    // InternalMyDsl.g:513:1: entryRuleHTMLTYPE returns [EObject current=null] : iv_ruleHTMLTYPE= ruleHTMLTYPE EOF ;
    public final EObject entryRuleHTMLTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTMLTYPE = null;


        try {
            // InternalMyDsl.g:513:49: (iv_ruleHTMLTYPE= ruleHTMLTYPE EOF )
            // InternalMyDsl.g:514:2: iv_ruleHTMLTYPE= ruleHTMLTYPE EOF
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
    // InternalMyDsl.g:520:1: ruleHTMLTYPE returns [EObject current=null] : ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) ) ;
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
            // InternalMyDsl.g:526:2: ( ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) ) )
            // InternalMyDsl.g:527:2: ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) )
            {
            // InternalMyDsl.g:527:2: ( ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) ) )
            // InternalMyDsl.g:528:3: ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) )
            {
            // InternalMyDsl.g:528:3: ( (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' ) )
            // InternalMyDsl.g:529:4: (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' )
            {
            // InternalMyDsl.g:529:4: (lv_type_0_1= 'guess' | lv_type_0_2= 'nameTag' | lv_type_0_3= 'class' | lv_type_0_4= 'id' | lv_type_0_5= 'name' | lv_type_0_6= 'CSS Selector' | lv_type_0_7= 'XPath' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:530:5: lv_type_0_1= 'guess'
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
                    // InternalMyDsl.g:541:5: lv_type_0_2= 'nameTag'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getHTMLTYPEAccess().getTypeNameTagKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHTMLTYPERule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:552:5: lv_type_0_3= 'class'
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
                    // InternalMyDsl.g:563:5: lv_type_0_4= 'id'
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
                    // InternalMyDsl.g:574:5: lv_type_0_5= 'name'
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
                    // InternalMyDsl.g:585:5: lv_type_0_6= 'CSS Selector'
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
                    // InternalMyDsl.g:596:5: lv_type_0_7= 'XPath'
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
    // InternalMyDsl.g:612:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:612:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:613:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalMyDsl.g:619:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) ) ;
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
            // InternalMyDsl.g:625:2: ( (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) ) )
            // InternalMyDsl.g:626:2: (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) )
            {
            // InternalMyDsl.g:626:2: (otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:627:3: otherlv_0= 'Collection' ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
            		
            // InternalMyDsl.g:631:3: ( (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' ) | (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:632:4: (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' )
                    {
                    // InternalMyDsl.g:632:4: (otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}' )
                    // InternalMyDsl.g:633:5: otherlv_1= '{' ( (lv_obj_2_0= ruleObject ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:637:5: ( (lv_obj_2_0= ruleObject ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||(LA9_0>=15 && LA9_0<=21)||LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:638:6: (lv_obj_2_0= ruleObject )
                    	    {
                    	    // InternalMyDsl.g:638:6: (lv_obj_2_0= ruleObject )
                    	    // InternalMyDsl.g:639:7: lv_obj_2_0= ruleObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionAccess().getObjObjectParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:662:4: (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:662:4: (otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:663:5: otherlv_4= 'of' otherlv_5= 'all' ( (lv_htmltype_6_0= ruleHTMLTYPE ) ) ( (lv_objectRule_7_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionAccess().getOfKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getAllKeyword_1_1_1());
                    				
                    // InternalMyDsl.g:671:5: ( (lv_htmltype_6_0= ruleHTMLTYPE ) )
                    // InternalMyDsl.g:672:6: (lv_htmltype_6_0= ruleHTMLTYPE )
                    {
                    // InternalMyDsl.g:672:6: (lv_htmltype_6_0= ruleHTMLTYPE )
                    // InternalMyDsl.g:673:7: lv_htmltype_6_0= ruleHTMLTYPE
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

                    // InternalMyDsl.g:690:5: ( (lv_objectRule_7_0= RULE_STRING ) )
                    // InternalMyDsl.g:691:6: (lv_objectRule_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:691:6: (lv_objectRule_7_0= RULE_STRING )
                    // InternalMyDsl.g:692:7: lv_objectRule_7_0= RULE_STRING
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
    // InternalMyDsl.g:714:1: entryRuleSubProcedure returns [EObject current=null] : iv_ruleSubProcedure= ruleSubProcedure EOF ;
    public final EObject entryRuleSubProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProcedure = null;


        try {
            // InternalMyDsl.g:714:53: (iv_ruleSubProcedure= ruleSubProcedure EOF )
            // InternalMyDsl.g:715:2: iv_ruleSubProcedure= ruleSubProcedure EOF
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
    // InternalMyDsl.g:721:1: ruleSubProcedure returns [EObject current=null] : (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_1 = null;

        EObject lv_actions_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:727:2: ( (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:728:2: (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:728:2: (otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}' )
            // InternalMyDsl.g:729:3: otherlv_0= 'Subprocedure' otherlv_1= '{' ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSubProcedureAccess().getSubprocedureKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubProcedureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:737:3: ( ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=30)||LA12_0==32||(LA12_0>=34 && LA12_0<=35)||(LA12_0>=37 && LA12_0<=38)||LA12_0==40||(LA12_0>=44 && LA12_0<=45)||LA12_0==51||LA12_0==54||LA12_0==58||LA12_0==61) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:738:4: ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) )
            	    {
            	    // InternalMyDsl.g:738:4: ( (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure ) )
            	    // InternalMyDsl.g:739:5: (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure )
            	    {
            	    // InternalMyDsl.g:739:5: (lv_actions_2_1= ruleAction | lv_actions_2_2= ruleStructure )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( ((LA11_0>=28 && LA11_0<=30)||LA11_0==32||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=37 && LA11_0<=38)||LA11_0==40||(LA11_0>=44 && LA11_0<=45)) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==27||LA11_0==51||LA11_0==54||LA11_0==58||LA11_0==61) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyDsl.g:740:6: lv_actions_2_1= ruleAction
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
            	            // InternalMyDsl.g:756:6: lv_actions_2_2= ruleStructure
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
            	    break loop12;
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
    // InternalMyDsl.g:782:1: entryRuleRefresh returns [EObject current=null] : iv_ruleRefresh= ruleRefresh EOF ;
    public final EObject entryRuleRefresh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefresh = null;


        try {
            // InternalMyDsl.g:782:48: (iv_ruleRefresh= ruleRefresh EOF )
            // InternalMyDsl.g:783:2: iv_ruleRefresh= ruleRefresh EOF
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
    // InternalMyDsl.g:789:1: ruleRefresh returns [EObject current=null] : ( () otherlv_1= 'Refresh' ) ;
    public final EObject ruleRefresh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:795:2: ( ( () otherlv_1= 'Refresh' ) )
            // InternalMyDsl.g:796:2: ( () otherlv_1= 'Refresh' )
            {
            // InternalMyDsl.g:796:2: ( () otherlv_1= 'Refresh' )
            // InternalMyDsl.g:797:3: () otherlv_1= 'Refresh'
            {
            // InternalMyDsl.g:797:3: ()
            // InternalMyDsl.g:798:4: 
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
    // InternalMyDsl.g:812:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalMyDsl.g:812:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalMyDsl.g:813:2: iv_ruleNavigate= ruleNavigate EOF
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
    // InternalMyDsl.g:819:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:825:2: ( (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:826:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:826:2: (otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:827:3: otherlv_0= 'Navigate' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalMyDsl.g:831:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:832:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:832:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:833:5: lv_url_1_0= RULE_STRING
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
    // InternalMyDsl.g:853:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:853:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:854:2: iv_ruleStore= ruleStore EOF
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
    // InternalMyDsl.g:860:1: ruleStore returns [EObject current=null] : (otherlv_0= 'var' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;
        Token otherlv_2=null;
        EObject lv_obj_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:866:2: ( (otherlv_0= 'var' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) ) )
            // InternalMyDsl.g:867:2: (otherlv_0= 'var' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:867:2: (otherlv_0= 'var' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) ) )
            // InternalMyDsl.g:868:3: otherlv_0= 'var' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_obj_3_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getVarKeyword_0());
            		
            // InternalMyDsl.g:872:3: ( (lv_objName_1_0= RULE_ID ) )
            // InternalMyDsl.g:873:4: (lv_objName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:873:4: (lv_objName_1_0= RULE_ID )
            // InternalMyDsl.g:874:5: lv_objName_1_0= RULE_ID
            {
            lv_objName_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getStoreAccess().getObjNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:894:3: ( (lv_obj_3_0= ruleObject ) )
            // InternalMyDsl.g:895:4: (lv_obj_3_0= ruleObject )
            {
            // InternalMyDsl.g:895:4: (lv_obj_3_0= ruleObject )
            // InternalMyDsl.g:896:5: lv_obj_3_0= ruleObject
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
    // InternalMyDsl.g:917:1: entryRuleReDefine returns [EObject current=null] : iv_ruleReDefine= ruleReDefine EOF ;
    public final EObject entryRuleReDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReDefine = null;


        try {
            // InternalMyDsl.g:917:49: (iv_ruleReDefine= ruleReDefine EOF )
            // InternalMyDsl.g:918:2: iv_ruleReDefine= ruleReDefine EOF
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
    // InternalMyDsl.g:924:1: ruleReDefine returns [EObject current=null] : (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) ) ;
    public final EObject ruleReDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;
        Token otherlv_2=null;
        EObject lv_obj_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:930:2: ( (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) ) )
            // InternalMyDsl.g:931:2: (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) )
            {
            // InternalMyDsl.g:931:2: (otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) ) )
            // InternalMyDsl.g:932:3: otherlv_0= 'Redefine' ( (lv_objName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_obj_3_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getReDefineAccess().getRedefineKeyword_0());
            		
            // InternalMyDsl.g:936:3: ( (lv_objName_1_0= RULE_ID ) )
            // InternalMyDsl.g:937:4: (lv_objName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:937:4: (lv_objName_1_0= RULE_ID )
            // InternalMyDsl.g:938:5: lv_objName_1_0= RULE_ID
            {
            lv_objName_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getReDefineAccess().getObjNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getReDefineAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:958:3: ( (lv_obj_3_0= ruleObject ) )
            // InternalMyDsl.g:959:4: (lv_obj_3_0= ruleObject )
            {
            // InternalMyDsl.g:959:4: (lv_obj_3_0= ruleObject )
            // InternalMyDsl.g:960:5: lv_obj_3_0= ruleObject
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
    // InternalMyDsl.g:981:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalMyDsl.g:981:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalMyDsl.g:982:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalMyDsl.g:988:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objName_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:994:2: ( (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:995:2: (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:995:2: (otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:996:3: otherlv_0= 'Delete' ( (lv_objName_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
            		
            // InternalMyDsl.g:1000:3: ( (lv_objName_1_0= RULE_ID ) )
            // InternalMyDsl.g:1001:4: (lv_objName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1001:4: (lv_objName_1_0= RULE_ID )
            // InternalMyDsl.g:1002:5: lv_objName_1_0= RULE_ID
            {
            lv_objName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_objName_1_0, grammarAccess.getDeleteAccess().getObjNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMyDsl.g:1022:1: entryRuleActionSelect returns [EObject current=null] : iv_ruleActionSelect= ruleActionSelect EOF ;
    public final EObject entryRuleActionSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSelect = null;


        try {
            // InternalMyDsl.g:1022:53: (iv_ruleActionSelect= ruleActionSelect EOF )
            // InternalMyDsl.g:1023:2: iv_ruleActionSelect= ruleActionSelect EOF
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
    // InternalMyDsl.g:1029:1: ruleActionSelect returns [EObject current=null] : (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_0=null;
        Token otherlv_2=null;
        Token lv_xpath_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1035:2: ( (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1036:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1036:2: (otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1037:3: otherlv_0= 'Select' ( (lv_option_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_xpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionSelectAccess().getSelectKeyword_0());
            		
            // InternalMyDsl.g:1041:3: ( (lv_option_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1042:4: (lv_option_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1042:4: (lv_option_1_0= RULE_STRING )
            // InternalMyDsl.g:1043:5: lv_option_1_0= RULE_STRING
            {
            lv_option_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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
            		
            // InternalMyDsl.g:1063:3: ( (lv_xpath_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1064:4: (lv_xpath_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1064:4: (lv_xpath_3_0= RULE_STRING )
            // InternalMyDsl.g:1065:5: lv_xpath_3_0= RULE_STRING
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
    // InternalMyDsl.g:1085:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:1085:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:1086:2: iv_ruleClick= ruleClick EOF
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
    // InternalMyDsl.g:1092:1: ruleClick returns [EObject current=null] : ( () otherlv_1= 'Click' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1098:2: ( ( () otherlv_1= 'Click' ) )
            // InternalMyDsl.g:1099:2: ( () otherlv_1= 'Click' )
            {
            // InternalMyDsl.g:1099:2: ( () otherlv_1= 'Click' )
            // InternalMyDsl.g:1100:3: () otherlv_1= 'Click'
            {
            // InternalMyDsl.g:1100:3: ()
            // InternalMyDsl.g:1101:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		

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
    // InternalMyDsl.g:1115:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalMyDsl.g:1115:45: (iv_ruleFill= ruleFill EOF )
            // InternalMyDsl.g:1116:2: iv_ruleFill= ruleFill EOF
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
    // InternalMyDsl.g:1122:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Write' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= 'inside' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1128:2: ( (otherlv_0= 'Write' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= 'inside' ) )
            // InternalMyDsl.g:1129:2: (otherlv_0= 'Write' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= 'inside' )
            {
            // InternalMyDsl.g:1129:2: (otherlv_0= 'Write' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= 'inside' )
            // InternalMyDsl.g:1130:3: otherlv_0= 'Write' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= 'inside'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getWriteKeyword_0());
            		
            // InternalMyDsl.g:1134:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1135:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1135:4: (lv_content_1_0= RULE_STRING )
            // InternalMyDsl.g:1136:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_content_1_0, grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFillAccess().getInsideKeyword_2());
            		

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
    // InternalMyDsl.g:1160:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalMyDsl.g:1160:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalMyDsl.g:1161:2: iv_ruleCheckBox= ruleCheckBox EOF
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
    // InternalMyDsl.g:1167:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nametag_1_0=null;
        Token otherlv_2=null;
        Token lv_newValue_3_1=null;
        Token lv_newValue_3_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1173:2: ( (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? ) )
            // InternalMyDsl.g:1174:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            {
            // InternalMyDsl.g:1174:2: (otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )? )
            // InternalMyDsl.g:1175:3: otherlv_0= 'CheckBox' ( (lv_nametag_1_0= RULE_STRING ) ) (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0());
            		
            // InternalMyDsl.g:1179:3: ( (lv_nametag_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1180:4: (lv_nametag_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1180:4: (lv_nametag_1_0= RULE_STRING )
            // InternalMyDsl.g:1181:5: lv_nametag_1_0= RULE_STRING
            {
            lv_nametag_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalMyDsl.g:1197:3: (otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1198:4: otherlv_2= 'to' ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getToKeyword_2_0());
                    			
                    // InternalMyDsl.g:1202:4: ( ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) ) )
                    // InternalMyDsl.g:1203:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    {
                    // InternalMyDsl.g:1203:5: ( (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' ) )
                    // InternalMyDsl.g:1204:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    {
                    // InternalMyDsl.g:1204:6: (lv_newValue_3_1= 'true' | lv_newValue_3_2= 'false' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==42) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==43) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:1205:7: lv_newValue_3_1= 'true'
                            {
                            lv_newValue_3_1=(Token)match(input,42,FOLLOW_2); 

                            							newLeafNode(lv_newValue_3_1, grammarAccess.getCheckBoxAccess().getNewValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCheckBoxRule());
                            							}
                            							setWithLastConsumed(current, "newValue", lv_newValue_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1216:7: lv_newValue_3_2= 'false'
                            {
                            lv_newValue_3_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyDsl.g:1234:1: entryRuleRickroll returns [EObject current=null] : iv_ruleRickroll= ruleRickroll EOF ;
    public final EObject entryRuleRickroll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRickroll = null;


        try {
            // InternalMyDsl.g:1234:49: (iv_ruleRickroll= ruleRickroll EOF )
            // InternalMyDsl.g:1235:2: iv_ruleRickroll= ruleRickroll EOF
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
    // InternalMyDsl.g:1241:1: ruleRickroll returns [EObject current=null] : ( () otherlv_1= 'RickRoll' ) ;
    public final EObject ruleRickroll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1247:2: ( ( () otherlv_1= 'RickRoll' ) )
            // InternalMyDsl.g:1248:2: ( () otherlv_1= 'RickRoll' )
            {
            // InternalMyDsl.g:1248:2: ( () otherlv_1= 'RickRoll' )
            // InternalMyDsl.g:1249:3: () otherlv_1= 'RickRoll'
            {
            // InternalMyDsl.g:1249:3: ()
            // InternalMyDsl.g:1250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRickrollAccess().getRickrollAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMyDsl.g:1264:1: entryRuleDoWait returns [EObject current=null] : iv_ruleDoWait= ruleDoWait EOF ;
    public final EObject entryRuleDoWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWait = null;


        try {
            // InternalMyDsl.g:1264:47: (iv_ruleDoWait= ruleDoWait EOF )
            // InternalMyDsl.g:1265:2: iv_ruleDoWait= ruleDoWait EOF
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
    // InternalMyDsl.g:1271:1: ruleDoWait returns [EObject current=null] : (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) ;
    public final EObject ruleDoWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_millisec_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1277:2: ( (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' ) )
            // InternalMyDsl.g:1278:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            {
            // InternalMyDsl.g:1278:2: (otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' )
            // InternalMyDsl.g:1279:3: otherlv_0= 'Wait' otherlv_1= 'for' ( (lv_millisec_2_0= RULE_INT ) ) otherlv_3= 'milliseconds'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWaitAccess().getWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDoWaitAccess().getForKeyword_1());
            		
            // InternalMyDsl.g:1287:3: ( (lv_millisec_2_0= RULE_INT ) )
            // InternalMyDsl.g:1288:4: (lv_millisec_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1288:4: (lv_millisec_2_0= RULE_INT )
            // InternalMyDsl.g:1289:5: lv_millisec_2_0= RULE_INT
            {
            lv_millisec_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_3=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMyDsl.g:1313:1: entryRuleIsIn returns [EObject current=null] : iv_ruleIsIn= ruleIsIn EOF ;
    public final EObject entryRuleIsIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsIn = null;


        try {
            // InternalMyDsl.g:1313:45: (iv_ruleIsIn= ruleIsIn EOF )
            // InternalMyDsl.g:1314:2: iv_ruleIsIn= ruleIsIn EOF
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
    // InternalMyDsl.g:1320:1: ruleIsIn returns [EObject current=null] : ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleIsIn() throws RecognitionException {
        EObject current = null;

        Token lv_body_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1326:2: ( ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1327:2: ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1327:2: ( ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1328:3: ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) ) otherlv_2= 'contains' ( (lv_text_3_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1328:3: ( ( (lv_obj_0_0= ruleObject ) ) | ( (lv_body_1_0= 'body' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=15 && LA15_0<=21)||LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==48) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1329:4: ( (lv_obj_0_0= ruleObject ) )
                    {
                    // InternalMyDsl.g:1329:4: ( (lv_obj_0_0= ruleObject ) )
                    // InternalMyDsl.g:1330:5: (lv_obj_0_0= ruleObject )
                    {
                    // InternalMyDsl.g:1330:5: (lv_obj_0_0= ruleObject )
                    // InternalMyDsl.g:1331:6: lv_obj_0_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalMyDsl.g:1349:4: ( (lv_body_1_0= 'body' ) )
                    {
                    // InternalMyDsl.g:1349:4: ( (lv_body_1_0= 'body' ) )
                    // InternalMyDsl.g:1350:5: (lv_body_1_0= 'body' )
                    {
                    // InternalMyDsl.g:1350:5: (lv_body_1_0= 'body' )
                    // InternalMyDsl.g:1351:6: lv_body_1_0= 'body'
                    {
                    lv_body_1_0=(Token)match(input,48,FOLLOW_24); 

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

            otherlv_2=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIsInAccess().getContainsKeyword_1());
            		
            // InternalMyDsl.g:1368:3: ( (lv_text_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1369:4: (lv_text_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1369:4: (lv_text_3_0= RULE_STRING )
            // InternalMyDsl.g:1370:5: lv_text_3_0= RULE_STRING
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
    // InternalMyDsl.g:1390:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:1390:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:1391:2: iv_ruleNot= ruleNot EOF
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
    // InternalMyDsl.g:1397:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1403:2: ( (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:1404:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:1404:2: (otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) ) )
            // InternalMyDsl.g:1405:3: otherlv_0= 'Not' ( (lv_cond_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalMyDsl.g:1409:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalMyDsl.g:1410:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalMyDsl.g:1410:4: (lv_cond_1_0= ruleCondition )
            // InternalMyDsl.g:1411:5: lv_cond_1_0= ruleCondition
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
    // InternalMyDsl.g:1432:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:1432:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:1433:2: iv_ruleIf= ruleIf EOF
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
    // InternalMyDsl.g:1439:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) ;
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
            // InternalMyDsl.g:1445:2: ( (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? ) )
            // InternalMyDsl.g:1446:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            {
            // InternalMyDsl.g:1446:2: (otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )? )
            // InternalMyDsl.g:1447:3: otherlv_0= 'If' otherlv_1= ':' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= 'Then' otherlv_4= ':' otherlv_5= '{' ( (lv_actionThen_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1455:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:1456:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:1456:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:1457:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1486:3: ( (lv_actionThen_6_0= ruleAction ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=28 && LA16_0<=30)||LA16_0==32||(LA16_0>=34 && LA16_0<=35)||(LA16_0>=37 && LA16_0<=38)||LA16_0==40||(LA16_0>=44 && LA16_0<=45)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1487:4: (lv_actionThen_6_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1487:4: (lv_actionThen_6_0= ruleAction )
            	    // InternalMyDsl.g:1488:5: lv_actionThen_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getActionThenActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1509:3: (otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1510:4: otherlv_8= 'Else' otherlv_9= ':' otherlv_10= '{' ( (lv_actionElse_11_0= ruleAction ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMyDsl.g:1522:4: ( (lv_actionElse_11_0= ruleAction ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=28 && LA17_0<=30)||LA17_0==32||(LA17_0>=34 && LA17_0<=35)||(LA17_0>=37 && LA17_0<=38)||LA17_0==40||(LA17_0>=44 && LA17_0<=45)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:1523:5: (lv_actionElse_11_0= ruleAction )
                    	    {
                    	    // InternalMyDsl.g:1523:5: (lv_actionElse_11_0= ruleAction )
                    	    // InternalMyDsl.g:1524:6: lv_actionElse_11_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getActionElseActionParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop17;
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
    // InternalMyDsl.g:1550:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1550:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1551:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:1557:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1563:2: ( (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:1564:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:1564:2: (otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}' )
            // InternalMyDsl.g:1565:3: otherlv_0= 'Loop' otherlv_1= ':' otherlv_2= 'Condition' otherlv_3= ':' ( (lv_cond_4_0= ruleCondition ) ) otherlv_5= 'Interval' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_INT ) ) otherlv_8= 'Do' otherlv_9= ':' otherlv_10= '{' ( (lv_actions_11_0= ruleAction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getConditionKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1581:3: ( (lv_cond_4_0= ruleCondition ) )
            // InternalMyDsl.g:1582:4: (lv_cond_4_0= ruleCondition )
            {
            // InternalMyDsl.g:1582:4: (lv_cond_4_0= ruleCondition )
            // InternalMyDsl.g:1583:5: lv_cond_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCondConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_5=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getIntervalKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:1608:3: ( (lv_milliseconds_7_0= RULE_INT ) )
            // InternalMyDsl.g:1609:4: (lv_milliseconds_7_0= RULE_INT )
            {
            // InternalMyDsl.g:1609:4: (lv_milliseconds_7_0= RULE_INT )
            // InternalMyDsl.g:1610:5: lv_milliseconds_7_0= RULE_INT
            {
            lv_milliseconds_7_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            otherlv_8=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getDoKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:1638:3: ( (lv_actions_11_0= ruleAction ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=28 && LA19_0<=30)||LA19_0==32||(LA19_0>=34 && LA19_0<=35)||(LA19_0>=37 && LA19_0<=38)||LA19_0==40||(LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1639:4: (lv_actions_11_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:1639:4: (lv_actions_11_0= ruleAction )
            	    // InternalMyDsl.g:1640:5: lv_actions_11_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop19;
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
    // InternalMyDsl.g:1665:1: entryRuleDoAll returns [EObject current=null] : iv_ruleDoAll= ruleDoAll EOF ;
    public final EObject entryRuleDoAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoAll = null;


        try {
            // InternalMyDsl.g:1665:46: (iv_ruleDoAll= ruleDoAll EOF )
            // InternalMyDsl.g:1666:2: iv_ruleDoAll= ruleDoAll EOF
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
    // InternalMyDsl.g:1672:1: ruleDoAll returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:1678:2: ( (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:1679:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:1679:2: (otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}' )
            // InternalMyDsl.g:1680:3: otherlv_0= 'For' otherlv_1= 'all' otherlv_2= 'in' ( (lv_coll_3_0= ruleCollection ) ) otherlv_4= 'do' otherlv_5= ':' otherlv_6= '{' ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDoAllAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDoAllAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDoAllAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1692:3: ( (lv_coll_3_0= ruleCollection ) )
            // InternalMyDsl.g:1693:4: (lv_coll_3_0= ruleCollection )
            {
            // InternalMyDsl.g:1693:4: (lv_coll_3_0= ruleCollection )
            // InternalMyDsl.g:1694:5: lv_coll_3_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDoAllAccess().getCollCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAllAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDoAllAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDoAllAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1723:3: ( ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=27 && LA21_0<=30)||LA21_0==32||(LA21_0>=34 && LA21_0<=35)||(LA21_0>=37 && LA21_0<=38)||LA21_0==40||(LA21_0>=44 && LA21_0<=45)||LA21_0==51||LA21_0==54||LA21_0==58||LA21_0==61) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1724:4: ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) )
            	    {
            	    // InternalMyDsl.g:1724:4: ( (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure ) )
            	    // InternalMyDsl.g:1725:5: (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure )
            	    {
            	    // InternalMyDsl.g:1725:5: (lv_todo_7_1= ruleAction | lv_todo_7_2= ruleStructure )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=28 && LA20_0<=30)||LA20_0==32||(LA20_0>=34 && LA20_0<=35)||(LA20_0>=37 && LA20_0<=38)||LA20_0==40||(LA20_0>=44 && LA20_0<=45)) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==27||LA20_0==51||LA20_0==54||LA20_0==58||LA20_0==61) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1726:6: lv_todo_7_1= ruleAction
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
            	            // InternalMyDsl.g:1742:6: lv_todo_7_2= ruleStructure
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
            	    break loop21;
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
    // InternalMyDsl.g:1768:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalMyDsl.g:1768:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalMyDsl.g:1769:2: iv_ruleExecute= ruleExecute EOF
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
    // InternalMyDsl.g:1775:1: ruleExecute returns [EObject current=null] : ( (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) ) | ( (lv_subprocedure_2_0= ruleSubProcedure ) ) ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_subProcedureName_1_0=null;
        EObject lv_subprocedure_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1781:2: ( ( (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) ) | ( (lv_subprocedure_2_0= ruleSubProcedure ) ) ) )
            // InternalMyDsl.g:1782:2: ( (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) ) | ( (lv_subprocedure_2_0= ruleSubProcedure ) ) )
            {
            // InternalMyDsl.g:1782:2: ( (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) ) | ( (lv_subprocedure_2_0= ruleSubProcedure ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            else if ( (LA22_0==27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1783:3: (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:1783:3: (otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) ) )
                    // InternalMyDsl.g:1784:4: otherlv_0= 'Execute' ( (lv_subProcedureName_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getExecuteAccess().getExecuteKeyword_0_0());
                    			
                    // InternalMyDsl.g:1788:4: ( (lv_subProcedureName_1_0= RULE_ID ) )
                    // InternalMyDsl.g:1789:5: (lv_subProcedureName_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1789:5: (lv_subProcedureName_1_0= RULE_ID )
                    // InternalMyDsl.g:1790:6: lv_subProcedureName_1_0= RULE_ID
                    {
                    lv_subProcedureName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_subProcedureName_1_0, grammarAccess.getExecuteAccess().getSubProcedureNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExecuteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"subProcedureName",
                    							lv_subProcedureName_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1808:3: ( (lv_subprocedure_2_0= ruleSubProcedure ) )
                    {
                    // InternalMyDsl.g:1808:3: ( (lv_subprocedure_2_0= ruleSubProcedure ) )
                    // InternalMyDsl.g:1809:4: (lv_subprocedure_2_0= ruleSubProcedure )
                    {
                    // InternalMyDsl.g:1809:4: (lv_subprocedure_2_0= ruleSubProcedure )
                    // InternalMyDsl.g:1810:5: lv_subprocedure_2_0= ruleSubProcedure
                    {

                    					newCompositeNode(grammarAccess.getExecuteAccess().getSubprocedureSubProcedureParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subprocedure_2_0=ruleSubProcedure();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExecuteRule());
                    					}
                    					set(
                    						current,
                    						"subprocedure",
                    						lv_subprocedure_2_0,
                    						"org.xtext.example.mydsl.MyDsl.SubProcedure");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleExecute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2448316D78000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2448316D783F8020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2448316D793F8020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2448316D79000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x244D316D783F8020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000316D71000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});

}