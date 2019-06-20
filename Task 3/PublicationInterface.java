/**
 * Publication Interface Class for all library publications.
 * 
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 18 December 2018
 */ 
public interface PublicationInterface
{
    /**
     * Get publisher's name
     * 
     */
    public String getPublisher();

    /**
     * Get publication's title
     * 
     */
    public String getPublicationTitle();

    /**
     * Get a publication's price
     * 
     */
    public float getPrice();

    /**
     * Set the publication's details.
     * 
     * @param publisherIn   The Publisher's name (as a String)
     * @param titleIn       The Publication's Title (as a String)
     * @param priceIn       The Publication's Price (as a float)
     */
    public void setPublication(String publisherIn, String publicationTitleIn, float priceIn);
}//End class PublicationInterface

