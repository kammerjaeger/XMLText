package org.xtext.example.mydsl.references.serializer;

import com.example.example.references.OrderDetail1;
import com.example.example.references.OrderDetail2;
import com.example.example.references.OrderRef1;
import com.example.example.references.OrderRef2;
import com.example.example.references.OrdersType;
import com.example.example.references.ReferencesPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.references.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReferencesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReferencesPackage.ORDER_DETAIL1:
				if(context == grammarAccess.getOrderDetail1Rule()) {
					sequence_OrderDetail1(context, (OrderDetail1) semanticObject); 
					return; 
				}
				else break;
			case ReferencesPackage.ORDER_DETAIL2:
				if(context == grammarAccess.getOrderDetail2Rule()) {
					sequence_OrderDetail2(context, (OrderDetail2) semanticObject); 
					return; 
				}
				else break;
			case ReferencesPackage.ORDER_REF1:
				if(context == grammarAccess.getOrderRef1Rule()) {
					sequence_OrderRef1(context, (OrderRef1) semanticObject); 
					return; 
				}
				else break;
			case ReferencesPackage.ORDER_REF2:
				if(context == grammarAccess.getOrderRef2Rule()) {
					sequence_OrderRef2(context, (OrderRef2) semanticObject); 
					return; 
				}
				else break;
			case ReferencesPackage.ORDERS_TYPE:
				if(context == grammarAccess.getOrdersTypeRule()) {
					sequence_OrdersType(context, (OrdersType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID0 customerAddress=String0? customerContact=String0? customerName=String0?)
	 */
	protected void sequence_OrderDetail1(EObject context, OrderDetail1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID0 customerName=String0?)
	 */
	protected void sequence_OrderDetail2(EObject context, OrderDetail2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (orderDetail1=[OrderDetail1|IDREF]?)
	 */
	protected void sequence_OrderRef1(EObject context, OrderRef1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (orderDetail2=[OrderDetail2|IDREF]?)
	 */
	protected void sequence_OrderRef2(EObject context, OrderRef2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         order1+=OrderDetail1 
	 *         order1+=OrderDetail1* 
	 *         order2+=OrderDetail2 
	 *         order2+=OrderDetail2* 
	 *         orderReference1+=OrderRef1 
	 *         orderReference1+=OrderRef1* 
	 *         orderReference2+=OrderRef2 
	 *         orderReference2+=OrderRef2*
	 *     )
	 */
	protected void sequence_OrdersType(EObject context, OrdersType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
