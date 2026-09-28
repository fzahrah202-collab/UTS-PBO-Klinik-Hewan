package model;

public class KucingPersia extends Kucing {

    public KucingPersia(
            int idData,
            String namaHewan,
            int umur,
            String statusVaksinF3) {

        super(
                idData,
                namaHewan,
                umur,
                statusVaksinF3
        );
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras: Persia");
    }
}