package com.shvartsy.archcomponents.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Basic view model implementation to illustrate the ViewModel functionality.
 */

public class ClickCounterViewModel extends ViewModel {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
