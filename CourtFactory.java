package day12.hotfut;

public class CourtFactory implements AbstractFactory{

		Court c;
		
		public Court getCourt(String sportName)
		{
			switch(sportName)
			{
			case "Cricket" : 
				c=new CricketCourt();
				break;
			case "Football" : 
				c=new FootballCourt();
				break;
			case "Tennis" : 
				c=new TennisCourt();
				break;
				
			}
			return c;
		}

		

		@Override
		public KitServices getKit(String serviceName) {
			// TODO Auto-generated method stub
			return null;
		}
}
