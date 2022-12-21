package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service ("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public BigDecimal matricular(BigDecimal precio) {
		// TODO Auto-generated method stub
		//Vehiculo vehiculo=this.iVehiculoRepository.buscar(placa);
		System.out.println("Matriculado Liviano");
		System.out.println("Calculo del descuento ll de 2000");
		
		BigDecimal valor=precio.multiply(new BigDecimal(0.1));
		return valor;
	}

}
