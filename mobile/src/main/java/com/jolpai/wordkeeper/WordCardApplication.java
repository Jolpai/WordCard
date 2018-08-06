package com.jolpai.wordkeeper;

import com.facebook.stetho.Stetho;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import io.realm.Realm;

/**
 * Created by Tanim reja on 10/10/2016.
 */

public class WordCardApplication extends DaggerApplication {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);

        Realm.init(this);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
    }


}
