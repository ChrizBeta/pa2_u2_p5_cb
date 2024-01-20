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

		
		
		System.out.println("\n________________________TypedQuery________________________");
		
		Alumno alum=this.alumnoService.buscarPorNombre("Christian");
		System.out.println("1. "+alum);
		Autor aut = this.autorService.buscarPorNacionalidad("Colombiano");
		System.out.println("2. "+aut);
		Ciudadano ciu = this.ciudadanoService.buscarPorApellido("Alban");
		System.out.println("3. "+ciu);
		Empleado empl = this.empleadoService.buscaarPorFechaIngreso(LocalDate.of(2024, 1, 19));
		System.out.println("4. "+empl);
		Estudiante est = this.estudianteService.buscarPorFechaNacimiento(LocalDate.of(2000, 5, 15));
		System.out.println("5. "+est);
		
		System.out.println("\n________________________NativeQuery________________________");
		Habitacion hab = this.habitacionService.buscarPorClase("Economica");
		System.out.println("1. "+hab);
		Hotel htl = this.hotelService.buscarPorDireccion("Av. Amazonas");
		System.out.println("2. "+htl);
		Libro lbr = this.iLibroService.buscarPorFechaPublicacion(LocalDate.of(2000, 12, 25));
		System.out.println("3. "+lbr);
		Empleado empl1 = this.empleadoService.buscarPorSalario(new BigDecimal(2000));
		System.out.println("4. "+empl1);
		Habitacion hab1 = this.habitacionService.buscarPorClase("Presidencial");
		System.out.println("5. "+hab1);
		
		
		
		
		
	}

}