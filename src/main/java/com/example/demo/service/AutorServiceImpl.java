package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAutorRepo;
import com.example.demo.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepo autorRepo;

	@Override
	public void guardar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
		
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.autorRepo.seleccionar(id);
	}

	@Override
	public void modificar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.actualizar(autor);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.autorRepo.eliminar(id);
		
	}


	
	
	
}
