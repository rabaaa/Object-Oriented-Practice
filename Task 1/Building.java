
/**
 * Class Building.
 * This class allows to create building objects.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 14 December 2018
 */
public class Building

{
  //Attributes of the building object 
  private String id;
  private String buildingType;
  private boolean isRented;
  private int numberOfRooms;
  private boolean isParkingAvailable;
  private String landlordName;
  private String tenantName;
  private Address address;
  
  /**
   * Constructor method for setting Building attributes
   * 
   * Allows the programmer to set the attributes as soon as the 
   * object is created
   * 
   */
  //Constructor method to set id, buildingType,
  //isRented, numberOfRooms, isParkingAvailable,
  //landlordName, tenantName, address.
  
  public Building (String id, String buildingType, boolean isRented,
		   int numberOfRooms, boolean isParkingAvailable,String landlordName,
		   String tenantName, Address address)
  {
    this.id = id;
    this.buildingType = buildingType;
    this.isRented = isRented;
    this.numberOfRooms = numberOfRooms;
    this.isParkingAvailable = isParkingAvailable;
    this.landlordName = landlordName;
    this.tenantName = tenantName;
    this.address = address;
  }
  // Setter Methods for the Building object
  /**
   * Set the id of the building in the building class.
   * 
   * @param id the id of the building (as String)
   */
  //Method to set id for the building object
  public void setId (String id)
  {
    this.id = id;
  }
  
  /**
   * Set the buildingType 
   * 
   * @param buildingType the type of the building (as String)
   */
  //Method to set type of building for the building object
  public void setBuildingType (String buildingType)
  {
    this.buildingType = buildingType;
  }
  
  /**
   * Set whether the building is rented or not
   * 
   * @param isRented to determine whether the building is rented 
   * or not (as boolean)
   */
  //Method to set whether the building is rented
  //for the building object

  public void setIsRented (boolean isRented)
  {
    this.isRented = isRented;
  }
  
  /**
   * Set the number of rooms
   * 
   * @param numberOfRooms the quantity of rooms (as int)  
   * 
   */
  //Method to set number of rooms

  public void setNumberOfRooms (int numberOfRooms)
  {
    this.numberOfRooms = numberOfRooms;
  }
  
  /**
   * Set whether the parking is available 
   * 
   * @param isParkingAvailable to determine whether the building has 
   * parking or not (as boolean)
   */
  //Method to set whether the building has parking space or not.
  public void setIsParkingAvailable (boolean isParkingAvailable)
  {
    this.isParkingAvailable = isParkingAvailable;
  }
  
  /**
   * Set the name of the landlord
   * 
   * @param landlordName the name of landlord (as String)  
   * 
   */
  //Method to set the name of landlord

  public void setLandlordName (String landlordName)
  {
    this.landlordName = landlordName;
  }
  
  /**
   * Set the name of the tenant
   * 
   * @param tenantName the name of tenant (as String)  
   * 
   */
  //Method to set the name of the tenant

  public void setTenantName (String tenantName)
  {
    this.tenantName = tenantName;
  }
  
  /**
     * Set the address of the building in the building class
     * 
     * @param address  set the address of the building
     * as a (as Address)
     */
  //Method to set the address of the building object
    
  public void setAddress (Address address)
  {
    this.address = address;
  }
  
  //Getter Methods for the Building object
  /**
   * Get the id of the building
   * 
   * @return the id of the building (as String)
   */
  
  //Method to return the id of the building
  public String getId ()
  {
    return id;
  }
  
  /**
   * Get the type of the building
   * 
   * @return the type of the building (as String)
   */
  
  //Method to return the type of the building

  public String getBuildingType ()
  {
    return buildingType;
  }
  
  /**
   * Get whether the building is rented or not
   * 
   * @return whether the building is rented or not (as boolean)
   */
  
  //Method to return whether the building is rented or not

  public boolean getIsRented ()
  {
    return isRented;
  }
  
  /**
   * Get the number of rooms
   * 
   * @return the number of rooms (as int)
   */
  
  //Method to return the number of rooms

  public int getNumberOfRooms ()
  {
    return numberOfRooms;
  }
  
  /**
   * Get whether the building has parking space or not
   * 
   * @return whether the building has parking space or not (as boolean)
   */
  
  //Method to return whether the building has parking space or not
  public boolean getIsParkingAvailable ()
  {
    return isParkingAvailable;
  }
  
  /**
   * Get the name of the landlord
   * 
   * @return the name of the landlord (as Strng)
   */
  
  //Method to return the name of the landlord

  public String getLandlordName ()
  {
    return landlordName;
  }
  
  /**
   * Get the name of the tenant
   * 
   * @return the name of tenant (as String)
   */
  
  //Method to return the name of tenant

  public String getTenantName ()
  {
    return tenantName;
  }
  
  /**
     * Get the address of the building class
     * 
     * @return  the address of the building (as Address)
     */
  //Method to return the address of the building
  public String getAddress ()
  {
    return address.getCompleteAddress();
  }
  //Method to return building details as a string
  public StringBuilder getBuildingDetails ()
  {
    StringBuilder buildingDetails = new StringBuilder ();
    buildingDetails.append ("Building Id: " + id + "\n");
    buildingDetails.append ("Building Type: " + buildingType + "\n");
    buildingDetails.append ("Is Rented: " + isRented + "\n");
    buildingDetails.append ("Number of Rooms: " + numberOfRooms + "\n");
    buildingDetails.append ("Is Parking Available: " + isParkingAvailable +
			    "\n");
    buildingDetails.append ("Landlord Name: " + landlordName + "\n");
    buildingDetails.append ("Tenant Name: " + tenantName + "\n");
    buildingDetails.append ("Address: " + address.getCompleteAddress () +
			    "\n");

    return buildingDetails;
  }

}//End Class Building
