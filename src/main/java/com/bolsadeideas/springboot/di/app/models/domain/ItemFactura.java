package com.bolsadeideas.springboot.di.app.models.domain;

public class ItemFactura {
	private Producta producto;
	private Integer cantidad;
	
	

	public ItemFactura(Producta producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producta getProducto() {
		return producto;
	}

	public void setProducto(Producta producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double calcularImoporte() {
		return this.cantidad * producto.getPrecio();
	}

}
