public class Bin{

	

	// Attributes

	private String id;
	private int row1;
	private int bin1;
	private Part part;



	// Constructors

	public Bin(int row1, int bin1, Part part){

		this.id = String.format("S%d-B%2d", row1, bin1);
		this.part = part;

	}



	// Methods

	public boolean store(){

		if(part.getStatus() == PartStatus.IN_SERVICE){

			part.setStatus(PartStatus.IN_LOCKER);

			return true;
			
		}

		return false;

	}

	public Part remove(){

		if(part.getStatus() == PartStatus.IN_LOCKER){

			part.setStatus(PartStatus.IN_SERVICE);

			return part;
			
		}

		return null;

	}


	public void compactLayout(){

		System.out.println(part.getType() == PartType.REGULAR? "[R]" : "[C]");

	}

	@Override
	public String toString(){

		return part.getType() == PartType.REGULAR? "[R]" : "[C]";

	}

}