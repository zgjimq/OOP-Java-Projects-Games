package java5.DetShpie;
import java.util.Scanner;
public class Main {
 static CityPopulationTracker cpt=new CityPopulationTracker();
    
    public static boolean isNullOrBlank(String input){
        return input==null||input.trim().isBlank();
    }
    public static boolean incorrectPopulation(int po){
        return po<=0;
    }
    public static String promptForCityName(Scanner scanner){
       // String fn=null;
        //boolean yes=true;
        while(true){
            System.out.println("\nPlease enter a valid city name:");
            String cityName=scanner.nextLine();
            if(!isNullOrBlank(cityName)){
                return cityName;
            }
        }
    }
    public static String promptForCountry(Scanner scanner){
        //String fn=null;
        //boolean yes=true;
        while(true){
            System.out.println("\nPlease enter a valid Country name:");
            String country=scanner.nextLine();
            if(!isNullOrBlank(country)){
          //      fn=country;
            //    yes=false;
                return country;
            }
        }
        //return fn;
    }
    public static int promptForPopulation(Scanner scanner){
        while(true){
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if(scanner.hasNextInt()){
                int population=scanner.nextInt();
                if(!incorrectPopulation(population)){
                    return population;
                }
            }else{
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
    CityPopulationTracker tracker = new CityPopulationTracker();
    // Test the addCity method
    tracker.addCity(new City("New York", "USA", 233412321L));
    tracker.addCity(new City("Los Angeles", "USA", 3971883L));
    // Test the getCity method
    City nyCity = tracker.getCity("New York");
    System.out.println("Population of New York: " + nyCity.getPolulation());
    // Test the setCity method
    City updatedNyCity = new City("New York", "USA", 8600000L);
    tracker.setCity(updatedNyCity);
    // Verify that the city data was updated
    nyCity = tracker.getCity("New York");
    System.out.println("Updated population of New York: " + nyCity.getPolulation());

    Scanner scanner=new Scanner(System.in);

    String cityName=promptForCityName(scanner);
    System.out.println("The name for the city u have typed is "+cityName);

    String country = promptForCountry(scanner);
    System.out.println("You entered a valid country: " + country);

    int population = promptForPopulation(scanner);
    System.out.println("You entered a valid population: " + population);

        scanner.close();
    }
}
