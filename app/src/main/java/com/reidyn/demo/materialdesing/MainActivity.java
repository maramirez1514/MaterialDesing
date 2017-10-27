package com.reidyn.demo.materialdesing;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    private Button btnMenu1;
    private Button btnTipografia;

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
    }
}
