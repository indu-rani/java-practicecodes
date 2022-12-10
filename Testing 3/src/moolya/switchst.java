package moolya;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class switchst {
	public static void main(String[] args) throws IOException {
		int x,y,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		s=Integer.parseInt(br.readLine());
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		switch (s){
		case 1:
		System.out.println(x+y);
		break;
		case 2:
		System.out.println(x-y);
		break;
		default:
		System.out.println("entered wrong number");
		}
	}

	}


