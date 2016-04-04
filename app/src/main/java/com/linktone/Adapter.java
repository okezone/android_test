package com.linktone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by souttab on 04/04/16.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolders> {

    private String[] dataSet;
    private Context context;

    public Adapter(String[] dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.textViewAndroid.setText(dataSet[position]);
    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }

    class ViewHolders extends RecyclerView.ViewHolder {

        private TextView textViewAndroid;

        public ViewHolders(View itemView) {
            super(itemView);
        }
    }
}
