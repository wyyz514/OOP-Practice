package inventorymanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryManagerTests {

	@Test
	public void nullValuesTest()
	{
		Item testItem = null;
		Inventory testInventory = new Inventory();
		int capacityBefore = Inventory.getInventorySize(); //save current inventory size to see if it changes after null value is inserted
		testInventory.saveItem(testItem);
		//test to see if the capacity changes after addition of a null value. It should not
		assertTrue(capacityBefore == Inventory.getInventorySize());
	}

}
