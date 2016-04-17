package za.ac.mzilikazi.Domain;

import java.io.Serializable;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Coupon implements Serializable{
    private Long id;
    private String dateOfRedemption;
    private String airplaneClass;
    private String standby;
    private int mealCode;

    public Coupon() {
    }

    public Coupon(Builder builder) {
        id = builder.id;
        dateOfRedemption = builder.dateOfRedemption;
        airplaneClass = builder.airplaneClass;
        standby = builder.standby;
        mealCode = builder.mealCode;

    }
    public Long getId(){return id;}

    public String getDateOfRedemption() {
        return dateOfRedemption;
    }

    public void setDateOfRedemption(String dateOfRedemption) {
        this.dateOfRedemption = dateOfRedemption;
    }

    public String getAirplaneClass() {
        return airplaneClass;
    }

    public void setAirplaneClass(String airplaneClass) {
        this.airplaneClass = airplaneClass;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }

    public int getMealCode() {
        return mealCode;
    }

    public void setMealCode(int mealCode) {
        this.mealCode = mealCode;
    }

    public static class Builder
    {
        private Long id;
        private String dateOfRedemption;
        private String airplaneClass;
        private String standby;
        private int mealCode;

        public Builder id(Long value)
        {
            this.id = value;
            return  this;
        }

        public Builder dateOfRedemption(String value)
        {
            this.dateOfRedemption = value;
            return  this;
        }

        public Builder airplaneClass(String value)
        {
            this.airplaneClass = value;
            return  this;
        }

        public Builder standby(String value)
        {
            this.standby = value;
            return  this;
        }

        public Builder mealCode(int value)
        {
            this.mealCode = value;
            return  this;
        }

        public  Builder copy(Coupon value)
        {
            this.id = value.getId();
            this.dateOfRedemption = value.getDateOfRedemption();
            this.airplaneClass = value.getAirplaneClass();
            this.standby = value.getStandby();
            this.mealCode = value.getMealCode();
            return this;
        }


        public Coupon build()
        {
            return new Coupon(this);
        }

    }
}
