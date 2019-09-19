package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	
	public static List<Marketing>  listMoreThan1000(List<Marketing> list){
		   // Implement a body
		//create  a list that will hold the values greater that 1000
		List<Marketing> hold = new ArrayList<>();
		
		//loop through the list passed and check for values greater that 1000
		for(Marketing mark: list) {
			
			if(mark.getSalesamount() >1000)
				hold.add(mark);
		}
		return hold;// this is the list with salesamount greater than 1000

		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Array List of type Marketing and add items to it.
		
		ArrayList<Marketing> list = new ArrayList<>();
		 list.add(new Marketing("John", "Pirus", 30000));
		 list.add(new Marketing("Andy", "Samsung Galaxy", 900));
		 list.add(new Marketing("Jane", "IPod", 800));
		 list.add(new Marketing("David", "Laptop", 3500));
		 list.add(new Marketing("David", "Laptop", 1500));
		 list.add(new Marketing("Chris", "MacBook", 7000));
		 
		 //Print the elements in the list
		 System.out.println("Marketing List");
		 System.out.println(list);
		 System.out.println("_________________________________\n");
		 list.remove(2);
		 System.out.println("After remove");
		 System.out.println(list);
		 System.out.println("_________________________________\n");
		 list.get(1).setProductname("Samsung S7");
		 System.out.println("Size : " +list.size() );
		 System.out.println("_________________________________\n");
		 System.out.println("Order by Sales Amount");
		 Collections.sort(list, new SalesComparator());
		 System.out.println(list);
		 System.out.println("_________________________________\n");
		 System.out.println("Order by Name and listMoreThan1000 ");
		  List<Marketing> list1 = listMoreThan1000(list);
		 Collections.sort(list1, new EmployeeNameComparator());
		 System.out.println(list1);
		 System.out.println("_________________________________\n");
		 
		 //st.remove(list.get(2));

	}

}
