package Tien63131427.ex_bottomnavigtiondemo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottmNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //1. Tạo DB openOrCreateDatabase(tên file csdl, quyền truy cập, null)
        SQLiteDatabase csdl = openOrCreateDatabase("QuanLySach db",MODE_PRIVATE,null);

        //

        bottmNav = findViewById(R.id.bot_nav);
        bottmNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuItemDuocChonID = item.getItemId();
//                if (menuItemDuocChonID == R.id.bot_home)
//                {
//                   // fragMen.beginTransaction().replace(R.id.frgView, new HomeFragment()).commit();
//                    //Toast.makeText(MainActivity.this, "Thay HOME", Toast.LENGTH_LONG).show();
//                }
//                //{
//                // else if (menuItemDuocChonID == R.id.bot_search)
//                // {
//                //
//                // }
//                //
//                //
//                //
//                //
//                //
//                //
//
                return true;

//                Fragment fragmentMoi = new Fragment();
//                if (menuItemDuocChonID == R.id.bot_home)
//                    fragmentMoi = new HomeFragment();
//
//                fragMan.beginTransaction().replace(R.id.frgView,fragmentMoi).commit();
//
            }
        });
    }
}