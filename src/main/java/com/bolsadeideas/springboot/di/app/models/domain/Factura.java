package com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura {
	@Value("${factura.descripcion}")
	private String descripcion;
	@Autowired
	private Cliente cliente;
	@Autowired
	private List<ItemFactura> item;
	
	@PostConstruct
	public void Construir() {
		cliente.setNombre(cliente.getNombre().concat(" José"));
		this.descripcion = this.descripcion.concat(" Del Cliente ").concat(cliente.getNombre());
	}
	
	@PreDestroy
	public void construir() {
		System.out.println("Hasta la proxima ".concat(cliente.getNombre()));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItem() {
		return item;
	}

	public void setItem(List<ItemFactura> item) {
		this.item = item;
	}

}
