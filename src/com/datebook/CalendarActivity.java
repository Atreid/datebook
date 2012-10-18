package com.datebook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CalendarActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calendar, menu);
        return true;
    }
}
