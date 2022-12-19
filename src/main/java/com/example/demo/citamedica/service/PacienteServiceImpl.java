package com.example.demo.citamedica.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.citamedica.modelo.Paciente;
import com.example.demo.citamedica.repository.IPacienteRepository;


@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void agregar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.eliminar(cedula);
	}
	
	public BigDecimal calcularDescuento() {
		return new BigDecimal(0);
	}
	

}
