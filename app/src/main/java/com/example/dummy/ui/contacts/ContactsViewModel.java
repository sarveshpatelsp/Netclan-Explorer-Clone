package com.example.dummy.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContactsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contacts Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}