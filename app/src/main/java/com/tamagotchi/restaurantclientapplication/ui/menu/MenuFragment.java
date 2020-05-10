package com.tamagotchi.restaurantclientapplication.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.tamagotchi.restaurantclientapplication.R;

public class MenuFragment extends Fragment {

    private MenuViewModel menuViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        menuViewModel = new ViewModelProvider(this).get(MenuViewModel.class);

        View root = inflater.inflate(R.layout.fragment_menu, container, false);
        //final TextView textView = root.findViewById(R.id.text_menu);
//        menuViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
