package com.pendientes.modelo.servicios.implementaciones;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pendientes.modelo.repositorios.BitacoraRepositorio;
import com.pendientes.modelo.servicios.BitacoraServicio;



@Service("bitacoraServicio")
public class BitacoraServicioImpl implements BitacoraServicio {

	// @Autowired
	 @Qualifier("bitacoraRepositorio")
	 private BitacoraRepositorio objBitacoraRepositorio;

	@Override
	public String prueb() {
		objBitacoraRepositorio.consultarPk_error();
		return "ok";
	}


	  
	 
}
