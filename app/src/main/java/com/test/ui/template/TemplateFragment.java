package com.test.ui.template;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.test.R;
import com.test.Test;

public class TemplateFragment extends Fragment {
    private  TemplateViewModel templateViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        templateViewModel =  new ViewModelProvider(this).get(TemplateViewModel.class);
        View root = inflater.inflate(R.layout.fragment_template, container, false);
        final  TextView textView = root.findViewById(R.id.text_template);

        templateViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(this.getContext(), "call log from maven, pls check 'logcat'", Toast.LENGTH_LONG).show();

        //maven
        Test.looog();
    }
}
