
public class main {
	/**
	 * Programme main
	 * @param args
	 */
	public static void main(String[] args) {
		
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element;
		try {
			element = maPile.depiler();
			if (!maPile.est_vide()) System.out.println("NOK");
	        if (element != 5) System.out.println("NOK");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("executé");
        
    }
}
