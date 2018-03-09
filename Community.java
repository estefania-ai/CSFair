package com.example.girlswhocode.csfair;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Girls Who Code on 4/18/2017.
 */

public class Community extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community);

        WebView webview = new WebView(this);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setAppCacheEnabled(true);
        Uri uri = Uri.parse("http://chiroutes.freeforums.net/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        setContentView(webview);


    }
}
