package com.khwansakun.smartshopping.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;

public class InternetConnectionData1 {

    /** CHECK WHETHER INTERNET CONNECTION IS AVAILABLE OR NOT */
    public static boolean checkConnection(@NonNull Context context) {
        return  ((ConnectivityManager) context.getSystemService
                (Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }
}
