package com.isilsubasi.hafta10;

public class Hoca {

    private String isim;
    private String mail;
    private String resimUrl;

    public Hoca(String isim, String mail, String resimUrl) {
        this.isim = isim;
        this.mail = mail;
        this.resimUrl = resimUrl;
    }

    public String getIsim() {
        return isim;
    }

    public String getMail() {
        return mail;
    }

    public String getResimUrl() {
        return resimUrl;
    }
}
