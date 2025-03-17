package com.example.chuvi_dientich;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTriangle, btnRectangle, btnSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnTriangle = (Button) findViewById(R.id.btnTriangle);
        btnSquare =(Button) findViewById((R.id.btnSquare));
        btnRectangle = (Button) findViewById(R.id.btnRectangle);

        btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent triangle = new Intent(MainActivity.this, TriangleActivity.class);
                startActivity(triangle);
            }
        });

        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rectangle = new Intent(MainActivity.this, RectangleActivity.class);
                startActivity(rectangle);
            }
        });

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent square = new Intent(MainActivity.this, SquareActivity.class);
                startActivity(square);
            }
        });
    }
}