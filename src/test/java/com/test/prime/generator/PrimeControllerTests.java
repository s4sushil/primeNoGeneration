package com.test.prime.generator;

import com.test.prime.Application;
import com.test.prime.model.PrimeResult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0", "management.port=0"})
public class PrimeControllerTests {

	@Value("${local.server.port}")
	private int port;


	//@Test
	public void testController() {

		RestTemplate rest = new TestRestTemplate();

		ResponseEntity<PrimeResult> entity = rest.getForEntity("http://localhost:" + port + "/primes/2", PrimeResult.class);
		assertEquals(org.springframework.http.HttpStatus.OK, entity.getStatusCode());

		PrimeResult primeResult = entity.getBody();

		assertEquals(Integer.valueOf(2), primeResult.getInitial());

		assertEquals(Arrays.asList(1), primeResult.getPrimes());
	}


	@Test
	public void testControllerForPrimeSequence() {

		RestTemplate rest = new TestRestTemplate();
		ResponseEntity<PrimeResult> entity = rest.getForEntity("http://localhost:" + port + "/primesequence/5", PrimeResult.class);
		assertEquals(org.springframework.http.HttpStatus.OK, entity.getStatusCode());

		PrimeResult primeResult = entity.getBody();

		assertEquals(Integer.valueOf(5), primeResult.getInitial());

		assertEquals(Arrays.asList(0,1,2,3,5), primeResult.getPrimes());
	}
	
}
