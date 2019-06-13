package com.example.samsung.xiaoshixunqizhong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.samsung.xiaoshixunqizhong.R;

public class WebActivity extends AppCompatActivity {

    private WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mWeb = findViewById(R.id.web);
        Intent intent = getIntent();
        String html = intent.getStringExtra("html");
        mWeb.loadUrl(html);
    }
}
