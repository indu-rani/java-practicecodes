package moolya;
class A{
	
 int id; private int salary;   // access modifier public, pivate, defalut, protected
 void set(int i,int j){   //i=2345;
    id=i=2345;                    //id=i=2345; id=2345;
    salary=j=44000;


}
public int get(){
    return id;

}
public int getSalary(){
    return salary;

}
}

public class accessmod {
	public static void main(String[] args) {
	    A c=new A();
	    c.set(2345,44000);
	    
	    System.out.println(c.getSalary());
	    System.out.println(c.get());


}
}
