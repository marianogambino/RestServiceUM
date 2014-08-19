/**
 * 
 */
package ar.edu.unimoron.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.unimoron.response.AlumnosResponse;
import ar.edu.unimoron.response.AulaResponse;
import ar.edu.unimoron.response.CursosResponse;
import ar.edu.unimoron.response.ExamenesResponse;
import ar.edu.unimoron.response.LoginResponse;
import ar.edu.unimoron.response.NovedadesResponse;
import ar.edu.unimoron.response.UnimoronResponse;
import ar.edu.unimoron.service.AlumnosIncriptosService;
import ar.edu.unimoron.service.AulasService;
import ar.edu.unimoron.service.CursosService;
import ar.edu.unimoron.service.ExamenesService;
import ar.edu.unimoron.service.LoginService;
import ar.edu.unimoron.service.NovedadesServices;

/**
 * @author MG10
 *
 */
@Controller
@RequestMapping("/service")
public class UnimoronController {
	
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hola %s";
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CursosService cursosService;
	
	@Autowired
	private ExamenesService examenesService;
	
	@Autowired
	private AulasService aulasService;
	
	@Autowired
	private AlumnosIncriptosService alumnosService;
	
	@Autowired
	private NovedadesServices novedadesService;
	
	/**
	 * 
	 * @param usuario
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/login" , params = { "usuario", "password" },  method = RequestMethod.GET)
	public @ResponseBody LoginResponse login( 
			@RequestParam ( value="usuario", required=true ) String usuario,
			@RequestParam ( value="password", required=true ) String password ){
	
		try {
			
			return loginService.login(usuario, password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			//tratar error.
			return null;
		}
	}
	
	/**
	 * 
	 * @param matricula
	 * @return
	 * 
	 * @PathVariable("matricula")
	 */
	@RequestMapping(value="/cursos" , method = RequestMethod.GET)
	public @ResponseBody CursosResponse consultarCusos(
			@RequestParam ( value="matricula", required=true )  String matricula ){
	
		try{
			
			return cursosService.getCursos(matricula);
			
		} catch (Exception e) {	
			e.printStackTrace();
			//tratar error.
			return null;
		}
	}
	
	/**
	 * 
	 * @param matricula
	 * @return
	 */
	@RequestMapping(value="/examenes" , method = RequestMethod.GET)
	public @ResponseBody ExamenesResponse consultarExamenes(
			@RequestParam ( value="matricula", required=true )  String matricula  ){
	
		try{
			
			return this.examenesService.getExamenes(matricula);
			
		}catch(Exception e){
			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 
	 * @param idCurso
	 * @return
	 */
	@RequestMapping(value="/aulaCurso" , method = RequestMethod.GET)
	public @ResponseBody AulaResponse consultarAulaCurso(
			@RequestParam ( value="idCurso", required=true )  Long idCurso  ){
	
		return this.aulasService.getAulaCurso(idCurso);
	}
	
	
	/**
	 * 
	 * @param idExamen
	 * @return
	 */
	@RequestMapping(value="/aulaExamen" , method = RequestMethod.GET)
	public @ResponseBody AulaResponse consultarAulaExamen(
			@RequestParam ( value="idExamen", required=true )  Long idExamen  ){
	
		return this.aulasService.getAulaExamen(idExamen);
	}
	
	
	
	/**
	 * Consulta de alumnos incriptos en curso o Materia
	 * Lista de alumnos que cursan o rinden las mismas materias
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/alumnosIncriptosMaterias" , method = RequestMethod.GET)
	public @ResponseBody AlumnosResponse consultarAlumnos(
			
			@RequestParam ( value="matricula", required=true )  String matricula  ){
	
		//UnimoronResponse resp = new UnimoronResponse(counter.incrementAndGet(), 
		//		String.format(template, name ) );e
		//return resp;
		
		try{
			
			return this.alumnosService.getAlumnosIncriptos(matricula);
			
		}catch(Exception e){
			
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	/**
	 * Consulta de Novedades
	 * Retorna una descripcion de las novedades
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/novedadesUM" , method = RequestMethod.GET)
	public @ResponseBody NovedadesResponse consultarNovedadesUM(){
	
		return this.novedadesService.getNovedad();
	}

	/**
	 * @return the loginService
	 */
	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService the loginService to set
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	/**
	 * @return the cursosService
	 */
	public CursosService getCursosService() {
		return cursosService;
	}


	/**
	 * @param cursosService the cursosService to set
	 */
	public void setCursosService(CursosService cursosService) {
		this.cursosService = cursosService;
	}

	/**
	 * @return the examenesService
	 */
	public ExamenesService getExamenesService() {
		return examenesService;
	}

	/**
	 * @param examenesService the examenesService to set
	 */
	public void setExamenesService(ExamenesService examenesService) {
		this.examenesService = examenesService;
	}

	/**
	 * @return the aulasService
	 */
	public AulasService getAulasService() {
		return aulasService;
	}

	/**
	 * @param aulasService the aulasService to set
	 */
	public void setAulasService(AulasService aulasService) {
		this.aulasService = aulasService;
	}

	/**
	 * @return the alumnosService
	 */
	public AlumnosIncriptosService getAlumnosService() {
		return alumnosService;
	}

	/**
	 * @param alumnosService the alumnosService to set
	 */
	public void setAlumnosService(AlumnosIncriptosService alumnosService) {
		this.alumnosService = alumnosService;
	}

	/**
	 * @return the novedadesService
	 */
	public NovedadesServices getNovedadesService() {
		return novedadesService;
	}

	/**
	 * @param novedadesService the novedadesService to set
	 */
	public void setNovedadesService(NovedadesServices novedadesService) {
		this.novedadesService = novedadesService;
	}
	
	
	

}
