/*
 * generated by Xtext 2.10.0
 */
grammar InternalTurtle;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.t3.turtle.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
			}
			lv_commands_0_0=ruleCommand
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"commands",
					lv_commands_0_0,
					"org.xtext.t3.turtle.Turtle.Command");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_0());
		}
		this_Forward_0=ruleForward
		{
			$current = $this_Forward_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_1());
		}
		this_Rotate_1=ruleRotate
		{
			$current = $this_Rotate_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getRepeatParserRuleCall_2());
		}
		this_Repeat_2=ruleRepeat
		{
			$current = $this_Repeat_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleForward
entryRuleForward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForwardRule()); }
	iv_ruleForward=ruleForward
	{ $current=$iv_ruleForward.current; }
	EOF;

// Rule Forward
ruleForward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='fd'
			{
				newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFdKeyword_0_0());
			}
			    |
			otherlv_1='forwad'
			{
				newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getForwadKeyword_0_1());
			}
		)
		(
			(
				lv_value_2_0=RULE_INT
				{
					newLeafNode(lv_value_2_0, grammarAccess.getForwardAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForwardRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleRotate
entryRuleRotate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateRule()); }
	iv_ruleRotate=ruleRotate
	{ $current=$iv_ruleRotate.current; }
	EOF;

// Rule Rotate
ruleRotate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='rt'
			{
				newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRtKeyword_0_0());
			}
			    |
			otherlv_1='rotate'
			{
				newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getRotateKeyword_0_1());
			}
		)
		(
			(
				lv_value_2_0=RULE_INT
				{
					newLeafNode(lv_value_2_0, grammarAccess.getRotateAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleRepeat
entryRuleRepeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRepeatRule()); }
	iv_ruleRepeat=ruleRepeat
	{ $current=$iv_ruleRepeat.current; }
	EOF;

// Rule Repeat
ruleRepeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='repeat'
		{
			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRepeatAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRepeatRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRepeatAccess().getCommandsModelParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRepeatRule());
					}
					add(
						$current,
						"commands",
						lv_commands_3_0,
						"org.xtext.t3.turtle.Turtle.Model");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_4());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
