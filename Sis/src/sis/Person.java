package sis;

 class Person {
	enum Gender{B,G};
	private Gender human;
	public Person(char human) {
		if(human=='B') this.human=Gender.B;
		else this.human=Gender.G;
		
	}
	public String toString()
	{
		return String.valueOf(human);
		
	}

}
