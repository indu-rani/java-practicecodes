package moolya;

import java.io.IOException;

public class sum {
	public static void main(String[] args) throws IOException{
		int[] i={2,3,5,6,7};
		int prod=1;
		for(int j=0; j<i.length; j++){
			prod=prod*i[j];
		}
		System.out.println(prod);
		}


}
