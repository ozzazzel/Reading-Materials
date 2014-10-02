//Textbook inherit method from ReadingMaterials class

public class Textbook extends ReadingMaterials {
	//create new values for this class, web and edition
	public String Web;
	public int edition;
	//Textbook class has new parameters
	public Textbook(String name, int numberOfPages,String Link,int edition) {
		super(name, numberOfPages);
		//create new values for the constructor
	this.Web = Link;
	this.edition= edition;
	}
	//unique print method for this class
	public void print(){

		System.out.println("Textbook(s)");
		System.out.println("Textbook name: "+ name);
		System.out.println("Number of pages: "+ NumberOfPages);
		System.out.println("e-book link: " + Web);
		System.out.println("Edition number: "+edition);
		System.out.println("-------------------------------");
	}
}
