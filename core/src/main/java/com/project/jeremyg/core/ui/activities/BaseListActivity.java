package com.project.jeremyg.core.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.project.jeremyg.core.R;
import com.project.jeremyg.core.ui.fragments.BaseListFragment;

/**
 * Created by JeremyG on 25.07.2018.
 */

public abstract class BaseListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_list);
    }

    public void getListFragment(BaseListFragment baseListFragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, baseListFragment,
                        baseListFragment.getClass().getSimpleName())
                .commit();
    }
}
