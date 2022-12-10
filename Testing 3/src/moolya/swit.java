package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swit {
	public static void main(String[] args) throws IOException {
		int p1,p2,p3,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		s=Integer.parseInt(br.readLine());
		p1=Integer.parseInt(br.readLine());
		p2=Integer.parseInt(br.readLine());
		p3=Integer.parseInt(br.readLine());
		switch (s){
		case 1:
			if(p1>p2)
		System.out.println("p1 is topper");
		break;
		case 2:
			if(p2>p3)
		System.out.println("p2 is topper");
		break;
		case 3:
			if(p3>p1)
		System.out.println("p3 is topper");
			break;
				
		}
	}
	

}
