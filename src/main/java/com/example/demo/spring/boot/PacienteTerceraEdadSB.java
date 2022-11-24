package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component //Le estamos diciendo a Spring esto lo vas a controlar tu, tu vas  a hacer el new
public class PacienteTerceraEdadSB extends PacienteSB {
	
	private String codigoIESS;
	
    public Integer calcularDescuento() {
		
		System.out.println("Paciente tercera edad con 20 % de descuento");
		return 20;
	}

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}
	

}
