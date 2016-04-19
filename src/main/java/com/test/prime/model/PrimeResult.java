package com.test.prime.model;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class PrimeResult {
	private Integer initial;
	private List<Integer> primes;

	public PrimeResult() {
	}

	public PrimeResult(Integer initial, List<Integer> primes) {
		this.initial = initial;
		this.primes = primes;
	}

	public Integer getInitial() {
		return initial;
	}

	public void setInitial(Integer initial) {
		this.initial = initial;
	}

	public List<Integer> getPrimes() {
		return primes;
	}

	public void setPrimes(List<Integer> primes) {
		this.primes = primes;
	}
}
