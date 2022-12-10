package moolya;

	class ed{
		public int valued(int x){
			int d=x;
			return(d);// parent
		}
	    
	    public int cal(int x, int y){
	        final int d=4; 
	        return x+y;
	    }
	}

	class ed1 extends ed{
		
	    int sum=valued(4)+4;
	    
	    public int cal_adv(int x, int y){
	        
	        return x-y;
	    }
	}
	class ed2 extends ed1{    // parent
	   
	    public int cals(int x, int y){
	        return x*y;
	    }
	}
	public class inheritence1 {
	    public static void main(String[] args) {
	    	
	     
	    
	    }
	}


