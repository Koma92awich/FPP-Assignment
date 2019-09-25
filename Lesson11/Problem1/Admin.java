package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> value = new HashMap<>();
		
		Key keys =null;
		for(Student std : students) {
			keys = new Key(std.getFirstName(), std.getLastName());
			value.put(keys, std);
		}
		
		return value;
	}
}
