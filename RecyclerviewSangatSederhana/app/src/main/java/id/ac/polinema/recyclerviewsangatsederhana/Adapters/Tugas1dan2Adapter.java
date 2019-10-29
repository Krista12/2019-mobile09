package id.ac.polinema.recyclerviewsangatsederhana.Adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Models.Tugas1dan2;
import id.ac.polinema.recyclerviewsangatsederhana.R;

public class Tugas1dan2Adapter extends RecyclerView.Adapter<Tugas1dan2Adapter.MyView>{
    List<Tugas1dan2> tugas1dan2List;

    public Tugas1dan2Adapter(List<Tugas1dan2> tugas1dan2Liat)
    {this.tugas1dan2List = tugas1dan2Liat; }


    @NonNull
    @Override
    public Tugas1dan2Adapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itembaret = layoutInflater.inflate(R.layout.item_tugas1dantugas2, parent, false);
        MyView view = new MyView(itembaret);

        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull Tugas1dan2Adapter.MyView holder, int position) {
        Tugas1dan2 t = tugas1dan2List.get(position);
        holder.jb.setText(t.getJenisBaret());
        holder.wb.setText(t.getWarnaBaret());
        holder.gb.setImageResource(t.getBaret());
    }

    @Override
    public int getItemCount() {
        return (tugas1dan2List != null ? tugas1dan2List.size() : 0);
    }

    public class MyView extends RecyclerView.ViewHolder {
        public TextView jb;
        public TextView wb;
        public ImageView gb;

        public MyView(@NonNull View itemView) {
            super(itemView);
            jb = itemView.findViewById(R.id.jbar);
            wb = itemView.findViewById(R.id.wbar);
            gb = itemView.findViewById(R.id.gbr);

        }
    }
}
