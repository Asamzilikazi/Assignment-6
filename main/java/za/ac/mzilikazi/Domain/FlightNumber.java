package za.ac.mzilikazi.Domain;

import java.util.List;

/**
 * Created by mandisi on 2016-04-16.
 */
public class FlightNumber {
    private Long id;
    private List<Airport> airportList;
    private String departureTime;
    private String description;
    private String type;
    private String airline;

    public FlightNumber() {
    }

    public FlightNumber(List<Airport> airportList, String departureTime, String description, String type, String airline) {
        this.id = id;
        this.airportList = airportList;
        this.departureTime = departureTime;
        this.description = description;
        this.type = type;
        this.airline = airline;
    }
    public Long getId(){return id;}

    public List<Airport> getAirportList() {
        return airportList;
    }

    public void setAirportList(List<Airport> airportList) {
        this.airportList = airportList;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void processFlight(Airport airport)
    {
        if(airport.isAirport()){
            System.out.print("Flight is stoping at this airport");
        }
    }
}
