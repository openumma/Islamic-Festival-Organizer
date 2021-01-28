package com.example.ummahackathon.ui.ListUstad;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ummahackathon.Model.ListDataUstad;
import com.example.ummahackathon.R;
import com.example.ummahackathon.ui.Detail.DetailUstadActivity;

import java.util.ArrayList;
import java.util.List;

public class ListUstadAdapter extends RecyclerView.Adapter<ListUstadAdapter.ListViewHolder> {

    List<ListDataUstad> listDataUstad;
    Context context;
    public ListUstadAdapter(List<ListDataUstad> listDataUstad, Context context) {
        this.listDataUstad = listDataUstad;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ustad,parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tv_nama_ustad.setText(listDataUstad.get(position).getNama_ustad());
        holder.tv_deskripsi.setText(listDataUstad.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listDataUstad.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_ustad,tv_deskripsi;
        Button btn_detail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama_ustad = itemView.findViewById(R.id.tv_nama_ustad);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi_ustad);
            btn_detail = itemView.findViewById(R.id.btn_detail);
            btn_detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(view.getContext(), DetailUstadActivity.class);
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
