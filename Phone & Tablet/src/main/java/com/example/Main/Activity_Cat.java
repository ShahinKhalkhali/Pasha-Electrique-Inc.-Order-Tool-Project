package com.example.Main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ordertool.R;

public class Activity_Cat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat);

        // Title of Activity Layout
        getSupportActionBar().setTitle("CAT Ethernet Cable");
    }
}