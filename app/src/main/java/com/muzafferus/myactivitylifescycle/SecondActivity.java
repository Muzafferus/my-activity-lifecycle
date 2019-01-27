package com.muzafferus.myactivitylifescycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.e("ActivityLifecycle", "Second activity started!");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e("ActivityLifecycle", "Second activity: onBackPressed!");

    }
}
