package com.leegacy.sooji.cookbook.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leegacy.sooji.cookbook.R;

/**
 * Created by soo-ji on 16-05-03.
 */
public class HomeFragment extends Fragment {
    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.home_fragment, null);
        return root;
    }
}
