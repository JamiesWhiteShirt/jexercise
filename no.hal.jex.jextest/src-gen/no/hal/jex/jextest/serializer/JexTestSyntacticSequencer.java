package no.hal.jex.jextest.serializer;

import com.google.inject.Inject;
import java.util.List;
import no.hal.jex.jextest.services.JexTestGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JexTestSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JexTestGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JexTestCase_InstanceKeyword_7_0_0_0_or_ValKeyword_7_0_0_1;
	protected AbstractElementAlias match_JexTestSequence_InstanceKeyword_5_0_0_or_ValKeyword_5_0_1;
	protected AbstractElementAlias match_JexTestSequence_TestsKeyword_3_0_q;
	protected AbstractElementAlias match_JexTestSuite_InstanceKeyword_3_0_0_0_or_ValKeyword_3_0_0_1;
	protected AbstractElementAlias match_JvmOperationRef___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_PropertiesTest_SemicolonKeyword_1_1_1_q;
	protected AbstractElementAlias match_TestedClass_ClassKeyword_0_1_1_q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JexTestGrammarAccess) access;
		match_JexTestCase_InstanceKeyword_7_0_0_0_or_ValKeyword_7_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJexTestCaseAccess().getInstanceKeyword_7_0_0_0()), new TokenAlias(false, false, grammarAccess.getJexTestCaseAccess().getValKeyword_7_0_0_1()));
		match_JexTestSequence_InstanceKeyword_5_0_0_or_ValKeyword_5_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJexTestSequenceAccess().getInstanceKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getJexTestSequenceAccess().getValKeyword_5_0_1()));
		match_JexTestSequence_TestsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getJexTestSequenceAccess().getTestsKeyword_3_0());
		match_JexTestSuite_InstanceKeyword_3_0_0_0_or_ValKeyword_3_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJexTestSuiteAccess().getInstanceKeyword_3_0_0_0()), new TokenAlias(false, false, grammarAccess.getJexTestSuiteAccess().getValKeyword_3_0_0_1()));
		match_JvmOperationRef___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getJvmOperationRefAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getJvmOperationRefAccess().getRightParenthesisKeyword_1_2()));
		match_PropertiesTest_SemicolonKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getPropertiesTestAccess().getSemicolonKeyword_1_1_1());
		match_TestedClass_ClassKeyword_0_1_1_q = new TokenAlias(false, true, grammarAccess.getTestedClassAccess().getClassKeyword_0_1_1());
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_JexTestCase_InstanceKeyword_7_0_0_0_or_ValKeyword_7_0_0_1.equals(syntax))
				emit_JexTestCase_InstanceKeyword_7_0_0_0_or_ValKeyword_7_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JexTestSequence_InstanceKeyword_5_0_0_or_ValKeyword_5_0_1.equals(syntax))
				emit_JexTestSequence_InstanceKeyword_5_0_0_or_ValKeyword_5_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JexTestSequence_TestsKeyword_3_0_q.equals(syntax))
				emit_JexTestSequence_TestsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JexTestSuite_InstanceKeyword_3_0_0_0_or_ValKeyword_3_0_0_1.equals(syntax))
				emit_JexTestSuite_InstanceKeyword_3_0_0_0_or_ValKeyword_3_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JvmOperationRef___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_JvmOperationRef___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertiesTest_SemicolonKeyword_1_1_1_q.equals(syntax))
				emit_PropertiesTest_SemicolonKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TestedClass_ClassKeyword_0_1_1_q.equals(syntax))
				emit_TestedClass_ClassKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'instance' | 'val'
	 */
	protected void emit_JexTestCase_InstanceKeyword_7_0_0_0_or_ValKeyword_7_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'instance' | 'val'
	 */
	protected void emit_JexTestSequence_InstanceKeyword_5_0_0_or_ValKeyword_5_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tests'?
	 */
	protected void emit_JexTestSequence_TestsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'instance' | 'val'
	 */
	protected void emit_JexTestSuite_InstanceKeyword_3_0_0_0_or_ValKeyword_3_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_JvmOperationRef___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_PropertiesTest_SemicolonKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'class'?
	 */
	protected void emit_TestedClass_ClassKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
