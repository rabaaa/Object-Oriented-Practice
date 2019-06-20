/**
 *
 * Class Book.
 * 
 * This Class will allow us to create Book Objects from it.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 18 December 2018
 * 
 */

public class Book extends Publications
{
  //Attributes
  int pageNumber;
  String author;
    
  // Constructor Method
  /** 
  * Constructor method to set name of publisher, publication title, price, 
  * no of pages and author
  * 
  */
  public Book(String publisherIn , String publicationTitleIn, float priceIn, int pageNumberIn,     String authorIn)
  {
    // Call the Publications Constructor 

    super (publisherIn , publicationTitleIn, priceIn);
            
    // Setup Book class attributes 
    pageNumber = pageNumberIn;
    author = authorIn;

  }
  
  //Setter Methods
  /**
     * Set the publication's details.
     * 
     * @param publisherIn   The Publisher's name (as a String)
     * @param titleIn       The Publication's Title (as a String)
     * @param priceIn       The Publication's Price (as a float)
     */
  public void setPublication(String publisherIn, String publicationTitleIn, float priceIn)
  {
     publisher = publisherIn;
     publicationTitle = publicationTitleIn;
     price = priceIn;
  }
  /**
     * Set the number of pages 
     * 
     * @param pageNumberIn  the number of pages of book (as int) 
     */
    //Method to set the number of pages 
  public void setPageNumber (int pageNumberIn)
  {
    pageNumber = pageNumberIn;
  }
  /**
     * Set the name of the author
     * 
     * @param authorIn  the name of the author (aString) 
     */
    //Method to set the name of the author
  public void setAuthor (String authorIn)
  {
    author = authorIn;
  }
  
  //Getter Methods
  /**
  * Get the number of pages in the book
  * 
  * @return   the number of pages (as int)
  */   
    //Get the number of pages in the book
    public int getPageNumber()
        {
            System.out.println("The number of pages in this book are " + pageNumber);
            return (pageNumber);
        }
  /**
  * Get the author name of the book
  * 
  * @return   the author name (as String)
  */   
  //Get the author name of the book
  public String getAuthor()
      {
        System.out.println("The author of this book is " + author);
        return (author);
      }
  /**
  * Get the publisher of the book
  * 
  * @return   the publisher (as a String)
  */   
  //Get the publisher of the book
  public String getPublisher()
      {
         System.out.println("The publisher of this book is " + publisher);
            return (publisher);
      }
  /**
  * Get the publication title of the book
  * 
  * @return   the publication title (as a String)
  */     
  //Get the publication title of the book
  public String getPublicationTitle()
      {
         System.out.println("The publication title of this book is " + publicationTitle);
            return (publicationTitle);
      }
  /**
  * Get the price of the book
  * 
  * @return   the price (as a float)
  */      
  //Get the price of the book
  public float getPrice()
       {
          System.out.println("The price of this book is £" + price);
            return (price);
       }

}//End Class Book