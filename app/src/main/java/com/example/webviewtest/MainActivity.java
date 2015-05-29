package com.example.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=(WebView)findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        Message
        webView.loadUrl("http://3g.163.com/x/");
    }


}
