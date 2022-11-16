package com.example.demo.tradicional;

public class Paciente {
	protected String nombre;
	protected String cedula;
	protected String tipo;

	// gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

}
