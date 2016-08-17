package me.ujung.movieapi.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 권석민
 */
@Entity(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="movie_name")
	private String name;

	@Column(name="date_of_registration")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfRegistration = new Date();

	public Movie() {
	}

	public Movie(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
}
