package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	
	public void agendar(String numero, LocalDateTime fechaCita,
			String nombreMedico, String cedulaMedico,
			String nombrePaciente, String cedulaPaciente) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		
		Medico medico=new Medico();
		medico.setCedula(cedulaMedico);
		medico.setNombre(nombreMedico);
		
		this.medico=medico;
		
		Paciente paciente=new Paciente();
		paciente.setCedula(cedulaPaciente);
		paciente.setNombre(nombrePaciente);
		
		this.paciente=paciente;
		
	}
	
	//gets y sets
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
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	
}
