package Exercises_from_6_4_2022_to;

import java.util.Scanner;

class Account
{	int amount;
	int sum=0;
	String Name;
	String BankName;
	public Account()
	{
		
	}
	public Account(int amount,String Name, String BankName)
	{
		this.amount = amount;
		this.Name = Name;
		this.BankName = BankName;
		
	}
	
	public void Deposit()
	{
		sum += amount;
	}
	public void Withdraw(int wAmount)
	{
		sum -= wAmount;
	}
	public int Display()
	{	
		System.out.println("Name :"+this.Name +" BankName: "+this.BankName);
		return sum;
	}
}
public class AccountTest1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Deposit amount: ");
		int dAmount = sc.nextInt();
		Account a = new Account(dAmount,"Joe","ICICI");
		
		System.out.println("Enter the Withdraw amount: ");
		int wAmount = sc.nextInt(); 
		a.Deposit();
		a.Withdraw(wAmount);
		System.out.println("Remaining Amount : "+ a.Display());
		sc.close();
	}

}
