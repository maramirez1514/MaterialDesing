package com.reidyn.demo.materialdesing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.reidyn.demo.materialdesing.adapters.recycleViewAdapter;

/**
 * Created by windows 8.1 on 06/11/2017.
 */

public class ActivityRecyclerView extends FragmentActivity{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new recycleViewAdapter(createDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    private String[] createDataSet(){
        String arr_cadena[] = new String[30];
        for(int i=0;i<30;i++){
            arr_cadena[i] = "Item Nro : " + i;
        }
        return arr_cadena;
    }
}
