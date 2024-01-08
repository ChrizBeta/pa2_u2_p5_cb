package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;

public interface IAutorService {
	
	public void guardar (Autor autor);
	public Autor buscar (Integer id);
	public void modificar (Autor autor);
	public void borrar (Integer id);


}
