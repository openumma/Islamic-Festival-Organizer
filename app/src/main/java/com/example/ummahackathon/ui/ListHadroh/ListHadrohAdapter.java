package com.example.ummahackathon.ui.ListHadroh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ummahackathon.Model.ListDataHadroh;
import com.example.ummahackathon.R;
import com.example.ummahackathon.ui.Detail.DetailHadrohActivity;
import com.example.ummahackathon.ui.Detail.DetailQoriActivity;

import java.util.List;

public class ListHadrohAdapter extends RecyclerView.Adapter<ListHadrohAdapter.ListViewHolder> {

    Context context;
    List<ListDataHadroh> listDataHadrohList;
    public ListHadrohAdapter(Context context, List<ListDataHadroh> listDataHadrohList) {
        this.context = context;
        this.listDataHadrohList = listDataHadrohList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hadroh,parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tv_nama_hadroh.setText(listDataHadrohList.get(position).getNama_hadroh());
        holder.tv_deskripsi_hadroh.setText(listDataHadrohList.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listDataHadrohList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_hadroh,tv_deskripsi_hadroh;
        Button btn_hadroh;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama_hadroh = itemView.findViewById(R.id.tv_nama_hadroh);
            tv_deskripsi_hadroh = itemView.findViewById(R.id.tv_deskripsi_hadroh);
            btn_hadroh = itemView.findViewById(R.id.btn_hadroh);
            btn_hadroh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    listDataHadrohList.get(position);
                    Intent intent = new Intent(view.getContext(), DetailHadrohActivity.class);
                    intent.putExtra("id",listDataHadrohList.get(position).getId());
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
