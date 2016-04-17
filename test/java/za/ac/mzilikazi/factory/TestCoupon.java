package za.ac.mzilikazi.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.Domain.Seat;
import za.ac.mzilikazi.conf.CouponFactory;
import za.ac.mzilikazi.conf.SeatFactory;
import za.ac.mzilikazi.conf.impl.CouponFactoryImpl;
import za.ac.mzilikazi.conf.impl.SeatFactoryImpl;

/**
 * Created by mandisi on 2016-04-17.
 */
public class TestCoupon {
    private CouponFactory couponFactory;
    private SeatFactory seatFactory;
    private Seat seat;
    @Before
    public void setUpCoupon() throws Exception {
        couponFactory = CouponFactoryImpl.getInstance();
        seatFactory = SeatFactoryImpl.getInstance();
        seat = seatFactory.createSeats("1",372,"Business class");
    }
    @Test
    public void testCoupon() throws Exception {
        Coupon coup = couponFactory.createCoupon("21 May 2015","Business class","go-show", 127);
        Assert.assertEquals(coup.getMealCode(),127);
    }

    @Test
    public void testUpdateCoupon() throws Exception {
        Coupon coup = couponFactory.createCoupon("21 May 2015","Business class","go-show", 127);
        Coupon updateCoup = new Coupon.Builder().copy(coup).mealCode(173).build();
        Assert.assertEquals(updateCoup.getMealCode(),173);

    }
}
