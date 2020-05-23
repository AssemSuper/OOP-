package lab4;
import java.util.*;

public class StringTokenizerExample {
	StringTokenizer s= new StringTokenizer("A*B*Ccc","*");
	while(s.hasMoreTokens()) {
		System.out.println(s.nextToken());
		
	}
	System.out.println();
	StringTokenizer s1=new StringTokenizer("A*B*Cc|cc", "*|");
	while(s1.hasMoreTokens()) {
		System.out.println(s1.nextToken());
	}
	

}
}
