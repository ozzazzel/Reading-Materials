//Driver for the classes
public class MainDriver {

	public static void main(String[] args) {
		//create new objects books, magazines, textbooks
		//name,number of pages,year,type of cover
		book book1 = new book("Java", 850, 2014, "Paperback");
		ReadingMaterials book2 = new book("Lord of the Rings",398,1954,"hardcover");
									//name, number of pages,month,day,year
		magazine mag1 = new magazine("People",45,07,8,2014);
		ReadingMaterials mag2 = new magazine("National Geographic",90,9,15,2013);
									//name, number of pages, web, edition
		Textbook text1 = new Textbook("Calculus I",744,"http://www.cengage.com/",10);
		ReadingMaterials text2 = new Textbook("Psychology",520,"http://www.wiley.com/WileyCDA/",6);
		
		//print() method is different for each class
		book1.print();
		book2.print();
		System.out.println("-------------------------------");
		
		mag1.print();
		mag2.print();
		System.out.println("-------------------------------");
		text1.print();
		text2.print();
		
	}

}
