package com.isilsubasi.hafta10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HocaAdapter extends RecyclerView.Adapter<HocaViewHolder> {

    ArrayList<Hoca> hocalar=new ArrayList<>();

    public HocaAdapter(ArrayList<Hoca> hocalar) {
        this.hocalar = hocalar;
    }

    @NonNull
    @Override
    public HocaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_ogretmen,parent,false);
        return new HocaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HocaViewHolder viewHolder, int position) {

        viewHolder.txtMail.setText(hocalar.get(position).getMail());
        viewHolder.txtIsim.setText(hocalar.get(position).getIsim());


    }

    @Override
    public int getItemCount() {
        return hocalar.size();
    }
}
