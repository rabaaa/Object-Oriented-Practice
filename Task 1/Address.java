/**
 * Class Address.
 * This class allows to create address objects.
 *
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 14 December 2018
 */
public class Address
{
  // Address attributes.
  private String houseNumber;
  private String streetAddress;
  private String city;
  private String county;
  private String country;
  private String postCode;
  
  /**
   * Constructor method for setting Address attributes
   * 
   * Allows the programmer to set the attributes as soon as the 
   * object is created
   * 
   */
  //Constructor method to set houseNumber, streetAddress,
  //city, county, country, postCode.
  public Address (String houseNumber, String streetAddress, String city,
		  String county, String country, String postCode)
  {
    this.houseNumber = houseNumber;
    this.streetAddress = streetAddress;
    this.city = city;
    this.county = county;
    this.country = country;
    this.postCode = postCode;
  }

  //Setter Methods for private attributes

   /**
     * Set the house number of the building (house)
     * 
     * @param houseNumber  the house number of the building (as 
     * String) 
     */
    //Method to set the number of the house for the Address Object
  public void setHouseNumber (String houseNumber)
  {
    this.houseNumber = houseNumber;
  }

  /**
     * Set the name of the street
     * 
     * @param streetAddress  the name of the street (as String) 
     */
    //Method to set the name of the street for the Address Object

  public void setStreetAddress (String streetAddress)
  {
    this.streetAddress = streetAddress;
  }

  /**
     * Set the city of the address
     * 
     * @param city  the city where the address is located (as String) 
     */
    //Method to set the city for the Address Object
  
  public void setCity (String city)
  {
    this.city = city;
  }

   /**
     * Set the county of the address
     * 
     * @param county  the county where the address is located (as String) 
     */
    //Method to set the county for the Address Object
  public void setcounty (String county)
  {
    this.county = county;
  }

  /**
     * Set the country of the address
     * 
     * @param country  the country where the address is located (as String) 
     */
    //Method to set the country for the Address Object
  public void setCountry (String country)
  {
    this.country = country;
  }

  /**
     * Set the post code of the address
     * 
     * @param postCode  the post code (as String) 
     */
    //Method to set the postcode for the Address Object
  public void setZipCode (String zipCode)
  {
    this.postCode = zipCode;
  }
  
  //Getter Methods for the Address Object
  /**
     * Get the number of the house of the address object
     * 
     * @return  the number of the house (as String)
     */
    //Method to return the house number of the Address object
  public String getHouseNumber ()
  {
    return houseNumber;
  }
  
  /**
     * Get the street name of the Address object
     * 
     * @return  the name of the street (as String)
     */
    //Method to return the street name of the Address object
   public String getStreetAddress ()
  {
    return streetAddress;
  }
  
  /**
     * Get the city of the Address object
     * 
     * @return  the city (as String)
     */
    //Method to return the city of the Address object
    public String getCity ()
  {
    return city;
  }
  
   /**
     * Get the county of the Address object
     * 
     * @return  the county (as String)
     */
    //Method to return the county of the Address object
  public String getcounty ()
  {
    return county;
  }
  
  /**
     * Get the country of the Address object
     * 
     * @return  the country (as String)
     */
    //Method to return the country of the Address object
  public String getCountry ()
  {
    return country;
  }
  
   /**
     * Get the post code of the Address object
     * 
     * @return  the post code (as String)
     */
    //Method to return the post code of the Address object
  public String getZipCode ()
  {
    return postCode;
  }
  
  //Returns Complete Address of the building
  public String getCompleteAddress ()
  {
    return houseNumber + " " + streetAddress + " " + city + " " + county +
      " " + country + " " + postCode;
  }
}//End Class Address
