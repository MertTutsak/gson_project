package com.mert.gsonproject;

import android.os.Environment;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Root Path
        String rootPath = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
