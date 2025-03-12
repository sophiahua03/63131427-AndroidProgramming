package tien63131427.autocompletetv;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

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

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Táo");
        fruits.add("Chuối");
        fruits.add("Cherry");
        fruits.add("Nho");
        fruits.add("Xoài");
        fruits.add("Cam");
        fruits.add("Dứa");
        fruits.add("Dâu");
        fruits.add("Ổi");
        fruits.add("Dừa");
        fruits.add("Mận");

        // B2: Tạo adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, fruits);

        // B3: Gán adapter cho AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);

    }
}