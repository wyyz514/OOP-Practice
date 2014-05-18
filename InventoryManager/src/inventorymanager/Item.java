package inventorymanager;

public class Item {
	private String name = "";
	private int numberInStock = 0;
	private double price = 0.0;
	private long id = 0;
	
	public Item(String name, int numberInStock, double price, long id)
	{
		this.name = name;
		this.numberInStock = numberInStock;
		this.price = price;
		this.id = id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getStock()
	{
		return this.numberInStock;
	}
	
	public long getID()
	{
		return this.id;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
