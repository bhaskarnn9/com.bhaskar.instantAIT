package com.example.bhaskarnn9.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        System.out.println("Debug Test: KeyCode: " + keyCode);
        Log.d("Debug Test:", "KeyCode: " + keyCode);
        int keycode = event.getKeyCode();
        int keyunicode = event.getUnicodeChar(event.getMetaState());
        char character = (char) keyunicode;
        System.out.println("DEBUG MESSAGE KEY=" + character + " KEYCODE=" + keycode);
        Log.d("Debug Test:", "Character= " + character + " KeyCode=  " + keyCode);
        switch (keyCode) {
            case KeyEvent.KEYCODE_D:
                //moveShip(MOVE_LEFT);
                return true;
            case KeyEvent.KEYCODE_F:
                //moveShip(MOVE_RIGHT);
                return true;
            case KeyEvent.KEYCODE_J:
                //fireMachineGun();
                return true;
            case KeyEvent.KEYCODE_K:
                //fireMissile();
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyunicode = event.getUnicodeChar(event.getMetaState());
        char character = (char) keyunicode;
        System.out.println("key pressed" + String.valueOf(event.getKeyCode()));
        Log.d("Debug Test:", "character: " + character +"  key pressed=  " + String.valueOf(event.getKeyCode()));
        return super.dispatchKeyEvent(event);
    }

   /* @Override
    public boolean dispatchKeyEvent(KeyEvent KEvent) {
        System.out.println("DEBUG MESSAGE KEY=" + KEvent);
        Log.d("Debug Test:", "KeyCode: " + KEvent);
        int keyaction = KEvent.getAction();
        if (keyaction == KeyEvent.KEYCODE_F4) {
            int keycode = KEvent.getKeyCode();
            int keyunicode = KEvent.getUnicodeChar(KEvent.getMetaState());
            char character = (char) keyunicode;
            System.out.println("DEBUG MESSAGE KEY=" + character + " KEYCODE=" + keycode);
        }
        return super.dispatchKeyEvent(KEvent);
    }*/
}
