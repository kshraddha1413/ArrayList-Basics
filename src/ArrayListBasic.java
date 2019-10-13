import java.util.ArrayList;

public class ArrayListBasic {
	// Java program to demonstrate working of ArrayList in Java 
	public static void main(String[] args) {
		ArrayList<Integer> intList=new ArrayList<Integer>();
	//adding values in arraylist	
		intList.add(23);
		intList.add(45);
		intList.add(70);
	//accessing arraylist elements	
		for(int i=0;i<intList.size();i++) {
			System.out.println("printting arraylist elements :"+intList.get(i));
		}
		//Removing element from arraylist
		intList.remove(0);
		//after removing value at 0 index
		for(int i=0;i<intList.size();i++) {
			System.out.println("printting arraylist elements :"+intList.get(i));
		}
		//contains method check element present or not return boolean
		
		boolean var=intList.contains(45);
		if(var)
		{
			System.out.println("45 present in list");
		}else {
			System.out.println("45 not present");
		}
		
		

	}

}
