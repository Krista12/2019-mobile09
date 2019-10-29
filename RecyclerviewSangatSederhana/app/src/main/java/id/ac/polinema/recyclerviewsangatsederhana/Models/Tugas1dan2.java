package id.ac.polinema.recyclerviewsangatsederhana.Models;

public class Tugas1dan2 {
    public String jenisBaret;
    public String warnaBaret;
    public int baret;

    public Tugas1dan2(String jenisBaret, String warnaBaret, int baret){
        this.jenisBaret = jenisBaret;
        this.warnaBaret = warnaBaret;
        this.baret = baret;
    }

    public void setJenisBaret(String jenisBaret) {
        this.jenisBaret = jenisBaret;
    }

    public void setWarnaBaret(String warnaBaret) {
        this.warnaBaret = warnaBaret;
    }

    public String getWarnaBaret() {
        return warnaBaret;
    }

    public String getJenisBaret() {
        return jenisBaret;
    }

    public void setBaret(int baret) {
        this.baret = baret;
    }

    public int getBaret() {
        return baret;
    }
}
