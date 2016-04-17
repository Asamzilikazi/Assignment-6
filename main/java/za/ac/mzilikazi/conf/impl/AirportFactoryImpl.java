package za.ac.mzilikazi.conf.impl;

import za.ac.mzilikazi.Domain.Airport;

/**
 * Created by mandisi on 2016-04-17.
 */
public class AirportFactoryImpl {
    private static AirportFactoryImpl airportFactory = null;

    public AirportFactoryImpl() {
    }

    public static  AirportFactoryImpl getInstance()
    {
        if(airportFactory == null)
            airportFactory = new AirportFactoryImpl();
        return airportFactory;
    }

    public Airport createCoverage() {
        Airport airport = new Airport();
        return airport;
    }
}
