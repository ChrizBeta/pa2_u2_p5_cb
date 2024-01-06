package com.example.demo.repository;

import com.example.demo.repository.modelo.Libro;

public interface ILibroRepo {
	
	public void insertar (Libro libro);
	public Libro seleccionar (Integer id);
	public void actualizar (Libro libro);
	public void eliminar (Integer id);

}
