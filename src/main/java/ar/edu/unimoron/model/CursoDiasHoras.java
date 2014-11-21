package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author mariano
 *
 */
@Entity
@Table(name="CURSODIASHORA")
public class CursoDiasHoras {

	private Long id;
	private DiasHora diasHora;
	private Curso curso;
	
	
	public CursoDiasHoras(){}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDCURSODIASHORA" , nullable = false)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the diasHora
	 */
	@ManyToOne
	@JoinColumn(name="IDDIASHORA" , nullable = false)
	public DiasHora getDiasHora() {
		return diasHora;
	}
	/**
	 * @param diasHora the diasHora to set
	 */
	public void setDiasHora(DiasHora diasHora) {
		this.diasHora = diasHora;
	}
	/**
	 * @return the curso
	 */
	@OneToOne
	@JoinColumn(name="IDCURSO" , nullable = false)
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CursoDiasHoras [id=" + id + ", diasHora=" + diasHora
				+ ", curso=" + curso + "]";
	}
	
	
	
}
