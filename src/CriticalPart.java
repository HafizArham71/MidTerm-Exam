public class CriticalPart extends Part{



	// Attributes

	private int urgency;  // 1 - 5



	
	// Constructor

	public CriticalPart(String assetCode, PartType type, int urgency){

		super(assetCode, type);

		this.urgency = urgency;

	}



	// Methods

	public int getUrgency(){

		return urgency;

	}

	public void setUrgency(){

		this.urgency = urgency;

	}

}