package com.example.demo.tienda.repository;


import com.example.demo.tienda.modelo.Detalle;

public interface IDetalleRepository {

	public void insertar(Detalle detalle);
	
	public void actualizar(Detalle detalle);
	
	public Detalle buscar(String numero);

	public void eliminar(String numero);
	

}
