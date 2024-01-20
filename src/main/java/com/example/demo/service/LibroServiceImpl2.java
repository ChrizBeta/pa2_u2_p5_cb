package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ILibroRepo2;
import com.example.demo.repository.modelo.Libro2;

@Service
public class LibroServiceImpl2 implements ILibroService2{
	
	@Autowired
	private ILibroRepo2 iLibroRepo2;

	@Override
	public void guardar(Libro2 libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo2.insertar(libro);
		
	}

	@Override
	public Libro2 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionar(id);
	}

	@Override
	public void modificar(Libro2 libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo2.actualizar(libro);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepo2.eliminar(id);
		
	}

	@Override
	public Libro2 buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Libro2> buscarPorFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionarPorFechaPublicacion(fecha);
	}

	@Override
	public Libro2 buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionarPorTitulo(titulo);
		
	}

	@Override
	public List<Libro2> buscarPorFechaPublicacion(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.buscarPorFecha(fechaPublicacion);
	}

	@Override
	public Libro2 buscarPorNamed(String titulo) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionarPorNamed(titulo);
	}

	@Override
	public List<Libro2> buscarPorFechaNamed(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.iLibroRepo2.seleccionarPorFechaNamed(fechaPublicacion);
	}

	@Override
	public Libro2 buscarPorTituloNative(String titulo) {
		// TODO Auto-generated method stub
		return this.buscarPorTituloNative(titulo);
	}

		
	

}
