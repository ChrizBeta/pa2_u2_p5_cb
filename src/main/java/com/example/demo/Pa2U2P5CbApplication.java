package com.example.demo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5CbApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IAlumnoService alumnoService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;
	
	@Autowired
	private ILibroService iLibroService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Set<Autor> autores = new HashSet<Autor>();
		Set<Libro> libros = new HashSet<Libro>();

		Autor autor = new Autor();
		autor.setNacionalidad("Ecuatoriano");
		autor.setNombre("Christian");
		
		Autor autor2 = new Autor();
		autor2.setNacionalidad("Colombiano");
		autor2.setNombre("Alejandro");	
		
		autores.add(autor);
		autores.add(autor2);		
		
		Libro libro = new Libro();
		libro.setAutores(null);
		libro.setFechaPublicacion(LocalDate.now());
		libro.setTitulo("Programacion en Java");
		libro.setAutores(autores);
		
		libros.add(libro);
		
		autor.setLibro(libros);
		autor2.setLibro(libros);
		
		this.iLibroService.guardar(libro);
		
		

		

	}

}