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

public class TriangleActivity extends AppCompatActivity {

    EditText etTriangleA = findViewById(R.id.etTriangleA);
    EditText etTriangleB = findViewById(R.id.etTriangleB);
    EditText etTriangleC = findViewById(R.id.etTriangleC);
    TextView tvTriangleResult = findViewById(R.id.tvTriangleResult);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triangle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnTriangleCalculate = findViewById(R.id.btnTriangleCalculate);

        btnTriangleCalculate.setOnClickListener(v -> {
            double a = Double.parseDouble(etTriangleA.getText().toString());
            double b = Double.parseDouble(etTriangleB.getText().toString());
            double c = Double.parseDouble(etTriangleC.getText().toString());

            double perimeter = a + b + c;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            tvTriangleResult.setText("Chu vi: " + perimeter + "\nDiện tích: " + area);
        });

    }
}