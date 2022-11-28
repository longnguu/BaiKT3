package com.example.a2050531200222_levanlong_baikt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<PhepTinh> items = new ArrayList<>();
    PhepTinhAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listPhepTinh);

        items.add(new PhepTinh("Phép cộng",R.drawable.icon_add)) ;
        items.add(new PhepTinh("Phép trừ",R.drawable.icon_minus)) ;
        items.add(new PhepTinh("Phép nhân",R.drawable.icon_clear)) ;
        items.add(new PhepTinh("Phép chia",R.drawable.icon_chia)) ;
        items.add(new PhepTinh("Phép Logarit",R.drawable.icon_logarit));
        items.add(new PhepTinh("Phép Mũ",R.drawable.icon_mu));
        items.add(new PhepTinh("Phép căn bậc 2",R.drawable.icon_can));


        adapter = new PhepTinhAdapter(MainActivity.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailPhepTinh.class);
                intent.putExtra("thuchien",i);
                startActivity(intent);
            }
        });

    }
}