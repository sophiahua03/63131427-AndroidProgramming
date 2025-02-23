package Tien63131427.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
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
        // Gắn Layout tương ứng với file này

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Đây là bộ lắng nghe và xu lý sự kiện onClick trên nút Tính Tổng
    public void XuLyCong(View view)
    {
        // Tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        // Lấy dữ liệu về ở điều kiện số a
       String strA = editTextSoA.getText().toString(); // strA = "2"

        // Lấy dữ liệu về ở điều kiện số b
        String strB = editTextSoB.getText().toString(); // strB = "5"

        // Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA); //2
        int so_B = Integer.parseInt(strB); //5

        // Tính toán theo yêu cầu
        int tong = so_A + so_B; // 7
        String strTong = String.valueOf(tong); // chuyển sang dạng chuỗi: "7"

        // Hiện kết quả ra màn hình
        editTextKetQua.setText(strTong);
    }

}