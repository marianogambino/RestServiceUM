package ar.edu.unimoron.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unimoron.model.Examen;
import ar.edu.unimoron.model.Materia;
import ar.edu.unimoron.response.ExamenesResponse;

/**
 * 
 * @author mariano
 *
 */
@Service
public class ExamenesService {

	
	public ExamenesResponse getExamenes ( String matricula) throws Exception{
		
		
	   try{
			Materia mat = new Materia();
			mat.setDescripcion("");
			mat.setCodigo(1L);
			mat.setNombre("Calculo 1");
			
			Materia mat1 = new Materia();
			mat1.setDescripcion("");
			mat1.setCodigo(1L);
			mat1.setNombre("ASA 1");
			
			Materia mat2 = new Materia();
			mat2.setDescripcion("");
			mat2.setCodigo(2L);
			mat2.setNombre("Programacion Estructurada 1");
			
			Materia mat3 = new Materia();
			mat3.setDescripcion("");
			mat3.setCodigo(3L);
			mat3.setNombre("Sistemas de Computacion");
			
			Materia mat4 = new Materia();
			mat4.setDescripcion("");
			mat4.setCodigo(4L);
			mat4.setNombre("Ingles 1");
			
			Examen e = new Examen();
			e.setAula("");
			e.setMateria( mat2 );
			SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
			String fechaExamen = "15-12-2014 09:30:00";
								
			e.setFechaExamen( dformat.parse( fechaExamen ) );
			
			Set<Examen> examenes = new HashSet<Examen>(); 
			examenes.add( e );
			return new ExamenesResponse( examenes );
	   }catch( ParseException e){
		  
		  throw e;
		  
	   }catch (Exception e) {

		  throw e;
	   }
	
		
	}
}
