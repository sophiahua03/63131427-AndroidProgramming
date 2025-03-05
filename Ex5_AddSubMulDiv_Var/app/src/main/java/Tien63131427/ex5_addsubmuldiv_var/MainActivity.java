package Tien63131427.ex5_addsubmuldiv_var;

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

        TimView();
        nutCong.setOnClickListener(XuLyCong);
        nutTru.setOnClickListener(XuLyTru);
        nutNhan.setOnClickListener(XuLyNhan);
        nutChia.setOnClickListener(XuLyChia);

    }

    View.OnClickListener XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 + num2;
            String ChuoiKQ = String.valueOf(tong);
            editTextKetQua.setText(ChuoiKQ);
        }
    };
    View.OnClickListener XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 - num2;
            String ChuoiKQ = String.valueOf(tong);
            editTextKetQua.setText(ChuoiKQ);
        }
    };
    View.OnClickListener XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 * num2;
            String ChuoiKQ = String.valueOf(tong);
            editTextKetQua.setText(ChuoiKQ);
        }
    };
    View.OnClickListener XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 / num2;
            String ChuoiKQ = String.valueOf(tong);
            editTextKetQua.setText(ChuoiKQ);
        }
    };

    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong, nutTru, nutChia, nutNhan;
    void TimView()
    {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKetQua = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
}