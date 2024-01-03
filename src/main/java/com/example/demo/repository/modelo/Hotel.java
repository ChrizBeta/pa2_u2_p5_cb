package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_hotel")
	@SequenceGenerator(name = "seq_hotel",sequenceName = "seq_hotel",allocationSize = 1)
	@Column(name = "htl_id")
	private Integer id;
	@Column(name = "htl_nombre")
	private String nombre;
	@Column(name = "htl_direccion")
	private String Direccion;
	
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	private List <Habitacion> habitaciones;
	
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
		
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", Direccion=" + Direccion + "]";
	}
	
	
	
}
