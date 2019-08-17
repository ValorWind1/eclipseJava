package speed6;

import java.util.*; 

public class spped6 { 
  
  //gen class
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        Set<T> set = new LinkedHashSet<>(); 
  
        
        set.addAll(list); 
  
       
        list.clear(); 
  
     
        list.addAll(set); 
  
      
        return list; 
    } 
  
    
    public static void main(String args[]) 
    { 
  
    	
    	
      
        ArrayList<Integer> 
            list = new ArrayList<>( Arrays .asList(1,1,2,3,4,5,5,6,7,8,9,9)); 
  
       
        
        
        
       
        ArrayList<Integer> 
            newList = removeDuplicates(list); 
  
        
        System.out.println("new array:  " + newList); 
    } 
} 
