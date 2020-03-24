package json;

import java.sql.Timestamp;


public class testModel {

    private String ID_transaksi;
    private String rekening_pengirim;
    private String rekening_penerima;
    private int nominal;
    private Timestamp tanggal;

    public String getID_transaksi() {
        return ID_transaksi;
    }

    public void setID_transaksi(String ID_transaksi) {
        this.ID_transaksi = ID_transaksi;
    }

    public String getRekening_pengirim() {
        return rekening_pengirim;
    }

    public void setRekening_pengirim(String rekening_pengirim) {
        this.rekening_pengirim = rekening_pengirim;
    }

    public String getRekening_penerima() {
        return rekening_penerima;
    }

    public void setRekening_penerima(String rekening_penerima) {
        this.rekening_penerima = rekening_penerima;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public Timestamp getTanggal() {
        return tanggal;
    }

    public void setTanggal(Timestamp tanggal) {
        this.tanggal = tanggal;
    }
 
}
