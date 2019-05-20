package com.e.heroapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class LoadImgStrictModeActivity extends AppCompatActivity {
        private ImageView imgProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_img_strict_mode);
        imgProfile = findViewById(R.id.imgPhoto);
        loadFromURL();
    }

    private void StrictMode(){
        android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }

    private void loadFromURL() {
        StrictMode();
        try {
            String imgURL = "https://www.gstatic.com/webp/gallery3/1.sm.png";
            URL url = new URL(imgURL);
        } catch (IOException e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
