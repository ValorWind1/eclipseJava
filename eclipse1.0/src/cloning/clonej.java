package cloning;

import java.io.*;

// We will be cloning this class objects 	
class Demo{
	
	int a ,b ; 
	
	Demo(){
		a = 50;
		b = 100;
	}
}

public class clonej {
	
	public static void main(String[] args) {
		
		Demo demoobj = new Demo();
		
		System.out.println(demoobj.a+"\t"+demoobj.b);
		
		
		
		Demo demoobj1 = demoobj ; 
		
		
		
		demoobj1.a = 500;
		
		System.out.println(demoobj.a+"\t"+demoobj.b);
		System.out.println(demoobj1.a+"\t"+demoobj1.b);
		
	}

}
