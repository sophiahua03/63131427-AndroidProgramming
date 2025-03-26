package Tien63131427.ex_usingrecyclerview;

import android.os.Bundle;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandscape;

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

        recyclerViewDatas = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        recyclerViewLandscape.setLayoutManager(layoutLinear);

//        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);

        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);

        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsHinhAnh = new ArrayList<LandScape>();
        dsHinhAnh.add(new LandScape("flagtowerofhanoi","Cột cờ Hà Nội"));
        dsHinhAnh.add(new LandScape("buckingham","Cung điện Buckingham"));
        dsHinhAnh.add(new LandScape("effel","Tháp Effel"));
        dsHinhAnh.add(new LandScape("statue_of_liberty","Tượng Nữ thần tự do"));
        return dsHinhAnh;
    }
}