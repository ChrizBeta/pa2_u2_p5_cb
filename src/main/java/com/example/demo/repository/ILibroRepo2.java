package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Libro2;

public interface ILibroRepo2 {
	
	public void insertar (Libro2 libro);
	public Libro2 seleccionar (Integer id);
	public void actualizar (Libro2 libro);
	public void eliminar (Integer id);
	
	//------------ Query ---------------
	public Libro2 seleccionarPorNombre (String nombre);
	public List <Libro2> seleccionarPorFechaPublicacion(LocalDate fechaPublicacion);

	//--------- TypedQuery -------------
	public Libro2 seleccionarPorTitulo (String titulo);
	public List <Libro2> seleccionarPorFecha(LocalDate fechaPublicacion);

	//--------- NamedQuery -------------
	public Libro2 seleccionarPorNamed (String titulo);
	public List <Libro2> seleccionarPorFechaNamed(LocalDate fechaPublicacion);
	
	//--------- NativeQuery -------------
	public Libro2 seleccionarPorTituloNative (String titulo);
	
	
	//--------- CriteriaAPIQuery -------------
}
