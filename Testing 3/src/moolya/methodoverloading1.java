package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methodoverloading1 {
	public static int sum(int ...numbers){
		int sum=0;
		for(int j=0; j<numbers.length; j++){
			sum=sum+numbers[j];
		}
			return(sum);
		}
	public static double area(int r){
		double ar=3.14*r*r;
		return ar;
	}
	
		
		
	public static void main(String[] args) throws IOException{
		int r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter r");
		r=Integer.parseInt(br.readLine());
		methodoverloading1 w=new methodoverloading1();
		
		System.out.println(w.sum(3,4,5,6,7,2,9));
		System.out.println(w.area(r));
	}
		
	}
	
		
	




