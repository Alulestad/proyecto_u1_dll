package com.example.demo.herencia;

import java.time.LocalDateTime;




public class CitaMedicaH {
	
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoH medico;
	private PacienteH paciente;
	
	public void agendar(String numero, LocalDateTime fcita
			,
			PacienteH ph,
			MedicoH mh) {
		this.numero = numero;
		this.fechaCita = fcita;
		this.fechaAgenda = LocalDateTime.now();
		
		
		Integer valorDescuento=ph.calcularDescuento();
		System.out.println("valor: "+valorDescuento);
		
		this.medico=mh;
		this.guardarCita(this);
	}

	// gets y sets
	public String getNumero() {
		return numero;
	}

	public void setNumero(String nombre) {
		this.numero = nombre;
	}

	public LocalDateTime getFechaCinta() {
		return fechaCita;
	}

	public void setFechaCinta(LocalDateTime fechaCinta) {
		this.fechaCita = fechaCinta;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoH getMedico() {
		return medico;
	}

	public void setMedico(MedicoH medico) {
		this.medico = medico;
	}

	public PacienteH getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteH paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}
	
	private void guardarCita(CitaMedicaH cita) {
		// insert ne la base de datos
		System.out.println(cita);
	}
}
