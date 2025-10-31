public class Shelf{



	// Attributes

	private Bin[][] rows;
	private int capacity;
	private int occupied;

	private String sheldId;



	// Constructors

	public Shelf(int[] rowLengths, Part part){

		this.rows = new Bin[rowLengths.length][];

		
		
		// Defining Length

		for(int i=0; i<rows.length; i++){

			rows[i] = new Bin[rowLengths[i]];

		}
		
		
		// Initializing Array
		
		for(int j=0; j<rows.length; j++){
			
			for(int k=0; k<rows[j].length; k++){
				
				rows[j][k] = new Bin(j+1, k+1, part);
	
			}
			
		}

	}


		

	// Methods

	@Override
	public String toString(){

		StringBuilder str = new StringBuilder();

		for(int i=0; i<rows.length; i++){

			for(int j=0; j<rows[i].length; j++){

				str.append(rows[i][j]);
			}

		}

		return str.toString();

	}

}