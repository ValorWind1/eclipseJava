package regex;

import java.util.regex.*;

import java.util.Scanner; 


public class Regex {
	public static void main(String[] args) {
		

	
	String sc = "${ACGGATTATGTAGCCCCTCGAUAGCCGCCUCG}";
	final Pattern myPattern = Pattern.compile("{STOP}");
	
	Matcher m = myPattern.matcher(sc);
	int i = 0;
	while (m.find()) {
	    sc = m.replaceFirst(String.valueOf(++i));
	    m = myPattern.matcher(sc);
	}
	
  }
	
}