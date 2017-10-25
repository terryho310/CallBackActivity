package scs2682.assignment3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class NameActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        intent.putExtra(AppActivity.TEXT_VALUE, "Greetings from NameActivity");
        setResult(RESULT_OK, intent);
        finish();

    }
}
