package polinema.ac.tugas1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.tugas1.R;
import polinema.ac.tugas1.models.makanan;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MyViewHolder> {

    public MakananAdapter(List<makanan> makananList){
        this.makananList = makananList;
    }

    List<makanan> makananList;

    @NonNull
    @Override
    public MakananAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View makananView = layoutInflater.inflate(R.layout.list_makanan,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(makananView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.MyViewHolder holder, int position) {
        makanan makanan = makananList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.makananName.setText(makanan.getNama());
        holder.makananKota.setText(makanan.getKota());
        holder.image.setImageDrawable(makanan.getImage());
    }

    @Override
    public int getItemCount() {
        return (makananList != null) ? makananList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView makananName;
        public TextView makananKota;
        public ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            makananName =itemView.findViewById(R.id.makananName);
            makananKota = itemView.findViewById(R.id.makananKota);
            image = itemView.findViewById(R.id.image);
        }
    }
}
