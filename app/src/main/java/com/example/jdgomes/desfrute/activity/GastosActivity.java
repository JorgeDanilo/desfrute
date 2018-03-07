package com.example.jdgomes.desfrute.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.fragment.GastosFragment;

public class GastosActivity extends AppCompatActivity {

    private Despesa despesaSelected = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();
        if ( extras != null ) {
            this.despesaSelected = extras.getParcelable("despesa");
        }

        FragmentManager fm = getSupportFragmentManager();

        if ( savedInstanceState == null ) {
            FragmentTransaction ft = fm.beginTransaction();
            GastosFragment frag1 = new GastosFragment();
            Bundle b = new Bundle();
            b.putParcelable("despesa", despesaSelected);
            frag1.setArguments(b);
            ft.add(R.id.layoutFrag, frag1, "Fragment 1");
            ft.commit();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
