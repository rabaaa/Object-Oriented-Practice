/**
 * Publications abstract Class.
 * This class implements the Publication Interface class.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 18 December 2018
 */ 
//Publications is an abstract class
//we cannot create objects from it 
abstract public class Publications implements PublicationInterface
{
  // Attributes
  //Protected attributes. Only sub-classes of Publications can 
  //see these attributes
  protected String publisher;
  protected String publicationTitle;
  protected float price;
  
  
  /** 
     * Constructor method to set publisher name, publicationTitle and price
     * 
     */
  public Publications(String publisherIn, String publicationTitleIn, float priceIn)
   {
     publisher = publisherIn;
     publicationTitle = publicationTitleIn;
     price = priceIn;
    }
  /**
     * Get publisher's name
     * 
     * @return the publisher's name (as a String) 
     */
  // Get Publisher
  public String getPublisher()
  {
    return (publisher);
   }
  /**
     * Get publication's title
     * 
     * @return the publication's title (as a String)
     */
  // Get Publication Title
  public String getPublicationTitle()
  {
    return (publicationTitle);
   }
  /**
     * Get a publication's price
     * 
     * @return the publication's price (as a float)
     */
  // Get Price
  public float getPrice()
  {
   return (price);
   }
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

}// End Class Publications