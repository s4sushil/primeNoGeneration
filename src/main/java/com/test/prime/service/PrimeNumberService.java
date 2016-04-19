package com.test.prime.service;

import java.util.List;

public interface PrimeNumberService {

	/**
	 * Generates the prime number series up to initial value.
	 * 
	 * @param initialPrime
	 * @return List of Prime numbers.
	 */
	List<Integer> generatePrimeNumbers(Integer initialPrime);
	
	/**
	 * Generates the prime number sequences till max count specified.
	 * 
	 * @param max count of value
	 * @return List of Prime numbers.
	 */
	List<Integer> primeSequence(int max);
	
}
