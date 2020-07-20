package practise;

public class HackerRankJava1DProblem {
	/**
	 * 
	 * @param leap   =< 0 leap <=100
	 * @param game   =< 2 n <=100
	 * @return
	 */
	public static boolean Solution(int leap,int[] game) {
		
		int n = game.length;
		int index = 0;
		boolean flag = false;
		if(leap >= n ) //case 1 : if leap is greater than no. of elements in array
			return true;
		while(index<n-1) {
			
		}
		return flag;
						
	}
	private static boolean winOrNot(int index,int leap,int n) {
		return index+leap >= n;
	}
	private static boolean canMoveAtLeap(int index,int leap,int[] game) {
		return game[index+leap] ==0;
	}
	private static boolean canMoveFwd(int index,int[] game) {
		return game[index+1]==0;
	}
	private static boolean canMoveBackward(int index,int[] game) {
		return game[index-1]==0;
	}
	
}
