package edu.example.criminalintent.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID id;
    private String title;
    private String date;
    private SimpleDateFormat simpleDateFormat;
    private boolean solved;
    private int mRequiresPolice;

    public Crime() {
        id = UUID.randomUUID();
        simpleDateFormat = new SimpleDateFormat("EEEE, MMM ww, yyyy");
        date = simpleDateFormat.format(new Date());
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public int getmRequiresPolice() {
        return mRequiresPolice;
    }

    public void setmRequiresPolice(int mRequiresPolice) {
        this.mRequiresPolice = mRequiresPolice;
    }
}
