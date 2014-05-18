package inventorymanager;

public class Inventory {
	final int MAX_INVENTORY_SIZE = 100;
	private Item[]items; //has many relationship
	private static int inventorySize = 0;
	public Inventory()
	{
		items = new Item[MAX_INVENTORY_SIZE];
	}
	
	public void add(Item item)
	{
		items[inventorySize] = item;
		inventorySize++;
	}
	
	public int getInventorySize()
	{
		return inventorySize;
	}
	
	public Item[] getItems()
	{
		return items;
	}
}
