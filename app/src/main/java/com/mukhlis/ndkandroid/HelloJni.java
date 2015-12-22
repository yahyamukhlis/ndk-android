package com.mukhlis.ndkandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mukhlis.ndkandroid.R;

public class HelloJni extends Activity {

    static {
        System.loadLibrary("app");
    }

    public native String getMessage();

    public native String getMessageFromAnotherFile();

    private TextView textView;

    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        textView.setText(getMessage());

        textView2 = (TextView) findViewById(R.id.text2);
        textView2.setText(getMessageFromAnotherFile());
    }

}
