package com.bayram.ramazan.model;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class Torun {

	private Integer alinacakHarclik;
	
	private boolean harclikAlabildim;

	public Torun(Integer alinacakHarclik) {
		this.alinacakHarclik = alinacakHarclik;
	}

	public void dedeninEliniOp(IDede dede) {

		harclikAlabildim = dede.harclikVer(alinacakHarclik);
	}
	
	public boolean isHarclikAlabildim() {
		return harclikAlabildim;
	}
}
