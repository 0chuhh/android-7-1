package com.example.telephone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telClick(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+7(926)888-88-88")));
    }
    public void browseClick(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
    }
    public void emailClick(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND, Uri.parse("https://google.com"));
        emailIntent.setType("text/'");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "vvlasovdo@mail.ru");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "вопрос о приложении");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Добрый день!...");
        startActivity(Intent.createChooser(emailIntent, "Написать разрабу"));
    }
    public void gpClick(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?=com.javavon.wrapitupbox")));
    }
}
