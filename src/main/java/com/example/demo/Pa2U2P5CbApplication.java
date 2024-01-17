package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
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

		/*
		System.out.println("\n___________________________Query___________________________");
		
		List<Libro2> lista = this.iLibroService2.buscarPorFecha(LocalDate.of(2024, 1, 8));
		for (Libro2 libro : lista) {
			System.out.println(libro);

		}
		
		System.out.println("\n________________________TypedQuery________________________");
		Libro2 lib = this.iLibroService2.buscarPorTitulo("Java");
		System.out.println(lib);

		List<Libro2> lista2 = this.iLibroService2.buscarPorFechaPublicacion(LocalDate.of(2024, 1, 8));
		for (Libro2 libro : lista2) {
			System.out.println(libro);

		}
		
		System.out.println("\n________________________NamedQuery________________________");
		Libro2 li2 = this.iLibroService2.buscarPorNamed("Java");
		System.out.println(li2);
		
		List<Libro2> list3 = this.iLibroService2.buscarPorFechaNamed(LocalDate.of(2024, 1, 8));
		for (Libro2 libro : list3) {
			System.out.println(libro);
		}
		
		*/
		
		Empleado empl = this.ciudadanoService.buscarPorCedula("123456789");
		System.out.println(empl);
		
		Ciudadano ciu = this.ciudadanoService.buscarPorCedulaCiu("123456789");
		System.out.println(ciu);
		
	}

}