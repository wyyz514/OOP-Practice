package inventorymanager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
			if(checkName(item.getName()) == false)
				inventory.add(item);
			else
				{
					System.out.println("Invalid name");
					return;
				}
				
		}
		else
		{
			System.out.println("Item is null");
		}
	}
	
	public static Inventory getInventory()
	{
		return inventory;
	}
	
	private static boolean checkName(String name)
	{
		Pattern pattern = Pattern.compile("\\s{2,}");
		Matcher matcher = pattern.matcher(name);
		if(matcher.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
