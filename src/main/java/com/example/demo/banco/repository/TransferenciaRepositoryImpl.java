package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	//acceso a la base de datos
	
	private static List<Transferencia> baseDatos= new ArrayList<>();
	
	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		//Select * from cuenta C where C.numero=numeroCuenta
		
		Transferencia transferencia = new Transferencia();
		/*cuemnta.setNumero(nueroCuenta);
		cuenta.setTipo("A");
		cuenta.setTitular("Edison C");
		return cuenta;**/
		
		for (Transferencia trans : baseDatos)
		 {
			if(trans.getNumero().equals(id)){
				transferencia=trans;
			}
		}
		System.out.println("Se busca la transferencia con id: "+ id);
		return transferencia;

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		Transferencia trans=null;
		for (Transferencia trans_buscada : baseDatos)
		 {
			if(trans_buscada.getNumero().equals(transferencia.getNumero())){
				trans=trans_buscada;
				
				//baseCuentas.add(cuentaBancaria);
				
			}
		}
		
		baseDatos.remove(transferencia);
		baseDatos.add(trans);
		System.out.println("Se actualiza la transferencia"+ transferencia);
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(transferencia);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se accede al borrar");
	}

	@Override
	public List<Transferencia> bucarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
