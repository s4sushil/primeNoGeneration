package com.test.prime.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumberServiceImpl implements PrimeNumberService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.test.prime.service.PrimeNumberService#generatePrimeNumbers(java.lang.
	 * Integer)
	 */
	public List<Integer> generatePrimeNumbers(Integer initialPrime) {
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i < initialPrime; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				result.add(i);
			}
		}

		return result;
	}

	public List<Integer> primeSequence(int max) {
		final List<Integer> primes = new ArrayList<>(max);
		IntStream.iterate(0, i -> i + 1).filter(x -> isPrime(x)).limit(max).forEach(primes::add);
		return primes;
	}

	public static boolean isPrime(int x) {
		return LongStream.rangeClosed(2, (int) (Math.sqrt(x))).allMatch(n -> x % n != 0);
	}
}
