package com.pendientes.modelo.servicios.implementaciones;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pendientes.modelo.entidades.respuestas.Pendiente;
import com.pendientes.modelo.entidades.solicitudes.PendienteS;
import com.pendientes.modelo.entidades.solicitudes.PendientesU;
import com.pendientes.modelo.repositorios.PendientesRepositorio;
import com.pendientes.modelo.servicios.PendientesServicio;



@Service("pendientesServicio")
//@Service
public class PendientesServicioImpl implements PendientesServicio {

	 @Autowired
	 private PendientesRepositorio objBitacoraRepositorio;

	@Override
	public List<Pendiente> finAllPendientes() {
		return (List<Pendiente>) objBitacoraRepositorio.findAll();
	}

	@Override
	public Pendiente findPendienteById(Integer id) {
    Optional<Pendiente> objPendiente=objBitacoraRepositorio.findById(1);
		return objPendiente.get();
	}

	@Override
	public PendienteS createPendiente(PendienteS pendienteS) {
		return objBitacoraRepositorio.save(pendienteS);
	}
	@Override
	public PendientesU actualizarPendiente(PendientesU pendienteS) {
		return objBitacoraRepositorio.save(pendienteS);
	}

	@Override
	public String borrarPendiente(int idpendiente) {
		objBitacoraRepositorio.deleteById(idpendiente);
		return "ok";
	}
	 
}
