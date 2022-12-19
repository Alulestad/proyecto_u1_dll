package com.example.demo.citamedica.service;

import com.example.demo.citamedica.modelo.Medico;

public interface IMedicoService {

	
	public void agregar(Medico medico);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
	public void borrar(String cedula);
	
}
