package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service //Aqui esta la logica del negocio
public class CitaMedicaSB {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoSB medico;
	private PacienteSB paciente;

	public void agendar(String numero, LocalDateTime fechaCita, PacienteSB ph, MedicoSB medicoh) {

		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Integer valor_descuento = ph.calcularDescuento();
		System.out.println("Valor: " + valor_descuento);

		this.medico = medicoh;
		this.guardarCitaH(this);

	}

	private void guardarCitaH(CitaMedicaSB cita) {

		// Insertar en la base de datos, guardar cita
		System.out.println(cita);
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoSB getMedico() {
		return medico;
	}

	public void setMedico(MedicoSB medico) {
		this.medico = medico;
	}

	public PacienteSB getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteSB paciente) {
		this.paciente = paciente;
	}

}
