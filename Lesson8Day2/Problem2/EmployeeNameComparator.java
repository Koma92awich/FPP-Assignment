package Lists;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing> {
	
	@Override
	public int compare(Marketing mm1,Marketing mm2) {
		
		String str1 = mm1.getEmployeename();
		String str2 = mm2.getEmployeename();
		
		return str1.compareTo(str2);
		
	}

}
