package com.pendientes.modelo.excepciones;

public abstract class GenericaExcepciones extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public GenericaExcepciones(String MENSAJEEXCEPCION){
		super(MENSAJEEXCEPCION);
	}
	
	public abstract String getMensajeTecnico();
	public abstract String getMensajeUsuario();
	public abstract Integer getCodigo();
}
