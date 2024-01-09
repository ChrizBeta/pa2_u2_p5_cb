package com.example.demo.repository;

import com.example.demo.repository.modelo.Libro2;

public interface ILibroRepo2 {
	
	public void insertar (Libro2 libro);
	public Libro2 seleccionar (Integer id);
	public void actualizar (Libro2 libro);
	public void eliminar (Integer id);
	
	public Libro2 seleccionarPorNombre (String nombre);

}
