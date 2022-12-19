package com.example.demo.citamedica.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.citamedica.modelo.CitaMedica;
import com.example.demo.citamedica.modelo.Medico;
import com.example.demo.citamedica.modelo.Paciente;
import com.example.demo.citamedica.repository.ICitaMedicaRepository;



@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscar(numero);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(citaMedica);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.eliminar(numero);
	}

	@Override
	public void agendar(String numero, LocalDateTime fcita, Paciente ph, Medico mh) {
		CitaMedica citaMedica= new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCinta(fcita);
		citaMedica.setPaciente(ph);
		citaMedica.setMedico(mh);
		
		
		BigDecimal valorDescuento=((PacienteServiceImpl)iPacienteService).calcularDescuento();
		System.out.println("valor: "+valorDescuento);
		
		this.insertar(citaMedica);

	}

}
