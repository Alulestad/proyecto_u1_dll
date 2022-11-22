package com.example.demo.herencia;

public class PacienteH {
	protected String nombre;
	protected String cedula;
	protected String tipo;
	protected String CodigoIESS;
	
	
	protected Integer calcularDescuento() {
		
		System.out.println("Sin descuento");
		return 0;

	}
	
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
		

		public String getCodigoIESS() {
			return CodigoIESS;
		}

		public void setCodigoIESS(String codigoIESS) {
			CodigoIESS = codigoIESS;
		}

		
		
		@Override
		public String toString() {
			return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
		}


}
