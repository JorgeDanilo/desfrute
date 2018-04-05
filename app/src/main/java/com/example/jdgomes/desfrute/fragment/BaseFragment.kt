package com.example.jdgomes.desfrute.fragment


import android.app.Activity
import android.support.v4.app.Fragment
import android.widget.Toast

abstract class BaseFragment : Fragment() {

    protected fun showToast(activity: Activity, msg: String) {
        Toast.makeText(activity.baseContext, msg, Toast.LENGTH_SHORT).show()
    }
}
