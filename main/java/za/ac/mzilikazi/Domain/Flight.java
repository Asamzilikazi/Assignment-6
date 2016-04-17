package za.ac.mzilikazi.Domain;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Flight {
    private Long id;
    private AvailableSeat availableSeat;
    private Customer customer;
    private String boardingTime;
    private String flightDate;
    private String gate;
    private String checkInCounter;

    public Flight() {
    }

    private Flight(Builder builder)
    {
        id = builder.id;
        availableSeat = builder.availableSeat;
        customer = builder.customer;
        boardingTime = builder.boardingTime;
        flightDate = builder.flightDate;
        gate = builder.gate;
        checkInCounter = builder.checkInCounter;
    }
    public Long getId(){return id;}

    public AvailableSeat getAvailableSeat() {
        return availableSeat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getCheckInCounter() {
        return checkInCounter;
    }

    public void setCheckInCounter(String checkInCounter) {
        this.checkInCounter = checkInCounter;
    }

   public static  class  Builder
   {
       private Long id;
       private AvailableSeat availableSeat;
       private Customer customer;
       private String boardingTime;
       private String flightDate;
       private String gate;
       private String checkInCounter;

       public Builder id(Long value)
       {
           this.id = value;
           return this;
       }

       public Builder availableSeat(AvailableSeat value)
       {
           this.availableSeat = value;
           return this;
       }

       public Builder customer(Customer value)
       {
           this.customer = value;
           return this;
       }
       public Builder boardingTime(String value)
       {
           this.boardingTime = value;
           return this;
       }
       public Builder flightDate(String value)
       {
           this.flightDate = value;
           return this;
       }
       public Builder gate(String value)
       {
           this.gate = value;
           return this;
       }
       public Builder checkInCounter(String value)
       {
           this.checkInCounter = value;
           return this;
       }

       public Builder copy (Flight value)
       {
           this.id = value.getId();
           this.availableSeat = value.getAvailableSeat();
           this.customer = value.getCustomer();
           this.boardingTime = value.getBoardingTime();
           this.checkInCounter = value.getCheckInCounter();
           this.flightDate = value.getFlightDate();
           this.gate = value.getGate();
           return this;
       }

       public Flight build()
       {
           return  new Flight(this);
       }

   }
}
