package com.iwdael.indicator.example;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * Created by hackware on 2016/9/13.
 */

public class TestFragment extends Fragment {
    public static final String EXTRA_TEXT = "extra_text";

     @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.simple_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        Bundle bundle = getArguments();
        if (bundle != null) {
            textView.setText(bundle.getString(EXTRA_TEXT));
        }
    }
}
