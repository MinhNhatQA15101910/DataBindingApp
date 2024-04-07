package com.donhat.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    private Context _context;

    public MyClickHandler(Context _context) {
        this._context = _context;
    }

    public void onButton1Clicked(View view) {
        Toast.makeText(_context, "First Button is Clicked", Toast.LENGTH_SHORT).show();
    }
}
