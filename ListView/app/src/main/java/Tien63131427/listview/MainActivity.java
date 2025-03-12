package Tien63131427.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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


        // B1: Chuẩn bị dữ liệu
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Việt Nam");
        countries.add("Hoa Kỳ");
        countries.add("Canada");
        countries.add("Nhật Bản");
        countries.add("Pháp");
        countries.add("Đức");
        countries.add("Ý");
        countries.add("Úc");
        countries.add("Trung Quốc");
        countries.add("Singapore");
        countries.add("Thái Lan");
        countries.add("Ấn Độ");

        // B2: Tạo adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        // B3: Gán adapter cho ListView
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // B4: Xử lý sự kiện click trên ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy giá trị được chọn
                String selectedCountry = countries.get(position);
                Toast.makeText(MainActivity.this, "Bạn chọn: " + selectedCountry, Toast.LENGTH_SHORT).show();
            }
        });
    }
}