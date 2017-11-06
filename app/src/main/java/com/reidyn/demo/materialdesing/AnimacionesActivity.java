package com.reidyn.demo.materialdesing;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

/**
 * Created by windows 8.1 on 06/11/2017.
 */

public class AnimacionesActivity extends FragmentActivity{

    private Button btnMostrar;
    private Button btnOcultar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);

        btnMostrar = (Button)findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                mostrarPantalla();
            }
        });

        btnOcultar = (Button)findViewById(R.id.btnOcultar);
        btnOcultar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                ocultarPantalla();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void ocultarPantalla(){
        final View miEncabezado = findViewById(R.id.encabezado);

        if(miEncabezado.getVisibility() == View.VISIBLE){
            int cx = (miEncabezado.getLeft() + miEncabezado.getRight()) / 2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom()) / 2;

            int radioInicial = miEncabezado.getWidth();

            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado,cx,cy,radioInicial,0);

            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    miEncabezado.setVisibility(View.INVISIBLE);
                }
            });

            anim.start();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void mostrarPantalla(){
        View miEncabezado = findViewById(R.id.encabezado);

        if(miEncabezado.getVisibility() != View.VISIBLE){
            int cx = (miEncabezado.getLeft() + miEncabezado.getRight()) / 2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom()) / 2;

            int radioInicial = miEncabezado.getWidth();

            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado,cx,cy,0,radioInicial);

            miEncabezado.setVisibility(View.VISIBLE);

            anim.start();
        }
    }
}
