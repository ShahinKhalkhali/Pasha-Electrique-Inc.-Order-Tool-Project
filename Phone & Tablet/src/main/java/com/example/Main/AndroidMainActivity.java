package com.example.Main;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ordertool.R;

public class AndroidMainActivity extends AppCompatActivity {
    // Displays main interface
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        // Orient main layout to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Button bindings and onClick listeners
        findViewById(R.id.imageTECK).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, TECKActivity.class)));
        findViewById(R.id.imageLUMEX).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, LUMEXActivity.class)));
        findViewById(R.id.imageBX).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, BXActivity.class)));
        findViewById(R.id.imageBARE).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, BAREActivity.class)));
        findViewById(R.id.image18BROWN).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, BROWN18Activity.class)));
        findViewById(R.id.imageNMWU).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, NMWUActivity.class)));
        findViewById(R.id.imageCAT).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, CATActivity.class)));
        findViewById(R.id.imageSOLSTR).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, SOLSTRActivity.class)));
        findViewById(R.id.imageTOOLS).setOnClickListener(v -> startActivity(new Intent(AndroidMainActivity.this, TOOLActivity.class)));

    }
}