package za.ac.mzilikazi.conf;

import za.ac.mzilikazi.Domain.Coupon;

/**
 * Created by mandisi on 2016-04-17.
 */
public interface CouponFactory {
    Coupon createCoupon(String dateOfRedemption, String airplaneClass,
    String standby, int mealCode);


}
