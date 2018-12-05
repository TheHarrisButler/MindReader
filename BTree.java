class BTree
{
	public final int MAXSIZE = 1024; 
	private String[] items; 

	public BTree()
	{
		items = new String[MAXSIZE]; 
		for(int i = 0; i < MAXSIZE; i++)
		{
			items[i] = ""; 
		}
	}
	public boolean isEmpty()
	{
		return items[0].equals(""); 
	}
	public int find(int node, String key)
	{
		int rv = -1; 
		if(items[node].equals(""))
		{
			rv = -1; 
		}
		else if(items[node].equals(key))
		{
			rv = node; 
		}
		else
		{
			rv = find(2*node+1, key); 
			if(rv == -1)
			{
				rv = find(2*node+2, key); 
			}
		}
		return rv; 
	}

	public void addLeft(int node, String data)
	{
		items[2*node + 1] = data; 
	} 

	public void addRight(int node, String data)
	{
		items[2*node + 2] = data; 
	}

	public boolean checkLeft(int node)
	{
		boolean rv = true;
		String t = items[2*node + 1];
		
		if(t == "")
		{
			rv = false; 
		}

		return rv; 
	}

	public boolean checkRight(int node)
	{
		boolean rv = true;
		String t = items[2*node + 2];
		
		if(t == "")
		{
			rv = false; 
		}

		return rv; 
	}

	public String moveLeft(int node)
	{
		String rv = items[2*node + 1]; 

		return rv;  
	}

	public String moveRight(int node)
	{
		String rv = items[2*node + 2]; 

		return rv;  
	}

	public void setData(int node, String data)
	{
		items[node] = data; 
	}

	public String toString(int node)
	{
		String rv = items[node]; 

		return rv;  
	} 		
}