package data.pm.ctec.model;

public class ArrayDataNode extends DataNode
{
	
	private int index;
	
	public ArrayDataNode()
	{
		index = -1;
		super.setLinkedNode(null);
		super.setStoredItem(null);
		
	}
	
	public ArrayDataNode(int index)
	{
		this.index = index;
		super.setLinkedNode(null);
		super.setStoredItem(null);
		
	}
	
	public int getIndex()
	{
		return index;
		
	}
	
	public void setIndex(int index)
	{
		this.index = index;
	}	
}
