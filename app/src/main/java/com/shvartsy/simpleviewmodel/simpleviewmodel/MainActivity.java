package com.shvartsy.simpleviewmodel.simpleviewmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.click_count_text)
    protected TextView clickCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.increment_button)
    public void incrementClickCount(View button) {
        int currentClickCount = Integer.parseInt(clickCountText.getText().toString());
        clickCountText.setText(String.valueOf(++currentClickCount));
    }
}
