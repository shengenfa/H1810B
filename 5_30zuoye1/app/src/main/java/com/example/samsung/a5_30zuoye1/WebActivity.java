package com.example.samsung.a5_30zuoye1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mWeb = findViewById(R.id.web);
        Intent intent = getIntent();
        String s = intent.getStringExtra("s");
        mWeb.loadUrl(s);
    }
}
