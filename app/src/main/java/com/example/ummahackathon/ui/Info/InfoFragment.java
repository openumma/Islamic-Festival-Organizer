package com.example.ummahackathon.ui.Info;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ummahackathon.R;

public class InfoFragment extends Fragment {
    Button btn_premium,btn_donasi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_info, container, false);
        btn_donasi = root.findViewById(R.id.btn_donasi);
        btn_premium = root.findViewById(R.id.btn_premium);
        btn_premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                final View v = layoutInflater.inflate(R.layout.premium,null);
                alertDialogBuilder.setView(v);
                alertDialogBuilder
                        .setMessage(" ")
                        .setCancelable(false)
                        .setPositiveButton("BERLANGGANAN", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                InfoFragment infoFragment = new InfoFragment();
                                getActivity().getSupportFragmentManager().beginTransaction()
                                        .replace(R.id.mainFrame,infoFragment,"findthisfragment")
                                        .addToBackStack(null)
                                        .commit();
                            }
                        })
                        .setNegativeButton("BATAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        InfoFragment infoFragment = new InfoFragment();
                        getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.mainFrame,infoFragment,"findthisfragment")
                                .addToBackStack(null)
                                .commit();
                    }
                });
                AlertDialog alertDialog =alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        btn_donasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                final View v = layoutInflater.inflate(R.layout.donasi,null);
                alertDialogBuilder.setView(v);
                alertDialogBuilder
                        .setMessage(" ")
                        .setCancelable(false)
                        .setPositiveButton("DONASI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                InfoFragment infoFragment = new InfoFragment();
                                getActivity().getSupportFragmentManager().beginTransaction()
                                        .replace(R.id.mainFrame,infoFragment,"findthisfragment")
                                        .addToBackStack(null)
                                        .commit();
                            }
                        })
                        .setNegativeButton("BATAL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                InfoFragment infoFragment = new InfoFragment();
                                getActivity().getSupportFragmentManager().beginTransaction()
                                        .replace(R.id.mainFrame,infoFragment,"findthisfragment")
                                        .addToBackStack(null)
                                        .commit();
                            }
                        });
                AlertDialog alertDialog =alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        return root;
    }
}