import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        // Saturn is missing from the planetList
        // Insert it into the correct position

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        planetList.add(5, "Saturn");
        System.out.println(planetList);
    }
}