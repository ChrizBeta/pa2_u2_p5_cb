package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Libro2;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.IAutorService;
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
	
	@Autowired
	private IAutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Ciudadano ciu = this.ciudadanoService.buscarPorApellidoNuevo("Alban");
		System.out.println(ciu);
		
		Ciudadano ciu1 = this.ciudadanoService.buscarPorCriteria("Christian", "Betancourt", "1722781000");
		System.out.println(ciu1);
		
		Ciudadano ciu2 = this.ciudadanoService.buscarPorCriteria("Christian", "Betancourt", "0522781000");
		System.out.println(ciu2);
		
		System.out.println("____________ Criteria API Query AND OR ____________");
		Ciudadano ciu3 = this.ciudadanoService.buscarPorCriteriaAndOr("Christian", "Betancourt", "1722781000");
		System.out.println(ciu3);
		
		Ciudadano ciu4 = this.ciudadanoService.buscarPorCriteriaAndOr("Christian", "Betancourt", "0522781000");
		System.out.println(ciu4);
	}

}