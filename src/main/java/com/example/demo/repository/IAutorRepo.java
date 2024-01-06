package com.example.demo.repository;

import com.example.demo.repository.modelo.Autor;

public interface IAutorRepo {
	
	public void insertar (Autor autor);
	public Autor seleccionar (Integer id);
	public void actualizar (Autor autor);
	public void eliminar (Integer id);

}
