package com.example.demo.citamedica.repository;

import com.example.demo.citamedica.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public void insertar(CitaMedica citaMedica);
	public CitaMedica buscar(String numero);
	public void actualizar(CitaMedica citaMedica);
	public void eliminar(String numero);
	
	
	
	
}
