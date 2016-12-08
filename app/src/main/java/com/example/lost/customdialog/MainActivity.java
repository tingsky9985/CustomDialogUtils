package com.example.lost.customdialog;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by lost on 2016/12/8.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogUtils.showPromptDialog(this, "b", "c");
    }
}
