
package com.masbie.qr_code_scanner_ptk;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetPost {

    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("statikUrl")
    @Expose
    private String statikUrl;
    @SerializedName("ptk")
    @Expose
    private Ptk ptk;
//    @SerializedName("ptk_verval")
//    @Expose
//    private List<PtkVerval> ptkVerval = null;
//    @SerializedName("instansi")
//    @Expose
//    private Instansi instansi;
//    @SerializedName("instansi_verval")
//    @Expose
//    private InstansiVerval instansiVerval;
//    @SerializedName("data_asal")
//    @Expose
//    private Object dataAsal;
//    @SerializedName("is_gugat")
//    @Expose
//    private Boolean isGugat;
//    @SerializedName("thn_verval")
//    @Expose
//    private Integer thnVerval;
//    @SerializedName("periode_verval")
//    @Expose
//    private Integer periodeVerval;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getStatikUrl() {
        return statikUrl;
    }

    public void setStatikUrl(String statikUrl) {
        this.statikUrl = statikUrl;
    }

    public Ptk getPtk() {
        return ptk;
    }

    public void setPtk(Ptk ptk) {
        this.ptk = ptk;
    }

//    public List<PtkVerval> getPtkVerval() {
//        return ptkVerval;
//    }
//
//    public void setPtkVerval(List<PtkVerval> ptkVerval) {
//        this.ptkVerval = ptkVerval;
//    }
//
//    public Instansi getInstansi() {
//        return instansi;
//    }
//
//    public void setInstansi(Instansi instansi) {
//        this.instansi = instansi;
//    }
//
//    public InstansiVerval getInstansiVerval() {
//        return instansiVerval;
//    }
//
//    public void setInstansiVerval(InstansiVerval instansiVerval) {
//        this.instansiVerval = instansiVerval;
//    }
//
//    public Object getDataAsal() {
//        return dataAsal;
//    }
//
//    public void setDataAsal(Object dataAsal) {
//        this.dataAsal = dataAsal;
//    }
//
//    public Boolean getIsGugat() {
//        return isGugat;
//    }
//
//    public void setIsGugat(Boolean isGugat) {
//        this.isGugat = isGugat;
//    }
//
//    public Integer getThnVerval() {
//        return thnVerval;
//    }
//
//    public void setThnVerval(Integer thnVerval) {
//        this.thnVerval = thnVerval;
//    }
//
//    public Integer getPeriodeVerval() {
//        return periodeVerval;
//    }
//
//    public void setPeriodeVerval(Integer periodeVerval) {
//        this.periodeVerval = periodeVerval;
//    }

}
