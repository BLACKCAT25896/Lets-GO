package com.bmsrental.letsgo.common;

import com.bmsrental.letsgo.model.DriverInfoModel;

public class Common {
    public static final String USER_INFO_REF = "UserInfoRef";
    public static DriverInfoModel currentUser;
    public static String DRIVER_LOCATION_REFERENCE = "DriversLocation";

    public static String buildWelcomeMessage() {
        if (Common.currentUser!=null){
            return new StringBuilder("Welcome ")
                    .append(Common.currentUser.getFirst_name())
                    .append(" ")
                    .append(Common.currentUser.last_name)
                    .toString();

        }
        else
            return "";

    }
}
