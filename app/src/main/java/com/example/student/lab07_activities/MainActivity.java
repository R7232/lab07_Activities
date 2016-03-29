package com.example.student.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 傳令識別碼
    private static final int SELECT_COLOR_REQUEST = 0;
    private static final int EDIT_TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        // 如果回傳的包裹裡的識別碼與我們當初定義的相同，這結果(包裹)就是我們的
        if (requestCode == SELECT_COLOR_REQUEST) {
            if (resultCode == RESULT_OK) {

                //取得傳令兵的包裹
                Bundle bundle = data.getExtras();

                //從包裹取出值
                int colorInt = bundle.getInt(ColorPickerActivity.BUNDLE_KEY_COLOR_INT);
                CharSequence colorName = bundle.getCharSequence(ColorPickerActivity.BUNDLE_KEY_COLOR_NAME);

                //將 color 相關的資訊設定到 TextView
                TextView tv_color = (TextView) findViewById(R.id.tv_color);
            //    tv_color.setText(colorName);
                tv_color.setBackgroundColor(colorInt);
            }
        } else if (requestCode == EDIT_TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {

                Bundle bundle = data.getExtras();
                CharSequence edittext = bundle.getCharSequence(EditTextActivity.BUNDLE_KEY_EDITTEXT_NAME);
                TextView tv_color = (TextView) findViewById(R.id.tv_color);
                tv_color.setText(edittext);
            }
        }
    }

    public void selectColor(View view) {
        //Intent( 傳令的 Activity , 接受傳令的 Activity)
        Intent intent = new Intent(this, ColorPickerActivity.class);
        //startActivity(intent); //傳令
        startActivityForResult(intent, SELECT_COLOR_REQUEST); //傳令需要能返回結果
        finish();

    }


    public void next(View view) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
        finish();
    }


    public void edittext(View view) {
        Intent intent = new Intent(this , EditTextActivity.class) ;
        startActivityForResult(intent, EDIT_TEXT_REQUEST); //傳令需要能返回結果
        finish();

    }
}
