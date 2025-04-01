package com.sahariyar.testlibrary;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestLibrary extends AppCompatActivity {

    private Context context;

    public TestLibrary(Context context) {
        this.context = context;
    }

    public void showToast(String msg, int length) {
        Toast.makeText(context, ""+msg, length).show();

    } // end toast============


} // end main class
