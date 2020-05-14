package com.give.playground1.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.give.playground1.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    String[] texts = {"text1","text2","text3","text4"};

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View frame =  layoutInflater.inflate(R.layout.frame_test,parent,false);
        ViewHolder viewHolder = new ViewHolder(frame);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.textView.setText(texts[position]);

        if(holder.checkBox.isChecked()){
            Log.d("TAG", "checkbox"+ holder.checkBox.getId());
        }
    }

    @Override
    public int getItemCount() {
        return texts.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

         CheckBox checkBox;
         TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.checkBox = itemView.findViewById(R.id.checkbox);
            this.textView = itemView.findViewById(R.id.textview);

        }
    }
}
