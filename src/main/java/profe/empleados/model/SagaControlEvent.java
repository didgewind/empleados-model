package profe.empleados.model;

import java.io.Serializable;

/**
 * Clase de respuesta con el resultado de la operación idEvento y el empleado sobre 
 * el que se realizó la operación
 * @author made
 *
 */
public class SagaControlEvent implements Serializable  {

	private int idEvento;
	
	private SagaOperationResult sagaOperationResult;
	
	private EmpleadosEventType eventType;
	
	private Empleado empleado;

	public SagaControlEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SagaControlEvent(int idEvento, EmpleadosEventType eventType, SagaOperationResult sagaOperationResult, Empleado empleado) {
		super();
		this.idEvento = idEvento;
		this.eventType = eventType;
		this.sagaOperationResult = sagaOperationResult;
		this.empleado = empleado;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public SagaOperationResult getSagaOperationResult() {
		return sagaOperationResult;
	}

	public void setSagaOperationResult(SagaOperationResult sagaOperationResult) {
		this.sagaOperationResult = sagaOperationResult;
	}

	@Override
	public String toString() {
		return "SagaControlEvent [idEvento=" + idEvento + ", sagaOperationResult=" + sagaOperationResult + ", empleado="
				+ empleado + "]";
	}

	public EmpleadosEventType getEventType() {
		return eventType;
	}

	public void setEventType(EmpleadosEventType eventType) {
		this.eventType = eventType;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
}
