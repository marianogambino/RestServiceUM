/**
 * 
 */
package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="USUARIO") 
public class Usuario {

	private Long id;
	private String username;
	private String password;
	private DatosAlumno alumno;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDUSUARIO" , nullable = false)
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
	 * @return the username
	 */
	@Column(name="USUARIO" , nullable = false)
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	@Column(name="PASSWORD" , nullable = false)
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the alumno
	 */
	@OneToOne
	@JoinColumn(name="MATRICULA", nullable = false)
	public DatosAlumno getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(DatosAlumno alumno) {
		this.alumno = alumno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password="
				+ password + ", alumno=" + alumno + "]";
	}
}
