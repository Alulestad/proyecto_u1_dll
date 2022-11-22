package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{

	protected Integer calcularDescuento() {
		
		System.out.println("Paciente C con 30% de descuento");
		return 30;

	}
}
