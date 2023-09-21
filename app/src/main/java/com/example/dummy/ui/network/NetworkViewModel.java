package com.example.dummy.ui.network;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NetworkViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NetworkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Network Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}