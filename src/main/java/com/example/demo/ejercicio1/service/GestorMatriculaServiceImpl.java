package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.citamedica.repository.IPacienteRepository;
import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

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
	
	@Autowired
	//private IMatriculaService iMatriculaService;
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	//private IMatriculaService iMatriculaService;
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	//private IMatriculaService iMatriculaService;
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void matricular(String celula, String placa) {
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario propietario=this.iPropietarioRepository.buscar(celula);
		matricula.setPropietario(propietario);
		Vehiculo vehi=this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehi);
		
		// TODO Auto-generated method stub
		BigDecimal valor=new BigDecimal(0);
		if(vehi.getTipo().equals("L")) {
			valor=this.iMatriculaService.matricular( vehi.getPrecio());
			System.out.println("Su vehiculo es  liviano");
		}else {
			valor=this.iMatriculaServicePesado.matricular(vehi.getPrecio());
			System.out.println("Su vehiculo es pesado");
		}
		
		//programa decuento
		
		if (valor.compareTo(new BigDecimal(2000))>0) {
			BigDecimal descuento= valor.multiply(new BigDecimal(7));
			descuento=descuento.divide(new BigDecimal(100));
			valor= valor.subtract(descuento);
		
		}
		
		matricula.setValor(valor);
		
		
		this.iMatriculaRepository.insertar(matricula);
		
		System.out.println("Se matriculo el vehiculo: "+matricula);
		System.out.println("El valor fue: "+valor);
		
	}

}
