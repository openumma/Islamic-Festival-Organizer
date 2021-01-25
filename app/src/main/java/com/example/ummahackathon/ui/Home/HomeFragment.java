package com.example.ummahackathon.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ummahackathon.R;
import com.example.ummahackathon.ui.ListHadroh.ListHadrohFragment;
import com.example.ummahackathon.ui.ListQori.ListQoriFragment;
import com.example.ummahackathon.ui.ListUstad.ListUstadFragment;

public class HomeFragment extends Fragment {
    ImageView iv_ustad,iv_qori,iv_hadroh;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {;
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        iv_ustad = root.findViewById(R.id.iv_ustad);
        iv_qori = root.findViewById(R.id.iv_qori);
        iv_hadroh = root.findViewById(R.id.iv_hadroh);
        iv_ustad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListUstadFragment listUstadFragment = new ListUstadFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainFrame,listUstadFragment,"findthisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        iv_qori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListQoriFragment listQoriFragment = new ListQoriFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainFrame,listQoriFragment,"FindthisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        iv_hadroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListHadrohFragment listHadrohFragment = new ListHadrohFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainFrame,listHadrohFragment,"FindthisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        getActivity().setTitle("Home");
        return root;
    }
}