package com.example.jdgomes.desfrute.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.fragment.ItensFragment;

public class ItensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itens);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fm = getSupportFragmentManager();
        if ( savedInstanceState == null ) {
            FragmentTransaction ft = fm.beginTransaction();
            ItensFragment fragment = new ItensFragment();
            ft.add(R.id.layoutItens, fragment, "Itens Fragment");
            ft.commit();
        }
    }

}
