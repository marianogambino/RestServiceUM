/**
 * 
 */
package ar.edu.unimoron.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unimoron.model.Curso;
import ar.edu.unimoron.model.Examen;
import ar.edu.unimoron.response.LoginResponse;
import ar.edu.unimoron.service.LoginService;

/**
 * @author mariano
 *
 */
public class UnimoronTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws ParseException {
		
		
		SimpleDateFormat dateformat = new SimpleDateFormat("EEE-HH:mm:ss");
		String diaCursoDesde = "mar-09:00:00";
		String diaCursoHasta = "mar-13:00:00";
		
		Date dcD = dateformat.parse(diaCursoDesde);
		Date dcH = dateformat.parse(diaCursoHasta);
		
		System.out.println(  dcD );
		System.out.println(  dcH );
		
	}
	
	@Test
	public void LoginTest() throws Exception{
		
		LoginService login = new LoginService();
		
		LoginResponse resp = login.login( "um03676" , "hkjhkjh" );
		
		Assert.assertEquals( "Gambino" , resp.getAlumno().getApellido() );
		Assert.assertEquals( "Ingenieria en Informatica" , resp.getAlumno().getCarrera().getNombre() );
		
//		Curso c = resp.getAlumno().getCursosIncriptos().iterator().next();
//		String materiaCurso = c.getMateria().getNombre();
//		
//		
//		Assert.assertEquals( "ASA 1" , materiaCurso );
//		
//		
//		Examen e = resp.getAlumno().getExamenesInscriptos().iterator().next();
//		
//		Assert.assertEquals( "Mon Dec 15 09:30:00 ART 2014" , e.getFechaExamen().toString() );
//		Assert.assertEquals( "Programacion Estructurada 1" , e.getMateria().getNombre() );
	}
	

}
