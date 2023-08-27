/**
 * Class for new generic object type Item.
 * @author Fanni Kertesz
 * @version 08/27/23
 * Item.java
 */
public class Item <T>
{
	protected T e;//generic variable contained in Item
	
	/**
	 * Constructor with no argument
	 */
	public Item()
	{
		e = null;
	}//end constructor
	
	/**
	 * Constructor with argument
	 * @param e, generic variable to store in Item.
	 */
	public Item(T e)
	{
		this.e = e;
	}
	//end constructor
	
	/**
	 * @param e, set new variable
	 */
	public void setE(T e)
	{
		this.e = e;
	}//end setE
	
	/**
	 * @return e, the current variable stored
	 */
	public T getE()
	{
		return e;
	}//end getE
}//end class
