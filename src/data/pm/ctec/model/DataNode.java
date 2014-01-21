package data.pm.ctec.model;

public abstract class DataNode
{
	
	private DataNode linkedNode;
	private Object storedItem;
	
	public DataNode getLinkedNode()
	{
		return linkedNode;
	}
	
	public Object getStoredItem()
	{
		return storedItem;
	}
	
	public void setLinkedNode(DataNode linkedNode)
	{
		this.linkedNode = linkedNode;
	}
	
	public void setStoredItem(Object storedItem)
	{
		this.storedItem = storedItem;
	}
}
