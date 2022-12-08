package com.ar.cac.Models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public Long id;
	public String plato;
	public String descripcion;
	public Double precio;
	
	public Menu() {}
	
	
	public Menu(Long id, String plato, String descripcion, Double precio) {
		super();
		this.id = id;
		this.plato = plato;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, id, plato, precio);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(id, other.id)
				&& Objects.equals(plato, other.plato) && Objects.equals(precio, other.precio);
	}
	
}
