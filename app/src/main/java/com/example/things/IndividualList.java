package com.example.things;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class IndividualList extends AppCompatActivity {

    private EditText Title, Content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_list);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
