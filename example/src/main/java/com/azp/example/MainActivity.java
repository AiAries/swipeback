package com.azp.example;

import android.os.Bundle;

import com.azp.swipeback.SwipeBackActivity;

public class MainActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSwipeBackLayout().setEdgeSize(300);
    }
}
