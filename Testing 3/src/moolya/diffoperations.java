package moolya;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class diffoperations {
	public static void cal2() {
		System.out.println("arithmatic operations");
	}
	public static void cal2(int x, int y){
		System.out.println("x-y" +(x-y));
		System.out.println(x/y);
	}
	
	public static void cal2(int x, int y ,int s){
		System.out.println(" x+s+y " +(x+s+y));
	}
	public static void cal2(int x, int y, int s, int a){
		System.out.println(x*s*y*a);
	}
	
	
		public static void main(String[] args) throws IOException{
			
			int x,y,s,a;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value of s");
		    s=Integer.parseInt(br.readLine());
		    System.out.println("Enter the value of x");
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter the value of y");
			y=Integer.parseInt(br.readLine());
			System.out.println("Enter the value of a");
			a=Integer.parseInt(br.readLine());
			
			
		diffoperations t=new diffoperations();
		t.cal2();
		t.cal2(x,y);
		t.cal2(x,y,s);
		t.cal2(x,s,y,a);
		
		
		
	}
	}


