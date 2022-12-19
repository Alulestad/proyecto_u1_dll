package com.example.demo.citamedica.repository;

import com.example.demo.citamedica.modelo.Medico;

public interface IMedicoRepository {

	public void insertar(Medico medico);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
	public void eliminar(String cedula);
}
