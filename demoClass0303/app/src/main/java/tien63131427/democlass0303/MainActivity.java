package tien63131427.democlass0303;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnSayHi;

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

        btnSayHi = findViewById(R.id.btnSayHello);
        //Tạo và gán bộ lắng nghe ẩn danh mà không cần khai báo biến
        btnSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
            }
        });

    }

    // 2.1 Listener in Variable
    // B1 + B2
    //View.OnClickListener boLangNghe_XinChao = new View.OnClickListener()
    //{
      //  public void onClick (View v)
        //{
            // Example: hiện thông báo nhanh bằng lớp Toast
            // Toast.makeText(Ngữ_Cảnh, nội dung_thong_bao, thời gian hiện).show();
          //  Toast.makeText(MainActivity.this, "Hello Class", Toast.LENGTH_SHORT).show();
        //}
    //};
}