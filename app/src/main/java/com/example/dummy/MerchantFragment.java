package com.example.dummy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dummy.R;

import java.util.ArrayList;

public class MerchantFragment extends Fragment {

    private String mParam1;
    private String mParam2;

    public static MerchantFragment newInstance(String param1, String param2) {
        MerchantFragment fragment = new MerchantFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("param1");
            mParam2 = getArguments().getString("param2");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_merchant, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<ModelClass> friendList = Constants.getEmployeeData();
        ItemAdapter itemAdapter = new ItemAdapter(friendList);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView_merchant);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(itemAdapter);
    }
}