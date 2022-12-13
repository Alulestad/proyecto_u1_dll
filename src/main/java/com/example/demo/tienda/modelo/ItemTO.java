package com.example.demo.tienda.modelo;

public class ItemTO {
	private String codigoBarras;
	private Integer cantidad;
	
	//GET Y SET
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "ItemTO [codigoBarras=" + codigoBarras + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
