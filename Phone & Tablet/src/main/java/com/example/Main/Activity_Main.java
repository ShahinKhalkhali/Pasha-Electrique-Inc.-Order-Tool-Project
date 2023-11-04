package com.example.Main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ordertool.R;

public class Activity_Main extends AppCompatActivity {
    // Displays main interface
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        // Button bindings and onClick listeners
        findViewById(R.id.imageTECK).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Teck.class)));
        findViewById(R.id.imageLUMEX).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Lumex.class)));
        findViewById(R.id.imageBX).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_BX.class)));
        findViewById(R.id.imageBARE).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Bare.class)));
        findViewById(R.id.image18BROWN).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Brown18.class)));
        findViewById(R.id.imageNMWU).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_NMWU.class)));
        findViewById(R.id.imageCAT).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Cat.class)));
        findViewById(R.id.imageSOLSTR).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Sol_Str.class)));
        findViewById(R.id.imageTOOLS).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageEMTPART).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageEMTPART).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageFUSE).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageHVAC).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageLIGHTING).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imagePVCPART).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageSWITCHES).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));
        findViewById(R.id.imageTRANSFORMER).setOnClickListener(v -> startActivity(new Intent(Activity_Main.this, Activity_Tool.class)));

    }

}