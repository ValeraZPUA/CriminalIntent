package edu.example.criminalintent.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Для каждого второго объекта
            mCrimes.add(crime);
        }
        mCrimes.get(0).setmRequiresPolice(1);
        mCrimes.get(10).setmRequiresPolice(1);
        mCrimes.get(20).setmRequiresPolice(1);
        mCrimes.get(30).setmRequiresPolice(1);
        mCrimes.get(40).setmRequiresPolice(1);
        mCrimes.get(50).setmRequiresPolice(1);
        mCrimes.get(60).setmRequiresPolice(1);
        mCrimes.get(70).setmRequiresPolice(1);
        mCrimes.get(70).setmRequiresPolice(1);
        mCrimes.get(80).setmRequiresPolice(1);
        mCrimes.get(90).setmRequiresPolice(1);
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getmCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

}
