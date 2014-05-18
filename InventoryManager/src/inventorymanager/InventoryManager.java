package inventorymanager;


public class InventoryManager {
	
	private static Inventory inventory;
	
	public static void createInventory()
	{
		inventory = new Inventory();
	}
	
	public static void saveItem(Item item, Inventory inventory)
	{
		if(item != null)
		{
			inventory.add(item);
		}
	}
	
	public static Inventory getInventory()
	{
		return inventory;
	}
}
