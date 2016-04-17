package za.ac.mzilikazi.Domain;

import java.io.Serializable;

/**
 * Created by mandisi on 2016-04-16.
 */
public class AvailableSeat implements Serializable{

    public boolean isAvailable(){
        System.out.print("Availability: validating available seats ");
        return true;
    }
}
