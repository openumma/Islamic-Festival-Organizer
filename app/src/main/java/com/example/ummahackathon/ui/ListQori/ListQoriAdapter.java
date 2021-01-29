package com.example.ummahackathon.ui.ListQori;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ummahackathon.Model.ListDataQori;
import com.example.ummahackathon.R;
import com.example.ummahackathon.ui.Detail.DetailQoriActivity;
import com.example.ummahackathon.ui.Detail.DetailUstadActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ListQoriAdapter extends RecyclerView.Adapter<ListQoriAdapter.ListViewHolder> {
    Context context;
    ListDataQori listDataQori;
    List<ListDataQori> listDataQoris;

    public ListQoriAdapter(Context context, List<ListDataQori> listDataQoris) {
        this.context = context;
        this.listDataQoris = listDataQoris;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_qori,parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tv_nama_qori.setText(listDataQoris.get(position).getNama_qori());
        holder.tv_deskripsi.setText(listDataQoris.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listDataQoris.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_qori,tv_deskripsi;
        Button btn_qori;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama_qori = itemView.findViewById(R.id.tv_qori);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi_qori);
            btn_qori = itemView.findViewById(R.id.btn_qori);
            btn_qori.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    listDataQoris.get(position);
                    Intent intent = new Intent(view.getContext(), DetailQoriActivity.class);
                    intent.putExtra("id",listDataQoris.get(position).getId());
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
