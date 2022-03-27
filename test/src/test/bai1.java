package test;

public class bai1 {
//	static boolean stabilityArray(int[] arr) {
//	    int count=arr[0];
//	    for (int i = 1 ; i < arr.length; i++) {
//		    if(arr[i]-count>5){
//	            return false;
//	        }
//	        count=arr[i];
//	    }
//	    return true;
//	}
	
	static int gradeCheating(int n, int m, int[] a) {
		int tong=0;
			for (int i = 0 ; i < n; i++) {
			    tong=tong+a[i];
		    }
			
			
		return tong>m?m:tong;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int n=4,m=10;
		System.out.println(gradeCheating(n, m, a));
	}
}
