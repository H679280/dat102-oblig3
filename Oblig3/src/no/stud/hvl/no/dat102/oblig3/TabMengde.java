package no.stud.hvl.no.dat102.oblig3;

import java.util.Arrays;
import java.util.EmptyStackException;



public final class TabellMengde<T> implements MengdeADT<T> {

	private static final int DEFAULT_KAPASITET = 10; 
	
	private T[] tab; 
	private int antall; 
	
	
	public TabellMengde() {
		this(DEFAULT_KAPASITET);
	}
	
	@SuppressWarnings("unchecked")
	public TabellMengde(int kapasitet) {
		tab = (T[]) new Object[kapasitet];
		antall = 0;
	}

	@Override
	public boolean erTom() {
		return antall == 0;
	}

	@Override
	public boolean inneholder(T element) {
		for(int i = 0; i<antall;i++) {
			if(tab[i] == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean erDelmengdeAv(MengdeADT<T> annenMengde) {
		boolean svar = true;
		int i = 0;
		do {
			svar = annenMengde.inneholder(tab[i]);
			i++;
		}
		while(svar);
	
		return svar; 
	}

	@Override
	public boolean erLik(MengdeADT<T> annenMengde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean erDisjunkt(MengdeADT<T> annenMengde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MengdeADT<T> snitt(MengdeADT<T> annenMengde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MengdeADT<T> union(MengdeADT<T> annenMengde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MengdeADT<T> minus(MengdeADT<T> annenMengde) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public void leggTil(T element) {
		tab[antall] = element;
		antall++;
		
		
	}

	@Override
	public void leggTilAlleFra(MengdeADT<T> annenMengde) {
		int lengde = annenMengde.antallElementer();
		for(int i = 0; i<lengde;i++) {
			
		}
		
	}

	@Override
	public T fjern(T element) {
		if(erTom()) {
			return null;
		}
		element = tab[antall-1];
		tab[antall-1] = null;
		antall--;
		return element;
	}

	@Override
	public T[] tilTabell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antallElementer() {
		return antall;
	}
}