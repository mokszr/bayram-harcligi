package com.bayram.ramazan.model;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class Dede implements IDede {

	private Integer toplamDagitilacakHarclik;

	@Override
	public boolean harclikVer(Integer alinacakHarclik) {
	 
		toplamDagitilacakHarclik = toplamDagitilacakHarclik - alinacakHarclik;
		
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
