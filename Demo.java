public class Demo{


	public static void main(String[] args){

		//Part p1 = new Part("SIG-2025-000123", PartType.REGULAR);

		//System.out.println(p1);

		
		//b1.compactLayout();

		//Bin b1 = new Bin(2, 3, new Part("SIG-2025-000123", PartType.CRITICAL));

		//System.out.println(b1);

		Shelf s1 = new Shelf(new int[]{1, 3, 5, 7}, new Part("SIG-2025-00022", PartType.REGULAR));

		System.out.println(s1);

	}

}