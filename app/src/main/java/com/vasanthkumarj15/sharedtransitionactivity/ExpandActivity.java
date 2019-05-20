package com.vasanthkumarj15.sharedtransitionactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class ExpandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_transition);
    }
}
