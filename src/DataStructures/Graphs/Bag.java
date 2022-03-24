package DataStructures.Graphs;

public class Bag<Item>
{
	Item item;
	int size;

	public Bag()
	{
		size = 0;
	}
	public void addItem(Item item)
	{
		this.item = item;
	}

	public boolean isEmpty()
	{
		return size == 0;
	}

	public int size()
	{
		return size;
	}
}
