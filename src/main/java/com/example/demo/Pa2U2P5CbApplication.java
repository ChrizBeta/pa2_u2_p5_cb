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
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("\n________________________________________________ TAREA 10 ________________________________________________\n");
		
		
		Ciudadano ciu = this.ciudadanoService.buscarPorApellidoNuevo("Alban");
		System.out.println("1. "+ciu);		
		Ciudadano ciu1 = this.ciudadanoService.buscarPorCriteria("Christian", "Betancourt", "1722781000");
		System.out.println("2. "+ciu1);		
		Ciudadano ciu2 = this.ciudadanoService.buscarPorCriteria("Christian", "Betancourt", "0522781000");
		System.out.println("3. "+ciu2);		
		Ciudadano ciu3 = this.ciudadanoService.buscarPorCriteriaAndOr("Christian", "Betancourt", "1722781000");
		System.out.println("4. "+ciu3);		
		Ciudadano ciu4 = this.ciudadanoService.buscarPorCriteriaAndOr("Christian", "Betancourt", "0522781000");
		System.out.println("5. "+ciu4);
	}

}