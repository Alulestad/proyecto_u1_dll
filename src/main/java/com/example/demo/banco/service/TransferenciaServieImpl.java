package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServieImpl implements ITransferenciaService{

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.bucarTodos();
	}

	@Override
	public void realizar(String numOrigen, String numDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//ORIGEN
				//1. buscar la cuneta origen
				CuentaBancaria origen= this.bancariaService.bucarPorNumero(numOrigen);
				//2. Consultar el saldo de la cuenta origen
				BigDecimal saldoOrigen= origen.getSaldo();
				//3. operacion resta en el origen
				BigDecimal nuevoSaldo= saldoOrigen.subtract(monto);
				//4. Actualizacion cuenta origen
				
				origen.setSaldo(nuevoSaldo);
				this.bancariaService.actualizar(origen);
				

				//DESTINO
				//1. buscar la cuneta origen
				CuentaBancaria destino = this.bancariaService.bucarPorNumero(numOrigen);
				
				//2. Consultar el saldo de la cuenta destino
				BigDecimal saldoDestino= destino.getSaldo();

				//3. operacion suma en el destino
				BigDecimal nuevoSaldoDestino= saldoDestino.add(monto);

				//4. Actualizacion cuneta destino
				
				destino.setSaldo(nuevoSaldoDestino);
				this.bancariaService.actualizar(destino);
	}
	
	

}
