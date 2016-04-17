package za.ac.mzilikazi.Domain;

/**
 * Created by mandisi on 2016-04-16.
 */
public class PiecesOfLuggage {
    private Long id;
    private String number;
    private String weight;

    public PiecesOfLuggage() {
    }

    public PiecesOfLuggage(Builder builder){
        id = builder.id;
        number = builder.number;
        weight = builder.weight;
    }
    public Long getId(){return id;}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public class Builder{
        private Long id;
        private String number;
        private String weight;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder number(String value){
            this.number = value;
            return this;
        }

        public Builder weight(String value){
            this.weight = value;
            return this;
        }
        public Builder copy(PiecesOfLuggage value){
            this.id = value.getId();
            this.number = value.getNumber();
            this.weight = value.getWeight();
            return this;
        }
        public PiecesOfLuggage build(){
            return new PiecesOfLuggage(this);
        }
    }
}
