package com.bayram.ramazan;

import com.bayram.ramazan.model.IDede;
import com.bayram.ramazan.model.Torun;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class ElOpmeHarclikAlmaThread  extends Thread {

	private IDede dede;
	
	private Torun torun;
	
	public ElOpmeHarclikAlmaThread(IDede dede, Torun torun) {
		this.dede = dede;
		this.torun = torun;
	}

	@Override
	public void run() {

		torun.dedeninEliniOp(dede);
	}
	
	public Torun getTorun() {
		return torun;
	}
}
