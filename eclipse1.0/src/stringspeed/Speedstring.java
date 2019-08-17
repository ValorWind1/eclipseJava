package stringspeed;
/**
 * @author Dan Leyghton
 * @exception InterruptedException
 * @since days
 * @see the documentation 
 * 
 */
import java.util.Scanner;
public class Speedstring {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input something: ");
        
        
        
        
        String str = in.nextLine();
        
        
        System.out.println("you wrote: "+str);

        System.out.print("# vowels:  " + numVowels(str));
        
        
        
        
    }
  
  
 public static int numVowels(String str)
    {
        int count = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            
        	if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                   
        			|| str.charAt(i) == 'o' || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    
         			|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
        		
                count++;
                
            }
        }
        
        return count;
    }
}