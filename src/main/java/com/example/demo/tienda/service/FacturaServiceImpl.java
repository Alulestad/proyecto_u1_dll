package com.example.demo.tienda.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IClienteRepository;
import com.example.demo.tienda.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturaRepository iFacturaRepository;
	
	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	public void generar(String cedulaCliente, List<ItemTO> detalles) {
		// TODO Auto-generated method stub
		Cliente cliente = this.iClienteRepository.buscar(cedulaCliente);
		
		Factura mifactura= new Factura();
		mifactura.setCliente(cliente);
		
		mifactura.setFecha(LocalDateTime.now());
		
		this.iFacturaRepository.insertar(mifactura);
	}

}
