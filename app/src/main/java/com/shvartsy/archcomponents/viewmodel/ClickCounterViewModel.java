package com.shvartsy.archcomponents.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

/**
 * Basic view model implementation to illustrate the ViewModel functionality.
 */

public class ClickCounterViewModel extends ViewModel {

    private static final String LOG_TAG = ClickCounterViewModel.class.getSimpleName();

    private int count;

    private boolean doLog = false;

    public ClickCounterViewModel() {}

    public ClickCounterViewModel(boolean doLog) {
        this.doLog = doLog;
    }

    public void setCount(int count) {
        this.count = count;
        if (doLog) {
            log();
        }
    }

    public int getCount() {
        return count;
    }

    private void log() {
        Log.d(LOG_TAG, "processed click.");
    }
}
