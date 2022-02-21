/**
 * @Author Marc Valls
 * @since 21/02/2022
 * @version 1.0
 */
package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Clase alimentació guarda totes les funcions per tractar amb productes d'alimentació.
 */
public class Alimentacio extends Producte {
	
	private LocalDate d;

	/**
	 * Funció per introduir l'informació dels aliments.
	 * @param preu entra un valor de tipus float per indicar el preu del producte.
	 * @param nom entra un valor de tipus String per indicar el nom del producte.
	 * @param codi entra un valor de tipus String per indicar el codi del producte.
	 * @param datac entra un valor de tipus data per indicar la data de caducitat del producte.
	 */
	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		d = datac; //obtenim la data de caducitat
	}

	/**
	 funció per retorna el preu del producte.
	 * @return retorna el preu del producte.
	 */
	@Override


	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(d,LocalDate.now());
		preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		//System.out.println("preu:" + preu);
		return preu;
	}

	/**
	 *  funció que serveix per retornar el nom del producte més el preu del producte.
	 * @return retorna el nom del producte més el seu preu.
	 */
	@Override

	public String toString() {
		return new String(getNom() + " " + getPreu());
	}
	


}
