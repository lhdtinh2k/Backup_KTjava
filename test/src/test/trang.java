package test;

import java.util.Arrays;

public class trang {
	static String extrapolateRanges(String str) {
		
		
		char[] kt=str.toCharArray();

		        for(int i=0;i<kt.length;i++) {

		            if(kt[i]<48&&kt[i]!=44||kt[i]>57)

		                return "undefined";

		        }

		        String[] a=str.split(",");

		        int number[]=new int[a.length];

		        for(int i=0;i<a.length;i++) {

		            number[i]=Integer.parseInt(a[i]);

		        }for(int i=0;i<number.length-1;i++)

		            for(int j=i+1;j<number.length;j++)

		                if(number[i]>number[j]) {

		                    int tam=number[i];

		                    number[i]=number[j];

		                    number[j]=tam;

		                }
		        System.out.println("ccc");    
                for(int i=0;i<number.length;i++) {
                	System.out.println(number[i]);
                }
		        System.out.println("ccc");
		        
		        
		        int k=0;

		        int num=number.length;

		        while(k<num) {

		            if((k>0)&&(number[k]==number[k-1])) {

		                for(int j=k;j<number.length;j++)

		                    number[j-1]=number[j];

		                num=num-1;

		            } else k++;

		        } String kq="";
		        for(int i=0;i<number.length;i++) {
                	System.out.println(number[i]);
                }
		        System.out.println("gg");
		        
		        

		        int i=0;

		        while(i<num) {

		            int tam=number[i];

		            if((i<num-1)&&(number[i+1]==number[i]+1)) {

		                while((i<num-1)&&(number[i+1]==number[i]+1)) {

		                    i++;

		                }

		                kq=kq+ tam+"-"+number[i]+",";

		            }else {

		                kq=kq+new Integer(tam).toString()+",";

		            }

		            i++;

		        }
		        

		        return kq.substring(0, kq.length()-1);

		}
	public static void main(String[] args) {
		
		System.out.println(extrapolateRanges("2,1,2,3,4,"));
	}
}
