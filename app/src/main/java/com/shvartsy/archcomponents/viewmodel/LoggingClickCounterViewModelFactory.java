package com.shvartsy.archcomponents.viewmodel;

import android.arch.lifecycle.ViewModelProvider;

public class LoggingClickCounterViewModelFactory implements ViewModelProvider.Factory {
    @Override
    public ClickCounterViewModel create(Class viewModelClass) {
        return new ClickCounterViewModel(true);
    }
}
