package za.ac.mzilikazi.conf;

import za.ac.mzilikazi.Domain.AvailableSeat;
import za.ac.mzilikazi.Domain.Customer;
import za.ac.mzilikazi.Domain.Flight;

/**
 * Created by mandisi on 2016-04-17.
 */
public interface FlightFactory {

    Flight createFlight(AvailableSeat availableSeat,Customer customer, String boardingTime,
            String flightDate,String gate,String checkInCounter);
}
