package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

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

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Christian");
		ciu.setApellido("Betancourt");
		//this.ciudadanoService.guardar(ciu);
		
		Empleado empl = new Empleado();
		empl.setFechaIngreso(LocalDate.now());
		empl.setSalario(new BigDecimal(200));
		
		this.empleadoService.guardar(empl);
		
		
		/*System.out.println(this.ciudadanoService.buscar(1));
		Ciudadano ciu2 = this.ciudadanoService.buscar(1);
		ciu2.setEmpleado(empl);
		
		*/
		
		
		
	}

}
