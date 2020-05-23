package problem.six;

 class TestPalindrome {
	 public static void main(String args[]) {
		 Palindrome e= new Palindrome();
		 if (e.palin("racecar")) System.out.println("this is palindrome");
		 if(e.palin("low")) System.out.println("this is not palindrome");
		 
	 }

}
