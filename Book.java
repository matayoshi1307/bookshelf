package sample;

public class Book {	
	
	public String title;
	public String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	

}
 

public interface Enemy {
	public int hitPoint;
	public int magicPoint;
	
	public void fight(Hero hero);
}

public class Slime implements Enemy {
	
	
}

public class Goblin implements Enemy {}