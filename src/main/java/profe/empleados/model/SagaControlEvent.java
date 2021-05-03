package profe.empleados.model;

import java.io.Serializable;

/**
 * Clase de respuesta con el resultado de la operación idEvento y el empleado sobre 
 * el que se realizó la operación
 * @author made
 *
 */
public class SagaControlEvent implements Serializable  {

	private EmpleadosEvent originalEvent;
	
	private SagaOperationResult sagaOperationResult;
	
	public SagaControlEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SagaControlEvent(EmpleadosEvent originalEvent, SagaOperationResult sagaOperationResult) {
		super();
		this.originalEvent = originalEvent;
		this.sagaOperationResult = sagaOperationResult;
	}

	public EmpleadosEvent getOriginalEvent() {
		return originalEvent;
	}

	public void setOriginalEvent(EmpleadosEvent originalEvent) {
		this.originalEvent = originalEvent;
	}

	public SagaOperationResult getSagaOperationResult() {
		return sagaOperationResult;
	}

	public void setSagaOperationResult(SagaOperationResult sagaOperationResult) {
		this.sagaOperationResult = sagaOperationResult;
	}

	@Override
	public String toString() {
		return "SagaControlEvent [originalEvent=" + originalEvent + ", sagaOperationResult=" + sagaOperationResult
				+ "]";
	}
	
}
