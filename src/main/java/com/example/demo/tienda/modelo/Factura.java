package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {
	
	private String numero;
	private LocalDateTime fecha;
	private Cliente cliente;
	private List<Detalle> detalles;
	private BigDecimal dubtotal;
	private BigDecimal iva;
	private BigDecimal total;
	
	//GET y SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public BigDecimal getDubtotal() {
		return dubtotal;
	}
	public void setDubtotal(BigDecimal dubtotal) {
		this.dubtotal = dubtotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", detalles=" + detalles
				+ ", dubtotal=" + dubtotal + ", iva=" + iva + ", total=" + total + "]";
	}
	
	
	
	

}
