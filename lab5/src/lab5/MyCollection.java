package lab5;

public interface MyCollection {
	int duplicate();
// order();
	boolean add(Object obj);
	boolean addAll(MyCollection c);
	void clear();
	boolean contains(Object obj);
	boolean containsAll(MyCollection c );
	boolean equals(MyCollection o);
	int hashCode();
	boolean isEmpty();
	int size();

}
