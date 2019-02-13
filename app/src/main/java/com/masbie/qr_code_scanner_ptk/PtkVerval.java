
package com.masbie.qr_code_scanner_ptk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PtkVerval {

    @SerializedName("ptk_id")
    @Expose
    private String ptkId;
    @SerializedName("thn_verval")
    @Expose
    private Integer thnVerval;
    @SerializedName("periode_verval")
    @Expose
    private Integer periodeVerval;
    @SerializedName("instansi_id")
    @Expose
    private Integer instansiId;

    public String getPtkId() {
        return ptkId;
    }

    public void setPtkId(String ptkId) {
        this.ptkId = ptkId;
    }

    public Integer getThnVerval() {
        return thnVerval;
    }

    public void setThnVerval(Integer thnVerval) {
        this.thnVerval = thnVerval;
    }

    public Integer getPeriodeVerval() {
        return periodeVerval;
    }

    public void setPeriodeVerval(Integer periodeVerval) {
        this.periodeVerval = periodeVerval;
    }

    public Integer getInstansiId() {
        return instansiId;
    }

    public void setInstansiId(Integer instansiId) {
        this.instansiId = instansiId;
    }

}
