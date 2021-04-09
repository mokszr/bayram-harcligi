package com.bayram.ramazan.model;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class AtomicDede implements IDede {

	private AtomicInteger toplamDagitilacakHarclik;

	@Override
	public boolean harclikVer(Integer alinacakHarclik) {
		 
		toplamDagitilacakHarclik.addAndGet(-alinacakHarclik);
		
		return toplamDagitilacakHarclik.get() >= 0;
	}
	
	@Override
	public Integer getKalanHarclik() {
		
		return toplamDagitilacakHarclik.get();
	}
	
	@Override
	public void setToplamDagitilacakHarclik(Integer toplamDagitilacakHarclik) {
		this.toplamDagitilacakHarclik = new AtomicInteger(toplamDagitilacakHarclik);
	}

}
