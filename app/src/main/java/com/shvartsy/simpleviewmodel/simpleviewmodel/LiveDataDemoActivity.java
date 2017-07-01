package com.shvartsy.simpleviewmodel.simpleviewmodel;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LiveDataDemoActivity extends LifecycleActivity {

    private LiveDataTimerViewModel liveDataTimerViewModel;

    private final Observer<Long> elapsedTimeObserver = new Observer<Long>() {
        @Override
        public void onChanged(@Nullable final Long newValue) {
            String newText = LiveDataDemoActivity.this.getResources().getString(
                    R.string.seconds, newValue);
            displayTimerValue(newText);
        }
    };

    @BindView(R.id.timer_value_text)
    protected TextView timerValueText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedata_demo);
        ButterKnife.bind(this);

        liveDataTimerViewModel = ViewModelProviders.of(this).get(LiveDataTimerViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        subscribeElapsedTimeObserver();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unsubscribeElapsedTimeObserver();
    }

    private void subscribeElapsedTimeObserver() {
        liveDataTimerViewModel.getElapsedTime().observe(this, elapsedTimeObserver);
    }

    private void unsubscribeElapsedTimeObserver() {
        liveDataTimerViewModel.getElapsedTime().removeObserver(elapsedTimeObserver);
    }

    private void displayTimerValue(String value) {
        timerValueText.setText(String.valueOf(value));
    }
}
