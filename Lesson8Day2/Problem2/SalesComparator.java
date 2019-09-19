package Lists;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing mm1, Marketing mm2) {
		// TODO Auto-generated method stub
		
		Double ss1 = mm1.getSalesamount();
		Double ss2 = mm2.getSalesamount();
		
		String ee1 = mm1.getEmployeename();
		String ee2 = mm2.getEmployeename();
		
		String pp1  = mm1.getProductname();
		String pp2 = mm2 .getProductname();
		//return 0;
		
		if(ss1.compareTo(ss2) !=0)
			return ss1.compareTo(ss2);
		else if(ee1.compareTo(ee2) != 0)
			return ee1.compareTo(ee2);
		
		else 
			return pp1.compareTo(pp2);
		
	}
	
	
	

}
