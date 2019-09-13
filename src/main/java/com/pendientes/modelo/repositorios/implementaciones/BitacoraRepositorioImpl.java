package com.pendientes.modelo.repositorios.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.pendientes.modelo.entidades.respuestas.Usuario;
import com.pendientes.modelo.repositorios.BitacoraRepositorio;



@Repository("bitacoraRepositorio")
public class BitacoraRepositorioImpl implements BitacoraRepositorio{

	@Autowired
	private NamedParameterJdbcTemplate nameParameterJdbcTemplate;

	@Override
	public Integer consultarPk_error() {
		SqlParameterSource namedParameters = new MapSqlParameterSource();
		Integer res=nameParameterJdbcTemplate.queryForObject("select id from example where id=2",namedParameters,Integer.class);
		
		Usuario us=nameParameterJdbcTemplate.queryForObject("select id,name from example where id=2",namedParameters,new Usuario());
		System.out.println(res);
		System.out.println("Usuario:: " + us.getId() + " :: " + us.getName());
		return res;
	}
	 

}
