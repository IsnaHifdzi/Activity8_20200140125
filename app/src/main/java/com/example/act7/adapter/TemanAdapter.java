package com.example.act7.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.act7.R;
import com.example.act7.model.Teman;

import java.util.ArrayList;

public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.TemanViewHolder> {

    private ArrayList<Teman> listData;

    public TemanAdapter(ArrayList<Teman> listData) {
        this.listData = listData;
    }

    @Override
    public TemanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());
        View view = layoutInf.inflate(R.layout.row_data_teman, parent, false);
        return new  TemanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TemanViewHolder holder, int position) {
        String nma, tlp;

        nma = listData.get(position).getNama();
        tlp = listData.get(position).getTelpon();

        // Style
        holder.namaTxt.setTextColor(Color.BLUE);
        holder.namaTxt.setTextSize(20);

        // Set Text
        holder.namaTxt.setText(nma);
        holder.telponTxt.setText(tlp);

        holder.cardku.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return (listData != null) ? listData.size() : 0;
    }

    public class TemanViewHolder extends RecyclerView.ViewHolder {

        private CardView cardku;
        private TextView namaTxt,telponTxt;

        public TemanViewHolder(View view) {
            super(view);

            cardku = (CardView) view.findViewById(R.id.card);
            namaTxt = (TextView) view.findViewById(R.id.textNama);
            telponTxt = (TextView) view.findViewById(R.id.textTelpon);
        }
    }
}
