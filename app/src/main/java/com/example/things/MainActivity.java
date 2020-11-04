package com.example.things;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView todoList;
    private ListItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todoList = (RecyclerView) findViewById(R.id.rcvItem);
        ArrayList<String> temp = new ArrayList<String>();
        for(int i=0;i<10;i++)
            temp.add("nice This is something I can't expect people to be so nice that they can not be so much idiotically euiqowueiqwueioqwueioquweioquweiqouweioqwue"+i);
        itemAdapter = new ListItemAdapter(this,temp);
        todoList.setAdapter(itemAdapter);
        todoList.setLayoutManager(new LinearLayoutManager(this));
    }

    public void addItem(View v)
    {
        Intent i = new Intent(this,IndividualList.class);
        startActivity(i);
    }
}
