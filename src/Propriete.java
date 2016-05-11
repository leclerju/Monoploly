public abstract class Propriete extends Carreau {

	Joueur proprietaire;
	private int prix;
	private int loyer;

	protected int calculLoyer() {
		// TODO - implement Propriete.calculLoyer
		throw new UnsupportedOperationException();
	}

	protected Joueur getProprietaire() {
		return this.proprietaire;
	}

	/**
	 * 
	 * @param j
	 */
	public void acheterProprietaire(Joueur j) {
		// TODO - implement Propriete.acheterProprietaire
		throw new UnsupportedOperationException();
	}

	public String getNomProprio() {
		// TODO - implement Propriete.getNomProprio
		throw new UnsupportedOperationException();
	}

	protected int getPrix() {
		return this.prix;
	}

	public int getLoyer() {
		return this.loyer;
	}

	/**
	 * 
	 * @param j
	 */
	protected void setProprio(Joueur j) {
		// TODO - implement Propriete.setProprio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param j
	 */
	public void action(Joueur j) {
		// TODO - implement Propriete.action
		throw new UnsupportedOperationException();
	}

}