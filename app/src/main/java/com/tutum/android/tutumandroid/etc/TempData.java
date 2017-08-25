package com.tutum.android.tutumandroid.etc;

/**
 * Created by godjakoo on 2017. 8. 25..
 */

public class TempData {
    private static String mUserID= "";
    private static String mUserPW= "";

    public static void setID(String v){ mUserID= v; }
    public static void setPW(String v){ mUserPW= v; }

    public static String getID(){ return mUserID; }
    public static String getPW(){ return mUserPW; }
}
