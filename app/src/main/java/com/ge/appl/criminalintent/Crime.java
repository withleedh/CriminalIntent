package com.ge.appl.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by SweetLife on 2016-08-09.
 * Class description : model class for logging Crime info.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSoloved;


    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSoloved() {
        return mSoloved;
    }

    public void setmSoloved(boolean mSoloved) {
        this.mSoloved = mSoloved;
    }
}
