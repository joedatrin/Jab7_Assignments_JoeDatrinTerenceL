package exercise7;

public class TestMedicine {

	public static void main(String[] args)
	{
		Medicine m[] = new Medicine[5];
		double i = Math.random()*4;
		
		int j = (int)i;
		System.out.println(j);
		
		switch(j)
		{
		case 1:
			
			m[1] = new Tablet();
			Medicine.getDetails(5,"12/06/2022");
			m[1].displayLabel();
			break;
			
		case 2:
					
					m[2] = new Syrup();
					Medicine.getDetails(5,"12/06/2022");
					m[2].displayLabel();
					break;

		case 3:
			
			m[3] = new Ointment();
			Medicine.getDetails(5,"12/06/2022");
			m[3].displayLabel();
			break;

		default:
			System.out.println("Invalid Choice");
			
			
		}
	}
}
