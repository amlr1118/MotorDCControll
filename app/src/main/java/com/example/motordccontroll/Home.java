package com.example.motordccontroll;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    private Button btnLVL1;
    private Button btnLVL2;
    private Button btnLVL3;

    ToggleButton tglOnOff;

    TextView tVStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();
    }

    private void init(){
        btnLVL1 = findViewById(R.id.btnLVL1);
        btnLVL2 = findViewById(R.id.btnLVL2);
        btnLVL3 = findViewById(R.id.btnLVL3);

        tglOnOff = findViewById(R.id.tglRelay);

        tVStatus = findViewById(R.id.tVStatus);
    }
}