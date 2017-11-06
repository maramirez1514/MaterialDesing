package com.reidyn.demo.materialdesing;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    private Button btnMenu1;
    private Button btnTipografia;
    private Button btnSombras;
    private Button btnPropiedades;
    private Button btnCompatibilidad;
    private Button btnCardView;
    private Button btnButton;
    private Button btnRecyclerView;
    private Button btnAnimacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnMenu1 = (Button)findViewById(R.id.btnMenu1);
        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ColoresActivity.class));
            }
        });

        btnTipografia = (Button)findViewById(R.id.btnTipografia);
        btnTipografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TipografiaActivity.class));
            }
        });

        btnSombras = (Button)findViewById(R.id.btnSombras);
        btnSombras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CapasySombras.class));
            }
        });

        btnPropiedades = (Button)findViewById(R.id.btnPropiedades);
        btnPropiedades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PropiedadesActivity.class));
            }
        });

        btnCompatibilidad = (Button)findViewById(R.id.btnCompatibilidad);
        btnCompatibilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CompatibilidadActivity.class));
            }
        });

        btnCardView = (Button)findViewById(R.id.btnCardView);
        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),activityCardView.class));
            }
        });

        btnButton = (Button)findViewById(R.id.btnButton);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),botonFlotanteActivity.class));
            }
        });

        btnRecyclerView = (Button)findViewById(R.id.btnRecyclerView);
        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActivityRecyclerView.class));
            }
        });

        btnAnimacion = (Button)findViewById(R.id.btnAnimacion);
        btnAnimacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AnimacionesActivity.class));
            }
        });
    }
}
