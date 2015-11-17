package hipster.model;
/**
 *  11-17-15
 *  
 * @author htha9587
 *
 */


public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private String [] firstHipster;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name ="";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		this.firstHipster = new String[5];
		setUpArray();
		setUpBooks();
	}
	
	private void setUpArray()
	{
		hipsterPhrases[0] = "I am mainstreamin!";
		hipsterPhrases[1] = "HUE HUE HUE HUE";
		hipsterPhrases[2] = "References!";
		hipsterPhrases[3] = "Analog is the treat.";
	}
	
	private void setUpBooks()
	{
	
	}
	public Hipster(String name)
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHipsterPhrases() {
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) {
		this.hipsterPhrases = hipsterPhrases;
	}

	
	
}

