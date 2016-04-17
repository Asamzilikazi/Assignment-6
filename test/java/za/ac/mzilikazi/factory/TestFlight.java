package za.ac.mzilikazi.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.Domain.*;
import za.ac.mzilikazi.conf.FlightFactory;
import za.ac.mzilikazi.conf.impl.FlightFactoryImpl;

/**
 * Created by mandisi on 2016-04-17.
 */
public class TestFlight {

    private FlightFactoryImpl flightFactory;
    private AvailableSeat availableSeat;
    private Customer customer;
    private FlightNumber flightNumber;
    private Flight flight;

    @Before
    public void setUpFlight() throws Exception {
        flightFactory = FlightFactoryImpl.getInstance();
        availableSeat = new AvailableSeat();
        customer = new Customer(flight);
    }

    @Test
    public void testFlight() throws Exception {
        flight = flightFactory.createFlight(availableSeat, customer, "boardingTime",
                "flightDate", "gate", "checkInCounter");
        Assert.assertEquals("boardingTime",flight.getBoardingTime());
    }

    @Test
    public void testFlightUpdate() throws Exception {
        flight = flightFactory.createFlight(availableSeat, customer, "boardingTime",
                "flightDate", "gate", "checkInCounter");
        Flight updateFlight = new Flight.Builder().copy(flight).availableSeat(availableSeat).build();
        updateFlight.getAvailableSeat();
        Assert.assertEquals(updateFlight.getAvailableSeat(),availableSeat);


    }
}
