package inventorymanager;

public class Inventory {
	final int MAX_INVENTORY_SIZE = 100;
	private Item[]items; //has many relationship
	private static int inventorySize;
	
	public Inventory()
	{
		items = new Item[MAX_INVENTORY_SIZE];
		inventorySize = 0;
	}
	
	public void saveItem(Item item)
	{
		if(inventorySize == 100) //if inventory is at capacity, do not save item
		{
			System.out.println("Inventory is already full. Cannot add new items");
			return;
		}
		else
		{
			if(item != null)
			{
				items[inventorySize] = item;
				inventorySize++;
			}
		}
	}
	
	public static int getInventorySize()
	{
		return inventorySize;
	}
	
	public Item[] getInventory()
	{
		return items;
	}
}
