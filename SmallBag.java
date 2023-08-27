/**
 * Class for new generic object type SmallBag.
 * @author Fanni Kertesz
 * @version 08/27/23
 * SmallBag.java
 */
public class SmallBag<S>
{
	private S item;//generic variable to be stored

	/**
	 * Constructor with no argument
	 */
	public SmallBag()
	{
		item = null;
	}//end constructor
	
	/**
	 * Constructor with argument
	 * @param item to be stored
	 */
	public SmallBag(S item)
	{
		this.item = item;
	}//end constructor
	
	/**
	 * @return current item stored
	 */
	public S getItem()
	{
		return item;
	}//end getItem

	/**
	 * @param new item to be set
	 */
	public void setItem(S item)
	{
		this.item = item;
	}//end setItem
	
}//end class
