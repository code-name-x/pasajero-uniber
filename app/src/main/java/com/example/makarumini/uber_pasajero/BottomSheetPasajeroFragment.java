package com.example.makarumini.uber_pasajero;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MakaruMini on 11/30/18.
 */

public class BottomSheetPasajeroFragment extends BottomSheetDialogFragment{
    String mTag;

    public static BottomSheetPasajeroFragment newInstanc (String tag){
        BottomSheetPasajeroFragment f = new BottomSheetPasajeroFragment();
        Bundle args = new Bundle();
        args.putString("TAG",tag);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = getArguments().getString("TAG");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.botton_sheet_pasajero,container,false);
        return view;
    }
}
