/**
 * 
 */
package ar.edu.unimoron.db.test;

import static org.junit.Assert.*;

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
