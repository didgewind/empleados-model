package profe.empleados.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {
	    "nextIdEvento"
	})
public class EmpleadosEvent implements Serializable {

	private static int nextIdEvento;
	
	private int idEvento;
	
	private EmpleadosEventType eventType;
	
	private Empleado empleado;
	
	private String idDepartamento;

	public EmpleadosEvent() {
		super();
		synchronized (this) {
			this.idEvento = nextIdEvento++;
		}
	}

	public EmpleadosEvent(EmpleadosEventType eventType, Empleado empleado) {
		this();
		this.eventType = eventType;
		this.empleado = empleado;
	}

	public EmpleadosEvent(EmpleadosEventType eventType, Empleado empleado, String idDepartamento) {
		this(eventType, empleado);
		this.idDepartamento = idDepartamento;
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

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getIdEvento() {
		return idEvento;
	}

	@Override
	public String toString() {
		return "EmpleadosEvent [idEvento=" + idEvento + ", eventType=" + eventType + ", empleado=" + empleado
				+ ", idDepartamento=" + idDepartamento + "]";
	}
	
	
}
