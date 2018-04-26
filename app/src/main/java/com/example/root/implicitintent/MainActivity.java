package com.example.root.implicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText mMsgET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMsgET=(EditText)findViewById(R.id.msg_et);

    }

    public void share(View view) {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,mMsgET.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);

    }
}
