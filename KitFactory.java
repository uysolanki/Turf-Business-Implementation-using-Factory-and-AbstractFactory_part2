package day12.hotfut;

public class KitFactory implements AbstractFactory{
		KitServices s;
		
		public KitServices getKit(String serviceName)
		{
			switch(serviceName)
			{
			case "cricketkit":
				s=new CricketKit();
				break;
			case "footballkit":
				s=new FootballKit();
				break;
			case "tenniskit":
				s=new TennisKit();
				break;
			}
			return s;
		}

		@Override
		public Court getCourt(String sportName) {
			return null;
		}
}
