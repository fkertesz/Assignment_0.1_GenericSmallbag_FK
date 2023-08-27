/**
 * Class for testing classes Item and SmallBag.
 * @author Fanni Kertesz
 * @version 08/27/23
 * Application.java
 */
public class Application
{
	public static void main(String[] args)
	{
		//new items of type String and Integer
		Item<String> first = new Item<String>("Fanni");
		Item<Integer> second = new Item<Integer>(314);
		
		//new SmallBag of type Item
		SmallBag<Item> bag = new SmallBag<Item>();
		
		//setting and printing for testing
		bag.setItem(first);
		
		System.out.println(bag.getItem().getE());
		
		bag.setItem(second);
		
		System.out.println(bag.getItem().getE());
		
	}//end main
}//end class
