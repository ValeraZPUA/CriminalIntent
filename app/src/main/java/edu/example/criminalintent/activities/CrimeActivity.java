package edu.example.criminalintent.activities;

import android.support.v4.app.Fragment;

import edu.example.criminalintent.fragments.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
