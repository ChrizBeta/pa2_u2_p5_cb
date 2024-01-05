package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

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
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Christian");
		ciu.setApellido("Betancourt");
		ciu.setCedula("1722781000");

		//this.ciudadanoService.guardar(ciu);

		Empleado empl = new Empleado();
		empl.setFechaIngreso(LocalDate.now());
		empl.setSalario(new BigDecimal(200));
		empl.setCiudadano(this.ciudadanoService.buscar(1));

		this.empleadoService.guardar(empl);
		*/
		
		/*Ciudadano ciu2 = new Ciudadano();
		ciu2.setApellido("Alban");
		ciu2.setCedula("1722781000");
		ciu2.setNombre("Alejandro");
		
		Empleado empl1 = new Empleado();
		empl1.setFechaIngreso(LocalDate.now());
		empl1.setSalario(new BigDecimal(2000));
		empl1.setCiudadano(ciu2);
		this.empleadoService.guardar(empl1);
		*/
		/*
		Empleado empl2 = new Empleado();
		empl2.setFechaIngreso(LocalDate.now());
		empl2.setSalario(new BigDecimal(2000));
		
		
		Ciudadano ciu3 = new Ciudadano();
		ciu3.setApellido("Betancourt");
		ciu3.setCedula("1722781018");		
		ciu3.setNombre("Anthony");	
		
		ciu3.setEmpleado(empl2);
		empl2.setCiudadano(ciu3);
		
		this.ciudadanoService.guardar(ciu3);*/
		
		List<Habitacion> habitaciones = new ArrayList<>();
		
		Hotel htl = new Hotel();
		htl.setDireccion("Av. Patria");
		htl.setNombre("Hilton Colon");
		
		Habitacion habi = new Habitacion();
		habi.setClase("V.I.P");
		habi.setNumero("1");
		habi.setHotel(htl);
		Habitacion habi1 = new Habitacion();
		habi1.setClase("Economica");
		habi1.setNumero("2");
		habi1.setHotel(htl);
		
		habitaciones.add(habi);
		habitaciones.add(habi1);
		
		htl.setHabitaciones(habitaciones);
		
		this.hotelService.guardar(htl);
		
		Hotel htl1 = this.hotelService.buscar(7);
		htl1.setDireccion("Av. Amazonas");
		this.hotelService.modificar(htl1);
		
		
		this.habitacionService.borrar(15);

		

	}

}
