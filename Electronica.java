/**
 * @Author Marc Valls
 * @since 21/02/2022
 * @version 1.0
 */
package com.company;

/**
 * Clase alimentació guarda totes les funcions per tractar amb productes Electronics.
 */
public class Electronica extends Producte {
	private int dies_garantia;

	/**
	 * Funció per introduir l'informació del producte Electronic.
	 * @param preu entra un valor de tipus float per indicar el preu del producte.
	 * @param nom entra un valor de tipus String per indicar el nom del producte.
	 * @param codi entra un valor de tipus String per indicar el codi del producte.
	 * @param diesg entra un valor de tipus int per indicar els dies de garantia del producte.
	 */
	public Electronica(float preu, String nom, String codi, int diesg) {
		super(preu, nom, codi);
		dies_garantia = diesg;
	}

	/**
	 * funcio per obtenir el preu del producte.
	 * @return retorna un valor de tipus float que indiquen el preu del producte.
	 */
	@Override
	public float getPreu() {
		float preu = super.getPreu();
		return (float) (preu + preu*(dies_garantia/365)*0.1);
	}

	/**
	 * funció per mostrar el nom del producte més el seu preu
	 * @return retorna un valor de tipus string amb el nom del producte i el preu.
	 */

	@Override
	public String toString() {
		return getNom() + "," + getPreu();
	}
	
	
	

}
