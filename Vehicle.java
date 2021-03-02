public class Vehicle {
    private String rego;
    private String make;
    private String model;
    private String color;
    private int year;

    public Vehicle(String rg, String mk, String mod, String col, int yr) {
        rego = rg;
        make = mk;
        model = mod;
        color = col;
        year = yr;
    }

    public String getRego() {
        return rego;
    }

    public String toString() {
        String desc;
        desc = "a " + color + " " + year + " " + make + " " + model + " with rego " + rego;
        return desc;
    }

    public static void main (String[] args) {
        Vehicle car = new Vehicle("YET123", "Subaru", "Forester", "Black", 2007);
        System.out.println(car);
    }
}
