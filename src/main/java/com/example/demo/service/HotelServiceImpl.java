package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepo;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionar(id);
	}

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
		
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizar(hotel);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.eliminar(id);
		
	}
	

}
