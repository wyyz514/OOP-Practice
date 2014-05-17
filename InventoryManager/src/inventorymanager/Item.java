package inventorymanager;

public class Item {
	private String name = "";
	private int numberInStock = 0;
	private double price = 0.0;
	private int id = 0;
	
	public Item(String name, int numberInStock, double price, int id)
	{
		this.name = name;
		this.numberInStock = numberInStock;
		this.price = price;
		this.id = id;
	}
	
	private String getName()
	{
		return this.name;
	}
	
	private int getStock()
	{
		return this.numberInStock;
	}
	
	private int getID()
	{
		return this.id;
	}
	
	private double getPrice()
	{
		return this.price;
	}
}
