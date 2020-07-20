package practise;

public class MergeSortforString {

	
	public static void merge(char[] char_arr,int l,int m,int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m ;
		
		char[] L = new char[n1];
		char[] R = new char[n2];
		
		for(int i=0;i<n1 ;i++) {
			L[i] = char_arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = char_arr[m+1+j];
		}
		
		
		int i=0,j=0;
		int k = l;
		while(i < n1 && j <n2) {
			
			if(L[i] <= R[j]) {
				char_arr[k] = L[i];
				i++;
			}else {
				char_arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			char_arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			char_arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void sort(char[] char_arr,int l,int r) {
		
		if(l < r) {
			int m = (l+r)/2;
			sort(char_arr,l,m);
			sort(char_arr,m+1,r);
			
			merge(char_arr,l,m,r);
		}
		
	}
	
}
