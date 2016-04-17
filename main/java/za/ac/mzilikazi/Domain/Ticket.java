package za.ac.mzilikazi.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Ticket implements Serializable{
    private Long id;
    private List<Coupon> couponList;
    private String ticketingCode;
    private int number;

    public Ticket() {
    }

    public Ticket(Builder builder){
        id = builder.id;
        couponList = builder.couponList;
        ticketingCode = builder.ticketingCode;
        number = builder.number;
    }
    public Long getId(){return id;}

    public List<Coupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<Coupon> couponList) {
        this.couponList = couponList;
    }

    public String getTicketingCode() {
        return ticketingCode;
    }

    public void setTicketingCode(String ticketingCode) {
        this.ticketingCode = ticketingCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static class Builder{
        private Long id;
        private List<Coupon> couponList;
        private String ticketingCode;
        private int number;

        public Builder id(Long value)
        {
            this.id = value;
            return  this;
        }

        public Builder couponList(List<Coupon> value)
        {
            this.couponList = value;
            return this;
        }

        public Builder ticketingCode(String value)
        {
            this.ticketingCode = value;
            return this;
        }

        public Builder number(int value)
        {
            this.number = value;
            return this;
        }

        public Builder copy(Ticket value)
        {
            this.id = value.getId();
            this.couponList = value.getCouponList();
            this.ticketingCode = value.getTicketingCode();
            this.number = value.getNumber();
            return this;
        }

        public Ticket build()
        {
            return  new Ticket(this);
        }

    }
}
