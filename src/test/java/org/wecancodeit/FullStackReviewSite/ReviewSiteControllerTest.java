package org.wecancodeit.FullStackReviewSite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewSiteController.class)

	public class ReviewSiteControllerTest {
	

			@Resource
			MockMvc mvc;
			@MockBean
			ReviewRepository repo;
			@Mock
			Review review;

			ReviewSiteController controller = new ReviewSiteController();

			@Test
			public void shouldReturnReviews() throws Exception {
				mvc.perform(get("/reviews"))
					.andExpect(view()
						.name(is(equalTo("reviews"))));
			}
			@Test
			public void shouldReturn2xxSuccessReviews() throws Exception{
				mvc.perform(get("/reviews"))
					.andExpect(status()
							.is2xxSuccessful());
				
			}
			@Test
			public void shouldReturnAllReviews() throws Exception {
				mvc.perform(get("/reviews"))
					.andExpect(model()
					.attribute("reviews", repo.findAll()));
			}
			@Test
				public void geteviewShouldReturnReviewView() throws Exception {
					mvc.perform(get("/reviews/")).andExpect(view().name(is(equalTo("review"))));
				}
			@Test
				public void getReviewShouldBeOk() throws Exception {
					mvc.perform(get("/reviews/")).andExpect(status().is2xxSuccessful());
				}
			@Test
				public void getReviewShouldReturnOneReview() throws Exception {
					mvc.perform(get("/reviews/")).andExpect(model().attribute("review", is(repo.findOne(2L))));
				}
			
		}
		
		
	