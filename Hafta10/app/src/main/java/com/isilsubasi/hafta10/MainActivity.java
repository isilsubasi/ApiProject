package com.isilsubasi.hafta10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imgKapak;
    String resimUrl="http://isilsubasi.xtgem.com/hafta10/medipolniversitesi.jpg";

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    private void init(){
        kapakResminiCek();
        initRecyclerView();



    }

    private void kapakResminiCek(){
        imgKapak=findViewById(R.id.imgKapak);
        GlideUtil.resmiIndiripGoster(getApplicationContext(),resimUrl,imgKapak);

    }


    private void initRecyclerView(){
        recyclerView=findViewById(R.id.rcvHocalar);

        HocaAdapter hocaAdapter=new HocaAdapter(DataUtil.hocaDatasiAl(),getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(hocaAdapter);

    }



}