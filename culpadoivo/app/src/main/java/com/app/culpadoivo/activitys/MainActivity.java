package com.app.culpadoivo.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.culpadoivo.R;
import com.app.culpadoivo.room.AppDb;
import com.app.culpadoivo.room.Database;

public class MainActivity extends AppCompatActivity {
private AppDb db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Database.getDatabase(this);
    }
}