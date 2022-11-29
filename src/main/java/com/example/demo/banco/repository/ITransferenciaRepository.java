package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	//CRUD 
	public Transferencia buscar(Integer id); //primary key
	public void actualizar (Transferencia transferencia);//en transferencia 
	// no me sirve proque necesitaria ver el saldo, sumarle, un poceso 
	// redundante
	public void insertar(Transferencia transferencia);//***
	public void borrar(Integer id);// no deveria de existirme todo caso
	//seria anular la transferencia
	
	
}
