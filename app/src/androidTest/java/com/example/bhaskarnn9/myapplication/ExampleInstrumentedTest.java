package com.example.bhaskarnn9.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        
        Log.d("DebugTest", "This is an edited sample log to create a new change from branchBhaskar");
        assertEquals("com.example.bhaskarnn9.myapplication", appContext.getPackageName());


    }

    public void sampleClick() {

    	  UiDevice.click();

    }

    public void sampleSwipe() {

    	  UiDevice.swipe();

    }

    public void sampleTap() {

    	  UiDevice.tapMidScreen();

    }
}
