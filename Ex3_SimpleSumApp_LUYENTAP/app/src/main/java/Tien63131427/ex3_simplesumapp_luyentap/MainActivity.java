package Tien63131427.ex3_simplesumapp_luyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2, edtResults;
    Button btnstart;
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

        TimDieuKhien();
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum();
            }
        });

    }

    void TimDieuKhien()
    {
        edtSo1 = (EditText) findViewById(R.id.edtSo1);
        edtSo2 = (EditText) findViewById(R.id.edtSo2);
        edtResults = (EditText) findViewById(R.id.edtResult);
        btnstart = (Button) findViewById(R.id.btnSum);
    }



    public void Sum()
    {
        String so1 = edtSo1.getText().toString();
        String so2 = edtSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2;
        String KetQua = String.valueOf(tong);
        edtResults.setText(KetQua);


    }
}