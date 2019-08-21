package cloning;

// shallow copy using copy () 
//

class Demo1
{ 
	
 int a1,b1; 
 
} 

//  NOTICE implements 
//clone with shallow copy.


class ClassB implements Cloneable 
{ 
 int a,b;
 
 
 Demo1 demoreference = new Demo1(); 
 
 
 public Object clone() throws CloneNotSupportedException 
 { 
     return super.clone(); 
 } 
} 

public class ShallowClonning1_0 
{ 
 
	
	public static void main(String args[]) throws CloneNotSupportedException 
 { 
    ClassB obj1 = new ClassB(); 
    obj1.a =5; 
    obj1.b =10; 
    
    obj1.demoreference.b1 = 30; 

    ClassB obj2 = (ClassB)obj1.clone(); 

   
    
    // Creating a copy of object1 and passing that copy to obj2 
    //  
    obj2.a = 5; 

    obj2.demoreference.a1 = 600; 

    
    
    // Change in object type field will be reflected in both t2 and t1(shallow copy) 
    // 
    System.out.println(obj1.a + "\t" + obj1.b + "\t" + obj1.demoreference.a1 + "\t" + obj1.demoreference.b1); 
    
    
    System.out.println(obj2.a + "\t" + obj2.b + "\t" + obj2.demoreference.a1 + "\t" + obj2.demoreference.b1); 
 } 
} 
