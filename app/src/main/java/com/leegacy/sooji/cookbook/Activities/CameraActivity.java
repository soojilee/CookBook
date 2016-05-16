package com.leegacy.sooji.cookbook.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leegacy.sooji.cookbook.Fragments.Camera2VideoFragment;
import com.leegacy.sooji.cookbook.R;

/**
 * Created by soo-ji on 16-05-05.
 */
public class CameraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2VideoFragment.newInstance())
                    .commit();
        }
    }
}
