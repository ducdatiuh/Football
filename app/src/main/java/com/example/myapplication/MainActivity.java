package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFootball;
    ArrayList<Football>arrayFootball;
    FootballAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter=new FootballAdapter(this, R.layout.foot_ball,arrayFootball);

        lvFootball.setAdapter(adapter);
    }

    private void AnhXa() {
        lvFootball=findViewById(R.id.listviewdb);
        arrayFootball=new ArrayList<>();

        arrayFootball.add(new Football(R.drawable.rnd,"Ronaldo","1975",R.drawable.vn));
    }
}
