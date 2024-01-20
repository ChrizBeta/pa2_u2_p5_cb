package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Libro2;

public interface ILibroService2 {
	
	public void guardar (Libro2 libro);
	public Libro2 buscar (Integer id);
	public void modificar (Libro2 libro);
	public void borrar (Integer id);
	
	public Libro2 buscarPorNombre (String nombre);
	public List <Libro2> buscarPorFecha(LocalDate fecha);
	
	public Libro2 buscarPorTitulo(String titulo);
	
	public List <Libro2> buscarPorFechaPublicacion(LocalDate fechaPublicacion);

	
	public Libro2 buscarPorNamed (String titulo);
	public List <Libro2> buscarPorFechaNamed(LocalDate fechaPublicacion);
	
	public Libro2 buscarPorTituloNative (String titulo);

	
}
