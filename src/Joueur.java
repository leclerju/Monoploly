import java.util.*;

public class Joueur {

	Carreau positionCourante;
	Collection<ProprieteAConstruire> proprietes;
	Collection<Gare> gares;
	Collection<Compagnie> compagnies;
	private String nomJoueur;
	private int cash = 1500;

	/**
	 * 
	 * @param I
	 */
	public void payerLoyer(int I) {
		// TODO - implement Joueur.payerLoyer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param I
	 */
	public void recevoirLoyer(int I) {
		// TODO - implement Joueur.recevoirLoyer
		throw new UnsupportedOperationException();
	}

	public int getNbGares() {
		// TODO - implement Joueur.getNbGares
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		// TODO - implement Joueur.getNom
		throw new UnsupportedOperationException();
	}

	public int getCash() {
		return this.cash;
	}

	/**
	 * 
	 * @param prix
	 */
	public void payerPropriete(int prix) {
		// TODO - implement Joueur.payerPropriete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void addGare(Gare g) {
		// TODO - implement Joueur.addGare
		throw new UnsupportedOperationException();
	}

	public Carreau getPositionCourante() {
		return this.positionCourante;
	}

	/**
	 * 
	 * @param nouvelPosition
	 */
	public void setPosition(Carreau nouvelPosition) {
		// TODO - implement Joueur.setPosition
		throw new UnsupportedOperationException();
	}

}