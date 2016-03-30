package com.example.student.lab07_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private TextView m_tv_question ;
    private Button m_but_a ;
    private Button m_but_b ;
    private Button m_but_c ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        init() ;
    }


    public void init(){


        m_tv_question = (TextView)findViewById(R.id.tv_question) ;
        m_but_a = (Button)findViewById(R.id.radio_a) ;
        m_but_b = (Button)findViewById(R.id.radio_b) ;
        m_but_c = (Button)findViewById(R.id.radio_c) ;

        CharSequence question = getString(R.string.question_3) ;
        CharSequence que_btn_a = getString(R.string.question_3_a) ;
        CharSequence que_btn_b = getString(R.string.question_3_b) ;
        CharSequence que_btn_c = getString(R.string.question_3_c) ;

        m_tv_question.setText(question) ;
        m_but_a.setText(que_btn_a) ;
        m_but_b.setText(que_btn_b) ;
        m_but_c.setText(que_btn_c) ;

    }

    public void next3(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    public void back3(View view) {
        finish();
    }
}
