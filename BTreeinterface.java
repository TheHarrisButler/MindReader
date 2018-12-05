class BTreeInterface
{
	public boolean isEmpty(); 
	public int find(int node, String key);
	public void addLeft(int node, String data); 
	public void addRight(int node, String data); 
	public void setData(int node, String data);  	
}