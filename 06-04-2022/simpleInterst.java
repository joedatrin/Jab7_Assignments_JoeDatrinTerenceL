package Exercises_from_6_4_2022_to;

import java.util.Scanner;

public class simpleInterst {
	public static void main(String[] args)
	{
		int principle,time ;
		double rate,SI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle, Time and Rate in Sequential Order");
		principle = sc.nextInt();
		time = sc.nextInt();
		rate = sc.nextDouble();
		
		SI = (principle*rate*time)/100;
		System.out.println(SI);
		sc.close();
		
	}

}
