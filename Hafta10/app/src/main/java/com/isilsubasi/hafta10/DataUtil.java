package com.isilsubasi.hafta10;

import java.util.ArrayList;

public class DataUtil {


    private static ArrayList<Hoca> hocaArrayList=new ArrayList<>();

    public static ArrayList<Hoca> hocaDatasiAl(){

        hocaArrayList.add(new Hoca(
           "Prof.Dr. Mehmet İPŞİRLİ",
           "mipsirli@medipol.edu.tr",
           "https://www.medipol.edu.tr/medium/remote/%23kAYWkkW6J_AkPF5dGKM32elOU7kDFmwvE5dbL%7cNfQ%7cY%3d.vrf"

        ));
        hocaArrayList.add(new Hoca(
                "Dr.Öğr.Üye. Hakan ŞAHİN",
                "hsahin@medipol.edu.tr",
                "https://www.medipol.edu.tr/medium/remote/%23kAYWkkW6J_AkPF5dGKM32elOU7kDFmwvvQeyORMhdHQ%3d.vrf"

        ));

        hocaArrayList.add(new Hoca(
                "Dr.Öğr.Üye. Hande YILMAZ",
                "handeyilmaz@medipol.edu.tr",
                "https://www.medipol.edu.tr/medium/remote/%23kAYWkkW6J_AkPF5dGKM32elOU7kDFmwvZ_ndM_kzWPA%3d.vrf"

        ));

        return hocaArrayList;
    }



}
