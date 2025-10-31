public class Part{



	// Attributes

	protected String assetCode;  // SIG-2025-000123
	protected PartType type;
	protected PartStatus status;



	// Constructors
	
	public Part(String assetCode, PartType type){

		this.assetCode = assetCode;
		this.type = type;

		this.status = PartStatus.IN_SERVICE;

	}



	// Methods

	public PartStatus getStatus(){

		return status;

	}

	public void setStatus(PartStatus status){

		this.status = status;

	}

	public PartType getType(){

		return type;

	}

	public void setType(PartType partType){

		this.type = partType;

	}

	public boolean store(){

		if(status == PartStatus.IN_SERVICE){

			status = PartStatus.IN_LOCKER;
			
			return true;
		
		}

		return false;

	}

	public boolean remove(){

		if(status == PartStatus.IN_LOCKER){

			status = PartStatus.IN_SERVICE;
			
			return true;
		
		}

		return false;

	}

	

	@Override
	public String toString(){

		String str = String.format("%s | %s | %s", assetCode, type, status);

		return str;

	}
	

}