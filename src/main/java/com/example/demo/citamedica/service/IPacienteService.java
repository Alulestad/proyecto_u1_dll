package com.example.demo.citamedica.service;

import com.example.demo.citamedica.modelo.Paciente;

public interface IPacienteService {

	public void agregar(Paciente paciente);
	public Paciente buscar(String cedula);
	public void actualizar(Paciente paciente);
	public void borrar(String cedula);
	
}
