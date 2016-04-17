package za.ac.mzilikazi.conf.impl;

import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.conf.CouponFactory;

/**
 * Created by mandisi on 2016-04-17.
 */
public class CouponFactoryImpl implements CouponFactory
{
    private static CouponFactoryImpl couponFactory= null;

    private CouponFactoryImpl()
    {

    }

    public  static CouponFactoryImpl getInstance ()
    {
        if(couponFactory == null)
            couponFactory = new CouponFactoryImpl();
        return  couponFactory;
    }

    public Coupon createCoupon(String dateOfRedemption, String airplaneClass, String standby,
                                       int mealCode)
    {
        Coupon coupon = new Coupon.Builder().dateOfRedemption(dateOfRedemption).airplaneClass(airplaneClass)
                .standby(standby).mealCode(mealCode).build();
        return coupon;
    }

}
