package com.jacaranda.prueba;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prueba")
public class Prueba {
	@Id
	private int id;
	@Column(name="nombre")
	private String nombre;
	
	
	public Prueba(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public Prueba() {
		id = -1;
		nombre = null;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
