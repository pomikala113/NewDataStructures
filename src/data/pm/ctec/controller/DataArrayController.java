package data.pm.ctec.controller;

import data.pm.ctec.model.ArrayDataNode;
import data.pm.ctec.model.DataNodeArray;

public class DataArrayController
{
	
	private DataNodeArray myArray;
	
	public void makeArray()
	{
		myArray = new DataNodeArray();
		int size = getSize();
		
		for(int count = 0; count < size; count++)
		{
			ArrayDataNode currentNode = new ArrayDataNode(count+1);
			currentNode.setLinkedNode(myArray.getLastNode());
			myArray.setLastNode(currentNode);
		}
	}
	
	public int getSize()
	{
		//prompt for size
		int size = 5;
		return size;
	}
	
	public void stuffIntoTheArray()
	{
		ArrayDataNode temp = null;
		for(int count = 0; count < myArray.getLength(); count++ )
		{
			
		}
	}

}
