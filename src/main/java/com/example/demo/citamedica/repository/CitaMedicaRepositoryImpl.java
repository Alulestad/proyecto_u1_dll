package com.example.demo.citamedica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.citamedica.modelo.CitaMedica;




@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {
	private static List<CitaMedica> base=new ArrayList<>();
	
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		base.add(citaMedica);
	}

	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica=null;
		for (CitaMedica cm:base) {
			if (cm.getNumero().equals(numero)) {
				citaMedica=cm;
			}
		}
		
		return citaMedica;
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		CitaMedica citaMedicaAntigua=null;
		for (CitaMedica cm:base) {
			if (cm.getNumero().equals(citaMedica.getNumero())) {
				citaMedicaAntigua=cm;
			}
		}
		base.remove(citaMedicaAntigua);
		base.add(citaMedica);

	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedicaEliminar=this.buscar(numero);
		base.remove(citaMedicaEliminar);
		
	}



}
