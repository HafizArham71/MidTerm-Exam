public class Workshop{



	// Attributes

	private Shelf[] shelf;



	// Constructors

	public Workshop(int length, int[] rowLengths, Part part){

		this.shelf = new Shelf[length];

		for(int i=0; i<shelf.length; i++){

			shelf[i] = new Shelf(rowLengths, part);

		}

	}



	// Methods

	

}