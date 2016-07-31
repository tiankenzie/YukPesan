package com.yukpesan.tian.yukpesan;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by User on 6/11/2016.
 */
public class fragorder extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragorder, container, false);


        View fview = inflater.inflate(R.layout.fragorder,container, false);
        Button button1 = (Button) fview.findViewById(R.id.order);
        Button button2 = (Button) fview.findViewById(R.id.pay);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getActivity(), page_koki.class);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getActivity(), page_kasir.class);
                startActivity(i);
            }
        });
        return fview;
    }
}
