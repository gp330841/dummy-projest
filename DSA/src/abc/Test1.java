package abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Sueper{
	int index =1;
}
public class Test1 extends Sueper {

	public Test1(int index) {
		index = index;
	}
	public static void main(String[] args) {
		Test1 obj = new Test1(10);
		System.out.println(obj.index);
	}
}
