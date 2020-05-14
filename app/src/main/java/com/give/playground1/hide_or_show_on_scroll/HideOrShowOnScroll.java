package com.give.playground1.hide_or_show_on_scroll;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.give.playground1.R;

import java.util.ArrayList;

public class HideOrShowOnScroll extends AppCompatActivity implements ObservableScrollViewCallbacks {
    ObservableListView observableListView;
    Button hideShowEgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_or_show_on_scroll);

        observableListView = findViewById(R.id.observeListView);
        hideShowEgBtn = findViewById(R.id.buttHide);
        observableListView.setScrollViewCallbacks(this);

        // Add these codes after ListView initialization
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            items.add("Item " + i);
        }
        observableListView.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, items));

    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
       ActionBar ab = getSupportActionBar();

        if (scrollState == ScrollState.UP) {
            if (ab.isShowing()) {
                ab.hide();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (!ab.isShowing()) {
                ab.show();
            }
        }

    }
}
