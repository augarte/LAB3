package org.dea.packlaborategi3;

import java.util.*;

public class Pelikula {
	
	private String izenburua;
	private ArrayList<Aktore> listaA;
	
	public Pelikula(String pIzenburua){
		izenburua = pIzenburua;
	}
	
	public String getIzenburua(){
		return izenburua;
	}
	
	public void geituAktore(Aktore pAktor){
		listaA.add(pAktor);
	}
}
