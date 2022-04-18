package exercise7;

public abstract class Medicine {
	int price ;
	String date;
	public static void getDetails(int price, String date)
	{
		System.out.println("Price : "+price);
		System.out.println("Date : "+date);
	}
	 abstract void displayLabel();
	

}
