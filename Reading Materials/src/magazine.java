//Magazine inherit method from ReadingMaterials class
public class magazine extends ReadingMaterials{
	//create new values for this class, web and edition
	public int month;
	public int day ;
	public int year;
	//magazine class has new parameters
	public magazine(String name, int numberOfPages, int month, int day, int year) {
		//parameters of ReadingClass
		super(name, numberOfPages);
		//create new values for the constructor
		this.month = month;
		this.day= day;
		this.year = year;
	}
	//unique print method for this class
	public void print(){
	
		System.out.println("Magazine(s)");
		System.out.println("Magazine name: "+ name);
		System.out.println("Number of pages: "+ NumberOfPages);
		System.out.println("Date of publication: "+month+"/"+day+"/"+year);
		System.out.println("-------------------------------");
		
	}
}
