package com.ge.appl.criminalintent;

import java.util.UUID;

/**
 * Created by SweetLife on 2016-08-09.
 * Class description : model class for logging Crime info.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
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
}
