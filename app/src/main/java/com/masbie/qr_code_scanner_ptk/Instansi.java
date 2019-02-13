
package com.masbie.qr_code_scanner_ptk;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Instansi {

    @SerializedName("instansi_id")
    @Expose
    private Integer instansiId;
    @SerializedName("jenis_instansi")
    @Expose
    private List<Integer> jenisInstansi = null;
    @SerializedName("jenis_sekolah")
    @Expose
    private List<Object> jenisSekolah = null;
    @SerializedName("group_bimas")
    @Expose
    private List<Object> groupBimas = null;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("is_negeri")
    @Expose
    private String isNegeri;
    @SerializedName("jenjang")
    @Expose
    private List<Integer> jenjang = null;
    @SerializedName("propinsi")
    @Expose
    private List<Integer> propinsi = null;
    @SerializedName("kota")
    @Expose
    private List<Integer> kota = null;
    @SerializedName("kecamatan")
    @Expose
    private String kecamatan;
    @SerializedName("kelurahan")
    @Expose
    private String kelurahan;
    @SerializedName("npsn")
    @Expose
    private Object npsn;
    @SerializedName("status_daerah")
    @Expose
    private List<Object> statusDaerah = null;
    @SerializedName("is_blokir")
    @Expose
    private String isBlokir;
    @SerializedName("is_aktif")
    @Expose
    private String isAktif;
    @SerializedName("is_noneds")
    @Expose
    private String isNoneds;
    @SerializedName("is_skbk_kasek")
    @Expose
    private Object isSkbkKasek;
    @SerializedName("is_mic")
    @Expose
    private Object isMic;
    @SerializedName("nsm")
    @Expose
    private String nsm;
    @SerializedName("emis_id")
    @Expose
    private String emisId;
    @SerializedName("kode_satker")
    @Expose
    private Object kodeSatker;

    public Integer getInstansiId() {
        return instansiId;
    }

    public void setInstansiId(Integer instansiId) {
        this.instansiId = instansiId;
    }

    public List<Integer> getJenisInstansi() {
        return jenisInstansi;
    }

    public void setJenisInstansi(List<Integer> jenisInstansi) {
        this.jenisInstansi = jenisInstansi;
    }

    public List<Object> getJenisSekolah() {
        return jenisSekolah;
    }

    public void setJenisSekolah(List<Object> jenisSekolah) {
        this.jenisSekolah = jenisSekolah;
    }

    public List<Object> getGroupBimas() {
        return groupBimas;
    }

    public void setGroupBimas(List<Object> groupBimas) {
        this.groupBimas = groupBimas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getIsNegeri() {
        return isNegeri;
    }

    public void setIsNegeri(String isNegeri) {
        this.isNegeri = isNegeri;
    }

    public List<Integer> getJenjang() {
        return jenjang;
    }

    public void setJenjang(List<Integer> jenjang) {
        this.jenjang = jenjang;
    }

    public List<Integer> getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(List<Integer> propinsi) {
        this.propinsi = propinsi;
    }

    public List<Integer> getKota() {
        return kota;
    }

    public void setKota(List<Integer> kota) {
        this.kota = kota;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public Object getNpsn() {
        return npsn;
    }

    public void setNpsn(Object npsn) {
        this.npsn = npsn;
    }

    public List<Object> getStatusDaerah() {
        return statusDaerah;
    }

    public void setStatusDaerah(List<Object> statusDaerah) {
        this.statusDaerah = statusDaerah;
    }

    public String getIsBlokir() {
        return isBlokir;
    }

    public void setIsBlokir(String isBlokir) {
        this.isBlokir = isBlokir;
    }

    public String getIsAktif() {
        return isAktif;
    }

    public void setIsAktif(String isAktif) {
        this.isAktif = isAktif;
    }

    public String getIsNoneds() {
        return isNoneds;
    }

    public void setIsNoneds(String isNoneds) {
        this.isNoneds = isNoneds;
    }

    public Object getIsSkbkKasek() {
        return isSkbkKasek;
    }

    public void setIsSkbkKasek(Object isSkbkKasek) {
        this.isSkbkKasek = isSkbkKasek;
    }

    public Object getIsMic() {
        return isMic;
    }

    public void setIsMic(Object isMic) {
        this.isMic = isMic;
    }

    public String getNsm() {
        return nsm;
    }

    public void setNsm(String nsm) {
        this.nsm = nsm;
    }

    public String getEmisId() {
        return emisId;
    }

    public void setEmisId(String emisId) {
        this.emisId = emisId;
    }

    public Object getKodeSatker() {
        return kodeSatker;
    }

    public void setKodeSatker(Object kodeSatker) {
        this.kodeSatker = kodeSatker;
    }

}
