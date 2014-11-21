/**
 * 
 */
package ar.edu.unimoron.db.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.unimoron.model.Carrera;
import ar.edu.unimoron.model.DatosAlumno;

/**
 * @author mariano
 *
 */
public class UnimoronDbTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
		EntityManagerFactory emf =  (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		EntityManager em =  emf.createEntityManager();
		
		
		Query q = em.createQuery("select a from DatosAlumno a where matricula = :mat");
		q.setParameter("mat", 45010003L);
		DatosAlumno alu = (DatosAlumno) q.getResultList().get(0);
		
		
		Date fi = alu.getCursosIncriptos().iterator().next().getCurso().getFechaInicio();
		
		Date hd = alu.getCursosIncriptos().iterator().next().getCurso().getDiasCurso().iterator().next().getDiasHora().getFechaHoraDesde();
		Date hh = alu.getCursosIncriptos().iterator().next().getCurso().getDiasCurso().iterator().next().getDiasHora().getFechaHoraHasta();
		
		String dia = alu.getCursosIncriptos().iterator().next().getCurso().getDiasCurso().iterator().next().getDiasHora().getDia();
		
		
		String materia = alu.getCursosIncriptos().iterator().next().getCurso().getMateria().getNombre();
		
		Long idCurso = alu.getCursosIncriptos().iterator().next().getCurso().getId();
		
		Long codigoMateria = alu.getCursosIncriptos().iterator().next().getCurso().getMateria().getCodigo();
		
		System.out.println( "fecha Desde: " +  fi );
		
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println( "Dia: " + dia );
		System.out.println( "Hora desde: " + f.format( hd )  );
		System.out.println( "Hora Hasta: " +  f.format( hh ) );
		
		System.out.println( "materia: " +  materia );
		
		System.out.println( "id curso: " +  idCurso );
		System.out.println( "codigoMateria: " +  codigoMateria );
		
		
		
		Assert.assertNotNull( alu );
		Assert.assertEquals( "FERNANDO", alu.getNombre() );
	}
	
	
	@Test
	public void getCarrera() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
		EntityManagerFactory emf =  (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		EntityManager em =  emf.createEntityManager();
		
		
		Query q = em.createQuery("select a from Carrera a where id = :carr");
		q.setParameter("carr", 132L);
		Carrera carrera = (Carrera) q.getResultList().get(0);
		
		Assert.assertNotNull( carrera );
		Assert.assertEquals( "INGENIERÍA EN INFORMÁTICA", carrera.getNombre() );
	}
	
	
	
	

}
