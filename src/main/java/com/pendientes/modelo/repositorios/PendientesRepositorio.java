package com.pendientes.modelo.repositorios;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pendientes.modelo.entidades.respuestas.Pendiente;
import com.pendientes.modelo.entidades.solicitudes.PendienteS;
import com.pendientes.modelo.entidades.solicitudes.PendientesU;

public interface PendientesRepositorio extends JpaRepository<Pendiente, Serializable>{

	PendienteS save(PendienteS pendienteS);	
	PendientesU save(PendientesU pendienteS);
	
}
