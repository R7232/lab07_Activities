package com.example.student.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {

    public static final String BUNDLE_KEY_EDITTEXT_NAME = "www.123.com" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
    }

    public void cancle(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void ok(View view) {

        EditText editText = (EditText)findViewById(R.id.edit_text);
        CharSequence text = editText.getText() ;

        Intent intent = new Intent();
        intent.putExtra(BUNDLE_KEY_EDITTEXT_NAME, text);
        setResult(RESULT_OK, intent);
        finish();

    }
}
