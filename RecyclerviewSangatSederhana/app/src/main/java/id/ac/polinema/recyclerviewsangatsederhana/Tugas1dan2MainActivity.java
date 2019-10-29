package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapters.Tugas1dan2Adapter;
import id.ac.polinema.recyclerviewsangatsederhana.Models.Tugas1dan2;

public class Tugas1dan2MainActivity extends AppCompatActivity {
    RecyclerView rvTugas1danTugas2;
    List<Tugas1dan2> tugas1dan2List = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1dan2_main);
        rvTugas1danTugas2 = findViewById(R.id.rvTugas1dan2);

        Tugas1dan2 tugas1dan2 = new Tugas1dan2("TNI AD (Arhanud)" , "Coklat" , R.drawable.arhanud);
        tugas1dan2List.add(tugas1dan2);

        tugas1dan2 = new Tugas1dan2("TNI AD (Infanteri)" , "Hijau" , R.drawable.infanteri);
        tugas1dan2List.add(tugas1dan2);

        tugas1dan2 = new Tugas1dan2("TNI AD (Kopassus)" , "Merah" , R.drawable.kopassus);
        tugas1dan2List.add(tugas1dan2);

        tugas1dan2 = new Tugas1dan2("TNI AL" , "Pink Keunguan" , R.drawable.al);
        tugas1dan2List.add(tugas1dan2);

        tugas1dan2 = new Tugas1dan2("TNI AU" , "Orange", R.drawable.au);
        tugas1dan2List.add(tugas1dan2);

        Tugas1dan2Adapter tugas1dan2Adapter = new Tugas1dan2Adapter(tugas1dan2List);
        rvTugas1danTugas2.setAdapter(tugas1dan2Adapter);
       // rvTugas1danTugas2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvTugas1danTugas2.setLayoutManager(new GridLayoutManager(this,2));
    }
}
