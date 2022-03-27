package test;

import java.util.Arrays;

public class baitap {

	public static void main(String[] args) {
		String s1 ="5,10,11,20,21,12,13,100,1,2,3";
//		  System.out.println("returning words:");
		  String v[] = s1.split(",");
		  //		  check data
		  for (String w : s1.split(",")) {
			  try {
		          int x =Integer.parseInt(w);	          
		          if(x<1) return;// "undefined";		          
		    } catch (Exception e) {     	
		    	return;// "undefined";
		    }
		  }
//		  copy to new array
		  int[] myIntArray = Arrays.stream(v).mapToInt(Integer::parseInt).toArray();
	
	        
//		  sap xep
		  int temp = myIntArray[0];
	        for (int i = 0 ; i < myIntArray.length; i++) {
	            for (int j = i + 1; j < myIntArray.length; j++) {
	                if (myIntArray[i] > myIntArray[j]) {
	                    temp = myIntArray[j];
	                    myIntArray[j] = myIntArray[i];
	                    myIntArray[i] = temp;
	                }
	            }
	        }
	        
	        
//			Xoa trung nhau	(day sau khi da loai gom k phan tu, sau k la ko tinh)        
		    int k=0;
	        int num=myIntArray.length;
	        while(k<num) {
	            if((k>0)&&(myIntArray[k]==myIntArray[k-1])) {
	                for(int j=k;j<myIntArray.length;j++)
	                    myIntArray[j-1]=myIntArray[j];
	                num=num-1;
	            } else k++;
	        } 	
	        
//			show me	               
	        for (int i = 0 ; i < k; i++) {
	           System.out.println(myIntArray[i]);
	        }
	        
//			thuat toan 

	        int count = myIntArray[0];
	        int check=1;
	        String s = ""+myIntArray[0];	
 	        for (int i = 1 ; i < k; i++) {
	        	if(myIntArray[i]-count==1) {
	        		if(i==k-1) {
	        			s=s+"-"+myIntArray[i];
	        		}
	        		check++;
	        		
	        	}else if(check>1) {
	        		s=s+"-"+count+","+myIntArray[i];
	        		check=1;
	        	}else if(check==1) {
	        		s=s+","+myIntArray[i];
	        	}
	        	count=myIntArray[i];
	        }
 	        
	        System.out.println(s);
  
	}
}
