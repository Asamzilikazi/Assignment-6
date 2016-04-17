package za.ac.mzilikazi.conf;

import za.ac.mzilikazi.Domain.Seat;

/**
 * Created by mandisi on 2016-04-17.
 */
public interface SeatFactory {

    Seat createSeats (String size, int number, String location);
}
