package org.xtext.t3.turtle.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.t3.turtle.services.TurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fd'", "'forwad'", "'rt'", "'rotate'", "'repeat'", "'['", "']'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTurtleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTurtleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTurtleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTurtle.g"; }



     	private TurtleGrammarAccess grammarAccess;

        public InternalTurtleParser(TokenStream input, TurtleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TurtleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTurtle.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTurtle.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTurtle.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTurtle.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalTurtle.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalTurtle.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtle.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalTurtle.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalTurtle.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.t3.turtle.Turtle.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalTurtle.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTurtle.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTurtle.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalTurtle.g:107:1: ruleCommand returns [EObject current=null] : (this_Forward_0= ruleForward | this_Rotate_1= ruleRotate | this_Repeat_2= ruleRepeat ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Forward_0 = null;

        EObject this_Rotate_1 = null;

        EObject this_Repeat_2 = null;



        	enterRule();

        try {
            // InternalTurtle.g:113:2: ( (this_Forward_0= ruleForward | this_Rotate_1= ruleRotate | this_Repeat_2= ruleRepeat ) )
            // InternalTurtle.g:114:2: (this_Forward_0= ruleForward | this_Rotate_1= ruleRotate | this_Repeat_2= ruleRepeat )
            {
            // InternalTurtle.g:114:2: (this_Forward_0= ruleForward | this_Rotate_1= ruleRotate | this_Repeat_2= ruleRepeat )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTurtle.g:115:3: this_Forward_0= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_0=ruleForward();

                    state._fsp--;


                    			current = this_Forward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:124:3: this_Rotate_1= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_1=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTurtle.g:133:3: this_Repeat_2= ruleRepeat
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRepeatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeat_2=ruleRepeat();

                    state._fsp--;


                    			current = this_Repeat_2;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleForward"
    // InternalTurtle.g:145:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalTurtle.g:145:48: (iv_ruleForward= ruleForward EOF )
            // InternalTurtle.g:146:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalTurtle.g:152:1: ruleForward returns [EObject current=null] : ( (otherlv_0= 'fd' | otherlv_1= 'forwad' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:158:2: ( ( (otherlv_0= 'fd' | otherlv_1= 'forwad' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalTurtle.g:159:2: ( (otherlv_0= 'fd' | otherlv_1= 'forwad' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalTurtle.g:159:2: ( (otherlv_0= 'fd' | otherlv_1= 'forwad' ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalTurtle.g:160:3: (otherlv_0= 'fd' | otherlv_1= 'forwad' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalTurtle.g:160:3: (otherlv_0= 'fd' | otherlv_1= 'forwad' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:161:4: otherlv_0= 'fd'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:166:4: otherlv_1= 'forwad'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getForwadKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTurtle.g:171:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalTurtle.g:172:4: (lv_value_2_0= RULE_INT )
            {
            // InternalTurtle.g:172:4: (lv_value_2_0= RULE_INT )
            // InternalTurtle.g:173:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getForwardAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleRotate"
    // InternalTurtle.g:193:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalTurtle.g:193:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalTurtle.g:194:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalTurtle.g:200:1: ruleRotate returns [EObject current=null] : ( (otherlv_0= 'rt' | otherlv_1= 'rotate' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:206:2: ( ( (otherlv_0= 'rt' | otherlv_1= 'rotate' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalTurtle.g:207:2: ( (otherlv_0= 'rt' | otherlv_1= 'rotate' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalTurtle.g:207:2: ( (otherlv_0= 'rt' | otherlv_1= 'rotate' ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalTurtle.g:208:3: (otherlv_0= 'rt' | otherlv_1= 'rotate' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalTurtle.g:208:3: (otherlv_0= 'rt' | otherlv_1= 'rotate' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:209:4: otherlv_0= 'rt'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRtKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:214:4: otherlv_1= 'rotate'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getRotateKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTurtle.g:219:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalTurtle.g:220:4: (lv_value_2_0= RULE_INT )
            {
            // InternalTurtle.g:220:4: (lv_value_2_0= RULE_INT )
            // InternalTurtle.g:221:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getRotateAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleRepeat"
    // InternalTurtle.g:241:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalTurtle.g:241:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalTurtle.g:242:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalTurtle.g:248:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '[' ( (lv_commands_3_0= ruleModel ) ) otherlv_4= ']' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:254:2: ( (otherlv_0= 'repeat' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '[' ( (lv_commands_3_0= ruleModel ) ) otherlv_4= ']' ) )
            // InternalTurtle.g:255:2: (otherlv_0= 'repeat' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '[' ( (lv_commands_3_0= ruleModel ) ) otherlv_4= ']' )
            {
            // InternalTurtle.g:255:2: (otherlv_0= 'repeat' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '[' ( (lv_commands_3_0= ruleModel ) ) otherlv_4= ']' )
            // InternalTurtle.g:256:3: otherlv_0= 'repeat' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '[' ( (lv_commands_3_0= ruleModel ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
            		
            // InternalTurtle.g:260:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalTurtle.g:261:4: (lv_value_1_0= RULE_INT )
            {
            // InternalTurtle.g:261:4: (lv_value_1_0= RULE_INT )
            // InternalTurtle.g:262:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRepeatAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalTurtle.g:282:3: ( (lv_commands_3_0= ruleModel ) )
            // InternalTurtle.g:283:4: (lv_commands_3_0= ruleModel )
            {
            // InternalTurtle.g:283:4: (lv_commands_3_0= ruleModel )
            // InternalTurtle.g:284:5: lv_commands_3_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getCommandsModelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_commands_3_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.t3.turtle.Turtle.Model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRepeat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});

}