package day12.hotfut;

public class FactoryManager {
		static AbstractFactory abstractFactory;
		static Court court;
		static KitServices kitservice;
	public static Court getCourt(int choice) {
		abstractFactory=new CourtFactory();
		switch(choice)
		{
				
		case 1 : court=abstractFactory.getCourt("Cricket"); 
				 break;
		case 2 : court=abstractFactory.getCourt("Football");
				 break;
		case 3 : court=abstractFactory.getCourt("Tennis");
				 break;
		case 4 : System.exit(0);
		}
		return court;
	}
	
	public static KitServices getServices(int choice) {
		abstractFactory=new KitFactory();
		switch(choice)
		{
		case 1 : kitservice=abstractFactory.getKit("cricketkit"); 
				 break;
		case 2 : kitservice=abstractFactory.getKit("footballkit"); 
				 break;
		case 3 : kitservice=abstractFactory.getKit("tenniskit"); 
				 break;
		case 4 : System.exit(0);
		}
		return kitservice;
	}

}
