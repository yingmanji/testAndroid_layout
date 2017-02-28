package com.example.administrator.testandroid_layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static String text;
    private TextView tv;
    private EditText et;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        et=(EditText)findViewById(R.id.et);
        btn=(Button)findViewById(R.id.btn);
    }
    protected void get(View view)
    {
        text=et.getText().toString();
        tv.setText(text);
    }
}
