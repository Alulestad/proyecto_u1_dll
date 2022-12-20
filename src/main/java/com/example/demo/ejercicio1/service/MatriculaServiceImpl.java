package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula= new Matricula();
		matricula.setFecha(LocalDateTime.now());
		
		
		Propietario propietario= this.iPropietarioRepository.buscar(cedula);
		matricula.setPropietario(propietario);
		
		Vehiculo vehiculo= this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		//calculos
		BigDecimal valor=null;
		
		if (vehiculo.getTipo().equals("P")) {
			valor=vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}else if(vehiculo.getTipo().equals("L")){
			valor=vehiculo.getPrecio().multiply(new BigDecimal(0.10));
		}else {
			//hibrido
		}
		
		//-1 valor menor
		//0 valor igual
		//1 valor mayor
		if (valor.compareTo(new BigDecimal(2000))>0) {
			BigDecimal descuento= valor.multiply(new BigDecimal(7));
			descuento=descuento.divide(new BigDecimal(100));
			valor= valor.subtract(descuento);
		}
			
		matricula.setValor(valor);
		
		this.iMatriculaRepository.insertar(matricula);

		
				
	}

}
