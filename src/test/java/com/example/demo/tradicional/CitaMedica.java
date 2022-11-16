package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;



	private void guardaCinta(CitaMedica cita) {
		// insert ne la base de datos
		System.out.println(cita);
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

	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	public void agendar(String numero2, LocalDateTime of, String nombreMedico, String cedulaMedico,
			String nombrePaciente, String cedulaPaciente, String tipo) {
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Medico medico = new Medico();
		medico.setCedula(cedulaMedico);
		medico.setNombre(nombreMedico);

		this.medico = medico;

		// Tercera edad (TE), ninio (N)
		if (tipo.equals("TE")) {
			PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
			pacienteTE.setCodigoIESS("asdcr494");
			pacienteTE.setTipo("TE");

			this.paciente = pacienteTE;
			System.out.println("paciente con descuento");
		} else {
			PacienteNinio pcienteNinio = new PacienteNinio();
			pcienteNinio.setPesoNacimiento(5);
			pcienteNinio.setTipo("N");

			this.paciente = pcienteNinio;
			System.out.println("paciente niño sin descuento");
		}

		this.paciente.setCedula(cedulaPaciente);
		this.paciente.setNombre(nombrePaciente);

		this.guardaCinta(this);
		
	}

}
