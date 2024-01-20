package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelRepo {

	public Hotel seleccionar (Integer id);
	public void insertar (Hotel hotel);
	public void actualizar (Hotel hotel);
	public void eliminar (Integer id);	
	
	
	public Hotel seleccionarPorDireccion (String direccion);
}
