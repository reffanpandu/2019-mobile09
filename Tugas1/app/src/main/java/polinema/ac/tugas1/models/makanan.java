package polinema.ac.tugas1.models;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class makanan {
    public String kota;
    public String nama;
    public Drawable image;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public makanan(String kota, String nama, Drawable image) {
        this.kota = kota;
        this.nama = nama;
        this.image = image;
    }


    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
