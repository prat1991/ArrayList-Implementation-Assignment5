import java.util.Arrays;

// Updated this existing class to include the 7 changes stated below

public class CustomArrayList<T> implements CustomList<T>
{
	//1st, created an instance variable called arraySize
	private int arraySize = 0;
	
	//2nd, moved new Object[10] into the constructor as the constructor initializes the object
	Object[] arrayObject;
	
	/** add method contains the functionality of doubling the array in size
	 * when the object array is full.
	 * EX: when adding the 11th element; object array grows from 10 to 20 elements.
	 * EX: when adding the 21st element; object array grows from 20 to 40 elements. */
	
	//3rd, Created the Constructor
	public CustomArrayList()
	{
		System.out.println("Constructor call creates an array object of 10 elements\n");
		arrayObject = new Object[10]; // Default ArraySize is 10 elements
	}
		
	@Override
	public boolean add(T item) 
	{
		//4th, Provided Method body for the CustomList Interface's add() method
		if(arraySize == arrayObject.length)
		{
			int invalidIndex=arrayObject.length+1;
			System.out.println("Cannot add element at index position = " + invalidIndex );
			increaseSize();
			return false;
		}
		else
		{
			arrayObject[arraySize++]= item;
			return true;
		}
	}

	@Override
	public int getSize() 
	{
		//5th, Provided Method body for the CustomList Interface's getSize() method
		return arrayObject.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) 
	{
		//6th, Provided Method body for the CustomList Interface's get() method
		return (T) arrayObject[index];
	}
	
	//7th, Created a brand new method that exists outside of the CustomList Interface's 
	//in order to grow the array in size when it gets full
	private void increaseSize()
	{
		int updatedSize = (arrayObject.length)*2;
		System.out.println("Updating the Array Size to go from "+ arrayObject.length + " to "+updatedSize + " elements");
		System.out.println("Transferring all the elements into the bigger array\n");
		arrayObject = Arrays.copyOf(arrayObject,updatedSize);
	}

	
	
	
}