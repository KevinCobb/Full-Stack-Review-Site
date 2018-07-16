package org.wecancodeit.FullStackReviewSite;

	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

	import javax.annotation.Resource;

	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
	import org.springframework.boot.test.web.client.TestRestTemplate;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.test.context.junit4.SpringRunner;

	@RunWith(SpringRunner.class)
	@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

	public class ApiControllerTest {
		@Resource
		TestRestTemplate restTemplate;
		
		@Test
		public void canary() {
			ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
			HttpStatus status = response.getStatusCode();
			assertThat(status, is(HttpStatus.OK));
		}
		
		@Test
		public void shouldBeOkForReviewSite() {
			ResponseEntity<String> response = restTemplate.getForEntity("/api/Review", String.class);
			HttpStatus status = response.getStatusCode();
			assertThat(status, is(HttpStatus.OK));
		}
		
		@Test
		public void shouldBeOkForTagsPage() {
			ResponseEntity<String> response = restTemplate.getForEntity("/api/Tag", String.class);
			HttpStatus status = response.getStatusCode();
			assertThat(status, is(HttpStatus.OK));
		}
	}

