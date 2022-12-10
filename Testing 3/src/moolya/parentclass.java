package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class maths{
	public static double areac(int r){
		double ar=3.14*r*r;
		return ar;
	}
	public static double areat(int b,int h){
		double ar=(b*h)/2;
		return ar;
	}
	public static double areas(int s){
		int ar=s*s;
		return ar;
	}
	public static double arear(int d1,int d2){
		double ar=(d1*d2)/2;
		return ar;
	}
}

public class parentclass {
	public static void main(String[] args) throws IOException{
		int r;int s;int d1;int d2;int b;int h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter r");
		r=Integer.parseInt(br.readLine());
		System.out.println("enter s");
		s=Integer.parseInt(br.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(br.readLine());
		System.out.println("enter h");
		h=Integer.parseInt(br.readLine());
		System.out.println("enter d1");
		d1=Integer.parseInt(br.readLine());
		
		System.out.println("enter d2");
		d2=Integer.parseInt(br.readLine());
		maths m=new maths();
		System.out.println(m.areac(r));
		System.out.println(m.areat(b,h));
		System.out.println(m.areas(s));
		System.out.println(m.arear(d1,d2));
	}
}
		
		
		
		


