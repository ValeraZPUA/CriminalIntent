package edu.example.criminalintent.activities;

import android.support.v4.app.Fragment;

import edu.example.criminalintent.fragments.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
