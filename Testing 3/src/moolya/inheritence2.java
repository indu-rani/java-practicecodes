package moolya;
class ed4{  
	public int valued(int x){
		int d=x;
		return(d);
	}// parent// parent
    
    // public int cal_adv (int x, int y){
      //return x+y;
    }

 class  ed3 extends ed{
	 public int cal(){
     int sum=valued(4)+4;
    return sum;
	 }
 
    
   // public int cal_adv(int x, int y){
        
      //  return x-y;
    }

class indu extends ed3{ 
	// parent
   
    public int cals(int x, int y){
        return x*y;
    }
}

public class inheritence2 {
	
	 public static void main(String[] args) {
		 ed3 e=new ed3();
		 System.out.println(e.cal());
		 


}
}
