package com.jolpai.wordkeeper;

import android.app.Application;

import com.facebook.stetho.Stetho;

import io.realm.Realm;

/**
 * Created by Tanim reja on 10/10/2016.
 */

public class WordCardApp extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);

        Realm.init(this);
    }


}
