package com.example.chuvi_dientich;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_square);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etSquare = findViewById(R.id.etSquare);
        TextView tvSquareResult = findViewById(R.id.tvSquareResult);
        Button btnSquareCalculate = findViewById(R.id.btnSquareCalculate);

        btnSquareCalculate.setOnClickListener(v -> {
            double side = Double.parseDouble(etSquare.getText().toString());
            double perimeter = 4 * side;
            double area = side * side;
            tvSquareResult.setText("Chu vi: " + perimeter + "\nDiện tích: " + area);
        });

    }
}