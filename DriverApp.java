package day12.hotfut;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Name");
		String customerName=sc.next();
		Court court=null;
		KitServices service=null;
		System.out.println("***Choose Court***");
		System.out.println("1. Cricket Court" );
		System.out.println("2. Football Court" );
		System.out.println("3. Tennis Court" );
		System.out.println("4. Exit" );
		System.out.println("Please choose your Court");
		int courtChoice=sc.nextInt();
		
		court=FactoryManager.getCourt(courtChoice);
		
		System.out.println("***Choose Court***");
		System.out.println("1. Cricket Kit" );
		System.out.println("2. Football Kit" );
		System.out.println("3. Tennis Kit" );
		System.out.println("4. Exit" );
		System.out.println("Please choose your Service");
		int serviceChoice=sc.nextInt();
		
		service=FactoryManager.getServices(serviceChoice);
		System.out.println("Court Cost : "+court.getCourtPrice());
		System.out.println("Service Cost : "+service.getServiceCost());
		System.out.println("Total Cost : "+ (court.getCourtPrice()+service.getServiceCost()));
		

	}

}
