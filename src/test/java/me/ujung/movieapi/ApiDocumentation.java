package me.ujung.movieapi;

import me.ujung.movieapi.web.MovieController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author 권석민
 */
@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureRestDocs("target/generated-snippets")
public class ApiDocumentation {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getMoviesTest() throws Exception {

		this.mvc.perform(get("/movies"))
				.andExpect(status().isOk())
				.andDo(document("movies"));

	}

}
