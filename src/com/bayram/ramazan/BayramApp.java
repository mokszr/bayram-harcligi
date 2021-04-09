package com.bayram.ramazan;

import com.bayram.ramazan.model.AtomicDede;
import com.bayram.ramazan.model.Dede;
import com.bayram.ramazan.model.SemaphoreDede;
import com.bayram.ramazan.model.SynchronizedDede;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class BayramApp {

	public static void main(String[] args) {
		
		System.out.println("Dedeler harcliklari dagittiginde ellerinde hic para kalmamasi lazim!");
		System.out.println("--------");
		System.out.println("Basliyoruz");
		System.out.println("--------");
		
		Dede dede = new Dede();
		
		AtomicDede atomizDede = new AtomicDede();
		
		SynchronizedDede synchronizedDede = new SynchronizedDede();
		
		SemaphoreDede semaphoreDede = new SemaphoreDede();
		
		BayramKutlama bayramKutlama = new BayramKutlama();
		
		long start = System.currentTimeMillis();
		
		bayramKutlama.bayraminizKutluOlsun(dede);
		
		System.out.println("Dede hesaplama suresi " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
	
		start = System.currentTimeMillis();
		
		bayramKutlama.bayraminizKutluOlsun(atomizDede);
		
		System.out.println("AtomicDede hesaplama suresi " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
		
		start = System.currentTimeMillis();
		
		bayramKutlama.bayraminizKutluOlsun(synchronizedDede);
		
		System.out.println("SynchronizedDede hesaplama suresi " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
		
		start = System.currentTimeMillis();
		
		bayramKutlama.bayraminizKutluOlsun(semaphoreDede);
		
		System.out.println("SemaphoreDede hesaplama suresi " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
	}
}
