package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	private static List<CuentaBancaria> baseCuentas=new ArrayList<>();
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = new CuentaBancaria();
		/*cuemnta.setNumero(nueroCuenta);
		cuenta.setTipo("A");
		cuenta.setTitular("Edison C");
		return cuenta;**/
		
		for (CuentaBancaria cb : baseCuentas)
		 {
			if(cb.getNumero().equals(numeroCuenta)){
				cuenta=cb;
			}
		}
		System.out.println("Se busca la cuenta: "+ numeroCuenta);
		return cuenta;
	}
	//asdf

	@Override
	public CuentaBancaria buscar(Integer id) {
		System.out.println("Se busca la cuenta: "+ id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta=null;
		for (CuentaBancaria cb : baseCuentas)
		 {
			if(cb.getNumero().equals(cuentaBancaria.getNumero())){
				cuenta=cb;
				
				//baseCuentas.add(cuentaBancaria);
				
			}
		}
		
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		System.out.println("Se actualiza la cuenta"+ cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se borra la cuenta: "+ id);
	}

	
}
