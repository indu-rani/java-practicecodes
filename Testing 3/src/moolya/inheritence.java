package moolya;
class harsha{    // parent
    public int cal(int x, int y){
        return x+y;
    }
}

    class harsha1 extends harsha{      //child
    public int cal1(int x, int y){
        return x-y;
    }
    }
    class harsha2 extends harsha1{      //child
    public int cal2(int x, int y){
            return (x*y);
    }
    }
     class harsha3 extends harsha2{      //child
     public int cal3(int x,int y){
     return (x/y);
     }
     }
public class inheritence {
    public static void main(String[] args) {
    	//harsha h=new harsha();
      harsha3 h=new harsha3();
     // harsha2 b=new harsha2();
      //harsha3 c=new harsha3();// object of child
       System.out.println(h.cal1(2,5));
        System.out.println(h.cal2(2,5));
        System.out.println(h.cal3(2,5));
    }

}
