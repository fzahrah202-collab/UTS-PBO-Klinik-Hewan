package model;

public class Hewan {

    private int idData;
    private String namaHewan;
    private String jenisHewan;
    private int umur;

    public Hewan(int idData, String namaHewan, String jenisHewan, int umur) {

        this.idData = idData;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    // ==============================
    // GETTER
    // ==============================

    public int getIdData() {
        return idData;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getUmur() {
        return umur;
    }

    // ==============================
    // SETTER
    // ==============================

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // ==============================
    // POLYMORPHISM - OVERRIDING
    // ==============================

    public void tampilkanInfo() {
        System.out.println("Jenis Hewan: " + jenisHewan);
    }

    // ==============================
    // POLYMORPHISM - OVERLOADING
    // ==============================

    public void tampilkanInfo(String tambahan) {
        System.out.println(tambahan + " " + jenisHewan);
    }
}