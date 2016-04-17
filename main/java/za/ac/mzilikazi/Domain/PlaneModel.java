package za.ac.mzilikazi.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mandisi on 2016-04-16.
 */
public class PlaneModel implements Serializable{
    private Long id;
    private List<Seat> seats;
    private String description;
    private String graphic;

    public PlaneModel() {
    }

    public PlaneModel(Builder builder)
    {
        id = builder.id;
        seats = builder.seats;
        description = builder.description;
        graphic = builder.graphic;
    }
    public Long getId(){return id;}

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public static class Builder{
        private Long id;
        private List<Seat> seats;
        private String description;
        private String graphic;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder seats(List<Seat> value)
        {
            this.seats = value;
            return this;
        }

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public Builder seats(String value)
        {
            this.graphic = value;
            return this;
        }

        public  Builder copy(PlaneModel value)
        {
            this.id = value.getId();
            this.seats = value.getSeats();
            this.description = value.getDescription();
            this.graphic = value.getGraphic();
            return this;
        }

        public PlaneModel build()
        {
            return new PlaneModel(this);
        }

    }
}
