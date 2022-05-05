package com.isilsubasi.hafta10;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HocaViewHolder extends RecyclerView.ViewHolder {

    ImageView imgHoca;
    TextView txtIsim;
    TextView txtMail;


    public HocaViewHolder(@NonNull View itemView) {
        super(itemView);

        imgHoca=itemView.findViewById(R.id.imgHoca);
        txtIsim=itemView.findViewById(R.id.txtIsim);
        txtMail=itemView.findViewById(R.id.txtMail);


    }
}
