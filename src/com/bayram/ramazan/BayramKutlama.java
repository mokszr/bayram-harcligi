package com.bayram.ramazan;

import java.util.ArrayList;
import java.util.List;

import com.bayram.ramazan.model.IDede;
import com.bayram.ramazan.model.Torun;
/**
 * 
 * @see https://muratoksuzer.com/
 *
 */
public class BayramKutlama {
	
	public void bayraminizKutluOlsun(IDede dede) {
 		
		List<ElOpmeHarclikAlmaThread> elOpmeThreadleri = new ArrayList<>();
		
		dede.setToplamDagitilacakHarclik(100000);
		
		int torunSayisi = 1000;
				
		int harclikMiktari = 100;
		
		for(int i = 0; i < torunSayisi; i++) {
			
			Torun torun = new Torun(harclikMiktari);
			
			ElOpmeHarclikAlmaThread elOpmeThread = new ElOpmeHarclikAlmaThread(dede, torun);
			
			elOpmeThreadleri.add(elOpmeThread);
		}
		
		
		for(int i = 0; i < torunSayisi; i++) {
		
			elOpmeThreadleri.get(i).start();
		}
		
		
		// Tum threadlerin bitmesini bekle
		for(int i = 0; i < torunSayisi; i++) {
			
			try {
				elOpmeThreadleri.get(i).join();
				
				if(!elOpmeThreadleri.get(i).getTorun().isHarclikAlabildim()) {
					
					System.out.println( (i + 1) + ". Torun harcligini tam alamamis!!");
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(dede.getClass().getSimpleName() + " Bitirdi. Elinde kalan miktar " + dede.getKalanHarclik()); 
		if(dede.getKalanHarclik() > 0) {
			
			System.out.println(dede.getClass().getSimpleName() + " BASARISIZ!!!");
			
		} else {
			
			System.out.println("Dedenin elinde hic para kalmadi. Berhudar olsunlar!");
		}
	}
}
