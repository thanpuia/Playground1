package com.give.playground1.toobar_customize;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.give.playground1.R;

public class ToolbarCustomize extends AppCompatActivity {

    EditText toolbarEdittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_customize);

        //*TODO::
        /*
        :: 1. CREATE XML LAYOUT FOR THE TOOLBAR LAYOUT
        :: 2. ADD THIS
         ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setCustomView(R.layout.m_toolbar);

        toolbarEdittext = actionBar.getCustomView().findViewById(R.id.toobarEditText);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);
        ::

        //TODO :: ADD THIS IN THE THEME TO INCREASE THE SIZE OF THE HEIGH OF THE TOOLBAR
        <item name="actionBarSize">158dp</item>

        */
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setCustomView(R.layout.m_toolbar);

        toolbarEdittext = actionBar.getCustomView().findViewById(R.id.toobarEditText);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);

    }
}
