package com.masbie.qr_code_scanner_ptk;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
public class GetPost {
    @SerializedName("ptk")
    private ArrayList<Ptk> ptkArrayList;

    public ArrayList<Ptk> getPtkArrayList() {
        return ptkArrayList;
    }
    //    @SerializedName("ptk_id")
//    private int ptk_id;
//    @SerializedName("npk")
//    private int npk;
//    @SerializedName("nik")
//    private int nik;
//    @SerializedName("nama")
//    private String nama;
//    @SerializedName("tmp_lahir")
//    private String tmp_lahir;
//    @SerializedName("kelamin")
//    private char kelamin;
//    @SerializedName("thn_lulus_sd")
//    private int thn_lulus_sd;
//    @SerializedName("instansi_id")
//    private int instansi_id;
//    @SerializedName("foto")
//    private String foto;
//    @SerializedName("thn_verval")
//    private int thn_verval;
//    @SerializedName("akun_id")
//    private int akun_id;



//    public int getPtk_id() {
//        return ptk_id;
//    }

//    public int getNpk() {
//        return npk;
//    }
//
//    public int getNik() {
//        return nik;
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public String getTmp_lahir() {
//        return tmp_lahir;
//    }
//
//    public char getKelamin() {
//        return kelamin;
//    }
//
//    public int getThn_lulus_sd() {
//        return thn_lulus_sd;
//    }
//
//    public int getInstansi_id() {
//        return instansi_id;
//    }
//
//    public String getFoto() {
//        return foto;
//    }
//
//    public int getThn_verval() {
//        return thn_verval;
//    }
//
//    public int getAkun_id() {
//        return akun_id;
//    }

}
