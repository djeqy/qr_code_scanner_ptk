
package com.masbie.qr_code_scanner_ptk;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InstansiVerval {

    @SerializedName("instansi_id")
    @Expose
    private Integer instansiId;
    @SerializedName("thn_verval")
    @Expose
    private Integer thnVerval;
    @SerializedName("periode_verval")
    @Expose
    private Integer periodeVerval;
    @SerializedName("is_verval")
    @Expose
    private String isVerval;
    @SerializedName("wkt_ajuan")
    @Expose
    private List<String> wktAjuan = null;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("wkt_setuju")
    @Expose
    private List<String> wktSetuju = null;
    @SerializedName("is_rekap")
    @Expose
    private String isRekap;
    @SerializedName("wkt_tunggu")
    @Expose
    private Object wktTunggu;
    @SerializedName("akun_id")
    @Expose
    private String akunId;

    public Integer getInstansiId() {
        return instansiId;
    }

    public void setInstansiId(Integer instansiId) {
        this.instansiId = instansiId;
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

    public String getIsVerval() {
        return isVerval;
    }

    public void setIsVerval(String isVerval) {
        this.isVerval = isVerval;
    }

    public List<String> getWktAjuan() {
        return wktAjuan;
    }

    public void setWktAjuan(List<String> wktAjuan) {
        this.wktAjuan = wktAjuan;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getWktSetuju() {
        return wktSetuju;
    }

    public void setWktSetuju(List<String> wktSetuju) {
        this.wktSetuju = wktSetuju;
    }

    public String getIsRekap() {
        return isRekap;
    }

    public void setIsRekap(String isRekap) {
        this.isRekap = isRekap;
    }

    public Object getWktTunggu() {
        return wktTunggu;
    }

    public void setWktTunggu(Object wktTunggu) {
        this.wktTunggu = wktTunggu;
    }

    public String getAkunId() {
        return akunId;
    }

    public void setAkunId(String akunId) {
        this.akunId = akunId;
    }

}
