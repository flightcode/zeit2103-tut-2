import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Map<String,Vehicle> vehicleInventory = new HashMap<String,Vehicle>();
        Vehicle car = new Vehicle("YET123", "Subaru", "Forester", "Black", 2007);

        vehicleInventory.put(car.getRego(), car);

        System.out.println("Input rego to search.Press enter on empty input to close.");
        Scanner input = new Scanner(System.in);
        String regoSearch = "";
        do {
            regoSearch = input.nextLine();
            System.out.println(vehicleInventory.get(regoSearch));
        } while(regoSearch != "");
        input.close();
    }
}
