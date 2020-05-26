package com.give.playground1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.give.playground1.adapter.RecyclerViewAdapter;
import com.give.playground1.dialogAlert.DialogAlert;
import com.give.playground1.hide_or_show_on_scroll.HideOrShowOnScroll;
import com.give.playground1.map_marker_drag.MapDragMarkerStatic;
import com.give.playground1.map_marker_drag.MapMarkerDrag;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void showOrHideClick(View view) {
        startActivity(new Intent(this, HideOrShowOnScroll.class));
    }

    public void alertdialogClick(View view) {
        startActivity(new Intent(this, DialogAlert.class));
    }

    public void mapMarkerClick(View view) {
        startActivity(new Intent(this, MapMarkerDrag.class));
    }

    public void mapDragClick(View view) {
        startActivity(new Intent(this, MapDragMarkerStatic.class));
    }
}
