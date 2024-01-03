package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {

	public Hotel buscar (Integer id);
	public void guardar (Hotel hotel);
	public void modificar (Hotel hotel);
	public void borrar (Integer id);	
	
}
