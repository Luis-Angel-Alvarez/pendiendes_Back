package com.pendientes.controlador.rest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pendientes.modelo.entidades.respuestas.DatoEliminado;
import com.pendientes.modelo.entidades.respuestas.Pendiente;
import com.pendientes.modelo.entidades.solicitudes.PendienteS;
import com.pendientes.modelo.entidades.solicitudes.PendientesU;
import com.pendientes.modelo.servicios.BitacoraServicio;
import com.pendientes.modelo.servicios.PendientesServicio;

@Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AutobusComercialApiControlador {

	 @Autowired
	 @Qualifier("bitacoraServicio")
	 BitacoraServicio objBitacoraServicio;
	 
	 @Autowired
	 @Qualifier("pendientesServicio")
	 PendientesServicio objPendientesServicio;
	 
	 @GetMapping
	 @RequestMapping("/filtroPendiente/{idPendiente}")
	 public  ResponseEntity<Pendiente>casesClient(@PathVariable int idPendiente) {

		 Pendiente objPendiente=objPendientesServicio.findPendienteById(idPendiente);
		 return new ResponseEntity<Pendiente>(objPendiente, 
	               HttpStatus.OK);
	 }
	 
	 @GetMapping
	 @RequestMapping("/obteterPendientes")
	 public  ResponseEntity<List<Pendiente>>casesClient() {

		 List<Pendiente> listPendientes=objPendientesServicio.finAllPendientes();
		 return new ResponseEntity<List<Pendiente>>(listPendientes, 
	               HttpStatus.OK);
	 }
	 
	 @RequestMapping(method = RequestMethod.POST,value="/agregarPendiente")
	 public ResponseEntity<PendienteS> crearPendiente(@RequestBody PendienteS pendiente){

		 objPendientesServicio.createPendiente(pendiente);
		 return new ResponseEntity<PendienteS>(pendiente, 
	               HttpStatus.OK);
		 
	 }
	 @RequestMapping(method = RequestMethod.PUT,value="/actualizarPendiente")
	 public ResponseEntity<PendientesU> actualizarPendiente(@RequestBody PendientesU pendiente){

		 objPendientesServicio.actualizarPendiente(pendiente);
		 return new ResponseEntity<PendientesU>(pendiente, 
	               HttpStatus.OK);
		 
	 }
	 
	 @DeleteMapping("/borrarPendiente/{idPendiente}")
	 public ResponseEntity<DatoEliminado>  deletePendiente(@PathVariable int idPendiente) {
		 objPendientesServicio.borrarPendiente(idPendiente);
		 String resulatdo="exitoso";
		 DatoEliminado objDatoEliminado = new DatoEliminado(resulatdo);
		 return new ResponseEntity<DatoEliminado>(objDatoEliminado, 
	               HttpStatus.OK);
	 }
	}
