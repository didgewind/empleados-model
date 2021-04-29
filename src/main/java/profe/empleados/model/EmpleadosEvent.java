package profe.empleados.model;

import java.io.Serializable;

public class EmpleadosEvent implements Serializable {

	private EmpleadosEventType eventType;
	
	private Empleado empleado;

	public EmpleadosEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadosEvent(EmpleadosEventType eventType, Empleado empleado) {
		super();
		this.eventType = eventType;
		this.empleado = empleado;
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
