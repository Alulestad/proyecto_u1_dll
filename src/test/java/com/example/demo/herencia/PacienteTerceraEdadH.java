package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH {
	private String codigoIESS;
	
	protected Integer calcularDescuento() {
		
		System.out.println("Paciente TE con descuento del 20%");
		return 10;

	}

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}


}
