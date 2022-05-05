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
        imgKapak=findViewById(R.id.imgKapak);

        Glide.with(getApplicationContext())
                .load(resimUrl)
                .fitCenter()
                //.error(R.drawable.errorResim)
                .into(imgKapak);


        recyclerView=findViewById(R.id.rcvHocalar);

        HocaAdapter hocaAdapter=new HocaAdapter(DataUtil.hocaDatasiAl());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(hocaAdapter);


    }
}