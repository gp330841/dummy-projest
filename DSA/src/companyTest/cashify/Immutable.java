package companyTest.cashify;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Immutable {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		
		Map<Double, ArrayList<Student>> map = new TreeMap();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
	}
}
//make student class immutable
final class Student{
	final private int rn;
	final private String name;
	
	final private Address add;//deep cloning to get this object

	Student(int rn, String name,Address add){
		this.rn = rn;
		this.name = name;
		this.add = add;
	}

	public int getRn() {
		return rn;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}
	
}
class Address{
	
}
