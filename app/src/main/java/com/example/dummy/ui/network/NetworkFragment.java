package com.example.dummy.ui.network;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dummy.databinding.FragmentNetworkBinding;

public class NetworkFragment extends Fragment {

    private FragmentNetworkBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NetworkViewModel networkViewModel = 
                new ViewModelProvider(this).get(NetworkViewModel.class);

        binding = FragmentNetworkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNetwork;
        networkViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}