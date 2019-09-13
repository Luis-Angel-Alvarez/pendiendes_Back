package com.pendientes.modelo.servicios;

import java.util.List;

import com.pendientes.modelo.entidades.respuestas.Pendiente;
import com.pendientes.modelo.entidades.solicitudes.PendienteS;
import com.pendientes.modelo.entidades.solicitudes.PendientesU;
public interface PendientesServicio {
	List<Pendiente> finAllPendientes();	
	Pendiente findPendienteById(Integer id);
    PendienteS createPendiente(PendienteS pendienteS);
    PendientesU actualizarPendiente(PendientesU pendienteS);
	String borrarPendiente (int idpendiente);
}
