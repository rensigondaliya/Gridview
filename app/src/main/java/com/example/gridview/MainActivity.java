package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView lv1 ;
    String name[] = {"android","redmi","realme","mi","iphone","nokia","micromax","rezer","sewon","posh","honor","vertu","poko","oppo","vivo","oneplas","sumsung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1= findViewById(R.id.lv1);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,name);
        lv1.setAdapter(arrayAdapter);


        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this , "you select "+name[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}