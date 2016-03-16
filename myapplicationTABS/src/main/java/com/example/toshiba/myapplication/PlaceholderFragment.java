package com.example.toshiba.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by TOSHIBA on 16/03/2016.
 */
public class PlaceholderFragment extends android.support.v4.app.Fragment // l'interface du fragment

{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.fragment_main,null); //on récupère le fragment qui existe deja
        TextView textView=(TextView) v.findViewById(R.id.section_label);
        Bundle bundle=getArguments();
        int i= bundle.getInt("pos");
        if(i==0)
        {
            textView.setText("Fragment 0");
        }
        if(i==1)
        {
            textView.setText("Fragment 1");
        }
        if(i==2)
        {
            textView.setText("Fragment 3");
        }
        return v;
    }
}
