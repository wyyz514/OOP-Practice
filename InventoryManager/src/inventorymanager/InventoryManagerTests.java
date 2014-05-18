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
		InventoryManager.saveItem(item, inventory);
		assertTrue(inventory.getInventorySize() == 0);
	}

}
