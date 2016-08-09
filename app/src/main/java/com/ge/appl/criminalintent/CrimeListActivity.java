package com.ge.appl.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by leedongho on 16. 8. 9..
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
