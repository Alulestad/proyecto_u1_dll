package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CitaMedica cita = new CitaMedica();
		cita.agendar("123", LocalDateTime.of(2022, 12, 2, 8, 30), "Donctor Teran", "123465", "Paciente Daniel",
				"12316512", "C");//N

	}

}
