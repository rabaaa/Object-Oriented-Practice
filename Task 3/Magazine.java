/**
 *
 * Class Magazine.
 * 
 * This Class will allow us to create magazine Objects from it.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 19 December 2018
 * 
 */

public class Magazine extends Publications
{
    //Attributes
    String editor;
    String date;
    
    //Constructor Method
    /** 
     * Constructor method to set name of publisher, publication title, price, 
     * editor and date
     * 
    */
    public Magazine(String publisherIn , String publicationTitleIn, float priceIn, String editorIn, String dateIn)
        {
            // Call the Publications Constructor 
            super (publisherIn , publicationTitleIn, priceIn);
            
           // Setup magazine class attributes 
            editor = editorIn;
            date = dateIn;
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
     * Set the name of the editor
     * 
     * @param editorIn  the name of the editor(String) 
     */
    //Method to set the name of the editor
    public void setEditor (String editorIn)
    {
        editor = editorIn;
        
    } 
    
    /**
     * Set the publication date of the magazine
     * 
     * @param dateIn  the publication date(as String) 
     */
    //Method to set the publication date of the magazine
    public void setDate (String dateIn)
    {
       date = dateIn;
    }
    
    //Getter Methods
    /**
    * Get editor name of the magazine details
    * 
    * @return   the editor details (as a String)
    */   
    // Get the Editor of the magazine
    public String getEditor()
        {
            System.out.println("The editor of this magazine is " + editor);
            return (editor);
        }
    /**
    * Get  the publication date of the magazine
    * 
    * @return   the publication date (as a String)
    */   
    //Get the publication date of the magazine
    public String getDate()
        {
            System.out.println("The publication date of this magazine is " + date);
            return (date);
        }
    /**
    * Get the publisher of the magazine
    * 
    * @return   the publisher (as a String)
    */   
    //Get the publisher of the magazine
    public String getPublisher()
        {
            System.out.println("The publisher of this magazine is " + publisher);
            return (publisher);
        }
    /**
    * Get the publication title of the magazine
    * 
    * @return   the publication title (as a String)
    */   
    //Get the publication title of the magazine
    public String getPublicationTitle()
        {
            System.out.println("The publication title of this magazine is " + publicationTitle);
            return (publicationTitle);
        }
    /**
    * Get the price of the magazine
    * 
    * @return   the price (as a float)
    */   
    //Get the price of the magazine
    public float getPrice()
        {
            System.out.println("The price of this magazine is £" + price);
            return (price);
        }

}//End Class Magazine