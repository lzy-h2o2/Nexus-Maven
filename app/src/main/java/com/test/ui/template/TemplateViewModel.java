package com.test.ui.template;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TemplateViewModel extends ViewModel {

    private MutableLiveData<String> text;

    public TemplateViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is template fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
