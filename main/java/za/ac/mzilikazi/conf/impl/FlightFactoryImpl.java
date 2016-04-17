package za.ac.mzilikazi.conf.impl;

import za.ac.mzilikazi.Domain.AvailableSeat;
import za.ac.mzilikazi.Domain.Customer;
import za.ac.mzilikazi.Domain.Flight;
import za.ac.mzilikazi.conf.FlightFactory;

/**
 * Created by mandisi on 2016-04-17.
 */
public class FlightFactoryImpl implements FlightFactory{

    private static FlightFactoryImpl flightFactory = null;

    private FlightFactoryImpl(){}

    public static FlightFactoryImpl getInstance(){
        if(flightFactory == null)
            flightFactory = new FlightFactoryImpl();
        return flightFactory;
    }

    public Flight createFlight(AvailableSeat availableSeat, Customer customer, String boardingTime,
                               String flightDate, String gate, String checkInCounter)
     {
        Flight flight = new Flight.Builder().availableSeat(availableSeat).customer(customer).boardingTime(boardingTime).flightDate(flightDate).
                gate(gate).checkInCounter(checkInCounter).build();
        return flight;
    }
}
