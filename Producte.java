/**
 * @Author Marc Valls
 * @since 21/02/2022
 * @version 1.0
 */
package com.company;

/**
 * Clase alimentació guarda totes les funcions per tractar amb productes.
 */
public abstract class Producte {
	private float preu;
	private String nom;
	private String codibarres;

	/**
	 * funció per obtenir informació del productes.
	 * @param preu entra un valor de tipus float per indicar el preu del producte.
	 * @param nom entra un valor de tipus String per indicar el nom del producte.
	 * @param codi entra un valor de tipus String per indicar el codi del producte.
	 */
	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}

	/**
	 * funció per obtenir el preu del producte
	 * @return retorna un valor de tipus float per indicar el preu del producte.
	 */
	public float getPreu() {
		return preu;
	}

	/**
	 * funció per mostrar el valor del preu.
	 * @param preu entra el valor del preu.
	 */
	public void setPreu(float preu) {
		this.preu = preu;
	}

	/**
	 * funció que serveix per obtenir el nom del producte
	 * @return retorna un valor de tipus String amb el nom del producte.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * funció que serveix per mostrar el nom del producte.
	 * @param nom entra el nom del producte.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodibarres() {
		return codibarres;
	}
	public void setCodibarres(String codibarres) {
		this.codibarres = codibarres;
	}

	/**
	 * funcio que serveix per comparar objectes i saber si són iguals.
	 * @param obj entra un objecte.
	 * @return retorna un valor de tipus boolean true o false.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean son_iguals;
		if(obj == null) {
			son_iguals = false;
			return son_iguals;
		}
		else {
			Producte p = (Producte) obj;
			if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) {
				son_iguals = true;
				return son_iguals;
			}
			else {
				son_iguals = false;
				return son_iguals;
			}
		}
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int hashCode() {
		int codi = codibarres.hashCode();
		return codi;
	}
	
	
	

}
