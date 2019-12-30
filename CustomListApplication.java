//Created this class from scratch
//This class is simple a main method that shows how the Array List Data Structure works

public class CustomListApplication
{
	//3rd, created a brand new method to display the list
	// Made the method static so that i can call this method within the main method without creating an object
	private static void displayArrayList(CustomArrayList<Integer> passedListObject)
	{
		System.out.println("\nSize = "+ passedListObject.getSize() + " elements");
	
		for (int i =0; i <passedListObject.getSize(); i++)
		{
			System.out.println(passedListObject.get(i));
		}
		
	}
	
	public static void main(String [] args) throws Exception
	{
		//1st, creating the list
        CustomArrayList<Integer> arrayListObject = new CustomArrayList<Integer>();
        
        //2nd, populating the list
        arrayListObject.add(1);
        arrayListObject.add(2);
        arrayListObject.add(3);
        arrayListObject.add(4);
        arrayListObject.add(5);
        arrayListObject.add(6);
        arrayListObject.add(7);
        arrayListObject.add(8);
        arrayListObject.add(9);
        arrayListObject.add(10);
        
        //4th, displaying the arraylist
        displayArrayList(arrayListObject); //static method call aka object aren't needed to call this method         
        
        //5th, showing that the list increases in size when its completely full
        System.out.println("\n......Trying to add the 11th element to the List\n");
        arrayListObject.add(11);
        
        //6th, redisplaying the arraylist
        displayArrayList(arrayListObject); //static method call aka object aren't needed to call this method       
        
        //7th, populating the list
        arrayListObject.add(11);
        arrayListObject.add(12);
        arrayListObject.add(13);
        arrayListObject.add(14);
        arrayListObject.add(15);
        arrayListObject.add(16);
        arrayListObject.add(17);
        arrayListObject.add(18);
        arrayListObject.add(19);
        arrayListObject.add(20);
        
        //8th, redisplaying the arraylist
        displayArrayList(arrayListObject);  //static method call aka object aren't needed to call this method                
        
        //8th, redisplaying the arraylist
        System.out.println("\n......Trying to add the 21th element to the List\n");
        arrayListObject.add(21);
        displayArrayList(arrayListObject);  //static method call aka object aren't needed to call this method              
        
        //9th, redisplaying the arraylist
        System.out.println("\n......Retrying to add the 21th element to the List\n");
        arrayListObject.add(21);
        displayArrayList(arrayListObject);  //static method call aka object aren't needed to call this method                 
	}
}
