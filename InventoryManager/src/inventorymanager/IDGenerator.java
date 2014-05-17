package inventorymanager;

public class IDGenerator {

	private int generateID()
	{
		long id = System.currentTimeMillis();
		return (int)id;
	}
	

}
