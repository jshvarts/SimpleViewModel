package com.shvartsy.archcomponents.viewmodel;

import android.arch.lifecycle.ViewModel;

public class LoggingClickCounterViewModelFactory extends BaseClickCounterViewModelFactory {

    private final ClickLoggingInterceptor loggingInterceptor;

    public LoggingClickCounterViewModelFactory(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.equals(LoggingClickCounterViewModel.class)) {
            return (T) new LoggingClickCounterViewModel(loggingInterceptor);
        }
        return (T) super.create(ClickCounterViewModel.class);
    }
}
