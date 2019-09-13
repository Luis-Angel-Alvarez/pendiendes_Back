package com.pendientes.modelo.entidades.respuestas;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Usuario implements RowMapper<Usuario>{

	
	public int id;
	public String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Usuario(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Usuario() {
		
	}
	@Override
	public Usuario mapRow(ResultSet arg, int arg1) throws SQLException {

		Usuario us= new Usuario();
		us.setId(arg.getInt("id"));
		us.setName(arg.getString("name"));
		return us;
	}

}
