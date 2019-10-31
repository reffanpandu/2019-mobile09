package polinema.ac.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.tugas2.adapters.MakananAdapter;
import polinema.ac.tugas2.models.makanan;
import polinema.ac.tugas2.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMakanan;
    List<makanan> listMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan =findViewById(R.id.rvMakanan);
        makanan makan = new makanan("Jakarta", "Soto Betawi",this.getResources().getDrawable(R.drawable.soto));
        listMakanan.add(makan);

        makan = new makanan("Lamongan", "Soto Lamongan",this.getResources().getDrawable(R.drawable.sotol));
        listMakanan.add(makan);

        MakananAdapter MakananAdapter = new MakananAdapter(listMakanan);

        rvMakanan.setAdapter(MakananAdapter);
        rvMakanan.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }
}
