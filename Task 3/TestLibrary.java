/**
 * TestLibrary Class.
 * Controller (Entry-Point) class for Library Publications System.

 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 19 December 2018
 */ 

public class TestLibrary
{

      public static void main()
      { 
        // Create an instance of Magazine

        Magazine magazine1 = new Magazine ("David Publishing", "Mega Magazine", 30, "Maria Craig", "22/06/2014");

        System.out.println();
        magazine1.getEditor();
        magazine1.getDate();
        magazine1.getPublisher();
        magazine1.getPublicationTitle();
        magazine1.getPrice();
        // Display a blank line
        System.out.println();

       
        // Create an instance of Book
        
        Book Book1 = new Book ("Beckem and windsor", "Remember", 100, 2451, "Sue bright");

        Book1.getPageNumber();
        Book1.getAuthor();
        Book1.getPublisher();
        Book1.getPublicationTitle();
        Book1.getPrice();        
      }//End Class TestLibrary

}