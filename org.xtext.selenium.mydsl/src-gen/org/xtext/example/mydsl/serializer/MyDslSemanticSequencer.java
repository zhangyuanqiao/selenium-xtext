/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.myDsl.ActionSelect;
import org.xtext.example.mydsl.myDsl.CheckBox;
import org.xtext.example.mydsl.myDsl.Click;
import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.Delete;
import org.xtext.example.mydsl.myDsl.DoAll;
import org.xtext.example.mydsl.myDsl.DoWait;
import org.xtext.example.mydsl.myDsl.Execute;
import org.xtext.example.mydsl.myDsl.Fill;
import org.xtext.example.mydsl.myDsl.HTMLTYPE;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.IsIn;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.Main;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Navigate;
import org.xtext.example.mydsl.myDsl.Not;
import org.xtext.example.mydsl.myDsl.ReDefine;
import org.xtext.example.mydsl.myDsl.Refresh;
import org.xtext.example.mydsl.myDsl.Rickroll;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.SubProcedure;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ACTION_SELECT:
				sequence_ActionSelect(context, (ActionSelect) semanticObject); 
				return; 
			case MyDslPackage.CHECK_BOX:
				sequence_CheckBox(context, (CheckBox) semanticObject); 
				return; 
			case MyDslPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case MyDslPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case MyDslPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case MyDslPackage.DO_ALL:
				sequence_DoAll(context, (DoAll) semanticObject); 
				return; 
			case MyDslPackage.DO_WAIT:
				sequence_DoWait(context, (DoWait) semanticObject); 
				return; 
			case MyDslPackage.EXECUTE:
				sequence_Execute(context, (Execute) semanticObject); 
				return; 
			case MyDslPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case MyDslPackage.HTMLTYPE:
				sequence_HTMLTYPE(context, (HTMLTYPE) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.IS_IN:
				sequence_IsIn(context, (IsIn) semanticObject); 
				return; 
			case MyDslPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case MyDslPackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case MyDslPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case MyDslPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case MyDslPackage.OBJECT:
				sequence_Object(context, (org.xtext.example.mydsl.myDsl.Object) semanticObject); 
				return; 
			case MyDslPackage.RE_DEFINE:
				sequence_ReDefine(context, (ReDefine) semanticObject); 
				return; 
			case MyDslPackage.REFRESH:
				sequence_Refresh(context, (Refresh) semanticObject); 
				return; 
			case MyDslPackage.RICKROLL:
				sequence_Rickroll(context, (Rickroll) semanticObject); 
				return; 
			case MyDslPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case MyDslPackage.SUB_PROCEDURE:
				sequence_SubProcedure(context, (SubProcedure) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns ActionSelect
	 *     ActionSelect returns ActionSelect
	 *
	 * Constraint:
	 *     (option=STRING xpath=STRING)
	 */
	protected void sequence_ActionSelect(ISerializationContext context, ActionSelect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION_SELECT__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION_SELECT__OPTION));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION_SELECT__XPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION_SELECT__XPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionSelectAccess().getOptionSTRINGTerminalRuleCall_1_0(), semanticObject.getOption());
		feeder.accept(grammarAccess.getActionSelectAccess().getXpathSTRINGTerminalRuleCall_3_0(), semanticObject.getXpath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns CheckBox
	 *     CheckBox returns CheckBox
	 *
	 * Constraint:
	 *     (nametag=STRING (newValue='true' | newValue='false')?)
	 */
	protected void sequence_CheckBox(ISerializationContext context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLICK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLICK__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Collection returns Collection
	 *
	 * Constraint:
	 *     obj+=Object
	 */
	protected void sequence_Collection(ISerializationContext context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Delete returns Delete
	 *
	 * Constraint:
	 *     objName=STRING
	 */
	protected void sequence_Delete(ISerializationContext context, Delete semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DELETE__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DELETE__OBJ_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteAccess().getObjNameSTRINGTerminalRuleCall_1_0(), semanticObject.getObjName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns DoAll
	 *     DoAll returns DoAll
	 *
	 * Constraint:
	 *     (coll=Collection (todo+=Action | todo+=Structure)*)
	 */
	protected void sequence_DoAll(ISerializationContext context, DoAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns DoWait
	 *     DoWait returns DoWait
	 *
	 * Constraint:
	 *     millisec=INT
	 */
	protected void sequence_DoWait(ISerializationContext context, DoWait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DO_WAIT__MILLISEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DO_WAIT__MILLISEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoWaitAccess().getMillisecINTTerminalRuleCall_2_0(), semanticObject.getMillisec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns Execute
	 *     Execute returns Execute
	 *
	 * Constraint:
	 *     subProcedureName=STRING
	 */
	protected void sequence_Execute(ISerializationContext context, Execute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXECUTE__SUB_PROCEDURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXECUTE__SUB_PROCEDURE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExecuteAccess().getSubProcedureNameSTRINGTerminalRuleCall_1_0(), semanticObject.getSubProcedureName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (nametag=STRING content=STRING)
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FILL__NAMETAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FILL__NAMETAG));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FILL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FILL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillAccess().getNametagSTRINGTerminalRuleCall_1_0(), semanticObject.getNametag());
		feeder.accept(grammarAccess.getFillAccess().getContentSTRINGTerminalRuleCall_3_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HTMLTYPE returns HTMLTYPE
	 *
	 * Constraint:
	 *     (
	 *         type='title' | 
	 *         type='class' | 
	 *         type='id' | 
	 *         type='name' | 
	 *         type='CSS Selector' | 
	 *         type='XPath'
	 *     )
	 */
	protected void sequence_HTMLTYPE(ISerializationContext context, HTMLTYPE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (cond=Condition actionThen+=Action* actionElse+=Action*)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns IsIn
	 *     IsIn returns IsIn
	 *
	 * Constraint:
	 *     (obj=Object text=STRING)
	 */
	protected void sequence_IsIn(ISerializationContext context, IsIn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IS_IN__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IS_IN__OBJ));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IS_IN__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IS_IN__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsInAccess().getObjObjectParserRuleCall_0_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getIsInAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (cond=Condition milliseconds=INT actions+=Action*)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Main returns Main
	 *
	 * Constraint:
	 *     (fileName=STRING browserName=STRING (orders+=Action | orders+=Structure)*)
	 */
	protected void sequence_Main(ISerializationContext context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Navigate
	 *     Navigate returns Navigate
	 *
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_Navigate(ISerializationContext context, Navigate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NAVIGATE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NAVIGATE__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Not
	 *     Not returns Not
	 *
	 * Constraint:
	 *     cond=Condition
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__COND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getCondConditionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (body='body' | (htmltype=HTMLTYPE objectName=STRING))
	 */
	protected void sequence_Object(ISerializationContext context, org.xtext.example.mydsl.myDsl.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReDefine returns ReDefine
	 *
	 * Constraint:
	 *     (objName=STRING obj=Object)
	 */
	protected void sequence_ReDefine(ISerializationContext context, ReDefine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RE_DEFINE__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RE_DEFINE__OBJ_NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RE_DEFINE__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RE_DEFINE__OBJ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReDefineAccess().getObjNameSTRINGTerminalRuleCall_1_0(), semanticObject.getObjName());
		feeder.accept(grammarAccess.getReDefineAccess().getObjObjectParserRuleCall_3_0(), semanticObject.getObj());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Refresh
	 *     Refresh returns Refresh
	 *
	 * Constraint:
	 *     {Refresh}
	 */
	protected void sequence_Refresh(ISerializationContext context, Refresh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Rickroll
	 *     Rickroll returns Rickroll
	 *
	 * Constraint:
	 *     {Rickroll}
	 */
	protected void sequence_Rickroll(ISerializationContext context, Rickroll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (objName=STRING obj=Object)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__OBJ_NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__OBJ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_1_0(), semanticObject.getObjName());
		feeder.accept(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_3_0(), semanticObject.getObj());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns SubProcedure
	 *     SubProcedure returns SubProcedure
	 *
	 * Constraint:
	 *     (actions+=Action | actions+=Structure)+
	 */
	protected void sequence_SubProcedure(ISerializationContext context, SubProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
