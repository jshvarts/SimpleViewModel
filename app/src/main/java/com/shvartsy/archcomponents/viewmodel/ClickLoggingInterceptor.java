package com.shvartsy.archcomponents.viewmodel;

import android.util.Log;

public class ClickLoggingInterceptor {
    private static final String LOG_TAG = ClickLoggingInterceptor.class.getSimpleName();

    public void intercept(int clickCount) {
        Log.d(LOG_TAG, "processed click " + clickCount);
    }
}
