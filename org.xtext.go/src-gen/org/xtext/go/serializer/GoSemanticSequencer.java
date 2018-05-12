/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.go.go.AndExpression;
import org.xtext.go.go.ComparisonExpression;
import org.xtext.go.go.Condition;
import org.xtext.go.go.DataType;
import org.xtext.go.go.DecFunc;
import org.xtext.go.go.ElseCondition;
import org.xtext.go.go.Go;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.IfCondition;
import org.xtext.go.go.Literal;
import org.xtext.go.go.OrExpression;
import org.xtext.go.services.GoGrammarAccess;

@SuppressWarnings("all")
public class GoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GoPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case GoPackage.COMPARISON_EXPRESSION:
				sequence_ComparisonExpression(context, (ComparisonExpression) semanticObject); 
				return; 
			case GoPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GoPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case GoPackage.DEC_FUNC:
				sequence_DecFunc(context, (DecFunc) semanticObject); 
				return; 
			case GoPackage.ELSE_CONDITION:
				sequence_ElseCondition(context, (ElseCondition) semanticObject); 
				return; 
			case GoPackage.GO:
				sequence_Go(context, (Go) semanticObject); 
				return; 
			case GoPackage.IF_CONDITION:
				sequence_IfCondition(context, (IfCondition) semanticObject); 
				return; 
			case GoPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case GoPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns AndExpression
	 *     OrExpression returns AndExpression
	 *     OrExpression.OrExpression_1_0 returns AndExpression
	 *     AndExpression returns AndExpression
	 *     AndExpression.AndExpression_1_0 returns AndExpression
	 *     ComparisonExpression returns AndExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns AndExpression
	 *     PrimaryExpression returns AndExpression
	 *
	 * Constraint:
	 *     (left=AndExpression_AndExpression_1_0 right=ComparisonExpression)
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.AND_EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.AND_EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ComparisonExpression
	 *     OrExpression returns ComparisonExpression
	 *     OrExpression.OrExpression_1_0 returns ComparisonExpression
	 *     AndExpression returns ComparisonExpression
	 *     AndExpression.AndExpression_1_0 returns ComparisonExpression
	 *     ComparisonExpression returns ComparisonExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns ComparisonExpression
	 *     PrimaryExpression returns ComparisonExpression
	 *
	 * Constraint:
	 *     (
	 *         left=ComparisonExpression_ComparisonExpression_1_0 
	 *         (operator='<' | operator='<=' | operator='==' | operator='>=' | operator='>') 
	 *         right=PrimaryExpression
	 *     )
	 */
	protected void sequence_ComparisonExpression(ISerializationContext context, ComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Greeting returns Condition
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (if=IfCondition elseif=ElseIfCondition* else=ElseCondition?)
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Greeting returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.DATA_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.DATA_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Greeting returns DecFunc
	 *     DecFunc returns DecFunc
	 *
	 * Constraint:
	 *     (name=ID parameter=ID? parameter=ID* args+=Greeting*)
	 */
	protected void sequence_DecFunc(ISerializationContext context, DecFunc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElseCondition returns ElseCondition
	 *
	 * Constraint:
	 *     then=Greeting+
	 */
	protected void sequence_ElseCondition(ISerializationContext context, ElseCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Go returns Go
	 *
	 * Constraint:
	 *     elements+=Greeting+
	 */
	protected void sequence_Go(ISerializationContext context, Go semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IfCondition returns IfCondition
	 *     ElseIfCondition returns IfCondition
	 *
	 * Constraint:
	 *     (cond=Expression then=Greeting*)
	 */
	protected void sequence_IfCondition(ISerializationContext context, IfCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Literal
	 *     OrExpression returns Literal
	 *     OrExpression.OrExpression_1_0 returns Literal
	 *     AndExpression returns Literal
	 *     AndExpression.AndExpression_1_0 returns Literal
	 *     ComparisonExpression returns Literal
	 *     ComparisonExpression.ComparisonExpression_1_0 returns Literal
	 *     PrimaryExpression returns Literal
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     value='true'
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns OrExpression
	 *     OrExpression returns OrExpression
	 *     OrExpression.OrExpression_1_0 returns OrExpression
	 *     AndExpression returns OrExpression
	 *     AndExpression.AndExpression_1_0 returns OrExpression
	 *     ComparisonExpression returns OrExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns OrExpression
	 *     PrimaryExpression returns OrExpression
	 *
	 * Constraint:
	 *     (left=OrExpression_OrExpression_1_0 right=AndExpression)
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.OR_EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, GoPackage.Literals.OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoPackage.Literals.OR_EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}
