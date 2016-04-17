package za.ac.mzilikazi.Domain;
import java.io.Serializable;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Airport implements Serializable {

    public boolean isAirport(){
        System.out.print("Validating if a flight is going stop at an airport");
        return true;
    }

    public static class Builder{
        public Airport build()
        {
            return new Airport();
        }
    }
}
