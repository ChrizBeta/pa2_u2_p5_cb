package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor2;
import com.example.demo.repository.modelo.AutorLibro;
import com.example.demo.repository.modelo.Libro2;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.ILibroService;
import com.example.demo.service.ILibroService2;

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

	@Autowired
	private ILibroService2 iLibroService2;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		List<Autor2> autores2 = new ArrayList<>();
		List<Libro2> libros2 = new ArrayList<>();
		List<AutorLibro> lista = new ArrayList<>();
		
		//AUTORES
		Autor2 autor= new Autor2();
		autor.setNacionalidad("Ecuatoriano");
		autor.setNombre("Christian");			
		Autor2 autor1= new Autor2();
		autor1.setNacionalidad("Colombiano");
		autor1.setNombre("Alejandro");
		
		autores2.add(autor1);
		autores2.add(autor);
		
		//LIBROS
		Libro2 libro = new Libro2();
		libro.setFechaPublicacion(LocalDate.now());
		libro.setTitulo("Progra Java");
		
		
		//HAGO LA RELACION AUTOR CON EL LIBRO
		AutorLibro autorLibro1 = new AutorLibro();
		autorLibro1.setLibro2(libro);
		autorLibro1.setAutor2(autor1);
		autorLibro1.setFecha(LocalDate.of(2024, 1, 8));
		AutorLibro autorLibro2= new AutorLibro();
		autorLibro2.setLibro2(libro);
		autorLibro2.setAutor2(autor);
		autorLibro2.setFecha(LocalDate.of(2024, 11, 8));
		
		lista.add(autorLibro1);
		lista.add(autorLibro2);
		
		libro.setAutoreslibros(lista);
		
		//this.iLibroService2.guardar(libro);
		
		Libro2 librob = this.iLibroService2.buscarPorNombre("Progra Java");
		System.out.println(librob);
		
	}

}