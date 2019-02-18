
package com.masbie.qr_code_scanner_ptk;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ptk {

    @SerializedName("ptk_id")
    @Expose
    private String ptkId;
    @SerializedName("npk")
    @Expose
    private String npk;
//    @SerializedName("nuptk")
//    @Expose
//    private Object nuptk;
//    @SerializedName("tgl_terbit")
//    @Expose
//    private Object tglTerbit;
//    @SerializedName("nrg")
//    @Expose
//    private Object nrg;
//    @SerializedName("nip")
//    @Expose
//    private Object nip;
    @SerializedName("nik")
    @Expose
    private String nik;
    @SerializedName("nama")
    @Expose
    private String nama;
//    @SerializedName("tmp_lahir")
//    @Expose
//    private Object tmpLahir;
//    @SerializedName("tgl_lahir")
//    @Expose
//    private Object tglLahir;
//    @SerializedName("kelamin")
//    @Expose
//    private String kelamin;
//    @SerializedName("nama_ibu")
//    @Expose
//    private Object namaIbu;
//    @SerializedName("aktif")
//    @Expose
//    private List<Integer> aktif = null;
//    @SerializedName("is_cuti")
//    @Expose
//    private String isCuti;
//    @SerializedName("tugas")
//    @Expose
//    private List<Integer> tugas = null;
//    @SerializedName("tugas_pengawas")
//    @Expose
//    private List<Object> tugasPengawas = null;
//    @SerializedName("group_bimas")
//    @Expose
//    private List<Object> groupBimas = null;
//    @SerializedName("status")
//    @Expose
//    private List<Integer> status = null;
//    @SerializedName("fungsi")
//    @Expose
//    private List<Integer> fungsi = null;
//    @SerializedName("is_sertifikasi")
//    @Expose
//    private String isSertifikasi;
//    @SerializedName("kualifikasi")
//    @Expose
//    private List<Integer> kualifikasi = null;
//    @SerializedName("thn_lulus_sd")
//    @Expose
//    private Integer thnLulusSd;
//    @SerializedName("is_instansi")
//    @Expose
//    private String isInstansi;
//    @SerializedName("instansi_id")
//    @Expose
//    private Integer instansiId;
//    @SerializedName("is_valid")
//    @Expose
//    private String isValid;
//    @SerializedName("valid_id")
//    @Expose
//    private String validId;
//    @SerializedName("form_id")
//    @Expose
//    private Object formId;
//    @SerializedName("ajuan")
//    @Expose
//    private List<Object> ajuan = null;
//    @SerializedName("proses")
//    @Expose
//    private List<Integer> proses = null;
    @SerializedName("foto")
    @Expose
    private String foto;
//    @SerializedName("thn_verval")
//    @Expose
//    private Integer thnVerval;
//    @SerializedName("periode_verval")
//    @Expose
//    private Integer periodeVerval;
    @SerializedName("akun_id")
    @Expose
    private String akunId;
//    @SerializedName("tgl_blokir")
//    @Expose
//    private Object tglBlokir;

    public String getPtkId() {
        return ptkId;
    }

    public void setPtkId(String ptkId) {
        this.ptkId = ptkId;
    }

    public String getNpk() {
        return npk;
    }

    public void setNpk(String npk) {
        this.npk = npk;
    }

//    public Object getNuptk() {
//        return nuptk;
//    }
//
//    public void setNuptk(Object nuptk) {
//        this.nuptk = nuptk;
//    }
//
//    public Object getTglTerbit() {
//        return tglTerbit;
//    }
//
//    public void setTglTerbit(Object tglTerbit) {
//        this.tglTerbit = tglTerbit;
//    }
//
//    public Object getNrg() {
//        return nrg;
//    }
//
//    public void setNrg(Object nrg) {
//        this.nrg = nrg;
//    }
//
//    public Object getNip() {
//        return nip;
//    }
//
//    public void setNip(Object nip) {
//        this.nip = nip;
//    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
//
//    public Object getTmpLahir() {
//        return tmpLahir;
//    }
//
//    public void setTmpLahir(Object tmpLahir) {
//        this.tmpLahir = tmpLahir;
//    }
//
//    public Object getTglLahir() {
//        return tglLahir;
//    }
//
//    public void setTglLahir(Object tglLahir) {
//        this.tglLahir = tglLahir;
//    }
//
//    public String getKelamin() {
//        return kelamin;
//    }
//
//    public void setKelamin(String kelamin) {
//        this.kelamin = kelamin;
//    }
//
//    public Object getNamaIbu() {
//        return namaIbu;
//    }
//
//    public void setNamaIbu(Object namaIbu) {
//        this.namaIbu = namaIbu;
//    }
//
//    public List<Integer> getAktif() {
//        return aktif;
//    }
//
//    public void setAktif(List<Integer> aktif) {
//        this.aktif = aktif;
//    }
//
//    public String getIsCuti() {
//        return isCuti;
//    }
//
//    public void setIsCuti(String isCuti) {
//        this.isCuti = isCuti;
//    }
//
//    public List<Integer> getTugas() {
//        return tugas;
//    }
//
//    public void setTugas(List<Integer> tugas) {
//        this.tugas = tugas;
//    }
//
//    public List<Object> getTugasPengawas() {
//        return tugasPengawas;
//    }
//
//    public void setTugasPengawas(List<Object> tugasPengawas) {
//        this.tugasPengawas = tugasPengawas;
//    }
//
//    public List<Object> getGroupBimas() {
//        return groupBimas;
//    }
//
//    public void setGroupBimas(List<Object> groupBimas) {
//        this.groupBimas = groupBimas;
//    }
//
//    public List<Integer> getStatus() {
//        return status;
//    }
//
//    public void setStatus(List<Integer> status) {
//        this.status = status;
//    }
//
//    public List<Integer> getFungsi() {
//        return fungsi;
//    }
//
//    public void setFungsi(List<Integer> fungsi) {
//        this.fungsi = fungsi;
//    }
//
//    public String getIsSertifikasi() {
//        return isSertifikasi;
//    }
//
//    public void setIsSertifikasi(String isSertifikasi) {
//        this.isSertifikasi = isSertifikasi;
//    }
//
//    public List<Integer> getKualifikasi() {
//        return kualifikasi;
//    }
//
//    public void setKualifikasi(List<Integer> kualifikasi) {
//        this.kualifikasi = kualifikasi;
//    }
//
//    public Integer getThnLulusSd() {
//        return thnLulusSd;
//    }
//
//    public void setThnLulusSd(Integer thnLulusSd) {
//        this.thnLulusSd = thnLulusSd;
//    }
//
//    public String getIsInstansi() {
//        return isInstansi;
//    }
//
//    public void setIsInstansi(String isInstansi) {
//        this.isInstansi = isInstansi;
//    }
//
//    public Integer getInstansiId() {
//        return instansiId;
//    }
//
//    public void setInstansiId(Integer instansiId) {
//        this.instansiId = instansiId;
//    }
//
//    public String getIsValid() {
//        return isValid;
//    }
//
//    public void setIsValid(String isValid) {
//        this.isValid = isValid;
//    }
//
//    public String getValidId() {
//        return validId;
//    }
//
//    public void setValidId(String validId) {
//        this.validId = validId;
//    }
//
//    public Object getFormId() {
//        return formId;
//    }
//
//    public void setFormId(Object formId) {
//        this.formId = formId;
//    }
//
//    public List<Object> getAjuan() {
//        return ajuan;
//    }
//
//    public void setAjuan(List<Object> ajuan) {
//        this.ajuan = ajuan;
//    }
//
//    public List<Integer> getProses() {
//        return proses;
//    }
//
//    public void setProses(List<Integer> proses) {
//        this.proses = proses;
//    }
//
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
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
//
    public String getAkunId() {
        return akunId;
    }

    public void setAkunId(String akunId) {
        this.akunId = akunId;
    }
//
//    public Object getTglBlokir() {
//        return tglBlokir;
//    }
//
//    public void setTglBlokir(Object tglBlokir) {
//        this.tglBlokir = tglBlokir;
//    }

}
