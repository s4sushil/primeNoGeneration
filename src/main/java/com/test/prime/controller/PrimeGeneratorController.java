package com.test.prime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.prime.model.PrimeResult;
import com.test.prime.service.PrimeNumberService;

@RestController
public class PrimeGeneratorController {

	@Autowired
	private PrimeNumberService primeGenerator;

	@RequestMapping(value = "/primes/{initial}", produces = { "application/xml",
			"application/json" }, consumes = MediaType.ALL_VALUE)
	public PrimeResult primes(@PathVariable Integer initial) {
		List<Integer> primes = primeGenerator.generatePrimeNumbers(initial);
		return new PrimeResult(initial, primes);
	}

	@RequestMapping(value = "/primesequence/{maxCount}", produces = { "application/xml",
			"application/json" }, consumes = MediaType.ALL_VALUE)
	public PrimeResult primeSequence(@PathVariable Integer maxCount) {
		List<Integer> primes = primeGenerator.primeSequence(maxCount);
		return new PrimeResult(maxCount, primes);
	}

}
