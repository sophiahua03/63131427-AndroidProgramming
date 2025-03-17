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

public class RectangleActivity extends AppCompatActivity {

    EditText etRectangleA = findViewById(R.id.etRectangleWidth);
    EditText etRectangleB = findViewById(R.id.etRectangleHeight);
    TextView tvRectangleResult = findViewById(R.id.tvRectangleResult);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rectangle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnCalculate = findViewById(R.id.btnRectangleCalculate);

        btnCalculate.setOnClickListener(v -> {
            double width = Double.parseDouble(etRectangleA.getText().toString());
            double height = Double.parseDouble(etRectangleB.getText().toString());
            double perimeter = 2 * (width + height);
            double area = width * height;
            tvRectangleResult.setText("Chu vi: " + perimeter + "\nDiện tích: " + area);
        });
    }
}