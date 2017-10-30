package customlibrary.full.come.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import customlibrary.full.come.customlibrary.SimpleTask;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Addition: "+new SimpleTask().add(5,10));
        Log.d(TAG, "Simple String: "+new SimpleTask().displayString("hello world"));
    }
}
