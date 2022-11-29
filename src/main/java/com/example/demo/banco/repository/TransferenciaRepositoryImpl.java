package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		//Select * from cuenta C where C.numero=numeroCuenta
		
		
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
