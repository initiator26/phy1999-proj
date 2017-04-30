package com.example.android.cprpro;

/**
 * Created by Raina on 27-04-2017.
 */

public class InfoClass {

    String mText;
    int mImageResourceId;

    public InfoClass(String text,int resourceid){
        this.mImageResourceId = resourceid;
        this.mText = text;
    }

    public InfoClass(String text) {
        this.mText = text;
    }

    public String getmText() {
        return mText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}

