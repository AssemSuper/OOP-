package preparationForEndterm;

public abstract class Game {
	abstract void initilize();
	abstract void startPlay();
	abstract void endPlay();
	//template method 
	public  final void play() {
		initilize();
		startPlay();
		endPlay();
	}

}
