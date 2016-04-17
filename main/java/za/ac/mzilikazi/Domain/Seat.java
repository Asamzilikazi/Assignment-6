package za.ac.mzilikazi.Domain;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Seat {
    private String size;
    private int number;
    private String location;

    public Seat() {
    }

    public  Seat(Builder builder)
    {
        size = builder.size;
        number = builder.number;
        location = builder.location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static class Builder
    {
        private String size;
        private int number;
        private String location;

        public Builder size(String value)
        {
            this.size = value;
            return this;
        }

        public Builder number(int value)
        {
            this.number = value;
            return this;
        }

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder copy (Seat value)
        {
            this.size = value.getSize();
            this.number = value.getNumber();
            this.location = value.getLocation();
            return this;
        }

        public Seat build()
        {
            return  new Seat(this);
        }
    }
}
