package com.example.jdgomes.desfrute.fragment;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.widget.Toast;

public abstract class BaseFragment extends Fragment {

    protected void showToast(Activity activity, String msg) {
        Toast.makeText(activity.getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
