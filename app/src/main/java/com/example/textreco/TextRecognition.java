package com.example.textreco;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class TextRecognition extends Application {

    public static final String RESULT_TEXT="RESULT_TEXT";

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);
    }
}
