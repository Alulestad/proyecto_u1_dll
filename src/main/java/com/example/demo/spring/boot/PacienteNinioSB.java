package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinioSB extends PacienteSB {

	private int pesoNacimiento;

	public Integer calcularDescuento() {

		System.out.println("Paciente niño con 10% de descuento");
		return 10;
	}

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

}
