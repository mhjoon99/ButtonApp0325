package com.example.buttonapp0325;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity caller;
    public MyOnClickListener(MainActivity mainActivity) {
        caller = mainActivity;
    }

    @Override
    public void onClick(View view) {
        caller.mTextView1.setText("You clicked 마혜준의 button!");
    }
}
