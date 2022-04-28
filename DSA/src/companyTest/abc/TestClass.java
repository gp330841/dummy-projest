package companyTest.abc;

public class TestClass {
	public static void main(String[] args) {
		/*
		 * List list = Arrays.asList(1,2,3); List list2 = list; list2.add(3);
		 */
		int a=1,b=1;
		int c=0;
		try {
			c=a+b;
//			System.exit(0);
		} catch (Exception e) {
			
		} finally {
			System.out.println("finally");
		}
	}
	
}
