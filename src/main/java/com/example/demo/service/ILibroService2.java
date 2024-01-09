package com.example.demo.service;

import com.example.demo.repository.modelo.Libro2;

public interface ILibroService2 {
	
	public void guardar (Libro2 libro);
	public Libro2 buscar (Integer id);
	public void modificar (Libro2 libro);
	public void borrar (Integer id);
	
	public Libro2 buscarPorNombre (String nombre);

}
