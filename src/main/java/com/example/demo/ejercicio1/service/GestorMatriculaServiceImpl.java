package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	@Qualifier("liviano")
	//private IMatriculaService iMatriculaService;
	private IMatriculaNuevaService iMatriculaService;
	
	@Autowired
	@Qualifier("pesado")
	//private IMatriculaService iMatriculaService;
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Override
	public void matricular(String celula, String placa) {
		Vehiculo vehi=null;
		// TODO Auto-generated method stub

		if(vehi.getTipo().equals("P")) {
			this.iMatriculaService.matricular("1123456", "ASD343");
		}else {
			this.iMatriculaServicePesado.matricular("1123456", "ASD343");
		}
		
		//programa decuento
	}

}
