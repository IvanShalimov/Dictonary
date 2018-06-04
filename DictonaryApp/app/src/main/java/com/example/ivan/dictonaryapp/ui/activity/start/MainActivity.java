package com.example.ivan.dictonaryapp.ui.activity.start;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.ivan.dictonaryapp.R;
import com.example.ivan.dictonaryapp.presentation.presenter.start.MainPresenter;
import com.example.ivan.dictonaryapp.presentation.view.start.MainView;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
