/**
 *  Create ReadingMaterials class as superclass
 *  Inherit method of ReadingMaterials class to Textbook,magazine,book classes
 *  Create own print() method for each class
 *  Create ReadmingMaterials objects and add corresponding parameters.
 *  Use print() methods.
 * @author Oscar
 * Pseudo code 
class ReadingMaterials { String name ,int numberOfPages{} }
class  Textbook extends ReadingMaterials{ super() public String web, int edition{} }
class  magazine extends ReadingMaterials {super public int month, public int day, public int year()}
class  book extends ReadingMaterials { super() public String TypeofCover, public int YearOfPublication{} }
}
public class MainDriver {
 public static void main(String[] a) {
  	book book1 = new book();
	ReadingMaterials book2 = new book();
	magazine mag1 = new magazine();
	ReadingMaterials mag2 = new magazine();
	Textbook text1 = new Textbook();
	ReadingMaterials text2 = new Textbook();
	
	book1,book2,mag1,mag2,text1.text2.print()
  }
}
 */
//base class
public class ReadingMaterials {
	//parameters for the constructor
public String name;
public int NumberOfPages;
//constructor
public ReadingMaterials(String name, int NumberOfPages) {
	super();
	this.name = name;
	this.NumberOfPages = NumberOfPages;	
}
public void print(){

}
}
