package companyTest.cashify;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Features {

	public static void main(String[] args) {
		List<Emp> emp = new ArrayList<>();
		Predicate<Emp> pred = new Predicate<Emp>() {
			
			@Override
			public boolean test(Emp t) {
				if(t.sal>2000)
					return true;
				else
					return false;
			}
		};
		
		emp.stream().filter(pred).collect(Collectors.toList());
	}

}

class Emp{
	int sal;
	int age;
}
