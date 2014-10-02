//book inherit method from ReadingMaterials class
public class book extends ReadingMaterials {
	public String TypeOfCover;
	public int yearOfPublication;
	public book(String name, int NumberOfPages, int yearOfPublication,String cover) {
		//parameters of ReadingClass
		super(name, NumberOfPages);
		//create new values for the constructor
		this.TypeOfCover = cover;
		this.yearOfPublication = yearOfPublication;		
	}
	//unique print method for this class
	public void print(){
		
		System.out.println("Book(s)");
		System.out.println("Book name: "+ name);
		System.out.println("Number of pages: "+ NumberOfPages);
		System.out.println("Year of publication: " + yearOfPublication);
		System.out.println("Type of book cover: "+TypeOfCover);
		System.out.println("-------------------------------");
	
		
	}
}
