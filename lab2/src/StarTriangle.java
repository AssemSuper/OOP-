

public class StarTriangle {
	
	public String output="";
	int width;
	
	
			
	StarTriangle(int widthOf)
	{
		width=widthOf;
		
	}
	 public String toSllltring() {
		for (int i=1; i<=width;i++) {for (int j=1;j<=i;j++) { 
		output=output+"[*]";
		}
		output=output+"\n";
			
		}
		return output;
		
		
	}
	
	

}
