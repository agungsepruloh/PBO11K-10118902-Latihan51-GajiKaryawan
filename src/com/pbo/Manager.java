package com.pbo;

public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganJabatan, tunjanganGolongan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;

        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        tunjanganJabatan = jabatan.equals("Manager") ? 2000000 :
                jabatan.equals("Kabag") ? 1000000 : 0;

        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        }

        return tunjanganGolongan;
    }

    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }

}
