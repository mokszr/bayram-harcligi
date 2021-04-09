package com.bayram.ramazan.model;

import java.util.concurrent.Semaphore;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class SemaphoreDede implements IDede {

	private Integer toplamDagitilacakHarclik;
	
	private Semaphore mutex = new Semaphore(1);

	@Override
	public boolean harclikVer(Integer alinacakHarclik) {
		
		try {
			mutex.acquire();
			
			toplamDagitilacakHarclik = toplamDagitilacakHarclik - alinacakHarclik;
			
			mutex.release();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		return toplamDagitilacakHarclik >= 0;
	}
	
	@Override
	public Integer getKalanHarclik() {
		
		return toplamDagitilacakHarclik;
	}
	
	@Override
	public void setToplamDagitilacakHarclik(Integer toplamDagitilacakHarclik) {
		this.toplamDagitilacakHarclik = toplamDagitilacakHarclik;
	}
}
