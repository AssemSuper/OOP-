package problem.six;

public class Palindrome {
	public boolean palin(String a) {
		String word= a.replaceAll("\\s+", "").toLowerCase();
		int length=word.length();
		int first=0;
		int last=length-1;
		
		while (last > first){
			char firstChar=word.charAt(first++);
			char lastChar=word.charAt(last--);
			if (firstChar!=lastChar) {return false;}
			 return true;
			
		}
		return false;
	}
	
	
	

}
