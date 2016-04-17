package za.ac.mzilikazi.conf.impl;

import za.ac.mzilikazi.Domain.Seat;
import za.ac.mzilikazi.conf.SeatFactory;

/**
 * Created by mandisi on 2016-04-17.
 */
public class SeatFactoryImpl implements SeatFactory {
    private  static SeatFactoryImpl SeatFactory = null;

    public  SeatFactoryImpl(){

    }

    public static SeatFactoryImpl getInstance()
    {
        if (SeatFactory == null)
            SeatFactory = new SeatFactoryImpl();
        return SeatFactory;
    }

    public Seat createSeats (String size, int number, String location)
    {
        Seat seat = new Seat.Builder().size(size).number(number).location(location).build();
        return seat;
    }
}
