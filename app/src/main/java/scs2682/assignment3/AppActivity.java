package scs2682.assignment3;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity extends AppCompatActivity {

    public static final String NAME = AppActivity.class.getSimpleName();
    public static final String TEXT_VALUE = "text";
    public static final int REQUEST_CODE = 101;

    private Button text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String textValue;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        if (savedInstanceState != null){
            textValue = savedInstanceState.getString(TEXT_VALUE, "");
        } else {
            textValue = "App button";
        }

        text = findViewById(R.id.button);
        text.setText(textValue);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AppActivity.this, NameActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESULT_OK){
                String textValue = data.getStringExtra(TEXT_VALUE);
                text.setText(textValue);
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(TEXT_VALUE, "Save instance state called");
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}