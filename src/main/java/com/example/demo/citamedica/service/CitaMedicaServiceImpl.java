package com.example.demo.citamedica.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.citamedica.modelo.CitaMedica;
import com.example.demo.citamedica.modelo.Medico;
import com.example.demo.citamedica.modelo.Paciente;
import com.example.demo.citamedica.repository.ICitaMedicaRepository;
import com.example.demo.citamedica.repository.IMedicoRepository;
import com.example.demo.citamedica.repository.IPacienteRepository;



@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Autowired
	private IMedicoRepository iMedicoRepository;
	
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
	public void agendar(LocalDateTime fcita,String cedulaPaciente,String cedulaDoctor) {
		CitaMedica citaMedica= new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCinta(fcita);
		citaMedica.setPaciente(iPacienteRepository.buscar(cedulaPaciente));
		citaMedica.setMedico(iMedicoRepository.buscar(cedulaDoctor));
		citaMedica.setNumero(cedulaDoctor.concat(cedulaPaciente));
		
		
		System.out.println("calculo descuento");
		System.out.println("Cita generada: "+citaMedica);
		
		
		this.insertar(citaMedica);

	}

}
