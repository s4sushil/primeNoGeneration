package com.test.prime.generator;


import org.junit.Test;

import com.test.prime.service.PrimeNumberServiceImpl;
import com.test.prime.service.PrimeNumberService;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrimeNumberServiceTest {

	@Test
	public void testPrimeGeneration() {
		PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();

		assertEquals(Arrays.asList(), primeNumberService.generatePrimeNumbers(0));
		assertEquals(Arrays.asList(1), primeNumberService.generatePrimeNumbers(2));
		assertEquals(Arrays.asList(1,2,3,5,7), primeNumberService.generatePrimeNumbers(10));
	}
	
	@Test
	public void testPrimeGenerationSequence() {
		PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();

		assertEquals(Arrays.asList(), primeNumberService.primeSequence(0));		
		assertEquals(Arrays.asList(0,1), primeNumberService.primeSequence(2));		
		assertEquals(Arrays.asList(0,1,2,3,5,7,11), primeNumberService.primeSequence(7));
		
	}
	
}
