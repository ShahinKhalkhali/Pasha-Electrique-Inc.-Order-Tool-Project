package com.example.Main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ordertool.R;

public class Activity_Lumex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lumex);

        // Title of Activity Layout
        getSupportActionBar().setTitle("Lumex Cable");
    }
}