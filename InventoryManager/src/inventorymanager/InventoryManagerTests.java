package inventorymanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryManagerTests {

	@Test
	public void nullValuesTest()
	{
		InventoryManager.createInventory();
		Inventory inventory = InventoryManager.getInventory();
		Item item = null;
		int inventorySize = inventory.getInventorySize(); //holds size of inventory before adding new item
		InventoryManager.saveItem(item, inventory);
		assertTrue(inventory.getInventorySize() == inventorySize);
	}
	
	//@Test
	//public void 
}
