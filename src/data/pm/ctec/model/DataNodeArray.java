package data.pm.ctec.model;

public class DataNodeArray
{
	private ArrayDataNode nodeZero, lastNode;
	private int length;
	
	public DataNodeArray()
	{
		nodeZero = new ArrayDataNode(0);
		lastNode = nodeZero;
		length = 0;
		
	}
	
	public int getLength()
	{
		return 0;
	}
	
	public ArrayDataNode getNodeZero()
	{
		return nodeZero;
	}

	public ArrayDataNode getLastNode()
	{
		return lastNode;
	}

	public void setLastNode(ArrayDataNode lastNode)
	{
		this.lastNode = lastNode;
	}
}
