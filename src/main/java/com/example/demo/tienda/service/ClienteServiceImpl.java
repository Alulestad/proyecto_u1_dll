package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	public void agregar_crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		iClienteRepository.actualizar(cliente);
		
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return iClienteRepository.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		iClienteRepository.eliminar(cedula);
	}

}
