package companyTest.abc;

import java.util.Stack;

public class Quest1 {

	public static void main(String[] args) {
//		String str = "{}{}{}{{{{}}";
		String str = "{{{{}}}}{}";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(stack.isEmpty())
				stack.add(str.charAt(i));
			else
			{
				if(stack.peek()=='{' && str.charAt(i)=='}')
					stack.pop();
				else
					stack.add(str.charAt(i));
					
			}
		}
		if(stack.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}

}
