package practise;

import org.junit.Test;

public class TestMergeSort {

	
	
	@Test
	public void demo() {
		
		char[] carr =  new char[] {'b','c','e','a','z','f','a','b','o'};
		
		MergeSortforString.sort(carr, 0,8);
		
		for(char x : carr) {
			System.out.println(x);
		}
		
	}
}
