package com.example.jdgomes.desfrute.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.jdgomes.desfrute.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        carregaListaGastos();
        goToNewGastos();
    }

    protected void goToNewGastos() {
        FloatingActionButton fab = findViewById(R.id.btnAddGastos);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GastosActivity.class);
                startActivity(intent);
            }
        });
    }
}
