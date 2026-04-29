package gestiontareas;

public class Tarea {
	
	// Atributos
	private int id;
	private String descripcion;
	private boolean completada;
	
	// Constructor: crea una tarea nueva con estado pendiente por defecto
	
	public Tarea(int id, String descripcion) {
	this.id = id;
	this.descripcion = descripcion;
	this.completada = false;
	}
	
	//Getters
	
	public int getid() {
		return id;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	
	public boolean isCompletada() {
		return completada;
	}
	
	// Marca la tarea como completada
	
	public void completar() {
		this.completada = true;
	}
	
	// Devuelve una representación en texto de la tarea
	
	@Override
	public String toString() {
		String estado = completada ? "Completada" : "Pendiente";
		return id + " - " + descripcion + "[" + estado + "]";
	}
	
}
