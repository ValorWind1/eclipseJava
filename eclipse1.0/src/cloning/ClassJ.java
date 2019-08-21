package cloning;


class ClassJ implements Cloneable{  
int num;  
String player;  
  

ClassJ(int n,String player){  
this.num=n;  
this.player=player;  
}  
  

public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  


public static void main(String args[]){  
try{
	
ClassJ realMadrid=new ClassJ(7,"Cristiano Ronaldo");  
  
ClassJ juventus=(ClassJ)realMadrid.clone();  
  
System.out.println(realMadrid.num+" "+realMadrid.player);  

System.out.println(juventus.num+" "+juventus.player);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  
