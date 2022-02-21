/**
 * @Author Marc Valls
 * @since 21/02/2022
 * @version 1.0
 */
package com.company;

/**
 * Clase alimentació guarda totes les funcions per tractar amb productes Textils.
 */
public class Textil extends Producte {
	private String composicio;
	private String codificacio;

	/**
	 * Funció per introduir l'informació del producte textil.
	 * @param preu entra un valor de tipus float per indicar el preu del producte.
	 * @param nom entra un valor de tipus String per indicar el nom del producte.
	 * @param codi entra un valor de tipus String per indicar el codi del producte.
	 * @param compo entra un valor de tipus String per indicar la composició del producte.
	 */
	public Textil(float preu, String nom, String codi, String compo) {
		super(preu, nom, codi);
		composicio = compo;
		codificacio = preu + codi;
	}

	/**
	 * funcio per obtenir el valor de composició.
	 * @return retorna un valor de tipus String el valor de composició.
	 */
	public String getComposicio() {
		return composicio;
	}

	/**
	 * funcio per mostrar el valor de composició.
	 * @param composicio entra el valor de composició
	 */
	public void setComposicio(String composicio) {
		this.composicio = composicio;
	}

	/**
	 * funció per mostrar el nom del producte més el seu preu
	 * @return retorna un valor de tipus string amb el nom del producte i el preu.
	 */
	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}

	//aquesta funció no s'està usant
	public String getCode (){
		return codificacio;
	}

}
