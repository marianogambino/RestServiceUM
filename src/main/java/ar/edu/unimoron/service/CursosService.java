package ar.edu.unimoron.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unimoron.model.Curso;
import ar.edu.unimoron.model.DiasHora;
import ar.edu.unimoron.model.Materia;
import ar.edu.unimoron.model.Profesor;
import ar.edu.unimoron.response.CursosResponse;

/**
 * 
 * @author mariano
 *
 */
@Service
public class CursosService {

	
	public CursosResponse getCursos(String matricula) throws Exception {
		
		Set<Curso> cursos = new HashSet<Curso>();
		
		
		Set<Materia> materias = new HashSet<Materia>();
		
		
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
			
			materias.add( mat );
			materias.add( mat1 );
			materias.add( mat2 );
			materias.add( mat3 );
			materias.add( mat4 );
			
			//curso ASA 1
			Curso c1 = new Curso();
			c1.setMateria(mat1);
			c1.setComision("C1");
			
			Set<Profesor> profesores = new HashSet<Profesor>();
			
			
			profesores.add( new Profesor( "Marisa" , "Panisi") );
			//c1.setProfesores( profesores );
			
			Set<DiasHora> diasHora = new HashSet<DiasHora>();
			
			SimpleDateFormat dateformatFechaInicioFin = new SimpleDateFormat("dd/MM/yyyy");
			String fechaInicio = "10/08/2014";
			String fechaFin = "01/12/2014";
			
			c1.setFechaInicio( dateformatFechaInicioFin.parse(fechaInicio) );
			c1.setFechaFin( dateformatFechaInicioFin.parse(fechaFin) );
			
			SimpleDateFormat dateformat = new SimpleDateFormat("EEE-HH:mm:ss");
			String diaCursoDesde = "mar-09:00:00";
			String diaCursoHasta = "mar-13:00:00";
			
			Date dcD = dateformat.parse(diaCursoDesde);
			Date dcH = dateformat.parse(diaCursoHasta);
			//DiasHora dh = new DiasHora( dcD, dcH);								
			
			//diasHora.add( dh );
			
			//c1.setDiasCurso( diasHora );
			
			
			//curso Programacion Estructurada 1
			Curso c2 = new Curso();
			c2.setMateria(mat2);
			c2.setComision("C2");
			
			Set<Profesor> profesores2 = new HashSet<Profesor>();
			
			profesores2.add( new Profesor( "Pepe" , "Pepito") );
			
			//c2.setProfesores(profesores2);
			
			Set<DiasHora> diasHora2 = new HashSet<DiasHora>();
			
			String diaCursoDesde2 = "jue-09:00:00";
			String diaCursoHasta2 = "jue-13:00:00";
			
			Date dcD2 = dateformat.parse(diaCursoDesde2);
			Date dcH2 = dateformat.parse(diaCursoHasta2);
			//DiasHora dh2 = new DiasHora( dcD2, dcH2);								
			//diasHora2.add( dh2 );
			
//			c2.setDiasCurso( diasHora2 );
//			c2.setFechaInicio( dateformatFechaInicioFin.parse(fechaInicio) );
//			c2.setFechaFin( dateformatFechaInicioFin.parse(fechaFin) );
//			
//			cursos.add( c1 );
//			cursos.add( c2 );
			return new CursosResponse(cursos);
		}
		catch (ParseException e) {
			throw e;
		}
		catch (Exception e) {
			throw e;
		}
		
		
		
		
	}
	
}
