package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producta;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
			return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
			return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	
	public List<ItemFactura> itemsFactura(){
		Producta producto1 = new Producta("Camara sony", 250.00);
		Producta producto2 = new Producta("PlayStation", 450.00);
		Producta producto3 = new Producta("Bicicleta", 280.00);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		ItemFactura linea3 = new ItemFactura(producto3, 2);
		
		return Arrays.asList(linea1, linea2, linea3);
		
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> itemsFacturaOficina(){
		Producta producto1 = new Producta("Camara sony", 250.00);
		Producta producto2 = new Producta("PlayStation", 450.00);
		Producta producto3 = new Producta("Bicicleta", 280.00);
		Producta producto4 = new Producta("Monitor Sony", 880.00);
		Producta producto5 = new Producta("Picafresas", 1.00);
		Producta producto6 = new Producta("Refrigerador", 280.00);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		ItemFactura linea4 = new ItemFactura(producto4, 4);
		ItemFactura linea5 = new ItemFactura(producto5, 5);
		ItemFactura linea6 = new ItemFactura(producto6, 2);
		
		return Arrays.asList(linea1, linea2, linea3, linea4, linea5, linea6);
		
	}
}
