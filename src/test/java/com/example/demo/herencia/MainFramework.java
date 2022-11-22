package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PacienteH pacienteTE=new PacienteTerceraEdadH();
//		pacienteTE.setCedula("23423423");
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("TE");
//		pacienteTE.setCodigoIESS("asd342");
		
		
//		PacienteNinioH pacienteTE=new PacienteNinioH();
//		pacienteTE.setCedula("23423423");
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("TE");
//		pacienteTE.setPesoNacimiento(20);
		
		PacienteCancerH pacienteTE=new PacienteCancerH();
		pacienteTE.setCedula("23423423");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("C");
	
		MedicoH medico=new MedicoH();
		medico.setCedula("24353246");
		medico.setNombre("Medico Luis");
		
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar("123", LocalDateTime.of(2022, 12, 2, 8, 30), pacienteTE, medico);
	}

}
