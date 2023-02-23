

public class Pile {
	private int[] pile;
	private int sommet;
	
	public Pile(int i) {
		this.pile= new int[i];
		this.sommet=0;
		
	}
	/**
	 * Teste si la pile est vide
	 * @return true si la pile est vide, false sinon
	 */
	public boolean est_vide() {
		if(this.sommet<1) {
			return true;
		}
		return false;
	}

	/**
	 * Empile un entier
	 * @param i IN : entier à empiler
	 */
	public void empiler(int i) {
		this.sommet ++;
		this.pile[sommet] = i;
		
	}

	/**
	 * Dépile un entier
	 * @return l'entier dépilé
	 * @throws Exception si la pile est vide
	 */
	public int depiler() throws Exception{
		if (this.est_vide()) {
			throw new Exception("Pile vide!");
		}
		sommet--;
		return this.pile[sommet+1];
	}
	
	/**
	 * Retourne le sommet de la pile
	 * @return l'entier au sommet de la pile
	 */
	public int sommet() {
		return this.pile[sommet];
	}
	
	/**
	 * Vide la pile
	 */
	public void vider() {
		this.sommet=0;
	}
}