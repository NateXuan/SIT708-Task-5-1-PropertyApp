package com.example.sit708_task_5_1_property;

import android.os.Bundle;
import android.telephony.ims.RcsUceAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private LinearLayoutManager linearLayoutManager;
    private RvAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.horizontalRv);

        int []array = new int[6];
        Arrays.fill(array, R.drawable.ic_launcher_background);

        linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        rvAdapter = new RvAdapter(array);
        rv.setAdapter(rvAdapter);
        rv.setHasFixedSize(true);
    }
}