package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;




@SpringBootApplication
public class ProyectoU1DllApplication implements CommandLineRunner{
	@Autowired	
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("grande")
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	@Qualifier("liviano")
	//private IMatriculaService iMatriculaService;
	private IMatriculaNuevaService iMatriculaService;
	
	@Autowired
	@Qualifier("pesado")
	//private IMatriculaService iMatriculaService;
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	/*
	@Autowired
	private IMatriculaNuevaService iMatriculaNuevaService;*/
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DllApplication.class, args);
		

	}
	
	@Override
	public void run(String... args) throws Exception {/*
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1= new CuentaBancaria();
		cuenta1.setNumero("0001");
		cuenta1.setSaldo(new BigDecimal(30));
		cuenta1.setTipo("C");
		cuenta1.setTitular("Pepe");
		
		
		this.bancariaService.insertar(cuenta1);
		

		
		CuentaBancaria cuenta2= new CuentaBancaria();
		cuenta2.setNumero("0002");
		cuenta2.setSaldo(new BigDecimal(10));
		cuenta2.setTipo("D");
		cuenta2.setTitular("Diana");
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("Saldo actuales");
		CuentaBancaria cuentaActuala1= this.bancariaService.bucarPorNumero("0001");
		CuentaBancaria cuentaActuala2= this.bancariaService.bucarPorNumero("0002");
		System.out.println("Saldo actual: "+cuentaActuala1.getSaldo());
		System.out.println("Saldo actual: "+cuentaActuala2.getSaldo());
		
		
		
		System.out.println("Reporte 1	");
		for (Transferencia t:this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		
		this.iTransferenciaService.realizar("0001", "0002", new BigDecimal(10));
		System.out.println("Reporte 2	");
		for (Transferencia t:this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		System.out.println("Saldo nuevos");
		CuentaBancaria cuentaConsultada1= this.bancariaService.bucarPorNumero("0001");
		CuentaBancaria cuentaConsultada2= this.bancariaService.bucarPorNumero("0002");
		System.out.println("Nuevo saldo: "+cuentaConsultada1.getSaldo());
		System.out.println("Nuevo saldo: "+cuentaConsultada2.getSaldo());*/
		
		//Opcion 1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("TOYOTA");
		vehi.setPlaca("ASD343");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		
		this.iVehiculoService.crear(vehi);
		
		vehi.setPrecio(new BigDecimal(2000));
		vehi.setMarca("TOYOTAA");
		
		this.iVehiculoService.modificar(vehi);
		
		
		//OP 2
		Propietario propietario = new Propietario();
		propietario.setApellido("Llumqiuigjna");
		propietario.setCedula("");
		propietario.setFechaNacimiento(LocalDateTime.of(1997,7,7,12,35));
		propietario.setNombre("Daniel");
		
		this.iPropietarioService.guardar(propietario);
		
		
		
		
		//OP3
		this.iMatriculaService.matricular("1123456", "ASD343");
		
		System.out.println();
		
	}

}
