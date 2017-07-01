package com.shvartsy.archcomponents.viewmodel;

/**
 * ViewModel implementation that logs every count increment.
 */
public class LoggingClickCounterViewModel extends ClickCounterViewModel {
    private final ClickLoggingInterceptor loggingInterceptor;

    public LoggingClickCounterViewModel(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    @Override
    public void setCount(int count) {
        super.setCount(count);
        loggingInterceptor.intercept(count);
    }
}
