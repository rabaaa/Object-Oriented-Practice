
/**
 * This class allows us to 
 * test Building and Address class.
 *
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 15 December 2018
 */
public class BuildingAddressTest
   {  public static final String BUILDING_TYPE_HOUSE = "House";
      public static final String BUILDING_TYPE_APPARTMENT = "Appartment";
  
       public static void main(String[] args) {
        // Create an instance of Address
        
        Address address = new Address("5","Penn Hill","Poole","Dorset","UK","Bh14 9ly");
        // Create an instance of Building
        
        Building building = new Building("B9", BUILDING_TYPE_HOUSE, false, 4, true, "Gubbin", "Martin", address);
        System.out.println(building.getBuildingDetails());
	}
}//End class BuildingAddressTest
