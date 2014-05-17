package inventorymanager;


public class InventoryManager {
Inventory inv;
Item item;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager im = new InventoryManager();
		im.inv = new Inventory();
		im.item = null;
		im.inv.saveItem(im.item);	
	}
}
