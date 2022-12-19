package com.example.demo.citamedica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.citamedica.modelo.Medico;
import com.example.demo.citamedica.repository.IMedicoRepository;


@Service
public class MedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoRepository iMedicoRepository;
	
	@Override
	public void agregar(Medico medico) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.insertar(medico);
	}

	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iMedicoRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.actualizar(medico);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.eliminar(cedula);
	}

}
