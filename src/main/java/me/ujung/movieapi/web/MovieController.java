package me.ujung.movieapi.web;

import me.ujung.movieapi.domain.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 권석민
 */
@RestController
public class MovieController {

	/**
	 * 이것은 주석입니다.
	 * @return
	 */
	@RequestMapping(path = "/movies", method = RequestMethod.GET)
	public List<Movie> getMovies() {

		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("곡성"));
		movies.add(new Movie("비밀은 없다"));
		movies.add(new Movie("동방불패"));

		return movies;

	}
}

