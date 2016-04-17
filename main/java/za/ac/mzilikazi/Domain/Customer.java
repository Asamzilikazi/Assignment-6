package za.ac.mzilikazi.Domain;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Customer {
    private Long id;
    private String name;
    private String dob;
    private Flight flight;

    public Customer() {
    }

    public  Customer(Flight flight)
    {
        this.flight = flight;
        this.dob = dob;
        this.name = name;
    }
    public Long getId() {return  id;}

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public Flight getFlight() {
        return flight;
    }
}
