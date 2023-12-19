package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICiudadanoRepo;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	
	@Autowired
	private ICiudadanoRepo ciudadanoRepo;

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.seleccionar(id);
	}
	
	

}
