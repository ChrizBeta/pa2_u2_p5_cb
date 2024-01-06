package com.example.demo.service;

import com.example.demo.repository.modelo.Libro;

public interface ILibroService {
	
	public void guardar (Libro libro);
	public Libro buscar (Integer id);
	public void modificar (Libro libro);
	public void borrar (Integer id);

}
