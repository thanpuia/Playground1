package com.give.playground1.dialogAlert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.give.playground1.R;

public class DialogAlert extends AppCompatActivity {

    String districtsAndScheme[] = {"Kolasib","Champhai","Lawngtlai","Aizawl","others","PMEGY","Blue Revolution","other"};
    boolean[] checkednames= new boolean[]{false,false,false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_alert);


    }

    public void alertDialog(View view) {
        // Log.d("TAG","FILTER CLCK");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select District and Scheme");
        builder.setMultiChoiceItems(districtsAndScheme, checkednames, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                checkednames[which] = isChecked;
            }
        });

        builder.setPositiveButton("Filter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                for(int j =0;j<checkednames.length;j++){
                    if(checkednames[j]){
                        Log.d("TAG","SELECT ITEM: "+ districtsAndScheme[j]);
                    }
                }
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();


    }

    public void cutomDialogBtnClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Filters");

        //SET THE CUSTOM LAYOUT
        final View customLayout = getLayoutInflater().inflate(R.layout.custom_alert_dialog,null);
        builder.setView(customLayout);

        builder.setPositiveButton("Filter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            //    TextView editText = customLayout.findViewById(R.id.editText);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
