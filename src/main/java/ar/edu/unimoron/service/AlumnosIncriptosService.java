/**
 * 
 */
package ar.edu.unimoron.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unimoron.response.AlumnosResponse;
import ar.edu.unimoron.vo.AlumnoVO;

/**
 * @author mariano
 *
 */
@Service
public class AlumnosIncriptosService {
	
	/**
	 * Lista de Alumnos que cursan o rinden las mismas materias.
	 * 
	 * Segun la matricula se obtiene lista de alumnos que cursan o rinden las mismas materias , segun la fecha actual.
	 * @throws ParseException 
	 */
	public AlumnosResponse getAlumnosIncriptos(String matricula) throws ParseException{
		
		
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			AlumnoVO alu1 = new AlumnoVO();
			alu1.setApellido("Madeira");
			alu1.setFechaNacimiento( format.parse( "13/07/1983" ));
			alu1.setMatricula("32010212");
			alu1.setNombre("Leticia");
			
			AlumnoVO alu2 = new AlumnoVO();
			alu2.setApellido("Cari");
			alu2.setFechaNacimiento( format.parse( "13/07/1978" ));
			alu2.setMatricula("13270425");
			alu2.setNombre("Alejandro");
			
			AlumnoVO alu3 = new AlumnoVO();
			alu3.setApellido("Sanchez");
			alu3.setFechaNacimiento( format.parse( "11/11/1979" ));
			alu3.setMatricula("31013354");
			alu3.setNombre("Sabrina");
			
			AlumnoVO alu4 = new AlumnoVO();
			alu4.setApellido("Goicochea");
			alu4.setFechaNacimiento( format.parse( "20/08/1983" ));
			alu4.setMatricula("31010582");
			alu4.setNombre("Luciano");
			
			Set<AlumnoVO> alumnos = new HashSet<AlumnoVO>();
			
			alumnos.add(alu1);
			alumnos.add(alu2);
			alumnos.add(alu3);
			alumnos.add(alu4);
			
			
			return new AlumnosResponse(alumnos);
		
		}catch(ParseException e){
			
			throw e;
			
		}
	}

}
