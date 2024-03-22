package day12.hotfut;

public interface AbstractFactory {
	Court getCourt(String sportName);
	KitServices getKit(String serviceName);
}
